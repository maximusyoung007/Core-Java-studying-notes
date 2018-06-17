import json
filename = 'number1.json'
with open(filename) as file_object:
    number1 = json.load(file_object)
    print("i know your favourite number!It is " + number1)