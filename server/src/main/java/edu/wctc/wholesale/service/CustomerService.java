package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

public interface CustomerService {
    Customer getCustomer (int customerID) throws ResourceNotFoundException;
}
