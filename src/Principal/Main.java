package Principal;

import Entidades.Cuenta;
import Entidades.Usuario;
import Servicios.ServicioBanco;
import Servicios.UsuarioServicio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ServicioBanco sv = new ServicioBanco();
        UsuarioServicio us = new UsuarioServicio();

        sv.menu();


    }


}
