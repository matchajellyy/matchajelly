package poly.player;

public class Warrior extends Player {
	int rage;
	
	Warrior(String name){
		super(name); 

		this.rage = 60;
	}
	
	public void rush(Player p) {
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n",
				this.name, p.name);
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n",
					p.name);
		}else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n"
					, p.name);
		}else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다. \n"
					, p.name);
		}
		System.out.printf("%s님의 남은 체력 : %d\n"
				,p.name, p.hp);
		System.out.println("---------------------");
		
		}
	
	


	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	

	}
