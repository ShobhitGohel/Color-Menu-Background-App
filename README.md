# 🎨 Color Menu Background App  

## 📘 Overview  
This Android application demonstrates how to **change the background color of the app dynamically** using a **toolbar menu**.  
Users can select from **Red, Green, Blue, and White** from the menu, and the app's background color updates accordingly.

---

## 🧠 Concept  
This project showcases:  
- Using **Toolbar and Menu** in Android  
- Handling **menu item selection events** with Kotlin  
- Changing **layout background color programmatically**  
- Working with **ConstraintLayout** and basic Android UI  

---

## 🏗️ Project Structure  

app/
└── src/
└── main/
├── java/com/shobhu/assignment5/
│ └── MainActivity.kt
└── res/
├── layout/
│ └── activity_main.xml
└── menu/
└── color_menu.xml

yaml
Copy code

---

## 💻 Code Explanation  

### 🔹 MainActivity  
- Initializes the root layout (`ConstraintLayout`) and toolbar.  
- Sets up the toolbar so the menu items are displayed.  
- Handles **menu item selection** using `onOptionsItemSelected` to change background color:  
  - Red → `#FF0000`  
  - Green → `#00FF00`  
  - Blue → `#0000FF`  
  - White → `#FFFFFF`  

### 🔹 activity_main.xml  
- Contains:  
  - A `ConstraintLayout` as the root layout  
  - A `TextView` centered in the layout  
  - Toolbar defined for displaying the menu  

### 🔹 color_menu.xml  
- Defines menu items for **Red, Green, Blue, and White**  
- Each item corresponds to a color change in the background  

---

## 🧩 How It Works  

1. App starts → the screen displays a `TextView` and a toolbar.  
2. Tap the menu icon → menu with color options appears.  
3. Select a color → the background of the app changes to the selected color.  
4. Repeat → select different colors to change the background dynamically.  

---

## ⚙️ Requirements  

- **Android Studio**  
- **Kotlin** enabled project  
- **Minimum SDK:** 21 (Android 5.0 Lollipop)  

---

## 🚀 How to Run  

1. Clone or download this repository.  
2. Open the project in **Android Studio**.  
3. Sync Gradle and build the project.  
4. Run the app on an emulator or physical device.  
5. Tap the menu and select a color → watch the background change instantly.  

---

## 📸 Preview  

| Default | After Color Change |
|---------|-----------------|
| White background | Changes to Red, Green, Blue, or White based on menu selection |

---

## 🧑‍💻 Author  
**ShobhU**  
> A student exploring Android development, Kotlin fundamentals, and dynamic UI interactions in Android apps
