sandwich_orders = ['pastrami','tuna','pastrami','meat','pastrami','egg']
print("we use to have " + sandwich_orders[0] + ',')
print("but sorry,now,our pastrami have been sold out")
while 'pastrami' in sandwich_orders:
    sandwich_orders.remove('pastrami')
finished_sandwiches = []
active = True
while sandwich_orders:
    sandwich = sandwich_orders.pop()
    print("we will make you " + sandwich.title() + " sandwich")
    finished_sandwiches.append(sandwich)
print("following sanfwich have been made:")
for finished_sandwich in finished_sandwiches:
    print(finished_sandwich)