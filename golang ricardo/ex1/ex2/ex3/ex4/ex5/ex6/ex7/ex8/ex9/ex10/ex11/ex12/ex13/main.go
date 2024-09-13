package main

import "fmt"

type Matematica struct{}

func (Matematica) Fatorial(n int) int {
    if n == 0 {
        return 1
    }
    resultado := 1
    for i := 1; i <= n; i++ {
        resultado *= i
    }
    return resultado
}

func main() {
    m := Matematica{}
    fmt.Println("Fatorial de 5:", m.Fatorial(5))
}
