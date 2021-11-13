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
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	ProveedorRepository ProveedorRepository;

	@DeleteMapping("/proveedores/deleteAll")
	public ResponseEntity<?> deleteAllClientes() {
		ProveedorRepository.deleteAll();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/proveedores/save")
	public ResponseEntity<Proveedor> createProveedor(@RequestBody Proveedor proveedor) {
		try {
			Proveedor _proveedor = ProveedorRepository.save(proveedor);
			return new ResponseEntity<>(_proveedor, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/proveedores")
	public ResponseEntity<List<Proveedor>> getProveedores(@RequestParam(required = false) String nit) {
		try {
			List<Proveedor> proveedores = new ArrayList<Proveedor>();

			if (nit == null)
				ProveedorRepository.findAll().forEach(proveedores::add);
			else
				ProveedorRepository.findByNitContaining(nit).forEach(proveedores::add);

			if (proveedores.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(proveedores, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/proveedores/{nit}")
	public ResponseEntity<Proveedor> updateProveedor(@PathVariable("Nit") String nit, @RequestBody Proveedor proveedor) {
		Optional<Proveedor> proveedorData = ProveedorRepository.findByNit(nit);

		if (proveedorData.isPresent()) {
			Proveedor _proveedor = proveedorData.get();
			_proveedor.setSupplierNit(proveedor.getSupplierNit());
			_proveedor.setSupplierName(proveedor.getSupplierName());
			_proveedor.setSupplierAddress(proveedor.getSupplierAddress());
			_proveedor.setSupplierCity(proveedor.getSupplierCity());
			_proveedor.setSupplierPhone(proveedor.getSupplierPhone());
			return new ResponseEntity<>(ProveedorRepository.save(_proveedor), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/proveedores/{nit}")
	public ResponseEntity<HttpStatus> deleteProveedor(@PathVariable("nit") String nit) {
		try {
			ProveedorRepository.deleteByNit(nit);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
