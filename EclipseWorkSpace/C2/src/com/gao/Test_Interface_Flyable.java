package com.gao;

public interface Test_Interface_Flyable {
	int MIN_SPEED = 1;
	void fly();
}
interface attact{
	void attack();
}
interface small extends Test_Interface_Flyable,attact{
	void size();
}


