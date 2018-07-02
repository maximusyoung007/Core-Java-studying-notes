import json
filename = "username2.json"
try:
    with open(filename) as file_object:
        username = json.load(file_object)
except FileNotFoundError:
    username = input("what is your name?")
    with open(filename,'w') as file_object:
        json.dump(username,file_object)
        print("we will remember your name when you come back," + username + "!")
else:
    print("welcome back, " +username +"!")