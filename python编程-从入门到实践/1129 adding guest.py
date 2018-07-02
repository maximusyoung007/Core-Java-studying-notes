filename = "guest.txt"
with open(filename,'a') as file_object:
    while True:
        message = input("please input your name")
        if message == 'quit':
            break
        else:
            file_object.write(message + '\n')
