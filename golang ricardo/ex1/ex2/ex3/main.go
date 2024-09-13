package main

import (
    "fmt"
    "errors"
)

type ContaBancaria struct {
    saldo   float64
    titular string
}

func (c *ContaBancaria) Depositar(valor float64) {
    if valor > 0 {
        c.saldo += valor
    }
}

func (c *ContaBancaria) Sacar(valor float64) error {
    if valor > 0 && valor <= c.saldo {
        c.saldo -= valor
        return nil
    }
    return errors.New("Saldo insuficiente")
}

func (c *ContaBancaria) ExibirSaldo() string {
    return fmt.Sprintf("Saldo: %.2f", c.saldo)
}

func main() {
    conta := ContaBancaria{titular: "João", saldo: 100}
    conta.Depositar(50)
    fmt.Println(conta.ExibirSaldo()) // Saldo: 150.00
    err := conta.Sacar(30)
    if err != nil {
        fmt.Println(err)
    }
    fmt.Println(conta.ExibirSaldo()) // Saldo: 120.00
}
