# Computer Science Fundamentals

The goal of this document is to understand what the computer is doing under the hood.
These are my personal reference notes on core computer science concepts.

---

## What is Computer Science?

**Computer Science** is the study of computers, computing and their theoretical and practical applications.
CS applies the principles of mathematics, engineering and logic to plenty of functions, 
incl. algorithm formulation, software and hardware development, and AI. At its core, CS is about **problem-solving**.

### Importance and Application of Computer Science?

**Computer Science** is important because almost every sector needs digital transformation. CS seats at the heart of
so many important industries. There are more opportunities if I understand it well. Knowing how to design systems,
protect data and build intelligent software gives me endless career opportunities.

Key applications of computer science include:

- **Healthcare:** Developing diagnostic tools and managing patient data.
- **Finance:** Automating trading systems and enhancing cybersecurity.
- **Education:** Creating adaptive learning platforms and virtual classrooms.
- **Entertainment:** Powering video games, streaming services and virtual reality experience.

## Core concepts in Fundamentals of Computer Science I should know are:

### Week 1: Algorithms

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

### Week 2: Data Structure

If I want fast access to data I need to choose the right structure. **Arrays, Stacks, Queues, Trees and Graphs** each has 
its purpose. Some are better for searching and others are ideal for storing relationships between elements. 
Understanding how data is structured will give me the potential to build smarter, faster systems.

*(to expand on after more research, Abstract Data Types. Queues, Stacks. Linked Lists. Trees, Binary Search Trees. Hash Tables. Tries.)*

### Week 3: Computer Architecture and Hardware Basics

Understanding what's inside a computer helps me write better software. I'm learning how CPUs, memory, input/output devices 
and storage work together. If I know how data moves through hardware, I can make my code more efficient.

**Note:** *Java hides manual memory management, but the ideas of stack, heap and references still matter*.

### Memory

- Computers have limitations because they have a finite amount of memory/bits.
- **Memory addresses and pointers:**
- **Pointers:**
- **Stack:** 
- **Heap:**
- **Dynamic Memory Allocation:**
- **Segmentation Faults:**
- **Buffer Overflow:**
- **File I/O:**
- **Images:**

*(to add after the research. )*

### Week 4: Computer Networking and Internet Fundamentals

Everytime I send a message, stream a video or visit a website, **networking protocols** are in play.
Learning how **IP addresses, DNS, Routing and encryption work** to keep systems connected and secure is essential.

*(to expand on after more research)*

### Week 5: Databases and Data Management

Data powers everything, but only if it's well organised. Learning the basics of **relational and non-relational databases**,and understanding how to **query them using SQL** is essential. Good database design can mean the difference between a lightning-fast app and one that frustrates users.

*(to expand on after more research)*

### Week 6: Software Development Life Cycle (SDLC)

Software isn’t built in one step. It evolves from **planning and design to testing, deployment and maintenance**. 
The SDLC gives you a framework to manage this process, reduce risk and improve quality.

*(to expand on after more research)*
