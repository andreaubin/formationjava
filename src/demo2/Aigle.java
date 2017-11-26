package demo2;

public class Aigle extends Animal {
	
//	@Override
//	void methodeAnimal() {
//		
//	}
	
	@Override
	void methodePublique() {
		System.out.println("J'ai redéfini la méthode de mon Parent");
	}
	
	void voler() {
		System.out.println("Je vole");
	}

}
