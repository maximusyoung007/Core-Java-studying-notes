class Restaurant():
    def __init__(self,restaurant_name,cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
        self.number_served = 0

    def decsribe_restaurant(self):
        print("the name of the restaurant is " + self.restaurant_name)
        print("the type of the restaurant is " + self.cuisine_type)
    def open_restaurant(self):
        print("the restaurant is now opining!welcome!!")
    def count_number(self):
        print("there are " + str(restaurant1.number_served) + ' people eating in the restaurant.')
    def set_number(self,number):
        if number >= self.number_served:
            self.number_served = number
        else:
            print("you count something wrong!")
    def increase_number(self,number):
        self.number_served += number

restaurant1 = Restaurant('great jhon','pizza')
restaurant1.set_number(22)
restaurant1.set_number(21)
restaurant1.increase_number(10)
restaurant1.count_number()