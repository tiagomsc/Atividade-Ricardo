import java.util.ArrayList;
import java.util.List;

class Professor {
    public String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

class Escola {
    public String nome;
    private List<Professor> professores = new ArrayList<>();

    public Escola(String nome) {
        this.nome = nome;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor.nome);
        }
    }

    public static void main(String[] args) {
        Escola escola = new Escola("Escola A");
        Professor professor1 = new Professor("Ana");
        Professor professor2 = new Professor("Carlos");
        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.listarProfessores();
    }
}
