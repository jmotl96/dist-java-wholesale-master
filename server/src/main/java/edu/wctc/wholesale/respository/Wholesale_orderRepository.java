package edu.wctc.wholesale.respository;

import edu.wctc.wholesale.entity.WholesaleOrder;
import org.springframework.data.repository.CrudRepository;

public interface Wholesale_orderRepository extends CrudRepository<WholesaleOrder, Integer> {
}
