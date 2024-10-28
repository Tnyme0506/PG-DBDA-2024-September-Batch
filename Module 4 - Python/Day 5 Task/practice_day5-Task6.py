'''
Task6:-
=======
Write a function filter_long_words() that takes a list of words and an integer n
and returns the list of words that are longer than n
'''

def filter_long_words(*words,n):
    filtered_list = [word for word in words if len(word) > n]
    return filtered_list

flist = filter_long_words("ant","robber","yahoo","doraemon",n=4)
print(flist)
