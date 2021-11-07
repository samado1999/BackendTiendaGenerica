package co.edu.unbosque.lagenericiclo4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.lagenericiclo4.model.*;

public interface UserRepository extends MongoRepository<User, String>{
	List<User> findByUsuarioContaining(String usuario);
	Optional<User> findByUsuario(String usuario);
	void deleteByUsuario(String usuario);
}