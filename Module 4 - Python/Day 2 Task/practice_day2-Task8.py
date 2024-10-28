'''
Task8:-
========
Define a procedure histogram() that takes a list of integers and prints a histogram
to the screen. For example, histogram([4, 9, 7]) should print the following:

****
*********
*******
'''
def histogram():
    num = int(input("Enter the number of Integers: "))
    lst = []
    for i in range(num):
        integer = int(input(f"Enter the {i + 1} integer:"))
        lst.append(integer)

    print("Histogram:")
    for ele in lst:
        print("*" * ele)

histogram()