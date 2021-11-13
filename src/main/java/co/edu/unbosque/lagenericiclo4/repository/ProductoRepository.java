package co.edu.unbosque.lagenericiclo4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.lagenericiclo4.model.*;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	List<Producto> findByProductNameContaining(String productName); //buscar elemento por nombre
	Optional<Producto> findByProductName(String productName); //actualizar por nombre
	void deleteByProductName(String productName); //eliminar documento por nombre
}
