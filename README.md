# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that attempts to access an array element outside its valid range.  The `bugSolution.java` file provides a corrected version.

## Bug Description

The error occurs because of an incorrect index used to access an array element. Java arrays are zero-indexed, which means the first element has an index of 0, the second is 1, and so on. Attempting to access an index beyond the size of the array will cause an `ArrayIndexOutOfBoundsException`. 

## Solution

The solution involves carefully checking array indices to ensure they are within the valid range of 0 to `array.length - 1`. The `bugSolution.java` demonstrates proper index handling to avoid this exception.