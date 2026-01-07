# Lab 06 – Hashing (Linear Probing)

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
This lab explores **hash tables with linear probing** as a collision-resolution technique.
The objectives are:

1) Insert keys into a hash table using **closed hashing (linear probing)**.
2) Validate the correctness of insertion with a fixed dataset.
3) Study the effect of **load factor** on the average number of search comparisons.

---

## 🧠 Algorithms Implemented

### 1) Hash Table Insertion using Linear Probing
Each key is mapped using the hash function:
```text
h(key) = key mod table_size
```

If a collision occurs, the algorithm probes the next cell sequentially
(wrapping around if necessary) until an empty slot is found.

- **Collision Resolution:** Linear Probing
- **Time Complexity (Average):** `O(1)`
- **Time Complexity (Worst):** `O(n)`

---

### 2) Load Factor and Search Performance
The load factor is defined as:
```text
α = N / M
```
Where:
- `N` = number of keys
- `M` = hash table size

For this experiment:
- α = 0.5
- M = 2 × N

Random keys are inserted and multiple searches are performed to measure
the number of comparisons and compute the average.

---

## ✅ Results

### Linear Probing Validation (M = 19)
Inserted keys:
```text
{175, 26, 72, 60, 113, 123, 62, 160, 160, 157}
```
Final hash table:
```text
[-1, -1, -1, 60, 175, 62, 157, 26, 160, 123, 160, -1, -1, -1, -1, 72, -1, -1, 113]
```

---

### Load Factor Experiment (α = 0.5)
- Table size: `M = 20`
- Number of searches: `10`
- Output: number of comparisons per search
- Average number of comparisons is printed at the end
> Results may vary between runs due to randomized key generation.

---

## 🛠 Technologies Used
- Java
- Hash tables
- Linear probing
- Randomized testing

---

## 📂 Files
- `LinearProbing.java` – Hash table insertion using linear probing
- `LoadFactorTest.java` – Load factor experiment and average comparisons

---

## 🧪 Testing
The programs were executed and verified using the provided datasets
and randomized test cases.

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673