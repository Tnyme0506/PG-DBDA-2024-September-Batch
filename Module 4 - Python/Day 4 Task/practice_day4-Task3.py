'''
Task3:-
-------
Write a version of a palindrome recognizer that also accepts phrase palindromes
such as "Go hang a salami I'm a lasagna hog.", "Was it a rat I saw?", "Step on no pets",
"Sit on a potato pan, Otis", "Lisa Bonet ate no basil", "Satan, oscillate my metallic
sonatas", "I roamed under it as a tired nude Maori", "Rise to vote sir", or the exclamation
"Dammit, I'm mad!". Note that punctuation, capitalization, and spacing are usually
ignored.
'''


def is_palindrome(input_string):
    cleaned_string = ""
    punctuation = r"'.?,!"
    for char in punctuation:
        input_string = input_string.replace(char,"")

    cleaned_string = input_string.replace(" ","").lower()
    if(cleaned_string == cleaned_string[::-1]):
        print("Sentence is a Palindrome")
    else:
        print("Sentence is not a Palindrome")

string = input("Enter Sentence: ")
is_palindrome(string)