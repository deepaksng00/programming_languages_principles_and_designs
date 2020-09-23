import plotly.express as px
import re

s = "hello world"
global wordCount
wordCount = {"letters":[],
             "frequency":[]}

for letter in s:
    count = 0
    for letterComparason in s:
        if letter == letterComparason:
            count += 1
    if re.match("\s", letter) is None:
        wordCount["letters"].append(letter)
        wordCount["frequency"].append(count)
    count = 0

fig = px.bar(wordCount, x = 'letters', y = 'frequency')
fig.show()