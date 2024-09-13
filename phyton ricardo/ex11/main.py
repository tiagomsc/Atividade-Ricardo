from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas_trabalhadas, tarifa_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.tarifa_hora = tarifa_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.tarifa_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario):
        self.salario = salario

    def calcular_salario(self):
        return self.salario

# Exemplo de uso
horista = FuncionarioHorista(160, 20)
assalariado = FuncionarioAssalariado(3000)
print(horista.calcular_salario())    # 3200
print(assalariado.calcular_salario())  # 3000
