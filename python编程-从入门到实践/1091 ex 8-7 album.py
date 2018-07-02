def make_album(author,name,num_of_songs = ''):
    info = {'author':author,'name':name}
    if num_of_songs:
        info['num'] = num_of_songs
    return info
ex1 = make_album('jay','fantasy')
print(ex1)
ex2 = make_album('ladygaga','the crue',str(1))
print(ex2)
ex3 = make_album('Avril','fly',str(1))
print(ex3)