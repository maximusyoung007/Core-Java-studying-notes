invited = ["potter","snap","voldemort","dumbledore"] 
message = "i would like to invited " + invited[0] + "," + invited[1] + "," + invited[2] + " and " + invited[-1] + " to have dinner"
print(message)
message2 = "but professer " +  invited[1] + " connot come"
print(message2)
del invited[1]
invited.insert(1,"lily")
message3 = "i would like to invited " + invited[0] + "," + invited[1] + "," + invited[2] + " and " + invited[-1] + " to have dinner"
print(message3)
print("i have found a bigger table")
invited.insert(0,"antonin")
invited.insert(-1,"mike")
invited.append("meilin")
print(invited)
pop1 = invited.pop();
message4 = "i am sorry to cancel the dinner," + pop1
print(message4)