# 🧪 Selenium Test Automation Framework

This project is a modular and maintainable **Selenium Test Automation Framework** built using Java, TestNG, and the Page Object Model (POM) design pattern. It is designed for UI automation of web applications with support for utility-driven actions and reusable components.

---

## 📁 Project Structure

Selenium_framework/
├── src/
│ ├── main/
│ │ └── java/org/example/
│ │ ├── pages/ # Page Object classes
│ │ └── utils/ # Utility classes (DropdownUtils, PageUtils, etc.)
│ └── test/
│ └── java/org/example/
│ ├── base/ # BaseTest setup
│ └── tests/ # Test classes
├── testng.xml # TestNG configuration file
├── pageSource.html # Saved page snapshot (for debugging)
└── README.md # This file


---

## 🔧 Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Page Object Model (POM)**
- **Utilities for reusable actions**

---

## ✅ Features

- 📄 Structured page classes using POM
- ✅ Utility methods for dropdowns, alerts, and checkboxes
- 🧪 TestNG-based test execution
- 📥 Page source capture and verification support
- 💬 Easy-to-understand test logic

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- TestNG (if using IDE)
- ChromeDriver or other browser drivers
- Git

### Clone the Repository

```bash
git clone https://github.com/Yogesh-Murugesan-QA/Selenium_framework.git
cd Selenium_framework

🔸 Run Tests
Using Maven:
mvn test
Or run via your IDE by executing individual test classes or testng.xml.

🧪 Sample Test Cases
Alert popup handling and validation

Radio button and checkbox selection

Dropdown selection using utility class

Page source saving with PageUtils

🛠 Utility Classes
Utility Class	Purpose
DropdownUtils	Select dropdowns by index, value, or text
PageUtils	Save page source to a file

These are designed to keep test code clean and reusable across different pages.

📥 Page Source or Screenshot
You can use PageUtils.savePageSource(driver, "filename.html") in your test to save the current page for debugging. Screenshot utility can be added similarly.

🤝 Contributing
Fork this repository

Create a feature branch: git checkout -b feature/my-feature

Commit your changes: git commit -m "Added XYZ"

Push to the branch: git push origin feature/my-feature

Open a Pull Request

📄 License
This project is open-source and free to use for personal and professional automation learning.

🙋‍♂️ Author
Yogesh Murugesan
📍 Bengaluru, India
📧 yogeshyogidpi@gmail.com
🔗 GitHub

⭐ If you find this helpful, don't forget to star the repo!

---

### ✅ How to use:
1. Create a `README.md` file in the root of your project.
2. Paste the entire content above.
3. Commit and push:
   ```bash
   git add README.md
   git commit -m "Added project README"
   git push
