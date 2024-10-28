'''
Task1:-
========
f1 = open("data.csv", "w")
f1.write("name,loc,salary\n")
f1.write("arun,blr,25000\n")
f1.write("hari,chn,45000\n")
f1.write("john,mum,30000\n")
f1.write("manu,hyd,35000")
f1.close()
>>run the above program - it will create a csv file
>>read the csv file store this data in a DATABASE TABLE

'''

import mysql.connector
from mysql.connector import Error
fr = open("data.csv", "r")
insert_data = fr.readlines()[1:]
print(insert_data)
for ele in insert_data:
    print(type(ele))

try:
    conn = mysql.connector.connect(host = 'localhost', port = 3306,user = 'root', password='MyNewPass',database = 'python')

except Error as e:
    print("Error while connecting to MySQL", e)

else:
    cur = conn.cursor()
    for record in insert_data:
        name,loc,sal = record.split(",")
        cur.execute("insert into task_1(name,location,salary) values(%s,%s,%s)",(name,loc,int(sal)))
    conn.commit()


finally:
    cur.close()
    conn.close()






