'''
Task9:-
=======
Write a program to display the first and last word of a given file
Enter a filename : one.txt
contents of one.txt:-
---------------------
hello world of unix was
the output of the above
program which was given
Expected output is :-
---------------------
hello - was
the - above
program - given
'''
with open("one.txt","w") as fw:
    fw.write("hello world of unix was\n")
    fw.write("the output of the above\n")
    fw.write("program which was given\n")

with open("one.txt","r") as fr:
    for ele in fr:
        first,last = ele.split(" ")[0] ,ele.split(" ")[-1]
        print(first + " - " + last)




