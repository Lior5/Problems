# Shopping

Jean Baptiste is new to the neighborhood and he has a list of items he knows he often shops for, that’s why he would like to go around the neighborhood to visit all the stores and find out where he can get the cheapest deal overall. However, he doesn’t have much time so he needs you to figure out at which shop he should buy his items, and how long it will take him to get there assuming he starts off at shop number 1. Assume the shops are numbered in the order that they are given.
Jean Baptiste needs to get all his items from a single store.

# Problem

Given the list of items Jean Baptiste likes to buy, the number of shops in the neighborhood, and their products and prices, along with the time it takes to get from one shop to another, determine where Jean can get the best deal and the minimum amount of time it will take him to get there.

# Input

The first line of input will be an integer T (1<=t<=10) representing the number of items Jean wants to buy.
The next line will contain an array of strings of length T representing which items Jean Baptiste needs to buy.
The following line will contain and integer N (1<=N<=100) representing how many shops are in Jean’s neighborhood.
The next N*3 lines will contain the information about each store.
The first line will be the name of the store
The second will have an array of 10 strings representing the products it has for sale
And the third will have 10 integers representing the cost of each product (1<=cost<=10,000).
The next line will have an integer M (0<=M<=summation up to N-1), representing the total number of connections between stores.
The next M lines will contain 3 integers a, b, c (1<=a,b<=n) (1<=c<=100) a and b stating that there is a link between stores a and b, and c stating the time to travel that link.

# Output

Print out the name of the store where it’s the cheapest to buy the items Jean Baptiste needs and an integer representing the minimum amount of time it would take him to get there. If there are multiple stores with the same total price, print the one that Jean can get to in the smallest amount of time. It is guaranteed that he will be able to find the items he needs at at least one store.

# Sample Input

3
Eggs Cheese Bread
3
Walmart
Eggs Cheese Bread Chicken Avocado Tomatoes Banana Milk Pie Cookies  
10 10 11 1 2 3 4 5 6 7
Publix
Biscuits Cake Donuts Yogurt Cereal Eggs Cheese Bread Spoons Forks
7 6 5 4 3 8 12 10 2 1
Target
Eggs Cheese Chicken Shirts Pants Candy Sponge Spatulas Laptops Phones
1 1 1 1 1 1 1 1 1 1
3
1 3 5
1 2 5
2 3 5

# Sample Output

Publix 5
