package kabagambe.demo.repositories;

import kabagambe.demo.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {
}
