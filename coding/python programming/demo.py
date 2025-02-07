# Create a dictionary with 10 elements
my_dict = {1: 'one',2: 'two',3: 'three', 4: 'four', 5: 'five',6: 'six',7: 'seven',8: 'eight',9: 'nine',10: 'ten'}
# Print elements at odd positions
for key in my_dict:
    if key % 2 != 0:
        print(f"Key: {key}, Value: {my_dict[key]}")