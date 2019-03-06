package sanek.mysql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sanek.mysql.entity.Role;
import sanek.mysql.irepository.IRoleRepository;

import java.util.List;

@Component
public class RoleRepository {
    @Autowired
    IRoleRepository iRoleRepository;

    public Role findById(Long id) {
        Role role = iRoleRepository.findById(id).orElse(null);
        return role;
    }

    public List<Role> findAll() {
        List<Role> list = (List<Role>) iRoleRepository.findAll();
        return list;
    }

    public void save(Role role) {
        iRoleRepository.save(role);
    }
}
