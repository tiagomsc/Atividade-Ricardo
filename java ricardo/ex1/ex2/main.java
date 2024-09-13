class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int aumento) {
        velocidade += aumento;
    }

    public void frear(int reducao) {
        velocidade = Math.max(0, velocidade - reducao);
    }

    public String exibirVelocidade() {
        return "Velocidade atual: " + velocidade + " km/h";
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Onix", 2022);
        carro.acelerar(50);
        System.out.println(carro.exibirVelocidade());  // Velocidade atual: 50 km/h
        carro.frear(20);
        System.out.println(carro.exibirVelocidade());  // Velocidade atual: 30 km/h
    }
}
