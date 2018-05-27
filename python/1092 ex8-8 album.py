def make_album(name,author):
    ex = {'name':name,'author':author}
    return ex
while True:
    n = input('input the name of album:')
    if n == 'quit':
        break
    a = input('input the author of album:')
    if a == 'quit':
        break
    ex1 = make_album(n,a)
    print(ex1)