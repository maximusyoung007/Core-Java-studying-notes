while True:
    try:
        msg = input("please input a number.")
        msg_int = int(msg)
    except ValueError:
        print("please input a number!")
    else:
        print(msg_int)