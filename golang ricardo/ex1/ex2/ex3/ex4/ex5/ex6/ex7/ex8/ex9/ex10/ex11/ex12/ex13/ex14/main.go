package main

import "fmt"

type Configuracao struct{}

var instancia *Configuracao

func GetConfiguracao() *Configuracao {
    if instancia == nil {
        instancia = &Configuracao{}
    }
    return instancia
}

func main() {
    c1 := GetConfiguracao()
    c2 := GetConfiguracao()
    fmt.Println(c1 == c2) // true
}
