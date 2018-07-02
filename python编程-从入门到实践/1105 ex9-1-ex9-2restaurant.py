class Restaurant():
    def __init__(self,restaurant_name,cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type

    def decsribe_restaurant(self):
        print("the name of the restaurant is " + self.restaurant_name)
        print("the type of the restaurant is " + self.cuisine_type)
    def open_restaurant(self):
        print("the restaurant is now opining!welcome!!")

restaurant1 = Restaurant('fanzhuang','chineses food')
print("name:" + restaurant1.restaurant_name + "\ntype:" + restaurant1.cuisine_type)
restaurant1.decsribe_restaurant()
restaurant1.open_restaurant()

restaurant2 = Restaurant('great jhon','pizza')
restaurant2.decsribe_restaurant()

restaurant3 = Restaurant('xinshiqi','bbq')
restaurant3.decsribe_restaurant()

restaurant4 = Restaurant('student canteen','rubbish')
restaurant4.decsribe_restaurant()