package ro.itschool.hierarchysample.hierarchy;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
