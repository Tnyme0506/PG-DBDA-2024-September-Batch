'''
Task4:-
-------
A pangram is a sentence that contains all the letters of the English alphabet at
least once, for example: The quick brown fox jumps over the lazy dog. Your task here is
to write a function to check a sentence to see if it is a pangram or not.
'''
def is_panagram(input_string):
    cleaned_string = ""
    punctuation = r"'.?,!"
    alphabet = "abcdefghijklmnopqrstuvwxyz"

    input_string = "".join([char for char in input_string if char not in punctuation])

    cleaned_string = set(input_string.replace(" ","").lower())
    cleaned_string = "".join(sorted(cleaned_string))
    print(cleaned_string)

    if(cleaned_string == alphabet):
        print("Sentence is a Panagram")
    else:
        print("Sentence is not a Panagram")

string = input("Enter Sentence: ")
is_panagram(string)