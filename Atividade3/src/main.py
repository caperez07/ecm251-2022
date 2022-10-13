import streamlit as st
import streamlit_authenticator as stauth
import hashing
import pickle
import pandas as pd
from controllers.controllerCarrinho import ControllerCarrinho
from src.controllers.controllerUsuario import ControllerUsuario
from src.controllers.controllerProduto import ControllerProduto
from pathlib import Path
from unicodedata import name


nomes = ControllerUsuario.get_nomes(ControllerUsuario())
nomeUsuario = ControllerUsuario.get_nomeUsusario(ControllerUsuario())
senhas = ControllerUsuario.get_senhas(ControllerUsuario())
emails = ControllerUsuario.get_emails(ControllerUsuario())

try:
    arquivo_path = Path(__file__).parent / "hashed_pw.pkl"
    arquivo_path.open("rb")
except:
    hashing

with arquivo_path.open("rb") as arquivo:
    hashed_senhas = pickle.load(arquivo)

autenticador = stauth.Authenticate(nomes, nomeUsuario, hashed_senhas,
    "Carol", "xsdfv", cookie_expiry_days=60)


nome, statusAutenticacao, nomeUsuario = autenticador.login("entrar", "main")
if statusAutenticacao == False:
    st.error("Nome de usuário e/ou senha incorretos")
    st.session_state["Carrinho"] = ControllerCarrinho()

if  statusAutenticacao == None:
    st.warning("Por favor, insira seu nome de usuário e senha")
    
    st.session_state["Carrinho"] = ControllerCarrinho()

if statusAutenticacao:
    autenticador.logout("Sair")
    st.sidebar.title(f"Olá *{name}*")

    
    #Para um único usuário
    st.sidebar.image("https://cdn-icons-png.flaticon.com/512/6073/6073873.png")
    st.sidebar.markdown("***")
    st.sidebar.title(f"Olá!")
    st.sidebar.markdown("***")
    tab1, tab2= st.tabs(["Principal","Carrinho"])
    
    
    def novo_funko():
        st.session_state["Carrinho"] = ControllerCarrinho()

    with tab2:
            st.title("")
            st.markdown("***")

            col1, col2, col3,col4 = st.columns(4,gap="large")
            col1.markdown("### Produtor")
            col2.markdown("### Preço")
            col3.markdown("### Quantidade")
        
            
            quantidadeProduto = []
            nomeProdutos = []
            precoProdutos = []
            for qntproducao in st.session_state["Carrinho"].get_carrinho().get_produtos():
                nomeProdutos.append(qntproducao[0].get_nome())
                precoProdutos.append(qntproducao[0].get_preco())
                quantidadeProduto.append(qntproducao[1])
                    
            with col1:
                c = st.container()
                for i in range(len(nomeProdutos)):
                    c.markdown(f"#### {nomeProdutos[i]}")
            with col2:
                c = st.container()
                for i in range(len(nomeProdutos)):
                    c.markdown(f"#### R${precoProdutos[i]}")
            with col3:
                c = st.container()
                for i in range(len(nomeProdutos)):
                    c.markdown(f"#### {quantidadeProduto[i]}")
            with col4:
                c.button(label = f"Limpar Carrinho", key = 297, on_click= novo_funko)


            st.markdown("***")
            valorTotal = st.session_state["Carrinho"].get_precoTotal()
            st.markdown(f"## Total:{valorTotal:.3f} \n Moeda aceita!")
            c1 = st.container()
            c1.button(label = f"Pagar", key = 1570, on_click= novo_funko)
            st.markdown("***")
                        