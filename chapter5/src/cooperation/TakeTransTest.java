package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentE = new Student("Tomas", 10000);
		Student studentT = new Student("Tomas", 15000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwayGreen = new Subway(2);
		Taxi taxi_1 = new Taxi();
		
		studentJ.takeBus(bus100);
		studentE.takeSubway(subwayGreen);
		studentT.takeTaxi(taxi_1);
		
		studentJ.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		
		taxi_1.showTaxiInfo();
	}
	

}
