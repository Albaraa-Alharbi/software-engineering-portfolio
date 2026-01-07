# Lab 02 – Login & Register (Firebase Auth)

📌 Description  
This project is **Lab 02** for the *Mobile Programming* course.  
The app implements a simple **Login & Register system** using **Firebase Authentication (Email/Password)**.  
After logging in, the user is redirected to a home screen that shows the logged-in account and allows **logout**.

---

🎯 Objectives
- Practice building multi-screen Android apps using Activities
- Implement authentication using Firebase Email/Password
- Validate user input and provide feedback with Toast messages
- Navigate between screens using Intents

---

📱 Application Features
- **Register** a new account (Email/ID + Password)
- **Login** with existing credentials
- Display current user info on the main screen
- **Logout** and return to the login screen
- Basic input validation + progress feedback

> ✅ Note: Firebase Email/Password requires the “ID” field to be in **email format** (e.g., `name@example.com`).

---

🧠 Key Concepts Practiced
- Firebase Authentication (Email/Password)
- Activities & Intents navigation
- Form validation (TextUtils)
- Progress UI (ProgressBar)
- Session check (currentUser) + logout flow

---

🧩 Project Structure

```text
Lab02_LoginRegister/
└── app/
    └── src/
        └── main/
            ├── java/lab2/LogReg/
            │   ├── Login.java
            │   ├── Register.java
            │   └── MainActivity.java
            ├── res/layout/
            │   ├── activity_login.xml
            │   ├── activity_register.xml
            │   └── activity_main.xml
            ├── AndroidManifest.xml
            └── google-services.json
```
---


🛠 Technologies Used
- Java  
- Android SDK  
- XML Layouts  
- Firebase Authentication  

---

🚀 How to Run the Project
1. Open **Android Studio**
2. Select **Open an Existing Project**
3. Choose the folder: `Lab02_LoginRegister`
4. Wait for **Gradle sync**
5. Ensure Firebase is configured:
   - `google-services.json` exists in `app/`
   - Firebase Authentication is enabled in Firebase Console (**Email/Password**)
6. Run the app on an emulator or physical device

---

⚠️ Notes
- If registration/login fails, verify:
  - Firebase project configuration
  - Internet connection
  - Email format in the “ID” field
  - Email/Password sign-in method is enabled in Firebase Console

---

📚 Course Information
- Course: Mobile Programming
- Lab: Lab 02
- Topic: Login & Register (Firebase Authentication)

---

👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673