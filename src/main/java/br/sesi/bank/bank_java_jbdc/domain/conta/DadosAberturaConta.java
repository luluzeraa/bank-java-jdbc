package br.sesi.bank.bank_java_jbdc.domain.conta;

import br.sesi.bank.bank_java_jbdc.domain.clientes.DadosCadastroCliente;

public class DadosAberturaConta {
    public Integer numero;
    public DadosCadastroCliente dadosClientes;

    public DadosAberturaConta(Integer numero, DadosCadastroCliente dadosClientes){
        this.numero = numero;
        this.dadosClientes = dadosClientes;
    }
}
