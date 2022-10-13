from src.models.usuario import Usuario

class ControllerUsuario():
    def __init__(self):
        self._usuarios = [
            Usuario(nome = "Carolina", nomeUsuario = "caperez", senha = "carolzinha123", email = "carolina.perez711@gmail.com"),
            Usuario(nome = "Guilherme", nomeUsuario = "Guiban2000", senha = "banzinhaa", email = "guiban200@gmail.com"),
            Usuario(nome = "Matheus", nomeUsuario = "Pentgunz", senha = "eusouotaku", email = "matheus.pent@oul.com"),
            Usuario(nome = "Julia", nomeUsuario = "jumeneses", senha = "jujubavermelha3", email = "ju.meneses@hotmail.com")
        ]

    def check_usuario(self, usuario):
        return usuario in self._usuarios

    def get_senhas(self):
        senhas = []
        for usuario in self._usuarios:
            val = usuario.get_senha()
            senhas.append(val)
        return senhas

    def get_nomeUsusario(self):
        nomeUsuario = []
        for usuario in self._usuarios:
            val = usuario.get_nomeUsuario()
            nomeUsuario.append(val)
        return nomeUsuario

    def get_nomes(self):
        nomes = []
        for usuario in self._usuarios:
            val = usuario.get_nome()
            nomes.append(val)
        return nomes

    def get_emails(self):
        vec = []
        for usuario in self._usuarios:
            val = usuario.get_email()
            vec.append(val)
        return vec