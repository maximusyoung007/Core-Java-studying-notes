def get_formatted_name(first_name,last_name,middle_name = ''):
    if middle_name:#python将非空字符解释为true
        full_name = first_name + ' ' + middle_name + ' ' + last_name
    else:
        full_name = first_name + ' ' + last_name
    return full_name.title()
musician = get_formatted_name('john','lee','hooker')
print(musician)
musician = get_formatted_name('jimi','hendrix')
print(musician)