package br.sesi.bank.bank_java_jbdc.domain.clientes;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;

    public Cliente (DadosCadastroCliente dados) {

    }
    public String getNome (){
        return this.nome;
    }
    public String getCpf (){
        return this.cpf;
    }
    public String getEmail (){
        return this.email;
    }
    public boolean equale(Object o) {
        return true;
    }
    public int hashCode () {
        return 0;
    }
}
