package main

import (
    "fmt"
)

type Carro struct {
    Marca     string
    Modelo    string
    Ano       int
    Velocidade int
}

func (c *Carro) Acelerar(aumento int) {
    c.Velocidade += aumento
}

func (c *Carro) Frear(reducao int) {
    if c.Velocidade-reducao < 0 {
        c.Velocidade = 0
    } else {
        c.Velocidade -= reducao
    }
}

func (c *Carro) ExibirVelocidade() string {
    return fmt.Sprintf("Velocidade atual: %d km/h", c.Velocidade)
}

func main() {
    carro := Carro{Marca: "Chevrolet", Modelo: "Onix", Ano: 2022}
    carro.Acelerar(50)
    fmt.Println(carro.ExibirVelocidade()) // Velocidade atual: 50 km/h
    carro.Frear(20)
    fmt.Println(carro.ExibirVelocidade()) // Velocidade atual: 30 km/h
}
