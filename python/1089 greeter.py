def get_foematted_name(first_name,last_name):
    """返回整洁的姓名"""
    full_name = first_name + ' ' + last_name
    return full_name.title()
while True:
    print("\nplease tell me your name:")
    fname = input("First name:")
    lname = input("last name:")
    if fname == 'quit' and lname == 'quit':
        break
    formatted_name = get_foematted_name(fname,lname)
    print("\nhello," + formatted_name + '!')