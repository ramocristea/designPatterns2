package org.example.designpatterns2.observer;

public class EmagController {

	public static void main(String[] args) {
		Product laptop = new Product("Macbook pro", 3400, false);
		
		laptop.setAvailable(false);
		
		Observer ramona = new Person("Ramona");
		Observer razvan = new Person("Razvan");
		
		laptop.addObserver(ramona);
		laptop.addObserver(razvan);
		
		laptop.setAvailable(true);

	}

}
