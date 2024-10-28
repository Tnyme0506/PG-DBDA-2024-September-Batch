'''
Task10:-
=========
Given:-
========
data = "10-50-25-12-85"

Expected:-
==========
res = "11-51-26-13-86"
'''
data = "10-50-25-12-85"
lst_data = data.split("-")
str_data = []
for ele in lst_data:
    ele = int(ele)+1
    str_data.append(str(ele))

res = "-".join(str_data)
print(res)
