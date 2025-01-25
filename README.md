# Find the Second Largest Element in an Array

A java program to find the second largest element in an array without using any built in method. The program should not rely on initializing variables with Integer.MIN_VALUE or similar constants. Ensure that the solution handles edge cases, such as arrays with duplicate values or arrays with fewer than two elements.

## Features
- Handles arrays with duplicate values.
- Validates that the array has at least two elements.
- Efficiently finds the second largest element using a single pass through the array (after initialization).
- Includes user-friendly messages for edge cases, such as when no second largest element exists.

## How It Works
1. **Initialization**: The program initializes the largest and second largest elements from the array.
2. **Edge Case Handling**: 
   - If the array has fewer than two elements, the program prints an error message.
   - If all elements in the array are the same, the program reports that there is no second largest element.
3. **Comparison Logic**:
   - Iterates through the array, updating the largest and second largest elements as necessary.
   - Uses bitwise XOR swapping to ensure the proper order of `largest` and `secondLargest`.

## Input and Output
- The program prompts the user to input the size of the array and its elements.
- It outputs the second largest element or an appropriate message for edge cases.

## Example Usage
### Input:
- Enter the size of the array (at least 2): 6
- Enter the elements of the array: 3 1 4 4 2 5
### Output:
- Second largest element of the array is: 4
## Edge Cases
1. **Array with fewer than two elements**:
   - Input: `[7]`
   - Output: `There is less than two elements in the array.`
2. **Array with all identical elements**:
   - Input: `[5, 5, 5, 5]`
   - Output: `There is no second largest element.`
3. **Array with exactly two distinct elements**:
   - Input: `[1, 2]`
   - Output: `Second largest element of the array is: 1`
  
# Divisible Number Checker

This program checks for numbers in a given range that are **not divisible by 2 or 3**. 

## Features
- Allows users to input a range (start and end).
- Displays all numbers within the specified range that are not divisible by 2 or 3.

## Code Overview
The program consists of two main components:

1. **Method `isNotDivisibleBy2or3`**:
   - This method takes an integer as input.
   - Returns `true` if the number is **not divisible by 2 or 3**.
   - Returns `false` otherwise.

2. **Main Method**:
   - Accepts the start and end of the range from the user via the console.
   - Iterates through the range to find and print numbers that meet the criteria.


## Example
**Input:**
   - Enter the start range:
   - 5
   - Enter the end range:
   - 15

**Output:**
   - The numbers are not divisible by 2 or 3 are:
   - 5 7 11 13

## Edge Cases
- **Start and End Range are Equal:**
  - The program checks the single number.
- **Start Range Greater than End Range:**
  - No numbers will be displayed as the range is invalid.
- **Negative Numbers:**
  - The program works for negative ranges as well.

## Notes
- Ensure you enter valid integer values for the start and end range.
- The program is case-insensitive and accepts any valid range.



