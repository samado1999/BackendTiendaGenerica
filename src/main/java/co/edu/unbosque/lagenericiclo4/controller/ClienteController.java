package co.edu.unbosque.lagenericiclo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.lagenericiclo4.model.Cliente;
import co.edu.unbosque.lagenericiclo4.repository.ClienteRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Create a new Cliente
    @PostMapping("/add")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Get a Single Cliente
    @GetMapping("/get")
    public Cliente getCliente(@RequestBody Cliente cliente) {
        return clienteRepository.findById(cliente.getClientId()).get();
    }

    // Get All Clientes
    @GetMapping("/getAll")
    public Iterable<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Update a Cliente
    @PutMapping("/update")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Delete a Cliente
    @DeleteMapping("/delete")
    public void deleteCliente(@RequestBody Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    // Delete All Clientes
    @DeleteMapping("/deleteAll")
    public void deleteAllClientes() {
        clienteRepository.deleteAll();
    }

}
