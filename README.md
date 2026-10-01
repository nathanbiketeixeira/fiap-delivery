# FiapDelivery

## Check Point 2 - Refatoração Orientada a Objetos

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos da FIAP.

O objetivo foi refatorar um código legado do sistema FiapDelivery, aplicando conceitos de Orientação a Objetos, Clean Code e boas práticas de desenvolvimento.

## Conceitos aplicados

### Encapsulamento

Os atributos das classes foram definidos como `private`, evitando o acesso direto aos dados.

As alterações de estado são realizadas por métodos da própria classe, mantendo as regras de validação centralizadas.

### Construtores

As classes possuem construtores responsáveis pela inicialização dos objetos.

Os valores recebidos são validados durante a criação dos objetos.

### Herança

A classe `Veiculo` funciona como superclasse.

As classes `Carro` e `Moto` herdam de `Veiculo` utilizando `extends`.

Essa estrutura permite reutilizar atributos e comportamentos comuns aos veículos.

### Associação

A classe `Rota` possui referências para `Pacote` e `Veiculo`.

Dessa forma, uma rota consegue representar qual pacote está sendo transportado e qual veículo está sendo utilizado.

### Validações

Foram implementadas validações para impedir dados inválidos, como:

* proprietário vazio;
* placa vazia;
* modelo vazio;
* combustível negativo;
* quantidade de combustível inválida;
* consumo maior que o combustível disponível;
* peso de pacote inválido;
* código de pacote vazio;
* status vazio;
* objetos nulos em uma rota.

## Estrutura do projeto

* `Veiculo.java` - superclasse dos veículos.
* `Carro.java` - especialização de Veiculo.
* `Moto.java` - especialização de Veiculo.
* `Pacote.java` - representa o pacote transportado.
* `Rota.java` - realiza a associação entre pacote e veículo.
* `SistemaPrincipal.java` - executa os testes do sistema.

## Testes

O `SistemaPrincipal` realiza testes de:

* criação de veículos;
* herança;
* abastecimento;
* consumo de combustível;
* criação de pacotes;
* associação entre objetos;
* realização de entregas;
* validações de dados inválidos.

## Diagrama UML

O projeto possui um diagrama de classes desenvolvido no Astah, contendo:

* superclasse `Veiculo`;
* subclasses `Carro` e `Moto`;
* classe `Pacote`;
* classe `Rota`;
* relações de herança;
* relações de associação.

## Refatoração

O código legado possuía atributos públicos, nomes pouco descritivos e uma associação limitada ao tipo `Caminhao`.

A nova implementação utiliza nomes mais claros, encapsulamento, herança e associação com a classe `Veiculo`, permitindo que diferentes tipos de veículos sejam utilizados nas rotas.

## Autor

Nathan de Mello Teixeira
FIAP - Ciência da Computação
