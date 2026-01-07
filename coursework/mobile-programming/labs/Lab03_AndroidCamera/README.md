# Lab 03 – Android Camera (Profile Image)

📌 Description  
This project is **Lab 03** for the *Mobile Programming* course.  
The app demonstrates how to open the device camera using an **implicit Intent** (`MediaStore.ACTION_IMAGE_CAPTURE`) and display the captured photo as a **profile image** inside a circular image view.

---

🎯 Objectives
- Practice using implicit Intents in Android
- Launch the camera app with `ACTION_IMAGE_CAPTURE`
- Handle results returned from another app via `onActivityResult`
- Display an image as a profile picture in the UI

---

📱 Application Features
- Tap the profile image to open the device camera
- Capture a photo using the system camera app
- Display the captured image inside the app as a profile picture
- Show a "Cancelled" message if the user exits the camera without taking a photo

---

🧠 Key Concepts Practiced
- Implicit Intent (`MediaStore.ACTION_IMAGE_CAPTURE`)
- `startActivityForResult` + `onActivityResult`
- Handling returned `Bitmap` from Intent extras (`data`)
- Using third-party UI component: CircleImageView

---

🧩 Project Structure

```text
Lab03_AndroidCamera/
└── app/
    └── src/
        └── main/
            ├── java/lab3/androidCamera/
            │   └── MainActivity.java
            ├── res/layout/
            │   └── activity_main.xml
            ├── res/drawable/
            │   └── default_profile.png (or drawable resource)
            └── AndroidManifest.xml
```

---

🛠 Technologies Used
- Java  
- Android SDK  
- XML Layouts  
- Camera Intent (`MediaStore.ACTION_IMAGE_CAPTURE`)  
- CircleImageView (`de.hdodenhof:circleimageview:3.1.0`)  

---

🚀 How to Run the Project
1. Open **Android Studio**
2. Select **Open an Existing Project**
3. Choose the folder: `Lab03_AndroidCamera`
4. Wait for **Gradle sync**
5. Run the app on an emulator or a physical device
6. Tap the profile image to open the camera and take a photo

---

⚠️ Notes
- This implementation displays the **thumbnail image** returned by the camera Intent  
  (`data.getExtras().get("data")`).
- Some emulators may not fully support camera capture; using a **physical device** is recommended.

---

🔮 Possible Improvements
- Save full-resolution images using FileProvider
- Migrate to Activity Result APIs
- Add runtime permission handling for camera

---

📚 Course Information
- Course: Mobile Programming
- Lab: Lab 03
- Topic: Camera Intent & Handling Activity Results

---

👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673