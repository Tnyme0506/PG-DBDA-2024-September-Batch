import os
city = "Hyderabad"
print(len(city))

#program 1:
print(city[:1])

#program 2 dyh:
print(city[:3].lower()[::-1])

#program 3 dera:
print(city[2:-3])

#program 4 hyderaBAD:
print(city[0].lower()+city[1:-3]+city[-3:].upper())

#program 5 hdrbd:
print(city.lower()[::2])

#program 6 
city1 = ["blR", "koL", "deL", "Mumbai", "Hyderabad"]
for elem in city1:
    res = elem[0].upper() + elem[-1].lower()
    print(res)

#program 7:-
