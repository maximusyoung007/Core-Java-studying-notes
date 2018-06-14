filename = 'little women.txt'
with open(filename) as file_object:
    msg = file_object.read()
    number = msg.lower().count('love')
    number2 = msg.lower().count('the')
    print("the number of 'the' is",number2)
    print("the number of 'love' is",number)