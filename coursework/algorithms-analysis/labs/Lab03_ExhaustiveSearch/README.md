# Lab 03 – Exhaustive Search (Knapsack & TSP)

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
This lab demonstrates **exhaustive search** techniques by solving two classic problems:

1) **0/1 Knapsack**: Find the subset of items that maximizes total value without exceeding the capacity.
2) **Traveling Salesperson Problem (TSP)**: Find the shortest route that visits all nodes once and returns to the start.

---

## 🧠 Algorithms Implemented

### 1) Brute-Force 0/1 Knapsack (Bitmask Enumeration)
Enumerates all `2^n` subsets of items using a bitmask and selects the best feasible subset.

- **Output:** picked vector, total value, total weight  
- **Time Complexity:** `O(2^n · n)`

### 2) Exhaustive TSP (Permutation / Backtracking)
Fixes the start node and explores all permutations of remaining nodes, tracking the minimum tour distance.

- **Output:** best route, minimum distance  
- **Time Complexity:** `O((n-1)!)`

---

## ✅ Results

### Knapsack Test (C = 10)
Weights: `(1, 1, 5, 3, 4, 1, 3, 3, 5, 3)`  
Values: `(8, 10, 10, 4, 6, 9, 8, 8, 10, 7)`

- Picked vector (P): `[1, 1, 0, 0, 0, 1, 1, 1, 0, 0]`
- Total value: **43**
- Total weight: **9**

### TSP Test (5 nodes)
Best route (start/end at node 1): **123451**  
Minimum distance: **31**
> Route indices are shown using 1-based numbering.

---

## 🛠 Technologies Used
- Java
- Exhaustive search (bitmask enumeration, backtracking)
- Console output for verification

---

## 📂 Files
- `BruteForceKnapsack.java` – Knapsack solver using subset enumeration
- `ExhaustiveTSP.java` – TSP solver using exhaustive route search

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673