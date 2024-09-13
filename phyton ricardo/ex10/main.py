class Calculadora:
    @staticmethod
    def somar(a, b, c=None):
        if c is None:
            return a + b
        else:
            return a + b + c

# Exemplo de uso
print(Calculadora.somar(2, 3))       # 5
print(Calculadora.somar(2, 3, 4))    # 9
