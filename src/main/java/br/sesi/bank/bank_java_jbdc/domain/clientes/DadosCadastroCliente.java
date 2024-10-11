package br.sesi.bank.bank_java_jbdc.domain.clientes;

public class DadosCadastroCliente {
        public String nome;
    public String email;
    public String cpf;

    public DadosCadastroCliente(String nome, String email, String cpf){

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
}
