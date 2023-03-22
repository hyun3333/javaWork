package oop.poly.player;

public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name) {
		
//		모든 생성자에는 super()가 내장되어 있습니다.
//		자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야
//		부모의 속성과 기능이 실존하게 되고, 물려 줄 수가 있기 때문입니다.
		
		super(name);
//		this.name = name;
		this.rage = 60;
		
	}
	
	public void rush(Player target) {
		System.out.println("---------------------------------------");
		if (target instanceof Mage) {
			target.hp -= 20;
		} else if (target instanceof Hunter) {
			target.hp -= 15;
		} else if (target instanceof Warrior){
			target.hp -= 10;
			if (this == target) {
				System.out.println("자신을 때릴 수 없습니다.");
				System.out.println("자신의 생명을 소중히 하세요!");
				return;
			}
		} 
		System.out.printf("%s가 %s에게 돌진하여 공격합니다.\n", this.name, target.name);
		System.out.printf("%s의 체력 : %d \n", target.name, target.hp);
		/*
		 
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 
		 - rush의 대상은 모든 직업들 입니다.
		 
		 - 만약 rush의 대상이 전사라면 10의 피해를 받고
		  마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
		  
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
		 
		 - 남은 체력도 출력해 주세요.
		 
		 - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
		 
		 */
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : " + rage);
	}
	
	
	
	
}
