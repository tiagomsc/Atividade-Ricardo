package main

import "fmt"

func Somar(a int, b int) int {
    return a + b
}

func SomarTres(a int, b int, c int) int {
    return a + b + c
}

func main() {
    fmt.Println(Somar(2, 3))       // 5
    fmt.Println(SomarTres(2, 3, 4)) // 9
}
