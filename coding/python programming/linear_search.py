num=[5,8,2,6,4,9,1,3,7,0]
target=int(input("enter a number"))
for i in range(len(num)):
    if target==num[i]:
        print(i)
        break
    