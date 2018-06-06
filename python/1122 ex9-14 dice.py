from random import randint
class Die():
    def __init__(self):
        self.sides = 6
    def roll_die(self):
        x = randint(1,6)
        self.sides = x
        print(self.sides)
    def roll_die10(self):
        x = randint(1,10)
        self.sides = x
        print(self.sides)
    def roll_die20(self):
        x = randint(1,20)
        self.sides = x
        print(self.sides)

die = Die()
for i in range(1,7):
    die.roll_die()
print("\n")
for i in range(1,11):
    die.roll_die10()
print("\n")
for i in range(1,21):
    die.roll_die20()
