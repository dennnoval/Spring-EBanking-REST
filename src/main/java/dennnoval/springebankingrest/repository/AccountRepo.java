package dennnoval.springebankingrest.repository;

import dennnoval.springebankingrest.entity.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "account", path = "account")
public interface AccountRepo extends PagingAndSortingRepository<Account, Integer> {
}
