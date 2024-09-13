from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def imprimir(self):
        return "Imprimindo relatório"

class Contrato(Imprimivel):
    def imprimir(self):
        return "Imprimindo contrato"

# Exemplo de uso
imprimiveis = [Relatorio(), Contrato()]
for item in imprimiveis:
    print(item.imprimir())
