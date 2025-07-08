import pandas as pd
data={"customer id":[1,2,3,4,5],
      "country":['india','usa','russia','japan','india'],
      "state":['delhi','new york','moscow','tokyo','bhubneshwar'],
      "zipcode":[1234,56788,91011,12131,41516]}
df=pd.DataFrame(data)
result1=df[(df["country"]=='india') & (df["state"]=='bhubneshwar')]
print(result1)
print()

result2=df[(df["country"]=="russia")|(df["state"]=="delhi")]
print(result2)
print()
print(df.loc[1])
print()
