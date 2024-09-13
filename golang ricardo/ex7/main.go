package main

import "fmt"

type Professor struct {
    Nome string
}

type Escola struct {
    Nome       string
    Professores []Professor
}

func (e *Escola) AdicionarProfessor(p Professor) {
    e.Professores = append(e.Professores, p)
}

func (e Escola) ListarProfessores() {
    for _, professor := range e.Professores {
        fmt.Println(professor.Nome)
    }
}

func main() {
    escola := Escola{Nome: "Escola A"}
    professor1 := Professor{Nome: "Ana"}
    professor2 := Professor{Nome: "Carlos"}
    escola.AdicionarProfessor(professor1)
    escola.AdicionarProfessor(professor2)
    escola.ListarProfessores()
}
