package sanek.mysql.irepository;

import org.springframework.data.repository.CrudRepository;
import sanek.mysql.entity.User;

public interface IUserRepository extends CrudRepository<User, Long> {

    public User findByName(String name);
}
