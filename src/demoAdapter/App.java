package demoAdapter;

public class App {
	public static void main(String[] args) {
		Client client = new Client();
		client.setStandard(new Machine1());
		client.process(225,15);
		
		client.setStandard(new Machine2());
		client.process(120,8);
		
		client.setStandard(new Adapter());
		client.process(225,120);
	}

}
