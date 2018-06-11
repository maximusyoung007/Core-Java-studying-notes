filename = 'programming.txt'
#'r' 读取模式'w'写入模式 'a'附加模式 'r+'能够读取或写入文件的模式
#本例中是写入模式
with open(filename,'w') as file_object:
    file_object.write("i love programming.\n")
    file_object.write('i love creating new games.\n')

with open(filename,'a') as file_object:
    file_object.write("i also love finding meaning in large datasets.\n")
    file_object.write('i love creating apps that can run in a browser.\n')
