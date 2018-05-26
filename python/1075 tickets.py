active = True
while active:
    age = input("how old are you?")
    if age == 'quit':
        break
    age = int(age)
    if age < 3:
        print("you can watch the movie for free.")
    elif age >= 3 and age <= 12:
        print("10 dollors,please.")
    elif age > 12:
        print("15 dollors,please.")