'''
Task11:-
========
using for loop
print the following outputs

output1:-
---------
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

output2:-
--------
A
B B
C C C
D D D D
'''
print("output 1 :-")
print("-------------")
for i in range(1,6):
    print(f"{i} " * i)

print("output 2 :-")
print("-------------")
for i in range(1,5):
    print(f"{chr(64 + i)} " * i)
