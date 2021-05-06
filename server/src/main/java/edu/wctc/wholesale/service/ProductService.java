package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

public interface ProductService {
    Customer getCustomer (int productID) throws ResourceNotFoundException;
}
