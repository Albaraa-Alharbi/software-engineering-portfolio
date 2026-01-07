# Lab 04 – Divide and Conquer (Quicksort & Binary Search)

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
This lab demonstrates the **Divide and Conquer** paradigm by implementing:

1) **Quicksort** using the last element as the pivot.
2) **Recursive Binary Search** on a sorted array.

Both implementations follow the standard algorithms discussed in class and are
validated using test cases.

---

## 🧠 Algorithms Implemented

### 1) Quicksort
The array is partitioned around a pivot (last element), such that:
- Elements smaller than the pivot are placed on the left
- Elements greater than or equal to the pivot are placed on the right

The same process is applied recursively to each subarray.

- **Time Complexity (Average):** `O(n log n)`
- **Time Complexity (Worst):** `O(n²)`

---

### 2) Recursive Binary Search
Binary Search repeatedly divides the search space into two halves until:
- The key is found, or
- The subarray size becomes zero (not found)

- **Time Complexity:** `O(log n)`

---

## ✅ Results

### Quicksort Test
Input array:
```text
45 68 90 29 34 89 17
```
Output:
```text
17 29 34 45 68 89 90
```

---

### Binary Search Test
Sorted array:
```text
3 5 9 12 20 34 50
```
- Searching for `20` → **Found at index 4**
- Searching for `7` → **Not found**
> Indices are 0-based.

---

## 🛠 Technologies Used
- Java
- Divide and Conquer algorithms
- Recursion
- Console output for verification

---

## 📂 Files
- `QuickSort.java` – Quicksort implementation
- `RecursiveBinarySearch.java` – Recursive Binary Search implementation

---

## 🧪 Testing
The implementations were executed and verified using the provided test cases.

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673