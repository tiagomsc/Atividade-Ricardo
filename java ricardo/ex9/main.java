interface Imprimivel {
    String imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public String imprimir() {
        return "Imprimindo relatório";
    }
}

class Contrato implements Imprimivel {
    @Override
    public String imprimir() {
        return "Imprimindo contrato";
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel[] imprimiveis = {new Relatorio(), new Contrato()};
        for (Imprimivel item : imprimiveis) {
            System.out.println(item.imprimir());
        }
    }
}
