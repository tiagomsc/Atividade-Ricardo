class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public String exibirDetalhes() {
        return ano + " " + marca + " " + modelo + " com motor " + motor.getTipo();
    }

    public static void main(String[] args) {
        Motor motor = new Motor("V8");
        Carro carro = new Carro("Ferrari", "488", 2023, motor);
        System.out.println(carro.exibirDetalhes());
    }
}
