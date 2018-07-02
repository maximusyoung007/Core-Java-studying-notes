available_toppings = ['mushroom','olives','green peppers'
                      'pepperoni','pineapple','extra cheese']
request_toppings = ['mushroom','french frices','extra cheese']
for request_topping in request_toppings:
  	if request_topping in available_toppings:
  		print("adding " + request_topping + '.')
  	else:
  		print("sorry,we don't have " + request_topping + '.')

print('\nfinished making your pizza')