package br.com.fiapdelivery.model;

public class Carro extends Veiculo {

    private int capacidadePassageiros;

    public Carro(String proprietario, String placa, String modelo,
                 double nivelCombustivel, int capacidadePassageiros) {

        super(proprietario, placa, modelo, nivelCombustivel);
        setCapacidadePassageiros(capacidadePassageiros);
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros <= 0) {
            throw new IllegalArgumentException(
                    "A capacidade de passageiros deve ser maior que zero.");
        }

        this.capacidadePassageiros = capacidadePassageiros;
    }
}