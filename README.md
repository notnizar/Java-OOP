# Java OOP Design Portfolio: Business Logic Simulations

This repository documents my professional transition from understanding syntax to mastering **Object-Oriented Design**. Instead of focusing on "how code looks," these projects demonstrate **"how systems work"** through scalable architecture and real-world business logic.

---

## 🏗️ Featured Systems

### 1. FreelanceFlow (Project & Payment Management)
A modular system designed to manage diverse billing models for service providers.
* **Polymorphic Billing:** Implements a `Payable` interface, allowing a single calculation engine to process both `HourlyProject` and `FixedPriceProjects` seamlessly.
* **Relationship Management:** Utilizes a `User` hierarchy to share core identity data while distinguishing between `Client` and `FreeLancer` behaviors.
* **Composition:** The `Project` class manages an array of `FreeLancer` objects, demonstrating a "Has-A" relationship over rigid inheritance.

### 2. AmazonLite (E-Commerce Tax Engine)
A checkout simulation focusing on decoupling business rules from data.
* **Interface-Driven Design:** Uses the `Taxable` interface to isolate tax calculation logic. This allows `Electronics` (15% tax) and `Clothing` (10% tax) to have unique financial behaviors without bloating the parent `Product` class.
* **Encapsulation & Validation:** Protects data integrity by using controlled setters to prevent invalid states, such as negative pricing or empty product names.

### 3. Library Management System
A robust inventory handler for physical and digital assets.
* **Advanced Abstraction:** Leverages `abstract` classes to define a shared blueprint for all books.
* **Type Safety & Casting:** Uses `instanceof` and downcasting to handle specific sub-type attributes, such as managing `fileSizeMB` for `EBooks` versus `weight` for `PaperBooks`.

---

## 🛠️ Engineering Principles Applied

* **S.O.L.I.D Principles:** * **Single Responsibility:** Separating tax logic into interfaces.
    * **Open/Closed Principle:** The system is designed so new product or project types can be added without modifying existing checkout or payment logic.
* **Memory Management:** Architected with a deep understanding of **Stack vs. Heap** memory—ensuring efficient object referencing and garbage collection awareness.
* **Abstraction:** Focused on hiding implementation details to reduce system complexity and "loose coupling."

---

## 🧠 Technical Deep Dives (Documentation)
For detailed notes on the underlying "Physics" of Java used in these projects, see my internal documentation:
* [Class vs. Object Foundations](./General-Notes/Foundations/Class%20vs%20Object.md)
* [Memory: Stack & Heap Analysis](./General-Notes/Foundations/Memory%20Stack%20&%20Heap.md)
* [The Power of Reference Variables](./General-Notes/Foundations/Reference%20Variables.md)

---

## 💻 Tech Stack
* **Language:** Java (JDK 17+)
* **Concepts:** Inheritance, Runtime Polymorphism, Interface-driven design, Data Encapsulation, Abstract Data Types.

---
*Developed as part of an ongoing journey toward mastering Clean Code and System Design.*
