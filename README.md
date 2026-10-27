# SQE Lab Exam Cheat Sheet 🚀

## 1. Core JUnit 5 Assertions
* **`assertEquals(expected, actual);`** -> Check karta hai ke values barabar hain ya nahi.
* **`assertNotNull(actual);`** -> Check karta hai ke object null nahi hai (exist karta hai).
* **`assertNull(actual);`** -> Check karta hai ke result null hai.
* **`assertTrue(condition);`** -> Check karta hai ke condition true hai.
* **`assertFalse(condition);`** -> Check karta hai ke condition false hai.
* **`assertThrows(Exception.class, () -> { ... });`** -> Check karta hai ke expected exception/error throw ho raha hai ya nahi (Negative testing ke liye).

## 2. AAA Pattern (Structure of Every Test)
Harr test method mein yeh 3 steps hone lazmi hain:
1. **Arrange:** Object banana aur variables set karna.
2. **Act:** Method call karna jiska test lena hai.
3. **Assert:** Result ko verify karna (`assertEquals`, `assertThrows`, etc.).