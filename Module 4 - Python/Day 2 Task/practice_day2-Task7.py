'''
Task7:-
=======
Write a program that asks the user how many days are in a particular month, and
what day of the week the month begins on (0 for Monday, 1 for Tuesday, etc), and then
prints a calendar for that month. For example, here is the output for a 30-day month that
begins on day 4 (Thursday):

S  M  T  W  T  F  S
         1  2  3
4  5  6  7  8  9  10
11 12 13 14 15 16 17
18 19 20 21 22 23 24
25 26 27 28 29 30
'''
no_days = int(input("Number of days in the Month:"))
day = int(input("What day of the week the month begins on (0 for Monday, 1 for Tuesday, etc): "))
print("  M   T   W   T   F   S   Sun")
print("    " * day,end="")
for i in range(1,no_days+1):
    print(f"{i:3} ",end="")
    if((day + i) % 7 ==0 ):
        print()
