user_0 = {
	'username':'efermi',
	'first':'enrico',
	'last':'fermi',
}
for key,value in user_0.items():
	print("\nkey:" + key)
	print("Value: " + value)
favourite_languages = {
	'jen':'python',
	'sarah':'c',
	'edward':'ruby',
	'phil':'python',
}
for name,language in favourite_languages.items():
	print(name.title() + "'s favourite language is " + 
		language.title() + ".")
for name in favourite_languages.keys():
	print(name.title())
friends = ['pjil','sarah']
for name in favourite_languages.keys():
	print(name.title())
	if name in friends:
		print(" hi " + name.title() + ",i see your favourite language is " + favourite_languages[name].title() + '!')
#favourite_languages[name]表示键所对的值
if 'erin' not in favourite_languages.keys():
	print("erin,please take out poll!")
for name in sorted(favourite_languages.keys()):
	print(name.title() + ",thank you for taking the poll")
print("the following languages have been mentioned:")
for language in favourite_languages.values():
	print(language.title())