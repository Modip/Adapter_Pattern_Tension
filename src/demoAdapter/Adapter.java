package demoAdapter;

public class Adapter implements Prise {
	private Adapte adapte = new Adapte();
	
	public void tension (int t1, int t2) {
		double res = adapte.calcul(t1, t2);
		adapte.print(res);
		
	}

}
