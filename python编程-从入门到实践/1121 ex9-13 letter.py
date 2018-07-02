from collections import OrderedDict
favourite_languages = OrderedDict()
favourite_languages['ken'] = 'c'
favourite_languages['jack'] = 'PHP'
favourite_languages['ben'] = 'JAVA'
favourite_languages['phile'] = 'R'
for k,v in favourite_languages.items():
    print(k + ' ' + v)