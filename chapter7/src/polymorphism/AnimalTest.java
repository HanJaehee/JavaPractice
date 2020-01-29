package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal { 
	
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �׹� ���� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
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
