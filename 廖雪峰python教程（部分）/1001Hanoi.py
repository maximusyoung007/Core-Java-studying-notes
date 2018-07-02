def hanoi(n,_from,buffer,to):
    if n == 1:
        print("move " + _from + "-->" + to)
    else:
        hanoi(n - 1,_from,to,buffer)
        hanoi(1,_from,buffer,to)
        hanoi(n - 1,buffer,_from,to)

hanoi(3,'_from','buffer','to')