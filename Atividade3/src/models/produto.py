from unicodedata import name


class Produto():
    def __init__(self, nome, url, preco):
        self._nome = nome
        self._url = url 
        self._preco = preco
        
    def get_nome(self):
        return self._nome
    def get_preco(self):
        return self._preco
    def get_url(self):
        return self._url
    def __str__(self) -> str:
        return f'Produto(Nome: {self._nome}, Preço: {self._preco}, Url: {self._url})'