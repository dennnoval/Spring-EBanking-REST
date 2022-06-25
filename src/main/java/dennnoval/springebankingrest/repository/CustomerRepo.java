package dennnoval.springebankingrest.repository;

import dennnoval.springebankingrest.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepo extends PagingAndSortingRepository<Customer, Integer> {
}
