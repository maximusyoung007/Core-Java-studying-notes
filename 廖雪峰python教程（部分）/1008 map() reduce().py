def f(x):
    return x * x
r = map(f,[1,2,3,4,5,6,7,8,9])
print(list(r))
s = map(str,[1,2,3,4,5,6,7,8])
print(list(s))
from functools import reduce
def add(x,y):
    return x + y
print(reduce(add,[1,3,5,7,9]))
def fn(x,y):
    return x * 10 + y
print(reduce(fn,[1,3,5,7,9]))
def char2num(s):
    digits = {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}
    return digits[s]
print(reduce(fn,map(char2num,'13579')))
#str2int
DIGITS = {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}
def str2int(s):
    def fn(x,y):
        return x * 10 + y
    def char2num(s):
        return DIGITS[s]
    return reduce(fn,map(char2num,s))
#用lambda函数进一步化简
def char2num(s):
    return DIGITS[s]
def str2int(s):
    return reduce(lambda x,y:x*10 + y,map(char2num,s))
def es(s):
    return [s[0].upper() + s[1:].lower()]
L1 = ['admin','LISA','barT']
L2 = list(map(es,L1))
print(L2)
def prod(L):
    def fac(x,y):
        return x * y
    return reduce(fac,L)
print('3 * 5 * 7 * 9 =', prod([3, 5, 7, 9]))
if prod([3, 5, 7, 9]) == 945:
    print('测试成功!')
else:
    print('测试失败!')
def str2float(s):
    DIGITS = {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}

