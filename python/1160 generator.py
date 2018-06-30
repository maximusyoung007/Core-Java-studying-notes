g = (x * x for x in range(10))
for n in g:
    print(n)
print("\n")
def odd():
    print('step 1')
    yield 1
    print('step 2')
    yield (3)
    print('step 3')
    yield (5)
o = odd()
print(next(o))
print(next(o))
print(next(o))
print("\n")
def fib(max):
    n,a,b = 0,0,1
    while n < max:
        yield b
        #print(b)
        a,b = b,a + b#b是前两位相加的值，不是赋值后的a加上b的值
        n = n + 1
    return 'done'
#print(fib(6))
g = fib(6)
for i in g:
    print(i)
print("\n")
#while True:
 #   try:
  #      x = next(g)
   #     print("g:",x)
    #except StopIteration as e:
     #   print('Generator return value:',e.value)
      #  break

def triangles(n):
    L = [1]
    while True:
        yield L
        L = [L[x] + L[x - 1] for x in range(len(L) - 1)]
        L.insert(0,1)
        L.append(1)
        if len(L) > 10:
            break
a = triangles(10)
for i in a:
    print(i)


