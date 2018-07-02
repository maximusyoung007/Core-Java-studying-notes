filename = 'guest.txt'
with open(filename,'w') as file_objects:
    message = input("please input your name:")
    file_objects.write(message)
