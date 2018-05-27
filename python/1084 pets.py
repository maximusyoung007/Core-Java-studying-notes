def describe_pet(animal_type,pet_name):
    print("\n i have a " + animal_type + ".")
    print("my " + animal_type + "'s name is " + pet_name.title() + ".")
describe_pet('hamster','harry')
describe_pet('dogs','willie')
describe_pet(pet_name='nancy',animal_type='cat')
def describe_pet2(pet_name,animal_type = 'dog'):
    print("\ni have a " + animal_type + ".")
    print("my " + animal_type + "'s name is " + pet_name.title() + '.')
describe_pet2(pet_name = 'whillie')