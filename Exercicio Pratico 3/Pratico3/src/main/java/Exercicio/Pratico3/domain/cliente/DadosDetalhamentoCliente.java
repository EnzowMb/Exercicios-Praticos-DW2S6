package Exercicio.Pratico3.domain.cliente;

public record DadosDetalhamentoCliente(

        Long id,
        String nome,
        String email,
        String telefone

) {

    public DadosDetalhamentoCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getEmail(), cliente.getName(), cliente.getTelefone());
    }
}
