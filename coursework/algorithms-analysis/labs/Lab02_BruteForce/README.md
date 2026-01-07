# Lab 02 – Brute Force Algorithms

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
Implement brute-force approaches for two problems:
1) **String Matching**: Search for a pattern inside a text and return the index of the first match (or `-1` if not found).
2) **Closest Pair of Points (2D)**: Given a set of 2D points, find the closest pair and output their indices and the Euclidean distance.

The lab also includes verifying correctness using provided test cases.

---

## 🧠 Algorithms Implemented

### 1) Brute-Force String Matching
The algorithm tries every possible alignment of the pattern in the text and checks characters sequentially.

**Output:** first matching index, otherwise `-1`  
**Time Complexity:** `O(n * m)` where `n` = text length, `m` = pattern length

---

### 2) Brute-Force Closest Pair (2D)
The algorithm computes the Euclidean distance for every pair of points and keeps the minimum.

**Output:** indices of closest points + minimum distance  
**Time Complexity:** `O(n^2)` comparisons

---

## ✅ Provided Answers / Results

### Q3 (String Matching)
- Pattern: `001100`
- Result index: **62**

### Q4 (Closest Pair)
Points:
`(74,82), (98,46), (61,81), (72,80), (31,29), (46,7), (5,6), (39,64), (37,43), (29,91)`

- Closest pair indices: **0** and **3**
- Distance: **2.8284271247461903**

---

## 🛠 Technologies Used
- Java
- Console input/output
- Brute-force search and comparison

---

## 📂 Files
- `BruteForceStringMatch.java` – Brute-force string matching implementation
- `ClosestPair2D.java` – Brute-force closest pair of points in 2D implementation

---

## 🧪 Testing
The implementations were tested with multiple inputs and verified using the provided lab test cases.

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673