users = []
#users = ['mike','shaohailin','shaohailin2','shaohailin3','admin']
if users:
	for user in users:
		if user == 'admin':
			print('hello admin,would you like to see status report?')
		else:
			print('hello ' + user + ',thank you for logging in again.')
else:
	print("we need to find some users!")