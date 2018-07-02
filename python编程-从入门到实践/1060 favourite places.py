favourite_places = {
		'mike':['nanjing','shenzhen'],
		'yang':['london','beijing'],
		'sun':['shanghai','chengdu'],
	}
for name,places in favourite_places.items():
	print("the favourite places of " + name + 'are:')
	for place in places:
		print(place)