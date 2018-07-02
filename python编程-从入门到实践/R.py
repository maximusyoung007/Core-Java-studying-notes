class Restraurant():

    def __init__(self, restaurant_name, cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
        self.number_served = 0

    def describe_restaurant(self):
        print(self.restaurant_name, ":", self.cuisine_type)

    def open_restaurant(self):
        print("Is opening")

    def set_number_served(self, number):
        self.number_served = number

    def get_number_served(self):
        return self.number_served

    def increment_number_served(self, number):
        while self.number_served < number:
            print(self.number_served)
            self.number_served += 1