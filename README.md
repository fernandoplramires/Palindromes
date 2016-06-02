##Palindromes challenge##

Problem Description: Create a Java program to solve the following problem.
The problem is as follows: choose a number, reverse its digits and add it to the original. 
If the sum is not a palindrome (which means, it is not the same number from left to right and right to left), repeat this procedure.

#####For example#####
195 (initial number) + 591 (reverse of initial number) = 786
786 + 687 = 1473
1473 + 3741 = 5214
5214 + 4125 = 9339 (palindrome)

In this particular case the palindrome 9339 appeared after the 4th addition. 
This method leads to palindromes in a few step for almost all of the integers. 

But there are interesting exceptions. 196 is the first number for which no palindrome has been found. 
It is not proven though, that there is no such a palindrome.

#####Input sample:#####
Your program should accept as its first argument a path to a filename. 
Each line in this file is one test case. 
Each test case will contain an integer n < 10,000. 
Assume each test case will always have an answer and that it is computable with less than 100 iterations (additions).

#####Output sample:#####
For each line of input, generate a line of output which is the original input, 
the number of iterations (additions) to compute the palindrome and the resulting palindrome. 
(they should be on one line and separated by a single space character).

For example:
195 4 9339

#####Guidelines:#####
01.The solution must be correct.
02.The solution should not make use of external libraries other than for testing purposes.
03.The solution should demonstrate a candidate’s abilities as a software engineer including, for example, TDD principles, general object-oriented principles and domain modeling principles.
04.Please submit a solution that captures the business domain for the problem.
05.Git should be used as the versioning control system to demonstrate the progress of the coding.
