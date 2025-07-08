import random
trial=5000
success=0
tail=0
head=0
for i in range(trial):
    res=random.choice(['tail','head'])
    if res=='tail':
        tail+=1
    if res=='head':
        head+=1
print(tail/trial)
print(head/trial)
