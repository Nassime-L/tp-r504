def puissance(a,b):
	
	if not type(a) is int:
		raise TypeError("Only integers are allowed")
	if a == 0 & b < 0 :
		raise ArithmeticError
	
	z = a**b
	return z

		
	
