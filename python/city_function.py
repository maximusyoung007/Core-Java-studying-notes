def Country(City,Country,population = ' '):
    if population:
        info = City + ' ' + Country + ' ' + population
    else:
        info = City + ' ' + Country
    return info.title()
#don't know why wrong?