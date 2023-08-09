package Exercicio.Pratico3.controller;

import Exercicio.Pratico3.domain.cliente.Cliente;
import Exercicio.Pratico3.domain.cliente.DadosCadastroCliente;
import Exercicio.Pratico3.domain.cliente.DadosDetalhamentoCliente;
import Exercicio.Pratico3.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    @PostMapping
    public void cadastrarCliente(@RequestBody DadosCadastroCliente dados) {
        var cliente = new Cliente(dados);
        repository.save(cliente);
    }

    @GetMapping("/{id}")
    public DadosDetalhamentoCliente listarClientePorId(@PathVariable Long id) {
        var cliente = repository.getReferenceById(id);
        var dados = new DadosDetalhamentoCliente(cliente);
        return dados;
    }
}
