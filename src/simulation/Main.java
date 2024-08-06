package simulation;

import business.abstracts.BaseCustomerManager;
import business.concretes.CaribouCustomerManager;
import entities.abstracts.BaseCustomer;
import entities.concretes.CaribouCustomer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new CaribouCustomerManager();
		BaseCustomer customer1=new CaribouCustomer();
		customer1.setDateOfBirth("01.01.1990");
		customer1.setFirstName("Merve");
		customer1.setLastName("Yılmaz");
		customer1.setNationalityId("11111111111");
		customerManager.save(customer1);
	}

}
