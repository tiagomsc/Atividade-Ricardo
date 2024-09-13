abstract class Funcionario {
    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double tarifaHora;

    public FuncionarioHorista(double horasTrabalhadas, double tarifaHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * tarifaHora;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioFixo;

    public FuncionarioAssalariado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioHorista(160, 25);
        Funcionario f2 = new FuncionarioAssalariado(3000);

        System.out.println("Salário Horista: " + f1.calcularSalario());
        System.out.println("Salário Assalariado: " + f2.calcularSalario());
    }
}

