'''
Task10:-
========
grp1 = {"blr" : 5, "chn": 5, "hyd": 5  , "del" : 5 }

grp2 = {"blr" : 1, "mum": 2, "noida": 3, "del" : 4 }

Expected:-
==========

print(res) # {"blr"  : 6,

              "chn"  : 5,

              "hyd"  : 5,

              "del"  : 9,

              "mum"  : 2,

              "noida": 3}

'''
grp1 = {"blr" : 5, "chn": 5, "hyd": 5  , "del" : 5 }

grp2 = {"blr" : 1, "mum": 2, "noida": 3, "del" : 4 }

res = grp1.copy()

for keys,values in grp2.items():
    if keys in res:
        res[keys] = res[keys] + values
    else:
        res[keys] = values
print(res)

res1 = {key: grp1.get(key, 0) + grp2.get(key, 0) for key in set(grp1) | set(grp2)}
print(res1)






