# ICA05 – Bottom Navigation App

> **Note:** ICA05 stands for *In-Class Activity 05*

## 📌 Course
Mobile Programming

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673

---

## 📱 Project Description
**Bottom Navigation App** is an **In-Class Activity (ICA05)** developed for the Mobile Programming course.  
The application demonstrates the use of **Bottom Navigation** to switch between multiple **Fragments**
within a single Activity, following a single-activity architecture.

The app contains three main sections:
- Top
- Pizza
- Stores

Each section is displayed dynamically without switching Activities.

---

## 🎯 Objectives
- Practice using Fragments
- Implement Bottom Navigation
- Handle fragment transactions
- Organize UI using XML layouts
- Improve app navigation structure

---

## 📱 Application Features
- Bottom Navigation Bar
- Three Fragments:
  - **TopFragment** – Displays the main/top section
  - **PizzaFragment** – Displays pizza-related content
  - **StoresFragment** – Displays store-related content
- Smooth navigation between fragments
- Single Activity architecture

---

## 🧠 Key Concepts Practiced
- Fragment lifecycle and management
- BottomNavigationView implementation
- Fragment transactions
- Single-Activity architecture
- Menu resource handling
- XML-based UI design

---

## 🧩 Project Structure

```text
ICA05_BottomNavigation/
└── app/
    └── src/
        └── main/
            ├── java/five/inClassActivity/
            │   ├── MainActivity.java
            │   ├── TopFragment.java
            │   ├── PizzaFragment.java
            │   └── StoresFragment.java
            ├── res/
            │   ├── layout/
            │   │   ├── activity_main.xml
            │   │   ├── fragment_top.xml
            │   │   ├── fragment_pizza.xml
            │   │   └── fragment_stores.xml
            │   ├── menu/
            │   │   └── bottom_navigation_menu.xml
            │   └── values/
            │       ├── colors.xml
            │       ├── strings.xml
            │       └── themes.xml
            └── AndroidManifest.xml
```

---

## 🛠 Technologies Used
- Java  
- Android SDK  
- XML Layouts  
- Fragments  
- Bottom Navigation  
- Activities  
- Icons & Colors  

---

## 🚀 How to Run the Project
1. Open **Android Studio**
2. Select **Open an Existing Project**
3. Choose the folder: `ICA05_BottomNavigation`
4. Wait for **Gradle sync** to finish
5. Run the app on an emulator or physical device

---

## 🔮 Possible Improvements
- Use Navigation Component instead of manual fragment transactions
- Preserve fragment state on configuration changes
- Apply MVVM architecture
- Improve UI consistency using Material Design components

---

## 📚 Course Information
- Course: Mobile Programming
- Activity: ICA05
- Topic: Bottom Navigation & Fragments