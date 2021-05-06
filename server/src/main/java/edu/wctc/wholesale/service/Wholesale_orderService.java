package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

public interface Wholesale_orderService {
    Customer getCustomer (int order_id) throws ResourceNotFoundException;
}
