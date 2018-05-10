motorcycles = ['honda','yamaha','suzuki']
print(motorcycles)
motorcycles[0] = 'ducati'
print(motorcycles)
motorcycles.append('honda')
print(motorcycles)
motorcycles2 = []
motorcycles2.append('honda')
motorcycles2.append('yamaha')
motorcycles2.append('suzuki')
print(motorcycles2)
motorcycles2.insert(0,'ducati')
print(motorcycles2)
del motorcycles2[0]
print(motorcycles2)
motorcycles3 = ['honda','yamaha','suzuki']
print(motorcycles3)
last_owned = motorcycles3.pop()
print(motorcycles3)
print("the last motorcycle i wonede was" + last_owned)