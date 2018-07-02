def open_file(filename):
    try:
        with open(filename) as file_object:
            msg = file_object.read()
    except FileNotFoundError:
        print("we can not find file.")
    else:
        print(msg.rstrip())
animals = ['cats.txt','dogs.txt']
for i in animals:
    open_file(i)