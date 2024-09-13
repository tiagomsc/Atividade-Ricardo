package main

import "fmt"

type Funcionario interface {
    CalcularSalario() float64
}

type FuncionarioHorista struct {
    HorasTrabalhadas float64
    TarifaHora       float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
    return f.HorasTrabalhadas * f.TarifaHora
}

type FuncionarioAssalariado struct {
    SalarioFixo float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
    return f.SalarioFixo
}

func main() {
    f1 := FuncionarioHorista{HorasTrabalhadas: 160, TarifaHora: 25}
    f2 := FuncionarioAssalariado{SalarioFixo: 3000}

    fmt.Println("Salário Horista:", f1.CalcularSalario())
    fmt.Println("Salário Assalariado:", f2.CalcularSalario())
}
