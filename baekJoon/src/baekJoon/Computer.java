package baekJoon;

public class Computer {
	public int num = 10;
	private String owner;
	public boolean isOn;
	String os;
	
	Computer(String owner, boolean isOn, String os) {
		this.owner = owner;
		this.isOn = isOn;
		this.os = os;
	}
	
	public void setOwner(String changeOwner) {
		owner = changeOwner;
	}
	
	void calculate() {
		
	}
	
	void search() {
		
	}
	
	void launchProgram() {
		
	}
	
	// TODO
	void searchForWheather() {
		
	}
	
	public void printState() {
		System.out.println("============================================");
		System.out.println("������ : " + owner);
		System.out.println("On/OFF" + (isOn? "�����ִ�" : "�����ִ�"));
		System.out.println("OS : " + os);
		System.out.println("============================================");
	}
}
