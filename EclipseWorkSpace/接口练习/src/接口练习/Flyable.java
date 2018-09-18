package 接口练习;

public interface Flyable {
	int MIN_SPEED = 1;
	void fly();
}
interface attact{
	void attack();
}
interface small extends Flyable,attact{
	void size();
}


