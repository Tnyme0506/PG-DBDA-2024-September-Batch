'''
Task8:-

=======
grps = ["alpha", "beta", "delta", "alpha", "beta", "omega","alpha"]

Problem:-
---------
find the unique & duplicate values in above list

Expected:-
----------
print(unique)      # ["delta", "omega"]

print(duplicates)  # ["alpha", "beta"]
'''
grps = ["alpha", "beta", "delta", "alpha", "beta", "omega","alpha"]


unique = []
duplicates = []

for ele in grps:
    cnt = grps.count(ele)
    if(cnt > 1):
        if ele not in duplicates:
            duplicates.append(ele)
    else:
        unique.append(ele)

print(unique)
print(duplicates)
