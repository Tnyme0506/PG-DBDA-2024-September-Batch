'''
Task10:-
========
write a program to convert the file contents of upper case
Enter the file name : one.txt
Enter the output file : out.txt
contents of one.txt:-
---------------------
hello world of unix was
the output of the above
program which was given
contents of out.txt:-
---------------------
HELLO WORLD OF UNIX WAS
THE OUTPUT OF THE ABOVE
PROGRAM WHICH WAS GIVEN
'''
with open("one.txt","r") as fr:
    inp = fr.readlines()

inp = [word.upper() for ele in inp for word in ele.split(" ")]
inp = " ".join(inp)

with open("out.txt","w") as fw:
    fw.write(inp)
