c=0
for i in range(0,10):
    for  j in range(10,i,-1):
        print(2*"  ",end='')
    for k in range(0,i+1):
        c+=1
        print(c," ",end='')
    print()