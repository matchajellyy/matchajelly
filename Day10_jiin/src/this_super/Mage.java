package inherit.good;

public class Mage extends Player {

	int mana;

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 정신력: " + mana);
	}
	
	
}
