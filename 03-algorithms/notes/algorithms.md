## Algorithms

**Algorithms** are a set of step-by-step instructions for solving logical problems.
A program can be thought of as **Input → Algorithm → Output**. A  good algorithm saves time, memory and processing power. 
I’ll use them in almost every area of software development from sorting data to powering AI.

### Searching & Sorting

#### 1. Searching: finding something in a collection of data.

**Linear Search O(n)** - Check each item one by one.
- Simple, but gets slower as the list gets bigger.

**Binary Search O(log n)** - Only works if the data is sorted.
- Look at the middle → eliminate half → repeat.
- Much faster for large datasets.

#### 2. Sorting: putting data into an order, usually smallest → largest.

**Bubble Sort O(n²)**
- Compare neighboring items and swap them.
- very slow for large lists.

**Selection Sort O(n²)**
- Find the smallest item and put it in the correct position.
- Still slow for large lists.

**Merge Sort O(n log n)**
- Split the list into smaller pieces.
- Sort the smaller pieces.
- Merge them back together.
- Much faster than O(n²) algorithms for large datasets.

### Big-O / Asymptotic Notation

Big-O describe how an algorithm's work grows as the input gets bigger.

* O(1) → constant → doesn't really grow
* O(log n) → grows very slowly
* O(n) → grows directly with the amount of data
* O(n log n) → faster than n²
* O(n²) → grows very quickly

**Note:** *Don't just memorise O(n), O(n²), and O(n log n). Understand what happens when the input gets bigger*.

- O(n²) becomes much worse than O(n log n) as the amount of data gets large.
- O(n²) = work grows very quickly.
- O(n log n) = work grows much more slowly.

### Recursion

A function solving a problem by solving smaller versions of the same problem.

Two important parts:

- **Base case** → the problem is small enough to solve immediately.
- **Recursive case** → make the problem smaller and call the function again.

**Mental Model:**
Big problem → smaller problem → even smaller problem → base case
Merge sort uses this idea.