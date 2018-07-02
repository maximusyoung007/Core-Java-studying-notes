lesson = ['PE','math','chinese','english','music','art']
print('the first three items in the list are:')
print(lesson[:3])
print('three items from the middle of the list are:')
print(lesson[1:4])
print('the last three items in the list are:')
print(lesson[-3:])
friend_lesson = lesson[:]
print(lesson)
print(friend_lesson)
lesson.append('history')
friend_lesson.append('computer science')
print(lesson)
print(friend_lesson)
for lessons in lesson:
	print(lessons)
for friend_lessons in friend_lesson:
	print(friend_lessons)