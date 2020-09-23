import re

s = "hello world"
global wordCount
wordCount = {}

for letter in s:
    count = 0
    for letterComparason in s:
        if letter == letterComparason:
            count += 1
    if re.match("\s", letter) is None:
        wordCount[letter] = count
    count = 0

print(wordCount)