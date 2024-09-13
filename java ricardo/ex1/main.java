class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return ano + " " + marca + " " + modelo;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);
        Carro carro3 = new Carro("Ford", "Fiesta", 2019);

        System.out.println(carro1.exibirDetalhes());
        System.out.println(carro2.exibirDetalhes());
        System.out.println(carro3.exibirDetalhes());
    }
}
