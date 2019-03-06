package sanek.mysql;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sanek.mysql.entity.User;
import sanek.mysql.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MySQLTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void add() {
        User user = new User();
        user.setName("2");
        user.setPassword("2");
        user.setEnabled(true);
        userRepository.save(user);
        log.info("User saved " + user);
    }

    @Test
    public void delete() {
        User user = userRepository.findByName("2");
        if (user == null) {
            log.info("User not found !");
            return;
        }

        log.info("User found: " + user);
        userRepository.delete(user);
        log.info("User deleted: " + user);
    }
}
