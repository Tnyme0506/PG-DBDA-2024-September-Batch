'''
Task1:-
-------
depts={
       101 : "sales",
       102 : "purch",
       103 : "accts",
       104 : "finan"
      }
emps = {
         "arun" : "blr-101-alpha",
         "ravi" : "chn-104-beta",
         "hari" : "hyd-102-delta",
         "manu" : "del-103-omega"
       }

Expected:-
-----------
Enter the emp name : ravi
      location     : blr
      dept id      : 104
      dept name    : finan
      proj name    : beta

Enter the emp name : john
Error - Invalid emp name
'''
depts={
       101 : "sales",
       102 : "purch",
       103 : "accts",
       104 : "finan"
      }
emps = {
         "arun" : "blr-101-alpha",
         "ravi" : "chn-104-beta",
         "hari" : "hyd-102-delta",
         "manu" : "del-103-omega"
       }
name = input("Enter the Employee Name : ")
if name in emps:
    location,dept_id,proj_name = emps[name].split("-")
    dept_name = depts[int(dept_id)]
    print(" Location: ",location,"\n","Department ID: ",dept_id,"\n","Department Name: ",dept_name,"\n","Project: ",proj_name)
else:
    print("Error - Invalid Employee Name")
