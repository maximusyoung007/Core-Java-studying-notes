for values in range(1,21):
	print(values)
numbers = list(range(1,1000001))
#for number in numbers:
#	print(number)
numbers2 = list(range(1,1000001))
print(min(numbers2))
print(max(numbers2))
print(sum(numbers2))
odd_numbers = list(range(1,21,2))
for odd_number in odd_numbers:
	print(odd_number)
triple_numbers = list(range(3,31,3))
for triple_number in triple_numbers:
	print(triple_number) 
squares = []
for value in range(1,11):
	square = value ** 3
	squares.append(square)
for value2 in squares:
	print(value2)
squares2 = [value ** 3 for value in range(1,11)]
print(squares2)