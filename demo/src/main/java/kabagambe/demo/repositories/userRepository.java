package kabagambe.demo.repositories;

import ch.qos.logback.classic.spi.EventArgUtil;
import kabagambe.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User,Long> {



}
