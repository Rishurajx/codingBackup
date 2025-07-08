num=[5,8,2,6,4,9,1,3,7,0]
for i in range(len(num)):
    for j in range(0,len(num)-i-1):
        if num[j]>num[j+1]:
            num[j],num[j+1]=num[j+1],num[j]
print(num)
