import math

# 定义一个函数，接受三个参数，返回一个一元二次方程的两个解
def quadratic(a,b,c):
    m = b * b - 4 * a * c
    if m >= 0:
        x = (-b + math.sqrt(m)) / (2 * a)
        y=(-b - math.sqrt(m)) / (2 * a)
        return x,y
    else:
        return 'no answer!'
print(quadratic(2,3,1))
print(quadratic(1,-3,2))