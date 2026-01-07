# Lab 07 – Dynamic Programming (Fibonacci & Binomial Coefficient)

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
This lab demonstrates **Dynamic Programming (DP)** using a **bottom-up approach**
to efficiently solve problems with overlapping subproblems.

The lab focuses on:
1) Computing Fibonacci numbers using table-based DP.
2) Computing Binomial Coefficients using a 2D DP table.

---

## 🧠 Algorithms Implemented

### 1) Fibonacci (Bottom-Up Dynamic Programming)
Instead of using naive recursion, the algorithm builds a table from `0` up to `n`,
storing intermediate Fibonacci values to avoid repeated computations.

- **Recurrence:**
```text
F(n) = F(n−1) + F(n−2)
```
- **Base Cases:**  
  `F(0) = 0`, `F(1) = 1`

- **Time Complexity:** `Θ(n)`
- **Space Complexity:** `Θ(n)`

---

### 2) Binomial Coefficient (Dynamic Programming)
The binomial coefficient `C(n, k)` is computed using Pascal’s identity and a 2D DP table.

- **Recurrence:**
```text
C(n, k) = C(n−1, k−1) + C(n−1, k)
```
- **Base Cases:**  
  `C(n, 0) = 1`, `C(n, n) = 1`

- **Time Complexity:** `Θ(nk)`
- **Space Complexity:** `Θ(nk)`

---

## ✅ Results

### Fibonacci Test
Input:
```text
n = 10
```
Output:
```text
F(10) = 55
```

---

### Binomial Coefficient Tests
Inputs and outputs:
```text
C(5, 2) = 10
C(6, 3) = 20
```

---

## 🛠 Technologies Used
- Java
- Dynamic Programming
- Bottom-up table method
- Console input/output

---

## 📂 Files
- `FibDP.java` – Fibonacci using bottom-up dynamic programming
- `BinomialDP.java` – Binomial coefficient using dynamic programming

---

## 🧪 Testing
Both programs were executed and verified using the provided test cases.

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673