package com.ace.hexagonal.application.core.domain;

public class Customer {

    public Customer(){
        this.isValidCpf = false;
    }

    public Customer(String id, String nome, Address address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = nome;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    private String id;
    private String name;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
