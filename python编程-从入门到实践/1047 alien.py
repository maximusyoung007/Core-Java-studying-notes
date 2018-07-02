alien_0 = {'color' : 'green','points' : 5}
print(alien_0['color'])
print(alien_0['points'])
alien_0['x_position'] = 0
alien_0['y_position'] = 25
print(alien_0)
alien1 = {}
alien1['color'] = 'red'
alien1['points'] = 5
alien2 = {'color':'green'}
print("the alien is " + alien2['color'] + '.')
alien2['color'] = 'yellow'
print('the alien is now ' + alien2['color'] +'.')
alien3 = {'x_position' : 0,'y_position' : 25,'speed' : 'medium'}
print("Orignal x-position:" + str(alien3['x_position']))
if alien3['speed'] == 'slow':
	x_increment = 1;
elif alien3['speed'] == 'medium':
	x_increment = 2;
else:
	x_increment = 3;
alien3['x_position'] = alien3['x_position'] + x_increment
print("new x-position:" + str(alien3['x_position']))
alien4 = {'color' :'green','points':5}
print(alien4)
del alien4['points']
print(alien4)