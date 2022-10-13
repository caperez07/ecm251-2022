from src.controllers.controllerUsuario import ControllerUsuario
from pathlib import Path
import pickle
import streamlit_authenticator as stauth


if True:
    senhas = ControllerUsuario.get_senhas(ControllerUsuario())
    hashed_senhas = stauth.Hasher(senhas).generate()

    file_path = Path(__file__).parent / "hashed_pw.pkl"
    with file_path.open("wb") as file:
        pickle.dump(hashed_senhas, file)