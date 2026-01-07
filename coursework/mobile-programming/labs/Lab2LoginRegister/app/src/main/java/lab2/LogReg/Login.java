package lab2.LogReg;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    FirebaseAuth mAuth;
    TextView textView;
    ProgressBar progressBar;
    TextInputEditText editTextID, editTextPassword;
    Button buttonLgn;

    @Override
    public void onStart() {
        super.onStart();
        // It's good practice to initialize mAuth before using it.
        // Although it's initialized in onCreate, onStart can be called in other lifecycle scenarios.
        if (mAuth == null) {
            mAuth = FirebaseAuth.getInstance();
        }
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mAuth = FirebaseAuth.getInstance();
        editTextID = findViewById(R.id.stdID);
        editTextPassword = findViewById(R.id.password);
        progressBar = findViewById(R.id.progressBar);
        buttonLgn = findViewById(R.id.btnLgn);
        textView = findViewById(R.id.rgtNow);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The progress bar here might not be necessary if navigating immediately.
                // It's your choice if you want this visual feedback.
                // progressBar.setVisibility(View.VISIBLE);
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
                finish();
            }
        });

        buttonLgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id, password;
                id = String.valueOf(editTextID.getText());
                password = String.valueOf(editTextPassword.getText());

                if(TextUtils.isEmpty(id)){
                    Toast.makeText(Login.this, "Enter ID", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    // Bug Fix: Corrected the message for the password field.
                    Toast.makeText(Login.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                // UI Improvement: Show progress bar right after validation.
                progressBar.setVisibility(View.VISIBLE);

                mAuth.signInWithEmailAndPassword(id, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Login Successful.", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(Login.this, "Authentication Failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        }); // <-- MAJOR FIX: Added closing parenthesis and semicolon.
            }
        });
    }
}
