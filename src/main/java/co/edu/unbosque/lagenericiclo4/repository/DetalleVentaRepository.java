package co.edu.unbosque.lagenericiclo4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.lagenericiclo4.model.DetalleVenta;

public interface DetalleVentaRepository extends MongoRepository<DetalleVenta, String> {

}
