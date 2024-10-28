'''
Task10:-
--------
Write a function translate() that will translate a text into "rövarspråket" (Swedish for
"robber's language"). That is, double every consonant and place an occurrence of "o" in
between. For example, translate("this is fun") should return the string "tothohisos isos
fofunon".
'''
def translate(string):

    vowel = "aeiou"

    new_sent = []

    translated = ""

    lst_string = string.split(" ")

    for word in lst_string:
        new_word = []
        for letter in word:
            if letter in vowel:
                new_word.append(letter)
            else:
                new_word.append(letter + "o" + letter)
        new_sent.append("".join(new_word))

    translated = " ".join(new_sent)
    print(translated)

string = input("Enter Sentence: ")
translate(string)











