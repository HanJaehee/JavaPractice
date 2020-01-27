package staticex;

public class Company {// singleton pattern -> 단 하나의 인스턴스를 미리 생성해놓고 외부에서는 get만 할 수 있음.
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		
	}
}
