from city_function import Country
print("enter 'q' at any time to quit.")
while True:
    city = input("\n Please give the name of the city:")
    if city == 'q':
        break
    country = input("please give me the name of the country:")
    if country == 'q':
        break
    print(Country(city,country))