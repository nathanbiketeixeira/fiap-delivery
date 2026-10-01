package br.com.fiapdelivery.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private String modelo;
    private double nivelCombustivel;

    public Veiculo(String proprietario, String placa, String modelo, double nivelCombustivel) {
        setProprietario(proprietario);
        setPlaca(placa);
        setModelo(modelo);
        setNivelCombustivel(nivelCombustivel);
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void abastecer(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade de combustível deve ser maior que zero.");
        }

        nivelCombustivel += quantidade;
    }

    public void consumirCombustivel(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade de combustível deve ser maior que zero.");
        }

        if (quantidade > nivelCombustivel) {
            throw new IllegalArgumentException("Combustível insuficiente.");
        }

        nivelCombustivel -= quantidade;
    }

    private void setProprietario(String proprietario) {
        if (proprietario == null || proprietario.trim().isEmpty()) {
            throw new IllegalArgumentException("O proprietário não pode ser vazio.");
        }

        this.proprietario = proprietario;
    }

    private void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        }

        this.placa = placa;
    }

    private void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio.");
        }

        this.modelo = modelo;
    }

    private void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel < 0) {
            throw new IllegalArgumentException("O nível de combustível não pode ser negativo.");
        }

        this.nivelCombustivel = nivelCombustivel;
    }
}