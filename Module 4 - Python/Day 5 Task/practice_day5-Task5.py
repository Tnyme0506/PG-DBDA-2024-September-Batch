'''
Task5:-
=======
Write a function find_longest_word() that takes a list of words and returns the
length of the longest one.
'''

def find_longest_word(*word):
    lengths = [len(ele) for ele in word]
    return max(lengths)

# word[lengths.index(max(lengths))] for the word

res = find_longest_word("stop","start","successful")
print(res)