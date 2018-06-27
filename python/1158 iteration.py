from collections import Iterable
d = {'a' : 1,'b' : 2,'c' : 3}
for key in d:
    print(key)
for ch in "ABC":
    print(ch)
print(isinstance('abc',Iterable))
print(isinstance([1,2,3],Iterable))
print(isinstance(123,Iterable))
for i,value in enumerate(['A','B','C']):
    print(i,value)
for x,y in [(1,1),(2,4),(3,9)]:
    print(x,y)
def findMinAndMax(L = []):
    if L == []:
        print("None,None")
    else:
        max = L[0]
        min = L[0]
        for i in L:
            if i > max:
                max = i
            if i < min:
                min = i
        print(max,min)
findMinAndMax([1,2,3,4,5,6,7])
findMinAndMax([7])
findMinAndMax([])
