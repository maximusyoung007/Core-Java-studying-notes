from R import Restraurant

restraurant1 = Restraurant('A', 'B')
print(restraurant1.restaurant_name, " ", restraurant1.cuisine_type)
restraurant1.describe_restaurant()
restraurant1.open_restaurant()
print(restraurant1.get_number_served())
restraurant1.set_number_served(2)
print(restraurant1.get_number_served())
restraurant1.increment_number_served(10)