
# Class vs. Object

Tags: #Java #OOP #Foundations
Date: 2025-12-07

---

## 1. The Core Concept

In Object-Oriented Programming, we don't just write code; we model real-world things. To do this, we need two main elements:

1.  **The Class:** The **Blueprint** or Template. It defines the structure (attributes) and behavior (methods). It does not exist in reality (takes no memory for data).
2.  **The Object:** The **Instance** or Real Thing. It is created based on the class. It occupies memory and holds specific data.

* **Motto:** "You can have one Class, but infinite Objects created from it."

---

## 2. The Analogy 🏠

Think of an **Architect's Blueprint** for a house.

| Feature | Class (The Blueprint) 📄 | Object (The House) 🏡 |
| :--- | :--- | :--- |
| **Existence** | Logical (On paper). | Physical (In the real world). |
| **Quantity** | Just one design. | You can build 100 houses from it. |
| **Uniqueness** | The design is generic. | House #1 has a red door; House #2 has a blue door. |
| **Action** | You cannot live in a blueprint. | You can live in the house. |

> [!INFO] Other Analogies
> * **Cookie Cutter (Class)** vs. **Cookies (Objects)**.
> * **Car Design (Class)** vs. **Actual Ferrari/BMW (Objects)**.

---

## 3. Code Implementation

How do we translate this into Java?

### A. The Class (The Definition)

```java
// 1. We define the blueprint
public class Car {
    // Attributes (State)
    String color;
    String model;

    // Methods (Behavior)
    void drive() {
        System.out.println("The " + color + " " + model + " is moving.");
    }
}
````

### B. The Object (The Creation)

To create an object, we use the `new` keyword.

Java

```
public class Main {
    public static void main(String[] args) {
        // 2. We build (instantiate) objects from the blueprint
        
        // Object 1
        Car myCar = new Car(); 
        myCar.color = "Red";
        myCar.model = "Toyota";

        // Object 2 (Different data, same blueprint)
        Car yourCar = new Car(); 
        yourCar.color = "Black";
        yourCar.model = "BMW";

        // Action
        myCar.drive();   // Output: The Red Toyota is moving.
        yourCar.drive(); // Output: The Black BMW is moving.
    }
}
```

---

## 4. Deep Dive: What happens in Memory? 🧠

This is critical for exams. When you write:

Car c1 = new Car();

It is actually two parts:

1. **`Car c1` (The Reference):**
    
    - Lives in **Stack Memory**.
        
    - It's just a remote control or a pointer. It doesn't hold the car data itself.
        
2. **`new Car()` (The Object):**
    
    - Lives in **Heap Memory**.
        
    - This is where the actual "Red" color and "Toyota" model are stored.
        

> [!TIP] Visualization
> 
> c1 (Stack) ----points to----> {Color: Red, Model: Toyota} (Heap)

---

## 5. Summary Table

|**Comparison**|**Class**|**Object**|
|---|---|---|
|**Definition**|A template/blueprint.|An instance of the class.|
|**Creation**|Declared using `class` keyword.|Created using `new` keyword.|
|**Memory**|Consumes almost no memory (just code).|Consumes memory for each instance (Heap).|
|**Example**|`Human`|`John`, `Sarah`, `Ali`|