package business.abstracts;

import entities.abstracts.BaseCustomer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(BaseCustomer customer) {
		System.out.println("Save "+customer.getFirstName());
		
	}

}
