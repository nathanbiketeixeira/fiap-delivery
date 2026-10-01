package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String proprietario, String placa, String modelo,
                double nivelCombustivel, boolean possuiBau) {

        super(proprietario, placa, modelo, nivelCombustivel);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }
}