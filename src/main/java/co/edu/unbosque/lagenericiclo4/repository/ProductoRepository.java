package co.edu.unbosque.lagenericiclo4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.lagenericiclo4.model.*;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	List<Producto> findByProductNameContaining(String productName); //buscar elemento por nombre
	Optional<Producto> findByProductName(String productName); //actualizar por nombre
	void deleteByProductName(String productName); //eliminar documento por nombre
	//En la documentacion no se especifica si el crud se hace por nombre o por codigo, entonces lo trabaje por nombre
	//luego monto los metodos por codigo, para tener ambas opciones.
}
