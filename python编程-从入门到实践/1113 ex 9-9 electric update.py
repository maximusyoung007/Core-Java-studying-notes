class Car():
    def __init__(self,make,model,year):
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0
    def get_descriptive_name(self):
        long_name = str(self.year) + ' ' + self.make + ' ' +self.model
        return long_name.title()
    def read_odometer(self):
        print("this car has " + str(self.odometer_reading) + " miles on it.")
    def update_odometer(self,mileage):
        if mileage >= self.odometer_reading:
            self.odometer_reading = mileage
        else:
            print("you can't roll back an odometer!")
    def increment_odometer(self,miles):
        self.odometer_reading += miles
    def fill_gas_tank(self):
        print("hello world!")

class Battery():
    def __init__(self,battery_size = 70):
        self.battery_size = battery_size
    def describe_battery(self):
        print("this car has a " + str(self.battery_size) + "-kwh battery.")
    def get_range(self):
        if self.battery_size == 70:
            range = 240
        elif self.battery_size == 85:
            range = 270
        message = "the longest way we can go is:" + str(range)
        print(message)
    def upgrate_battery(self):
        if self.battery_size != 85:
            self.battery_size = 85
        print("let's change out battery!!")
class ElectricCar(Car):
    def __init__(self,make,model,year):
        super().__init__(make,model,year)
        self.battery = Battery()
    #def describe_battery(self):
    #   print("this car has a " + str(self.battery_size) + "-kwh battery.")
    def fill_gas_tank(self):
        print("this car doesn't need a gas tank!")
electric_car1 = ElectricCar('myself','motor','2018')
electric_car1.battery.get_range()
electric_car1.battery.upgrate_battery()
electric_car1.battery.get_range()