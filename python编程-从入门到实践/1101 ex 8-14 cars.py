def make_cars(maker,form,**car_info):
    info = {}
    info['makers'] = maker
    info['form'] = form
    for key,value in car_info.items():
        info[key] = value
    return info
car = make_cars('subaru','outback',color = 'blue',tow_package = True)
print(car)