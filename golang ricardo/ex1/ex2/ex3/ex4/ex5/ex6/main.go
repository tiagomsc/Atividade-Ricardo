package main

import "fmt"

type Motor struct {
    Tipo string
}

type Carro struct {
    Marca  string
    Modelo string
    Ano    int
    Motor  Motor
}

func main() {
    motor := Motor{Tipo: "V8"}
    carro := Carro{Marca: "Ferrari", Modelo: "488", Ano: 2023, Motor: motor}
    fmt.Println(carro)
}
