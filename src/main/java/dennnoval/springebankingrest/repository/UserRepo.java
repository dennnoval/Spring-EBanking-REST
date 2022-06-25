package dennnoval.springebankingrest.repository;

import dennnoval.springebankingrest.entity.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepo extends PagingAndSortingRepository<Users, Integer> {
}
