num=[5,3,7,2,8,9,1,2,7,3,9,6,4,7]
for i in range(1,len(num)-1):
    for j in range(0,len(num)-1):
        if num[i]<num[j]:
            num[i],num[i-1]=num[i-1],num[i]
print(num)