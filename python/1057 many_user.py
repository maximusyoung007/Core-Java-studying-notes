users = {
	'aeinstein':{
		'first':'albert',
		'last':'einstein',
		'location':'princeton',
	},
	'mcurie':{
		'first':'marie',
		'last':'cuire',
		'location':'paris',
	},
}
for username,user_info in users.items():
	print("\nusername:" + username)
	fullname = user_info['first'] + " " + user_info['last']
	location = user_info['location']

	print("\tfull name :" + fullname.title())
	print("\tlocation:" + location.title())