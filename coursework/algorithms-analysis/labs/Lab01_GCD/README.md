# Lab 01 – Greatest Common Divisor (GCD)

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
Design and implement algorithms to compute the **Greatest Common Divisor (GCD)**
of two positive integers.

The lab requires:
- Implementing a basic GCD algorithm using common divisors
- Implementing an efficient solution using **Euclid’s algorithm**
- Verifying correctness using multiple test cases
- Measuring execution time for the basic algorithm

---

## 🧠 Algorithms Implemented

### 1) Naive GCD (Common Divisors Method)
This approach checks all integers from `1` to `min(m, n)` and stores the values
that divide both numbers. The largest common divisor is returned as the GCD.

**Time Complexity:**  
`O(min(m, n))`

---

### 2) Euclid’s Algorithm
This algorithm repeatedly applies the rule:

```Text
gcd(m, n) = gcd(n, m mod n)
```

until the second value becomes zero. The remaining value is the GCD.

**Time Complexity:**  
Approximately `O(log(min(m, n)))`, making it significantly faster for large inputs.

---

## ✅ Test Results (Euclid’s Algorithm)

| m | n | GCD |
|---|---|-----|
| 33165 | 4806 | 9 |
| 30582 | 5058 | 18 |
| 11007 | 5304 | 3 |
| 11025 | 5172 | 3 |
| 14490 | 5112 | 18 |

---

## ⏱ Timing Experiment (Naive GCD)

Input values:
- `m = 124325965`
- `n = 215`

Result:
- `GCD = 5`

Execution time for 10 runs (milliseconds):

| Run | Time (ms) |
|----|-----------|
| 1 | 17 |
| 2 | 15 |
| 3 | 16 |
| 4 | 10 |
| 5 | 11 |
| 6 | 11 |
| 7 | 11 |
| 8 | 11 |
| 9 | 11 |
| 10 | 12 |

---

## 🛠 Technologies Used
- Java
- Console input/output
- Basic performance measurement

---

## 📂 Files
- `FindGCD.java` – Naive GCD implementation using common divisors
- `EuclidGCD.java` – Efficient GCD implementation using Euclid’s algorithm

---

## 🎯 Conclusion
Both implementations were tested and produced identical correct results.
The timing experiment shows that Euclid’s algorithm is significantly more efficient
than the naive approach, especially when dealing with large input values.
This experiment highlights the importance of choosing efficient algorithms
when dealing with large input sizes.

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673