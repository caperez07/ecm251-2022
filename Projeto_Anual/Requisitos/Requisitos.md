# Projeto Anual - Requisitos 17.03

*Descrição de Requisitos I*
    Desenvolvimento de uma plataforma de venda de jogos.
    
    A plataforma deve possibilitar que os usuários possuam suas
contas, seus perfis e seus dados de pagamento.
Cada usuário vai poder comprar novos jogos ao longo de sua
utilização da plataforma. O período de arrependimento da
compra de um jogo deve ser de 7 dias, onde o usuário pode
realizar sua devolução e receber o seu dinheiro de volta.

    Cada usuário vai poder dar feedbacks sobre os jogos que ele
possui. Esse detalhe é bastante importante, os usuários não
podem opinar sobre jogos que eles ainda não possuem.
Deve existir um perfil para cada jogo, com os dados sobre o
jogo e seu sistema de troféus.

    Utilizar como inspiração plataformas de jogos já existentes,
como Steam
(https://store.steampowered.com/?l=portuguese),Nuuvem
(https://www.nuuvem.com) e Origin
(https://www.origin.com/bra/pt-br/store).
- Elaborar o diagrama de classes;
- Descrição das funcionalidades de cada classe e seus
respectivos atributos.


1. Plataforma: (o que aparece na página inicial)
- Local de busca
- Anúncio de promoções
- Área de jogos destaque e/ou recomendados
- Área do úsuario
- Categorização dos jogos
- perfil de cada jogo
- Suporte ao úsuario
- Canal comunidade
- Notícias
- Carrinho de compras

2. Específicação das classes:
    2.1. Local de busca
        - barra de pesquisa por jogo ou categoria
        - filtro por marcador
        - filtro por preço
        - filtro por classificação indicativa
        - filtro por plataforma (Linux, Windows, macOS)
    2.2. Anúncio de promoções:
        - jogos com ofertas acima de 20%
        - carrocel de promoções automático (após um tempo ele muda sozinho, sem a necessidade do úsuario clicar em nada)
    2.3. Área de jogos destaque e/ou recomendados:
        - jogos mais baixados do ano
        - carrocel automático
    2.4. Área do úsuario:
        - perfil (nome, username, foto)
        - lista de desejos
        - biblioteca de jogos
        - área de dowloads
        - lista de amigos
        - área de troca
        - insígnias de jogo (troféus ganhos pelo úsuario)
    2.5. Categorização dos jogos:
        -