'''
print("A    B    C     A&B    B|C")
print("-------------------------------")
for a in range (0,2):
    for b in range(0,2):
        for c in range(0,2):
            print(a,"  ",b,"  ",c,"    ",a and b,"    ",b or c)
            '''

def fun(x):
    for i in range(x):
        yield i


obj=fun(5)
for i in obj:
    print(i)




#for j in fun(10):
 #   print(j)