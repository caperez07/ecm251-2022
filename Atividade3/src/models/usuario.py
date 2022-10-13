class Usuario():
    def __init__(self, nome, email, nomeUsuario, senha):
        self._nome = nome
        self._email = email 
        self._nomeUsuario = nomeUsuario
        self._senha = senha

    def get_nome(self):
        return self._nome
    def get_email(self):
        return self._email
    def get_nomeUsuario(self):
        return self._nomeUsuario
    def get_senha(self):
        return self._senha

    def __str__(self) -> str:
        return f'Usuario(Nome: {self._nome}, Email: {self._email}, Senha: {self._senha})'
