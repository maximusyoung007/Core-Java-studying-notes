#复制列表
my_foods = ['pizza','falafel','carrot cake']
friend_foods = my_foods[:]
my_foods.append('cannoli')
friend_foods.append('ice cream')
print("my favourite foods are:")
print(my_foods)
print("\nmy friends's favourite foods are:")
print(friend_foods)
my_foods2 = ['pizza','falafel','carrot cake']
#此方法将新变量friends_foods2关联到my_foods中
#两个变量其实指向同一个列表
friend_foods2 = my_foods2
my_foods2.append('cannoli')
friend_foods2.append('ice cream')
print("my favourite foods are:")
print(my_foods2)
print("\nmy friend's favourite foods are:")
print(friend_foods2)
friend_foods2
my_foods
