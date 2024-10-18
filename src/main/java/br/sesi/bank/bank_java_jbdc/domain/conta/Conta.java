package br.sesi.bank.bank_java_jbdc.domain.conta;

import br.sesi.bank.bank_java_jbdc.domain.clientes.Cliente;
import com.mysql.cj.xdevapi.Client;

import java.math.BigDecimal;
import java.util.Objects;


public class Conta {

    private Integer numero;
    private BigDecimal saldo;
    private Cliente titular;

    public Conta(Integer numero, BigDecimal valor, Cliente titular){
        this.numero = numero;
        this.saldo = valor;
        this.titular = titular;

    }

    public boolean possuiSaldo(){

        return this.saldo.compareTo(BigDecimal.ZERO) != 0;
    }

    public void sacar(BigDecimal valor){
        this.saldo = this.saldo.subtract(valor);

    }

    public void depositar(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
    }

    @Override
    public int hashCode() { return Objects.hash(numero); }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }
    public Integer getNumero(){

        return numero;
    }

    public BigDecimal getSaldo(){

        return saldo;
    }

    public Cliente getTitular(){

        return titular;

    }

}