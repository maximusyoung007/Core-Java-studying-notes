print(list(range(1,11)))
L = []
for x in range(1,11):
    L.append(x * x)
print(L)
print([x * x for x in range(1,11)])
print([x * x for x in range(1,11) if x % 2 == 0])
print([m + n for m in 'ABC' for n in "XYZ"])
import os
print([d for d in os.listdir('.')])
d = {'x':'A','y':'B','z':'C'}
for k,v in d.items():
    print(k + '=' + v)
print([k + '=' + 'v'for k,v in d.items()])
L = ['HELLO','WORLD','IBM','APPLE']
print([s.lower() for s in L])
L2 = ['HELLO','WORLD',18,'IBM','APPLE']
for s in L:
    if isinstance(s,str):
        print(s)
L3 = []
for s in L:
    if isinstance(s,str):
        L3.append(s)
print([s.lower() for s in L3])