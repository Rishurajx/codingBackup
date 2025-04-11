list=[1,2,3,7,8,4,9,8,6,2,5,9,6,1]
for i in range(len(list)):
    for i in range(0,len(list)-i-1):
        if list[i]>list[i+1]:
            list[i],list[i+1]=list[i+1],list[i]
print(list)

