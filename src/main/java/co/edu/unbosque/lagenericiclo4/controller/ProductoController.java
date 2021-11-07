package co.edu.unbosque.lagenericiclo4.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.lagenericiclo4.model.*;
import co.edu.unbosque.lagenericiclo4.repository.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoRepository productoRepository;

	@PostMapping("/productos")
	public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
		try {
			Producto _producto = productoRepository
					.save(new Producto(producto.getProductCode(), producto.getProductName(), producto.getSupplierNit(),
							producto.getBuyPrice(), producto.getIva(), producto.getSellPrice()));
			return new ResponseEntity<>(_producto, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/productos")
	public ResponseEntity<List<Producto>> getProductos(@RequestParam(required = false) String productName) {
		try {
			List<Producto> productos = new ArrayList<Producto>();

			if (productName == null)
				productoRepository.findAll().forEach(productos::add);
			else
				productoRepository.findByProductNameContaining(productName).forEach(productos::add);

			if (productos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(productos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/productos/{productName}")
	public ResponseEntity<Producto> updateProducto(@PathVariable("productName") String productName,
			@RequestBody Producto producto) {
		Optional<Producto> productoData = productoRepository.findByProductName(productName);

		if (productoData.isPresent()) {
			Producto _producto = productoData.get();
			_producto.setProductCode(producto.getProductCode());
			_producto.setProductName(producto.getProductName());
			_producto.setSupplierNit(producto.getSupplierNit());
			_producto.setBuyPrice(producto.getBuyPrice());
			_producto.setIva(producto.getIva());
			_producto.setSellPrice(producto.getSellPrice());
			return new ResponseEntity<>(productoRepository.save(_producto), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/productos/{productName}")
	public ResponseEntity<HttpStatus> deleteProducto(@PathVariable("productName") String productName) {
		try {
			productoRepository.deleteByProductName(productName);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
