import json
number1 = input("which number you like?")
filename1 = 'number1.json'
with open(filename1,'w') as file_object:
    json.dump(number1,file_object)
