from modelo.documentos import Document, Book, EMail
from modelo.plantas import Arvore, Alface

def run_system():
    doc1 = Document()
    doc2 = EMail(to="carolina.perez711@gmail.com", authors=['Carolina Perez'])
    doc3 = Book(title='Design Patterns', authors=["Erich Gamma",  "John Vlissides", "Ralph Johnson", "Richard Heln"])
    print(doc2.get_authors())
    print(doc3)

if __name__ == "__main__":
    # planta1 =Arvore('Carvalho')
    # planta2 = Alface(nome = 'Hamburguer de Siri do futuro')

    # print(planta1.ola())
    # print(planta2.ola())
    
    run_system()