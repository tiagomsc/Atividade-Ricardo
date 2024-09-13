package main

import "fmt"

type Imprimivel interface {
    Imprimir() string
}

type Relatorio struct{}

func (r Relatorio) Imprimir() string {
    return "Imprimindo relatório"
}

type Contrato struct{}

func (c Contrato) Imprimir() string {
    return "Imprimindo contrato"
}

func main() {
    imprimiveis := []Imprimivel{Relatorio{}, Contrato{}}
    for _, item := range imprimiveis {
        fmt.Println(item.Imprimir())
    }
}
