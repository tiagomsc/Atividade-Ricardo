class Motor:
    def __init__(self, tipo):
        self.tipo = tipo

class Carro:
    def __init__(self, marca, modelo, ano, motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = motor

    def exibir_detalhes(self):
        return f"{self.ano} {self.marca} {self.modelo} com motor {self.motor.tipo}"

# Exemplo de uso
motor = Motor("V8")
carro = Carro("Ferrari", "488", 2023, motor)
print(carro.exibir_detalhes())
