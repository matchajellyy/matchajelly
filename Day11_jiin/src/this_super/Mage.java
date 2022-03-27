package this_super;

public class Mage extends Player {

	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 50;
	}
	

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 정신력: " + mana);
	}
	
	
}
