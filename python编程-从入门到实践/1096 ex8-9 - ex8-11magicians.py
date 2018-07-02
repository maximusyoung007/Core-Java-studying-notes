def make_great(names,newnames):
    while names:
        full_name = "the Great " + names.pop()
        newnames.append(full_name)
def show_magicians(newnames):
    for name in newnames:
        print(name)
magicians_name = ['mike','liuqian','me']
magicians_name2 = []
make_great(magicians_name,magicians_name2)
#show_magicians(magicians_name2)
show_magicians(magicians_name)
