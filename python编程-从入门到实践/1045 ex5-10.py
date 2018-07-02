current_users = ['mike','jack','rose','thunder','vincent']
new_users = ['Mike','yang','kobe','messi','xiaoming']
for new_user in new_users:
	if new_user.lower() in current_users:
		print("the name have been used!")
	else:
		print("yes,the name can be used!")