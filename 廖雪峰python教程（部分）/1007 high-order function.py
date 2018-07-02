print(abs(-10))
print(abs)
x = abs(-10)
print(x)
f = abs
print(f)
f1 = abs
print(f1(-10))
def add(x,y,f):
    return f(x) + f(y)
x = -5
y = 6
f = abs
print(add(x,y,f))
#编写高阶函数，就是让函数的参数能够接收别的函数
