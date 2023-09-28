import pytest
import fonctions as f
def test_1():
	assert f.puissance( 2 , 3 ) == 8
	assert f.puissance( 2 , 2 ) == 4
def test_2():
	assert f.puissance( -2 , 2 ) == 4
	assert f.puissance( -6 , 2 ) == 36
	CHECK ( f.puissance (0 ,0) == -1 )
	CHECK_THROW ( f.puissance (0 , -2) )
	CHECK_THROW ( f.puissance (0 , -3) )

