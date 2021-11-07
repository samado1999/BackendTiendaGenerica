package co.edu.unbosque.lagenericiclo4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.lagenericiclo4.model.Venta;

public interface VentaRepository extends MongoRepository<Venta, String> {

}
