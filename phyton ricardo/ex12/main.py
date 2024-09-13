class Produto:
    def __init__(self, preco):
        self.preco = preco

    def __add__(self, other):
        if isinstance(other, Produto):
            return Produto(self.preco + other.preco)
        return NotImplemented

    def __str__(self):
        return f"Preço: {self.preco}"

# Exemplo de uso
produto1 = Produto(100)
produto2 = Produto(150)
produto3 = produto1 + produto2
print(produto3)  # Preço: 250
