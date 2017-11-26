package demo2;

public class Chat extends Animal {
	
	private boolean aimePoisson;
	
	public Chat() {
		// ceci est fait implicitement, n'est pas obligatoire
		super();
	}
	
	@Override
	public void cri() {
		System.out.println("Je miaule");
	}

	public boolean getAimePoisson() {
		return aimePoisson;
	}


	public void setAimePoisson(boolean aimePoisson) {
		this.aimePoisson = aimePoisson;
	}

	@Override
	public String toString() {
		return "Chat [race="+ getRace() +";aimePoisson=" + aimePoisson + "]";
	}
	
}
