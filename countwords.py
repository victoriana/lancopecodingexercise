import sys
wordsfile=open(sys.argv[1],"r+")
numwords={}
for word in wordsfile.read().split():
    if word not in numwords:
        numwords[word] = 1
    else:
        numwords[word] += 1
for uniqueword in numwords.keys():
  print ("%s %s " %(uniqueword, numwords[uniqueword]))
wordsfile.close();
