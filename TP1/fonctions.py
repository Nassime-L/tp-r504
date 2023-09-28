def puissance(a,b):
	
	if not type(a) is int:
		raise TypeError("Only integers are allowed")
	if a == 0 & b < 0 :
		raise TypeError("Impossible ! ")
	
	z = a**b
	return z

		
	
