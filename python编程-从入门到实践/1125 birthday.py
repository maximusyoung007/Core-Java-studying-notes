filename = 'pi_digits.txt'

with open(filename) as file_object:
    lines = file_object.readlines()
    pi_string = ''
    for line in lines:
        pi_string += line.rstrip()
birthday = input("enter your birthday,in the form mmddyy: ")
if birthday in pi_string:
    print("your birthday appears in the first million digits of pi")
else:
    print('your birthday does not appears in the first million digits of pi')