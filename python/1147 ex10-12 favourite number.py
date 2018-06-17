import json
filename = 'number2.json'
try:
    with open (filename) as file_object:
        number2 = json.load(file_object)
        print("we konw your favourite number!It is",number2)
except FileNotFoundError:
    with open(filename,'w') as file_object:
        number2 = input("what is your favourite number?")
        json.dump(number2,file_object)