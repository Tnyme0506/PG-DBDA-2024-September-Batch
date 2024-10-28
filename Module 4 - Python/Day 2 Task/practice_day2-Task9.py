'''
Task9:-
=======
Given:-
========
data = [10,20,30,40,50]

Expected:-
----------
res="10-20-30-40-50"

'''
data = [10,20,30,40,50]
str_data = []
for ele in data:
    str_data.append(str(ele))

res = "-".join(str_data)
print(res)