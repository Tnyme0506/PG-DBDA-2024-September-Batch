'''
Task3:-
=======
Write program to find the most repeated word in a file
Assume the file "data.txt" contains
-----------------------------------
this that this this this that
then that that that
that this then that
Expected:-
----------
Most repeated word in the file is = this
'''
import collections
fr = open(r"C:\Users\sucha\Desktop\C-DAC\Module 4 - Python\Day 5 Task\task_3.txt", "r")
sentence = fr.read()
print(sentence)
lst1 = sentence.split(" ")
dict1 = collections.Counter(lst1)
print(dict1)
res1 = sorted(dict1,key= lambda k:dict1[k])[-1]
print("Most repeated word in the file is =",res1)
print("------------------------------------------------")
sentence = sentence.replace("\n"," ")

print(sentence)
lst2 = sentence.split(" ")
dict2 = collections.Counter(lst2)
print(dict2)
res2 = sorted(dict2,key= lambda k:dict2[k])[-1]
print("Most repeated word in the file is =",res2)

#print("Most repeated word in the file is =",dict.most_common()[0][0])
