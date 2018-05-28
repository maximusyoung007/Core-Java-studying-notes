def introduce(first,last,**userinfo):
    info = {}
    info['first_name'] = first
    info['last_name'] = last
    for key,value in userinfo.items():
        info[key] = value
    return info
my_info = introduce('wenjun','yang',
                    location = "nanjing",
                    age = str(18),
                    hobbies = 'programme')
print(my_info)