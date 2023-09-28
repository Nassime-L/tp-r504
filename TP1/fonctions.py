def puissance(a,b):
	
	if not type(a and b) is int:
		raise TypeError("Only integers are allowed")
	
	if a == 0 and b<0 :
		raise ArithmeticError("Impossible !") 	
		
	
	z = a**b
	return z

		
	
