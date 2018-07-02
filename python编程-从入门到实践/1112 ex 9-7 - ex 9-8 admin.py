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

class Privileges():
    def __init__(self):
        self.privileges = ['can add post','can delete post','can ban user']
    def show_privileges(self):
        for i in self.privileges:
            print(i)
class Admin(User):
    def __init__(self,first_name,last_name,password,if_member):
        super().__init__(first_name,last_name,password,if_member)
        self.privileges = Privileges()
        #self.privileges = ['can add post','can delete post','can ban user']
    #def show_privileges(self):
    #   for i in self.privileges:
    #      print(i)
admin1 = Admin('yang','wenjun','123','yes')
admin1.privileges.show_privileges()