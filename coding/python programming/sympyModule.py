from sympy import symbols
from sympy.logic.boolalg import Equivalent

# Define Boolean symbols
A, B = symbols('A B')
expr1 = ~(A & B)
expr2 = ~A | ~B

# Equivalent returns True if expr1 ≡ expr2
print(Equivalent(expr1, expr2))  # True
