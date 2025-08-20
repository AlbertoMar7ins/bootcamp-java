class no:
    def __init__(self, valor):
        self.valor = valor
        self.fe = None  # filho esquerdo
        self.fd = None  # filho direito

def menor(raiz):
    if raiz is None:
        return None  # Árvore vazia
    atual = raiz
    while atual.fe is not None:
        atual = atual.fe
    return atual.valor

# Em uma árvore AVL, a diferença de altura entre suas subárvores esquerda e direita é, em módulo, de no máximo uma unidade. Isso permite que uma busca na árvore seja realizada, no pior caso, em tempo O(log n), sendo n o número de nós da árvore. Considerando todos os conceitos aprendidos até aqui, escreva uma função na linguagem Python para encontrar o menor valor da árvore AVL. Considere o protótipo abaixo, sendo o parâmetro raiz, a raiz da árvore AVL:


# def menor(raiz): retorna o menor valor da árvore enraizada em raiz.

# Considere que os campos do nó são:

# valor;
# fe (filho esquerdo);
# fd (filho direito);
# nome da classe no.
# Implemente apenas a função.