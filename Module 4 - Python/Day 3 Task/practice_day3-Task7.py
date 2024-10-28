'''
Task7.1:-
========
Given:-
-------
num=4503

Problem:-
----------
>> using dictionary

Expected:-
-----------
four five zero three

Task7.2:-
----------

Given="eight-zero-one-four"

Expected:-
-----------
8014
'''
adict = {'zero': 0, 'one': 1, 'two': 2, 'three': 3, 'four': 4, 'five': 5, 'six': 6, 'seven': 7, 'eight': 8, 'nine': 9}
num=4503; given="eight-zero-one-four"
intlst = [int(digit) for digit in str(num)]

res1 = [key for digit in intlst for key,value in adict.items() if value == digit]
print(" ".join(res1))

res2 = int("".join(map(str,[adict.get(key) for key in given.split("-")])))
print(res2)



