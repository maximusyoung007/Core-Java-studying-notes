places = {}
active = True
while active:
    name = input("what is your name?")
    place = input("where do you want to go most?")
    places[name] = place#the key point to save data in a 字典
    repeat = input("is there anybody else?(yes / no)")
    if repeat == 'no':
        active = False
print("\n")
for name,place in places:
    print(name + " wants to the " + place + "the most.")