'''
Task2:-
=======
From the DATABASE TABLE, READ THE TABLE contents and
store them in a text file
'''

import mysql.connector

conn = mysql.connector.connect(host = 'localhost', port = 3306,user = 'root', password='MyNewPass',database = 'python')

cur = conn.cursor()

cur.execute("select * from task_1")

insert_data = cur.fetchall()

print(insert_data)

cur.close()
conn.close()



fw = open("data.txt", "w")

for record in insert_data:
    string = " ".join(map(str,record))
    fw.write(string + "\n")

fw.close()




