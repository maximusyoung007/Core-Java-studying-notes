filename1 = 'dogs.txt'
filename2 = 'cats.txt'
try:
    with open(filename2) as file_object2:
        msg2 = file_object2.read()
except FileNotFoundError:
    #print("we cannot find the file.")
    pass
else:
        print(msg2.rstrip())
try:
    with open(filename1) as file_object2:
        msg = file_object2.read()
except FileNotFoundError:
    #print("we cannot find the file.")
    pass
else:
    print(msg.rstrip())