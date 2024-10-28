'''
Task2:-
-------
Define a procedure histogram() that takes a list of integers and prints a histogram
to the screen. For example, histogram([4, 9, 7]) should print the following:
****
*********
*******
'''
def histogram(integers):
    for num in integers:
        print('*' * num)

histogram([5,6,7,8])
print("-------------------------")
histogram([1,2,3,4])