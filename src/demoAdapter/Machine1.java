package demoAdapter;

public class Machine1 implements Prise{
	public void tension(int t1, int t2) {
		double res = t1/t2 ;
		System.out.println("*********************");
		System.out.println("************Tension de sortie est de "+res);
		System.out.println("***Implementation standard 1********");
		System.out.println("*********************");

	}
}
