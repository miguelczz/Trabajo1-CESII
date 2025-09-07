package com.trabajo1.trabajo1.models;

public class Pedido {
    private final String codigo;
    private final String titulo;
    private final int valor;

    public Pedido(String codigo, String titulo, int valor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getValor() {
        return valor;
    }
}
