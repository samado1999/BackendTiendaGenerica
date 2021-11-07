package co.edu.unbosque.lagenericiclo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    @RequestMapping("/add")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Get a Single Cliente
    @RequestMapping("/get")
    public Cliente getCliente(@RequestBody Cliente cliente) {
        return clienteRepository.findById(cliente.getClientId()).get();
    }

    // Get All Clientes
    @RequestMapping("/getAll")
    public Iterable<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Update a Cliente
    @RequestMapping("/update")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Delete a Cliente
    @RequestMapping("/delete")
    public void deleteCliente(@RequestBody Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    // Delete All Clientes
    @RequestMapping("/deleteAll")
    public void deleteAllClientes() {
        clienteRepository.deleteAll();
    }

}
