# ☕ My Java OOP Learning Path

This repository contains my practice projects for Object-Oriented Programming, focused on moving beyond simple syntax to designing real systems.

## 🚀 Projects & Learning Highlights 

### [1. FreelanceFlow (Billing System)](./FreelanceFlow/)
A system for managing different types of freelancer payments.
* **What I learned:** I implemented a `Payable` interface to handle both `HourlyProject` and `FixedPriceProjects` within a single calculation engine.
* **Key Concept:** Composition. I used the `Project` class to manage an array of `FreeLancer` objects, which showed me how to use "Has-A" relationships instead of just inheritance.

### [2. AmazonLite (E-Commerce Logic)](./AmazonLite/)
A mini-simulation of a checkout and tax system.
* **What I learned:** I used the `Taxable` interface to isolate tax logic so that `Electronics` and `Clothing` could have unique financial behaviors without bloating the parent class.
* **Key Concept:** Encapsulation. I used controlled setters to prevent invalid states like negative pricing or empty names.

### [3. Library Management System](./Book%20Mangment%20System/)
An inventory handler for physical books and E-books.
* **What I learned:** I used `abstract` classes to define a shared blueprint for all books while keeping the implementation details hidden.
* **Key Concept:** Type Safety. I practiced using `instanceof` and downcasting to handle specific sub-type attributes like `fileSizeMB` for `EBooks`.

---

## 🧪 Exam Training (Al-Zaytoonah University)
I built these modules to prepare for university finals, focusing on specific logic requirements:

* **[Programming Contest](./Final-Test-Train/Programming%20Contest/):** I managed teams within an `ArrayList` and practiced overriding registration fee logic based on student status.
* **[Car Rental System](./Final-Test-Train/Car%20Rental/):** Focused on input validation, such as requiring IDs to start with '9' and names to start with 'S'.
* **[Hotel Management](./Final-Test-Train/Hotel%20Management/):** I used `switch` cases to calculate room costs based on location (Amman vs. Aqaba) and room type.
* **[Research Projects](./Final-Test-Train/ResearchProject/):** Learned to calculate dynamic grants based on researcher rank and journal impact factors.

---

## 🧠 The "Foundations" (My Notes)
I also kept notes on how Java works behind the scenes to avoid common bugs:
* **[Stack vs. Heap](./General-Notes/Foundations/Memory%20Stack%20&%20Heap.md):** Understanding where temporary variables vs. long-term objects are stored.
* **[Reference Variables](./General-Notes/Foundations/Reference%20Variables.md):** Learning that a variable is just a "pointer" or "address" to the data in memory.
