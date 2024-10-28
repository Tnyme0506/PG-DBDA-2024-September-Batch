'''
Task7:-
-------
Write a Python program to count the elements in a list until an element is a tuple.

Sample input : list = [10, 20, 30, (40,50), 60]

Sample output = 3
'''
sample = [10, 20, 30, (40,50), 60]
count = 0
for ele in sample:
    if type(ele) != tuple:
        count += 1
    else:
        break

print(count)
