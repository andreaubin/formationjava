package demo2;

public class Aigle extends Animal {
	
//	@Override
//	void methodeAnimal() {
//		
//	}
	
	@Override
	void methodePublique() {
		System.out.println("J'ai red�fini la m�thode de mon Parent");
	}
	
	void voler() {
		System.out.println("Je vole");
	}

}
