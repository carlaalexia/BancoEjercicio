package Principal;

import Servicios.ServicioBanco;
import Servicios.UsuarioServicio;


public class Main {


    public static void main(String[] args) {

        ServicioBanco sv = new ServicioBanco();
        UsuarioServicio us = new UsuarioServicio();

        sv.menu();


    }


}
