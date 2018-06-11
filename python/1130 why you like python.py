filename = 'reason.txt'
with open(filename, 'a') as file_object:
    while True:
        message = input('why you like python?')
        if message == 'quit':
            break
        else:
            file_object.write(message + '\n')