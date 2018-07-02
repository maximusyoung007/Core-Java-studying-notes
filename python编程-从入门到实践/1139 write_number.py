import json
numbers = [2,3,5,34,44,9]

filename = 'numbers.json'
with open(filename,'w') as file_object:
    json.dump(numbers,file_object)