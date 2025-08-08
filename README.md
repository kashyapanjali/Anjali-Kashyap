# Anjali Kashyap - Full Stack Developer Screening Test

## Project Overview

This repository contains solutions for the TANDEMLOOP Technologies Full Stack Developer screening test. All problems are implemented in **Java** programming language.

## Programming Language

- **Language**: Java
- **IDE**: VS Code

## Problem Solutions

### Problem-1: Calculator Class

**File**: `Problem1.java`

**Description**: A calculator class that performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division) using OOPs concept.

**Input Parameters**:

- `a` (double): First number
- `b` (double): Second number
- `operation` (String): Type of operation (+, -, \*, /)

**Features**:

- Input validation for division by zero
- Case-insensitive operation handling
- object-oriented design with Calculator class

**Usage**:

```bash

javac Problem1.java
java Problem1
```

### Problem-2: Odd Number Series Generator

**File**: `Problem2.java`

**Description**: Generates a series of odd numbers starting from 1, with the count based on input value.

**Input**: Single integer `a`
**Output**: Series of odd numbers from 1 to (2a-1)

**Examples**:

- Input: 1 → Output: 1
- Input: 2 → Output: 1, 3
- Input: 3 → Output: 1, 3, 5
- Input: 4 → Output: 1, 3, 5, 7

**Usage**:

```bash

javac Problem2.java
java Problem2
```

### Problem-3: Conditional Odd Number Series

**File**: `Problem3.java`

**Description**: Generates odd number series with special conditions based on input value.

**Input**: Single integer `a`
**Output**: Odd numbers series with specific pattern

**Examples**:

- Input: 1 → Output: 1
- Input: 2 → Output: 1
- Input: 3 → Output: 1, 3, 5
- Input: 4 → Output: 1, 3, 5
- Input: 5 → Output: 1, 3, 5, 7, 9

**Logic**: For even input, generates (a-1) odd numbers; for odd input, generates (a) odd numbers.

**Usage**:

```bash

javac Problem3.java
java Problem3
```

### Problem-4: Multiples Counter

**File**: `Problem4.java`

**Description**: Counts how many numbers in the input array are multiples of each number from 1 to 9.

**Input**: Array of integers
**Output**: Dictionary/Map showing count of multiples for each number 1-9

**Example**:

- Input: [1,2,8,9,12,46,76,82,15,20,30]
- Output: {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

**Features**:

- Uses LinkedHashMap to maintain order
- Handles dynamic array input

**Usage**:

```bash

javac Problem4.java
java Problem4
```

## How to Run

### Compilation and Execution

1. **Compile all files**:

   ```bash
   javac *.java
   ```

2. **Run individual problems**:
   ```bash
   java Problem1    # Calculator
   java Problem2    # Odd Series Generator
   java Problem3    # Conditional Odd Series
   java Problem4    # Multiples Counter
   ```

## File Structure

```
Anjali Kashyap/
├── README.md
├── Problem1.java      # Calculator implementation
├── Problem2.java      # Odd number series generator
├── Problem3.java      # Conditional odd series
├── Problem4.java      # Multiples counter
└── *.class            # Compiled Java bytecode files
```

## Technical Details

### Code Quality

- **Comments**: Comprehensive inline comments explaining logic
- **Error Handling**: Input validation and exception handling

### Algorithm Complexity

- **Problem 1**: O(1) - Constant time operations
- **Problem 2**: O(n) - Linear time based on input size
- **Problem 3**: O(n) - Linear time based on input size
- **Problem 4**: O(n\*m) - Where n is array size, m is 9 (fixed)

## Author

**Anjali Kashyap**

- **Position Applied**: Full Stack Developer
- **Company**: Tandemloop Technologies Private Limited
- **Submission Date**: [08/08/2025]
