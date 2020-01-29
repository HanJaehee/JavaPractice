package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { 
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네바 ㄹ로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		/*
		Human human = (Human)hAnimal;
		human.readBooks();
		*/
		if ( hAnimal instanceof Human) {
			Human human = (Human)hAnimal;
			human.readBooks();
		}
		
		
		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(tAnimal);
		*/
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(eAnimal);
		animalList.add(tAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		/*
		for (Animal animal : animalList) {
			animal.move();
		}
		*/
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal ani = list.get(i);
			if ( ani instanceof Human) {
				Human human = (Human)ani;
				human.readBooks();
			}else if( ani instanceof Tiger){
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			}else if ( ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			}
			else {
				System.out.println("None");
			}
		}
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
