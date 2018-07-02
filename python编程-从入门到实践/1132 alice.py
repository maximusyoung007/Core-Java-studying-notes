filename = "alice.txt"

try:
    with open(filename) as file_object:
        contents = file_object.read()
except FileNotFoundError:
    message = "sorry,the file " + filename + "does not exist."
    print(message)
else:
    words = contents.split()
    num_words = len(words)
    print("the file " + filename + " has about" + str(num_words) + " words.")