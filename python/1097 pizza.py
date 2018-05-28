def make_pizza(*toppings):
    print("\nMaking a pizza with the following toppings:")
    for topping in toppings:
        print("-" + toppings)
make_pizza('pepperoni')
make_pizza('mushroom','green peppers','extra cheese')