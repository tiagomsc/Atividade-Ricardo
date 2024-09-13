class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        // Construtor privado para evitar instanciamento externo
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();
        System.out.println(config1 == config2);  // true
    }
}
