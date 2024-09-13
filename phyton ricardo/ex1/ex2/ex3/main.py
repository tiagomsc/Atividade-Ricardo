class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.__saldo = saldo
        self.titular = titular

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor

    def sacar(self, valor):
        if valor > 0 and valor <= self.__saldo:
            self.__saldo -= valor
        else:
            raise ValueError("Saldo insuficiente")

    def exibir_saldo(self):
        return f"Saldo: {self.__saldo}"

# Exemplo de uso
conta = ContaBancaria("João")
conta.depositar(100)
print(conta.exibir_saldo())  # Saldo: 100
conta.sacar(30)
print(conta.exibir_saldo())  # Saldo: 70
