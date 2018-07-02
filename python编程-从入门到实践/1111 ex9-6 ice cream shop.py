class Reataurant():
    def __init__(self,restaurant_name,cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
    def describe_restaurant(self):
        print(self.restaurant_name)
        print(self.cuisine_type)
    def open_restaurant(self):
        print("restaurant is open")
class IceCream(Reataurant):
    def __init__(self,restaurant_name,cuisine_type):
        super().__init__(restaurant_name,cuisine_type)
        self.flavors = ['orange','apple']
    def show_ice(self):
        print(self.flavors[0])
        print(self.flavors[1])
ice_cream1 = IceCream('dfd','fdsfsdfjk')
ice_cream1.show_ice()