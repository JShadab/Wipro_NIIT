## Practice Statement: International Standard Book Number

**International Standard Book Number (ISBN) is a unique numeric identifier for commercial books. The ISBN system was developed by the book publishers in order to provide a unique number to each book that is published throughout the world. ISBN numbers are usually printed on the back cover of a book. Before 2007, ISBNs were 10-digit long. Later on, ISBNs were extended to 13 digits.**

Write a program to create an ISBN-10 verifier that verifies if a given 10-digit ISBN is valid or not. The program takes the 10-digit ISBN as input.
- It returns 1, if the ISBN is valid
- It return 0, if the ISBN is not valid
- It returns -1, if it is a null or empty value  

**Steps to validate a 10-digit ISBN:**
- Calculate: 10 × 1st digit + 9 × 2nd digit + ...............+ 1 × 10th digit
- Divide the value obtained by 11.
- If the result is divisible by 11, the ISBN is valid.

**Sample input:**

    The ISBN Number is: 0201103311      

**Expected Output:**

    1           
----------------------------
**Sample input:**

    The ISBN Number is: 8999

**Expected Output:**
      
    0
------------------
**Sample input:**

    The ISBN Number is:

**Expected Output:**

    -1




