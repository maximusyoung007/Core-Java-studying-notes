class User():
    def __init__(self,first_name,last_name,password,if_member):
        self.first_name = first_name
        self.last_name = last_name
        self.password = password
        self.if_member = if_member
        self.login_attempts = 0

    def increment_login_attempts(self):
        self.login_attempts += 1
    def reset_login_attempts(self):
        self.login_attempts = 0
    def output(self):
        print(self.login_attempts)
user1 = User('yang','wenjun','123','yes')
user1.output()
user1.increment_login_attempts()
user1.output()
user1.increment_login_attempts()
user1.output()
user1.increment_login_attempts()
user1.output()
user1.reset_login_attempts()
user1.output()