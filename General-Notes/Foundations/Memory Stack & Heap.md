
# Java Memory: Stack vs. Heap

Tags: #Java #Memory #Foundations #CS_Concepts
Date: 2025-12-06

---

## 1. The Big Picture 🗺️

When you run a Java application, the JVM (Java Virtual Machine) divides the memory into two main parts. Understanding the difference is crucial for debugging and performance.

| Memory Type | **Stack Memory** 🥞 | **Heap Memory** ☁️ |
| :--- | :--- | :--- |
| **Role** | Temporary execution space. | Long-term object storage. |
| **Structure** | LIFO (Last-In, First-Out). | Dynamic / Scattered. |
| **Speed** | Very Fast. | Slower. |
| **Size** | Small. | Large. |

---

## 2. The Details

### A. The Stack (The "To-Do" List)
* **What lives here?**
    1.  **Method Calls:** When a method is called, a "block" is pushed onto the stack. When it finishes, the block is popped off.
    2.  **Local Variables:** Primitive types (`int`, `double`, `boolean`) declared *inside* methods.
    3.  **Reference Variables:** The "Remote Control" variables (e.g., `Car c`) that point to objects.

### B. The Heap (The "Storage" Room)
* **What lives here?**
    * **Objects:** ANYTHING created with the `new` keyword.
    * **Instance Variables:** Variables declared inside a class (even if they are primitives like `int id`), they live *inside* the object in the Heap.

---

## 3. Visual Analogy 🧠

Imagine you are eating at a restaurant.

* **The Stack:** Is the **Waiter's Notepad**.
    * It holds short-term tasks ("Table 5 needs water").
    * Once the task is done, the line is crossed out (erased).
    * It's fast and strictly ordered.

* **The Heap:** Is the **Kitchen**.
    * It holds the actual heavy stuff (The Ingredients, The Meals).
    * The waiter's note (Reference) just *points* to the meal in the kitchen.
    * The meal stays there until someone cleans it up (Garbage Collector).

---

## 4. Code Breakdown (Trace) 🕵️‍♂️

Let's trace exactly what happens in memory for this code.

```java
class Student {
    int id; // Instance Variable (Heap)
}

public class Main {
    public static void main(String[] args) {
        int x = 10;               // Line 1
        Student s = new Student(); // Line 2
        s.id = 55;                // Line 3
    } // Line 4
}
````

|**Line**|**Memory Action**|**Where?**|
|---|---|---|
|**Line 1**|`int x = 10` is created immediately.|**Stack**|
|**Line 2**|`new Student()` creates a real object.|**Heap**|
|**Line 2**|`Student s` (Reference) is created pointing to the object.|**Stack**|
|**Line 3**|We follow `s` to the Heap and set `id` inside the object.|**Heap**|
|**Line 4**|Method ends. `x` and `s` are destroyed immediately. The `Student` object remains in Heap until Garbage Collection deletes it.|**Both**|

---

## 5. Why References Matter? (The "=" Trap)

This is why `==` behaves differently for primitives vs. objects.

- **Primitives (`int a = 5; int b = 5;`):**
    
    - `a == b` checks the **Value**. -> **True**.
        
- **Objects (`Student s1 = new...; Student s2 = new...;`):**
    
    - `s1 == s2` checks the **Address** (Stack reference), NOT the content. -> **False** (even if they have same data).
        
    - _Solution:_ Use `.equals()` to check content inside the Heap.
        

---

## 6. Common Errors 💥

|**Error**|**Cause**|**Example**|
|---|---|---|
|**StackOverflowError**|Stack is full. Usually caused by **Infinite Recursion**.|Method A calls Method A forever.|
|**OutOfMemoryError**|Heap is full. Too many heavy objects.|Creating 1 billion Strings without deleting them.|