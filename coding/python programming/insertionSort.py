num=[5,8,2,6,4,9,1,3,7,0]
for i in range(1,len(num)):
    key=num[i]
    j=i-1
    for j in range(i-1,-1,-1):
        if key<num[j]:
            key=num[j]
            num[j],num[j+1]=num[j+1],num[j]
        else:
            break
print(num)