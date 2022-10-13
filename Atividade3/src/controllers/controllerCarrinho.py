from src.models.carrinho import Carrinho

class ControllerCarrinho():
    def __init__(self):
        self._carrinho = Carrinho()
    def get_carrinho(self):
        return self._carrinho
    def add_produto(self, produto, quantidade):
        for i in range(len(self.get_carrinho().get_produto())):
            if self._carrinho.get_produto()[i][0].get_nome() == produto.get_nome():
                self._carrinho.get_produto()[i][1] += quantidade
                return self._carrinho._produto.append([produto,quantidade])


    def get_precoTotal(self):
        total = 0
        for itens in self._carrinho.get_produto():
            total += itens[0].get_preco() * itens[1]
        return total