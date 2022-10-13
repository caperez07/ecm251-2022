from src.models.produto import Produto

class ControllerProduto:
    def __init__(self):
        self._produto = [
            Produto("Funko Pop: Mando segurando Grogu", 149.00, "https://m.media-amazon.com/images/I/5176rALHhgS._AC_SX425_.jpg"),
            Produto("Funko Pop: Sulley com a Boo", 249.90, "https://www.lojatsc.com.br/wp-content/uploads/2021/09/Funko-Pop-Monstros-S.A.-Sulley-1158-1.png"),
            Produto("Funko Pop: Luffi", 343.90, "https://m.media-amazon.com/images/I/61VPWs6NdpL._AC_SY450_.jpg"),
        ]

    def get_produto(self, index):
        return self._produto[index]