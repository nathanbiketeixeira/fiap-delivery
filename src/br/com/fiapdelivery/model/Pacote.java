package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        setCodigo(codigo);
        setPeso(peso);
        setStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    public void atualizarStatus(String novoStatus) {
        setStatus(novoStatus);
    }

    private void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser vazio.");
        }

        this.codigo = codigo;
    }

    private void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }

        this.peso = peso;
    }

    private void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("O status não pode ser vazio.");
        }

        this.status = status;
    }
}