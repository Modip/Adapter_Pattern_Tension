package demoAdapter;

public class Client {
	private Prise standard;
	
	public void process(int t1, int t2){
		standard.tension(t1, t2);
	}
	
	public void setStandard(Prise standard) {
		this.standard = standard;
	}

}
