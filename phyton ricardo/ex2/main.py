class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def acelerar(self, aumento):
        self.velocidade += aumento

    def frear(self, reducao):
        self.velocidade = max(0, self.velocidade - reducao)

    def exibir_velocidade(self):
        return f"Velocidade atual: {self.velocidade} km/h"

# Exemplo de uso
carro = Carro("Chevrolet", "Onix", 2022)
carro.acelerar(50)
print(carro.exibir_velocidade())  # Velocidade atual: 50 km/h
carro.frear(20)
print(carro.exibir_velocidade())  # Velocidade atual: 30 km/h
