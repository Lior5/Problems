# In Line

Lemonade man owns an extremely popular lemonade stand. On some days he gets so many customers so he decided to come up with a way of organizing them in a line. The way it works is whenever a person shows up to the line, they receive a number representing their position in line. Lemonade man knows which number’s turn it is with each serving, so he asks the first person in line for their number to make sure it’s their turn to be served or that their turn had already passed (it’s ok if it already passed). If their turn has not yet come, lemonade man becomes suspicious of how they got to the front of the line so quickly, and he sends them all the way to the back of the line. The suspect, however, becomes too angry to wait in the entire line so instead they leave and try coming back the next day. The next day when they come back, they decide to cut in line 1 person less than they did before, to try and make it less obvious. They repeat this until it works.

# Problem

Given the numbers each customer in line has on the first day in order from front of the line to the back, determine how long a chosen customer will have to wait in line until it’s actually their turn to be served, assuming each serving takes 1 second, and that the same amount of customers show up each day in the same order.

# Input

The first line of input will be an integer T (1<=T<=10) representing the number of test cases. For each test case there will be 2 more lines of input. The first line will contain an integer N (1<=N<=10^5) representing the number of customers and another integer K (1<=K<=n) representing the chosen customer, and the second line will contain N integers representing the numbers each customer received.

# Output

For each case output a single number representing how long in seconds the chosen customer will have to wait in line until it’s their turn to be served.

# Sample Input


5
7 3
1 2 7 3 4 5 6
7 3
1 2 3 7 4 5 6
10 6
1 2 3 4 5 9 6 7 8 10
5 3
1 2 4 3 5
2 1
1 2


# Sample output


20
2
26
5
0
