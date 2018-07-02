requested_toppings = ['mushroom','green peppers','extra cheese']
for requested_topping in requested_toppings:
	if requested_topping == 'green peppers':
		print("sorry,we are out of green peppers right now.")
	else:
		print("adding " + requested_topping)
#print("\nfinished making your pizza!")

requested_toppings2 = []
if requested_toppings2:
	for requested_topping2 in requested_toppings2:
		print("adding" + requested_topping2 + '.')
	print("\nfinished making your pizza!")
else:
	print("are you sure you want a plain pizza?")