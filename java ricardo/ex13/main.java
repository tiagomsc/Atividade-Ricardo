class Matematica {
    public static int fatorial(int n) {
        if (n == 0) return 1;
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + Matematica.fatorial(5));
    }
}
