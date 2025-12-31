---

# 📌 Google Form Automation Framework

## 📝 Project Description

This project demonstrates an **end-to-end UI automation framework** built to automate **Google Form submission** using **Selenium WebDriver with Java and TestNG**.
The automation covers dynamic and complex form elements such as **text inputs, radio buttons, checkboxes, dropdowns, date pickers, time pickers**, and validates successful form submission.

---

## 🚀 Key Features

* Automated **complete Google Form workflow** from launch to submission
* Handles **dynamic date selection** using Java `LocalDate` APIs
* Supports **keyboard-based interactions** for calendar and time pickers
* Generates **unique test data** using epoch timestamps
* Implements **robust synchronization** using Explicit Waits
* Includes **confirmation message validation** after form submission

---

## 🛠️ Technical Highlights

* Used **Selenium WebDriver** with **ChromeOptions** and **Selenium Manager**
* Created **custom reusable wrapper methods** for:

  * Clicking elements
  * Entering text
  * Keyboard interactions
  * Retrieving UI text
* Utilized **Actions class** and **Robot class** for advanced UI interactions
* Enabled **browser and driver logging** for debugging and analysis
* Ensured clean test execution with proper setup and teardown

---

## 🧪 Test Framework & Execution

* Structured tests using **TestNG annotations**

  * `@BeforeTest`
  * `@Test`
  * `@AfterTest`
* Executed tests using **TestNG XML suite**
* Implemented **explicit waits (`WebDriverWait`)** for stability and reliability

---

## ✅ Validation & Reliability

* Verified successful submission using **post-submission confirmation message**
* Applied defensive checks for **null element handling**
* Ensured browser cleanup using `driver.quit()`

---

## 🧰 Tools & Technologies Used

* **Programming Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Design Approach:** Wrapper-based reusable framework
* **Browser:** Google Chrome
* **Utilities:** Actions, Robot, Java Time API

---

## 🖼️ Tools & Frameworks Overview

<p align="left"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java" width="40" height="40"/> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/selenium/selenium-original.svg" alt="Selenium" width="40" height="40"/> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/chrome/chrome-original.svg" alt="Chrome" width="40" height="40"/> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/intellij/intellij-original.svg" alt="IntelliJ IDEA" width="40" height="40"/> <img src="https://avatars.githubusercontent.com/u/12528662?s=200&v=4" alt="TestNG" width="40" height="40"/> </p>

---
