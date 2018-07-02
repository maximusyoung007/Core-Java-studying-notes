L = ['mike','sarah','tracy','bob','jack']
print(L[0] + ' ' + L[1] + ' ' + L[2])
r = []
n = 3;
for i in range(n):
    r.append(L[i])
print(r)
print(L[0:3])
print(L[:3])
print(L[-2:])
print(L[-1:])
print(L[-2:-1])
L = list(range(100))
print(L[:10])
print(L[:10:2])#get a number in every two numbers
print(L[::5])
print(L[:])
print("ABCDEFG"[:3])
print("ABCDEFG"[::2])
def trim(str):
    if len(str) == 0:
        return str
    elif str[0] == ' ':
        return (trim(str[1:]))
    elif str[-1] == ' ':
        return (trim(str[:-1]))
    return str
if trim(" hello ") == 'hello':
    print("成功")
if trim(' hello') != ' hello':
    print("失败")