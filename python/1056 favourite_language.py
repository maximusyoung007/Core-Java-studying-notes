favourite_language = {
	'jen':['python','ruby'],
	'sarah':['c'],
	'edward':['ruby','go'],
	'phil':['python','haskell'],
}
for name,languages in favourite_language.items():
	print("\n" + name.title() + " 's favourite languages are:")
	for language in languages:
		print("\t" + language.title())
#先遍历字典，再遍历列表