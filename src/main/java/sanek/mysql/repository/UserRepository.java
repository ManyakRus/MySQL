package sanek.mysql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sanek.mysql.entity.User;
import sanek.mysql.irepository.IUserRepository;

import java.util.List;

@Component
public class UserRepository {
    @Autowired
    IUserRepository iUserRepository;

    public User findById(Long id) {
        User user = iUserRepository.findById(id).orElse(null);
        return user;
    }

    public List<User> findAll() {
        List<User> list = (List<User>) iUserRepository.findAll();
        return list;
    }

    @Transactional
    public void save(User user) {
        iUserRepository.save(user);
    }

    public User findByName(String name){
        User user = iUserRepository.findByName(name);
        return user;
    }

    @Transactional
    public void delete(User user) {
        iUserRepository.delete(user);
    }



}
