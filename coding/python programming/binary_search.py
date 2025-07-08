def search(num,target):
    high=len(num)-1
    low=0
    while low!=high or low<high:
        mid=(high+low)//2
        if target ==num[mid]:
            return mid
        elif target<mid:
            high=mid-1
        elif target>mid:
            low=mid+1
num=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
target= int(input("enter target number: "))
print(search(num,target))