# Lab 05 – Transform and Conquer (Element Uniqueness & Mode)

## 📌 Course
Algorithms Analysis

---

## 🧩 Problem Statement
This lab demonstrates the **Transform and Conquer** strategy by solving two problems:

1) **Element Uniqueness**: Determine whether all elements in an array are unique.
2) **Mode**: Find the value that occurs most frequently in an array.

Instead of using brute-force nested loops, both problems apply a transformation
step (sorting) followed by a linear scan.

---

## 🧠 Algorithms Implemented

### 1) Element Uniqueness
- **Transform:** Sort the array.
- **Conquer:** Compare adjacent elements to detect duplicates.

If any adjacent pair is equal, duplicates exist.

- **Time Complexity:** `O(n log n)`

---

### 2) Mode Finding
- **Transform:** Sort the array.
- **Conquer:** Scan the sorted array once to count frequencies of consecutive elements.
> In case of ties, any one of the most frequent values may be returned.
- **Time Complexity:** `O(n log n)`

---

## ✅ Results

### Element Uniqueness Test
Input arrays:
```text
{5, 3, 8, 1, 9}
{4, 7, 2, 7, 1}
```
Output:
- Array 1 → **All elements are unique**
- Array 2 → **Not Unique**

---

### Mode Test
Input array:
```text
{5, 1, 5, 3, 3, 3, 2, 5, 1, 5}
```
Output:
- Mode of array: **5**

---

## 🛠 Technologies Used
- Java
- Transform and Conquer approach
- Sorting (`Arrays.sort`)
- Linear scanning

---

## 📂 Files
- `ElementUniqueness.java` – Checks if all array elements are unique
- `ModeFinder.java` – Finds the mode of an array

---

## 🧪 Testing
The implementations were executed and verified using the provided test cases.

---

## 👤 Student Information
- Name: Albaraa Alharbi
- Student ID: 2342673