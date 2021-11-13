package co.edu.unbosque.lagenericiclo4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.lagenericiclo4.model.*;

public interface ProveedorRepository extends MongoRepository<Proveedor, String> {
	List<Proveedor> findByNitContaining(String nit); //buscar elemento por nit
	Optional<Proveedor> findByNit(String nit); //actualizar por nit
	void deleteByNit(String nit); //eliminar documento por nit
}
