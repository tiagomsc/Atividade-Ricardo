package main

import "fmt"

type Empregado struct {
    Nome   string
    Cargo  string
    Salario float64
}

type Empresa struct {
    Nome       string
    Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(emp Empregado) {
    e.Empregados = append(e.Empregados, emp)
}

func (e Empresa) ListarEmpregados() {
    for _, emp := range e.Empregados {
        fmt.Printf("%s - %s: %.2f\n", emp.Nome, emp.Cargo, emp.Salario)
    }
}

func main() {
    empresa := Empresa{Nome: "TechCorp"}
    empregado1 := Empregado{Nome: "Laura", Cargo: "Desenvolvedora", Salario: 5000}
    empregado2 := Empregado{Nome: "João", Cargo: "Analista", Salario: 4000}
    empresa.AdicionarEmpregado(empregado1)
    empresa.AdicionarEmpregado(empregado2)
    empresa.ListarEmpregados()
}
