def count_words(filename):
    try:
        with open(filename) as file_object:
            contents = file_object.read()
    except FileNotFoundError:
        #msg = "sorry,the file " + filename + " does not exist."
        #print(msg)
        pass
    else:
        words = contents.split()
        num_words = len(words)
        print("the file " + filename + " has about " + str(num_words) + " words.")

filename = ['alice.txt','dsds.txt','little women.txt','to the Tower.txt']
for file in filename:
    count_words(file)