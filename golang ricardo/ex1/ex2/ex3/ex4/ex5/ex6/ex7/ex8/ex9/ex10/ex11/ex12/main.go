package main

import "fmt"

type Produto struct {
    Preco float64
}

func (p Produto) AdicionarOutro(outro Produto) Produto {
    return Produto{Preco: p.Preco + outro.Preco}
}

func main() {
    p1 := Produto{Preco: 10.5}
    p2 := Produto{Preco: 20.0}
    p3 := p1.AdicionarOutro(p2)
    fmt.Println("Preço total:", p3.Preco)
