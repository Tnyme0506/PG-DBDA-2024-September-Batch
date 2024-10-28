'''
Task9:-
-------
Given a dictionary of students and their favourite colours:
people={'Arham':'Blue','Lisa':'Yellow',''Vinod:'Purple','Jenny':'Pink'}

1. Find out how many students are in the list
2. Change Lisa’s favourite colour to "Purple"
3. Remove 'Jenny' and her favourite colour
4. Sort and print students and their favourite colours alphabetically by name.
'''
people={'Arham':'Blue','Lisa':'Yellow','Vinod':'Purple','Jenny':'Pink'}
# 1. Find out how many students are in the list
lst = len(people.keys())
print(lst)

# 2. Change Lisa’s favourite colour to "Purple"
people["Lisa"] = "Purple"


# 3. Remove 'Jenny' and her favourite colour
people.pop("Jenny")
print(people)

# 4. Sort and print students and their favourite colours alphabetically by name.
people_sort = dict(sorted(people.items()))
print(people_sort)