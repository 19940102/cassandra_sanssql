package hp.net.tp_cassandra_nosql.repositories;

import hp.net.tp_cassandra_nosql.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;


public interface UserRepository extends CassandraRepository<User, UUID> {
}
