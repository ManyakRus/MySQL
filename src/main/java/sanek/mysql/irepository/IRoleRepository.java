package sanek.mysql.irepository;

import org.springframework.data.repository.CrudRepository;
import sanek.mysql.entity.Role;

public interface IRoleRepository extends CrudRepository<Role, Long> {
}
