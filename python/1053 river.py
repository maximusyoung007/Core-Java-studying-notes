rivers = {
	'nile':'egypt',
	'yellow river':'china',
	'Mississippi':'USA',
}
for river,country in rivers.items():
	print(river + " runs through " + country)
for river in rivers.keys():
	print(river)
for country in rivers.values():
	print(country)