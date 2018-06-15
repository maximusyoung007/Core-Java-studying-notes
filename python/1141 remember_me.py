import json

username = input("what is your name?")
filename = 'username.json'
with open(filename,'w') as file_object:
    json.dump(username,file_object)
    print("we'll remember you when you come back,",username,"!")