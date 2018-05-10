age = 23
#错误，这个变量可能是数值23，也可能是字符2和3
#message = "happy" + age + "rd birthday" 
message = "happy" + str(age) + "rd birthday"
print(message)