# Pattern Printing System

A console-based Pattern Printing System built using Java. The project allows users to explore and print different star, number, alphabet, and advanced patterns by selecting a category and pattern from the menu. It also includes input validation, selection previews, and a project report that tracks the patterns printed during the session.

## Features

- 4 Pattern Categories
- 8 Star Patterns
- 6 Number Patterns
- 5 Alphabet Patterns
- 5 Advanced Patterns
- Input validation for menu choices
- Input validation for rows and columns
- Pattern selection preview
- Ability to print multiple patterns in one session
- Project report showing the total number of patterns printed and category-wise counts

## Pattern Categories

### ⭐ Star Patterns

1. Right Triangle
2. Left Triangle
3. Pyramid
4. Inverted Triangle
5. Diamond
6. Hollow Square
7. Hollow Rectangle
8. Hollow Right Triangle

### 🔢 Number Patterns

1. Number Triangle
2. Reverse Number Triangle
3. Repeating Number Triangle
4. Floyd's Triangle
5. Number Pyramid
6. Palindrome Number Pyramid

### 🔤 Alphabet Patterns

1. Alphabet Triangle
2. Reverse Alphabet Triangle
3. Repeating Alphabet Triangle
4. Continuous Alphabet Triangle
5. Alphabet Pyramid

### 🚀 Advanced Patterns

1. Butterfly Pattern
2. Concentric Number Square Pattern
3. Consecutive Number Pyramid
4. Ascending Number Pyramid
5. Binary Triangle Pattern

## Concepts Used

- Methods
- Method Overloading
- Loops
- Nested loops
- Conditional statements
- Switch expressions
- Scanner for user input
- Input validation
- Breaking a larger program into smaller methods

## How It Works

1. The program displays the pattern categories.
2. The user selects a category.
3. The program displays the patterns available in that category.
4. The user selects a pattern.
5. The program asks for the required number of rows or columns.
6. A selection preview is displayed.
7. The selected pattern is printed in the console.
8. The user can choose to print another pattern.
9. At the end, a project report displays the total number of patterns printed along with category-wise counts.

## How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA or any Java-compatible IDE.
3. Make sure Java is installed and configured.
4. Run `PatternPrintingSystem.java`.
5. Follow the instructions displayed in the console.

## Example

```text
===================================
Welcome to Pattern Printing System
===================================

Choose Pattern Category:

1. Star Patterns
2. Number Patterns
3. Alphabet Patterns
4. Advanced Patterns

Enter your choice: 1

-------Star Patterns-------

1. Right Triangle
2. Left Triangle
3. Pyramid
4. Inverted Triangle
5. Diamond
6. Hollow Square
7. Hollow Rectangle
8. Hollow Right Triangle

Enter your choice: 3

Enter number of rows: 5


--------SELECTION PREVIEW--------

Category: Star Patterns
Pattern: Pyramid
Rows: 5

---------------------------------

    *
   ***
  *****
 *******
*********

Do you want to print another pattern?
1. Yes
2. No

Enter your choice: 2


-------------------------------------
PROJECT REPORT
-------------------------------------

Total Patterns Printed: 1

Star Patterns: 1
Number Patterns: 0
Alphabet Patterns: 0
Advanced Patterns: 0

Thank You For Using
Pattern Printing System!
-------------------------------------