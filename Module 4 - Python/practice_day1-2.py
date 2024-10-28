import os

num1 = int (input("Enter First Number: "))
num2 = int (input("Enter Second Number: "))

res1 = num1 + num2
print(res1)
print("Result = ", res1)
print("Result = " + str(res1))
print("Sum of %d and %d = %d" %(num1,num2,res1))
print("Sum of {0} and {1} = {2}".format(num1, num2, res1))
print(f"Sum of {num1} and {num2} = {res1}")