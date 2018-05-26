prompt = "\nplease enter the name of city you have visited:"
prompt += "\n(enter 'quit' when you are finished.)"
while True:
    city = input(prompt)
    if city == 'quit':
        break
    else:
        print("i'd love to go to " + city.title() + '!')