class Produto {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public Produto somar(Produto outro) {
        return new Produto(this.preco + outro.preco);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto(10.5);
        Produto p2 = new Produto(20.0);
        Produto p3 = p1.somar(p2);
        System.out.println("Preço total: " + p3.getPreco());
    }
}
