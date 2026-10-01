package br.com.fiapdelivery.model;

public class Rota {

    private Pacote pacoteTransportado;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacoteTransportado, Veiculo veiculoUtilizado) {

        if (pacoteTransportado == null) {
            throw new IllegalArgumentException("O pacote não pode ser nulo.");
        }

        if (veiculoUtilizado == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }

        this.pacoteTransportado = pacoteTransportado;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public Pacote getPacoteTransportado() {
        return pacoteTransportado;
    }

    public Veiculo getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public void realizarEntrega() {
        System.out.println(
                "Levando pacote " + pacoteTransportado.getCodigo()
                + " no veículo " + veiculoUtilizado.getPlaca()
        );

        pacoteTransportado.atualizarStatus("Em transporte");
    }
}