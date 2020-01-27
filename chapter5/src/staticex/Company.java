package staticex;

public class Company {// singleton pattern -> �� �ϳ��� �ν��Ͻ��� �̸� �����س��� �ܺο����� get�� �� �� ����.
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		
	}
}
