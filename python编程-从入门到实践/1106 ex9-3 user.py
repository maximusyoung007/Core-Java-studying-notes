class User():
    def __init__(self,first_name,last_name,password,if_member):
        self.first_name = first_name
        self.last_name = last_name
        self.password = password
        self.if_member = if_member

    def decribe_user(self):
        print("first_name:" + self.first_name)
        print("last_name" + self.first_name)
        print("password:" + self.password)
        print("if_member" + self.if_member)
    def greet_user(self):
        print("hello," + self.first_name + " " + self.last_name + ",welcome!")

user1 = User('vincent','yang',str(123),'yes')
user1.decribe_user()
user1.greet_user()