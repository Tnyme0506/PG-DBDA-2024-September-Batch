'''
Task4:-
=======
Define a function overlapping () that takes two lists and returns True
if they have at least one member in common, False otherwise.
'''

def overlapping(lst1,lst2):
    for ele in lst1:
        if ele in lst2:
            return True
        else:
            return False

lst1 = ['ram','shyam']
lst2 = ['tam','karam']

res = overlapping(lst1,lst2)
print(res)