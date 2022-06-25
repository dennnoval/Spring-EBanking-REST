package dennnoval.springebankingrest.repository;

import dennnoval.springebankingrest.entity.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "transaction", path = "transaction")
public interface TransactionRepo extends PagingAndSortingRepository<Transaction, Integer> {

  List<Transaction> findAllByAccountId(Integer accountId);

}
