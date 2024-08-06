package business.concretes;

import adapters.CustomerCheckMernel;
import business.abstracts.BaseCustomerManager;
import entities.abstracts.BaseCustomer;

public class CaribouCustomerManager extends BaseCustomerManager {

	@Override
	public void save(BaseCustomer customer) {
		CustomerCheckMernel customerCheckMernel= new CustomerCheckMernel();
		customerCheckMernel.customerCheckMernel(customer);
		super.save(customer);
	}

	
	
}
