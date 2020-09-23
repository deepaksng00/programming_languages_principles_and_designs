global intValue
intValue = 5

def fact(reference):
    global intValue
    if reference != 0:
        intValue = intValue * reference
        fact(reference - 1)

fact(intValue - 1)

print("The factorial value is:", intValue)