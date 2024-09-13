import java.util.ArrayList;
import java.util.List;

class Empregado {
    public String nome;
    public String cargo;
    public double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

class Empresa {
    public String nome;
    private List<Empregado> empregados = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void listarEmpregados() {
        for (Empregado empregado : empregados) {
            System.out.println(empregado.nome + " - " + empregado.cargo + ": " + empregado.salario);
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp");
        Empregado empregado1 = new Empregado("Laura", "Desenvolvedora", 5000);
        Empregado empregado2 = new Empregado("João", "Analista", 4000);
        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);
        empresa.listarEmpregados();
    }
}
