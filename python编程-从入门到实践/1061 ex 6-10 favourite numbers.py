favourite_numbers = {
		'nike':[1,2,3],
		'mike':[4,5,6],
		'nancy':[12,7],
	}
for name,numbers in favourite_numbers.items():
	print(name + "'s favourite numbers are:")
	for number in numbers:
		print(number)