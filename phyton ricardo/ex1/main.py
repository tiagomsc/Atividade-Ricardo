class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def exibir_detalhes(self):
        return f"{self.ano} {self.marca} {self.modelo}"

# Instanciando três objetos da classe Carro
carro1 = Carro("Toyota", "Corolla", 2020)
carro2 = Carro("Honda", "Civic", 2021)
carro3 = Carro("Ford", "Fiesta", 2019)

# Exibindo detalhes dos carros
for carro in [carro1, carro2, carro3]:
    print(carro.exibir_detalhes())
