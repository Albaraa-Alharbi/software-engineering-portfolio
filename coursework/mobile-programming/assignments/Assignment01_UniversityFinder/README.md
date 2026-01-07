# Assignment 01 - University Finder 🎓🌐

## 📌 Course
Mobile Programming

## 👨‍🎓 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673

---

## 📱 Project Description
**University Finder** is an Android application developed as **Assignment 01** for the Mobile Programming course.  
The app demonstrates basic Android UI interaction by allowing users to select a university from a dropdown list and navigate to the university’s official website using an implicit intent.

---

## 🎯 Objectives
- Practice handling user selection using Spinner
- Update UI components dynamically based on user input
- Use implicit intents to open external web pages
- Design a simple and responsive Android UI

---

## ⚙️ How the App Works
1. The user selects a university from a **Spinner**.
2. When the **"Show University's Site"** button is clicked:
   - The corresponding university logo is displayed.
   - A website URL is assigned internally.
3. Clicking on the displayed image opens the university’s official website using an implicit intent (`ACTION_VIEW`).

---

## 🧠 Key Concepts Practiced
- Spinner selection handling
- Event-driven programming
- Implicit Intents (`ACTION_VIEW`)
- Dynamic UI updates
- Android resource management

---

## 🧩 Key UI Components
- **Spinner** – Selects the university name
- **ImageView** – Displays the university logo and acts as a clickable link
- **Button** – Triggers the selection logic
- **Intent (ACTION_VIEW)** – Opens the university website in a browser

---

## 🛠 Technologies Used
- Java
- Android SDK
- XML Layouts
- Android Studio
- Gradle

---

## 📂 Project Structure

```Text
Lab01_GoogleMap/
└── app/
    └── src/
        └── main/
            ├── java/
            │   └── com/
            │       └── example/
            │           └── googlemap/
            │               └── MapsActivity.java
            ├── res/
            │   └── layout/
            │       └── activity_maps.xml
            ├── values/
            │   └── google_maps_api.xml
            └── AndroidManifest.xml
```

---

## ▶️ How to Run the Project
1. Open **Android Studio**
2. Select **Open an Existing Project**
3. Navigate to:  
   `coursework/mobile-programming/assignments/Assignment01_UniversityFinder`
4. Wait for **Gradle sync**
5. Click **Run ▶**
6. Choose an emulator or physical device

---

## 🌍 Supported Universities
- University of Jeddah
- King Abdulaziz University
- Taibah University

---

## 🔮 Possible Improvements
- Load universities dynamically using a data model
- Replace Spinner with RecyclerView for scalability
- Improve UI design using Material Components
- Add more universities with localized content

---

## ✅ Project Status
✔ Application runs successfully  
✔ UI and logic work as intended  
✔ Tested on Android Emulator