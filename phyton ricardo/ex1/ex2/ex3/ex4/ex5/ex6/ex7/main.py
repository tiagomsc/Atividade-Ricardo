class Professor:
    def __init__(self, nome):
        self.nome = nome

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

# Exemplo de uso
escola = Escola("Escola A")
professor1 = Professor("Ana")
professor2 = Professor("Carlos")
escola.adicionar_professor(professor1)
escola.adicionar_professor(professor2)
for professor in escola.professores:
    print(professor.nome)
