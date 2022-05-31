/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.Bank.src.main.java.Modelo;

import java.io.Serializable;

/**
 *
 * @author llait
 */
public class Cadastro implements Serializable {

    private String nome;
    private String data;
    private String cpf;
    private String rg;
    private String telefone;
    private String endereço;
    private String cidade;
    private String estado;
    private String email;
    private String senha;

    public Cadastro(String nome, String data, String cpf, String rg, String telefone, String endereço, String cidade, String estado, String email) {
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
    }

    public Cadastro() {

    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome
                + ", " + this.data
                + ", " + this.cpf
                + ", " + this.rg
                + ", " + this.telefone
                + ", " + this.endereço
                + ", " + this.cidade
                + ", " + this.estado
                + ", " + this.email;
    }
}
