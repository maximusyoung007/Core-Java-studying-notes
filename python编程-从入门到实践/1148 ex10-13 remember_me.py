import json

def get_stored_username():
    filename = 'username3.json'
    try:
        with open(filename) as file_object:
            username3 = json.load(file_object)
    except FileNotFoundError:
        return None
    else:
        return username3
def get_new_username():
    username = input("what is your name?")
    filename = 'username3.json'
    with open(filename,'w') as file_object:
        json.dump(username,file_object)
    return username
def greet_user():
    username = get_stored_username()
    if username:
        judge = input("is "+username+" your username?")
        if judge == 'y':
            print("welcome back,",username)
        else:
            username = get_new_username()
            print("we will remember you," + username)
    else:
        username = get_new_username()
        print('we will remember you,',username)
greet_user()

