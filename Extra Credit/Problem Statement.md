# Extra Credit
Dr. Pierre is a high school calculus teacher. His students often perform poorly on the tests so he thinks it’s a good idea to give extra credit to every student that gets at least one of any            
kth question right in order to increase his class average. 

# Problem
Given the number of questions on the test, the description of n students including an array of length m of integers showing which questions they got right, determine what the value of k for each class should be so that the largest amount of students in that class receive extra credit.

# Input
The first line of input will contain an integer t representing the number of classes Dr. Pierre has (1<=t<=10). The next t cases will start with an integer n (1<=n<=100), describing how many students are in the t<sup>th</sup> class, followed by n lines containing an integer m representing how many questions they got right (0<=m<=100), an array of length m including integers from 1 to 10^5 stating that the n<sub>i</sub> student got the array<sub>j</sub> question right.

# Output
For each of Pierre’s classes, output a single integer k, k cannot be equal to 1, representing the optimal value of k such that the amount of students receiving extra credit is maximized. If there are multiple answers, print the smallest among them. If nobody can receive extra credit print -1.

# Sample Input
2

4

2 1 5

2 3 6

3 2 4 6

4 2 4 6 8

3

1 7

1 5

2 3 6


# Sample Output
2

3






