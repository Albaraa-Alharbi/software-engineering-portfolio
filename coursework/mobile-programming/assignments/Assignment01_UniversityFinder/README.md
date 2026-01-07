# Assignment 01 – University Finder 🎓🌐

## 📌 Course
Mobile Programming

## 👨‍🎓 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673

## 📱 Project Description
University Finder is an Android application developed as Assignment 01.
The application allows users to select a university from a dropdown list (Spinner),
display the university logo, and open the official university website by clicking on the image.

## ⚙️ How the App Works
1. The user selects a university from a **Spinner**.
2. When the **"Show University's Site"** button is clicked:
    - The corresponding university image is displayed.
    - A website URL is assigned internally.
3. Clicking on the displayed image opens the university’s official website using an implicit intent.

## 🧩 Main Components Used
- **Spinner**: To select the university name.
- **ImageView**: Displays the university image and acts as a clickable link.
- **Button**: Triggers the selection logic.
- **Intent (ACTION_VIEW)**: Opens the university website in a browser.

## 🛠️ Technologies Used
- Java
- XML
- Android Studio
- Gradle

## 📂 Key Files
- `MainActivity.java`
    - Handles Spinner selection
    - Updates ImageView based on selection
    - Opens university website using Intent
- `activity_main.xml`
    - Defines UI layout using FrameLayout
    - Contains Spinner, ImageView, and Button

## ▶️ How to Run the Project
1. Open **Android Studio**
2. Click **Open**
3. Navigate to:
   coursework/mobile-programming/assignments/Assignment01_UniversityFinder
4. Let Gradle sync
5. Click **Run ▶**
6. Choose an Emulator or Physical Device

## 🌍 Supported Universities
- University of Jeddah
- King Abdulaziz University
- Taibah University

## ✅ Project Status
✔ Application runs successfully  
✔ UI and logic work as intended  
✔ Tested on Android Emulator