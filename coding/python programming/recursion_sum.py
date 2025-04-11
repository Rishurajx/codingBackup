def sum_of_n_numbers(n):
    if n == 0:
        return 0
    else:
        return n + sum_of_n_numbers(n - 1)
n = 10
print(f"The sum of the first {n} numbers is: {sum_of_n_numbers(n)}")