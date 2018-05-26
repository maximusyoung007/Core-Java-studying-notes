active = True
while active:
    need = input("please tell us what you need?")
    if need == 'quit':
        active = False
    else:
        print("fine,we will add " + need + 'for you')

