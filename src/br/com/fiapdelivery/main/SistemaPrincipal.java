package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Carro;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("===== FIAP DELIVERY =====");

        // Criação dos veículos

        Carro carro = new Carro(
                "João",
                "ABC1234",
                "Fiat Cronos",
                40.0,
                5
        );

        Moto moto = new Moto(
                "Carlos",
                "XYZ5678",
                "Honda CG",
                10.0,
                true
        );

        // Teste da herança e dos métodos da classe Veiculo

        System.out.println("\n--- CARRO ---");
        System.out.println("Proprietário: " + carro.getProprietario());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Combustível: " + carro.getNivelCombustivel());
        System.out.println("Capacidade: " + carro.getCapacidadePassageiros());

        carro.consumirCombustivel(5);

        System.out.println(
                "Combustível após consumo: "
                + carro.getNivelCombustivel()
        );

        carro.abastecer(10);

        System.out.println(
                "Combustível após abastecimento: "
                + carro.getNivelCombustivel()
        );

        System.out.println("\n--- MOTO ---");
        System.out.println("Proprietário: " + moto.getProprietario());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Combustível: " + moto.getNivelCombustivel());
        System.out.println("Possui baú: " + moto.isPossuiBau());

        // Criação do pacote

        Pacote pacote = new Pacote(
                "BR999",
                10.5,
                "Pendente"
        );

        System.out.println("\n--- PACOTE ---");
        System.out.println("Código: " + pacote.getCodigo());
        System.out.println("Peso: " + pacote.getPeso());
        System.out.println("Status: " + pacote.getStatus());

        // Associação entre Pacote e Carro

        Rota rotaCarro = new Rota(pacote, carro);

        System.out.println("\n--- ROTA COM CARRO ---");
        rotaCarro.realizarEntrega();

        System.out.println(
                "Status do pacote: " + pacote.getStatus()
        );

        // Associação entre Pacote e Moto

        pacote.atualizarStatus("Pendente");

        Rota rotaMoto = new Rota(pacote, moto);

        System.out.println("\n--- ROTA COM MOTO ---");
        rotaMoto.realizarEntrega();

        System.out.println(
                "Status do pacote: " + pacote.getStatus()
        );

        // Testes inválidos

        System.out.println("\n--- TESTES DE VALIDAÇÃO ---");

        try {
            new Carro(
                    "",
                    "AAA1111",
                    "Fiat",
                    20.0,
                    5
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Teste proprietário vazio: " + e.getMessage());
        }

        try {
            new Moto(
                    "Pedro",
                    "",
                    "Honda",
                    10.0,
                    true
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Teste placa vazia: " + e.getMessage());
        }

        try {
            new Pacote(
                    "BR123",
                    -5,
                    "Pendente"
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Teste peso inválido: " + e.getMessage());
        }

        try {
            carro.consumirCombustivel(1000);
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Teste combustível insuficiente: " + e.getMessage()
            );
        }
    }
}
