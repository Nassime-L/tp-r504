import pytest
import fonctions as f
def test_1():
	assert f.puissance( 2 , 3 ) == 8
	assert f.puissance( 2 , 2 ) == 4
def test_2():
	assert f.puissance( 0, -2 ) == 3
	assert f.puissance( -6 , 2 ) == 36
def test_3():
	if a = 0 and b < 0 :
		raise TypeError("Impossible ! ") 
