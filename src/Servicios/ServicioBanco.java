package Servicios;

import Entidades.Cuenta;

import java.util.*;

public class ServicioBanco {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static List<Cuenta> usuarios = new ArrayList<>();
    int opcion;


    public void menu() {
        UsuarioServicio us = new UsuarioServicio();
        CuentaServicio cs = new CuentaServicio();

        us.agregarUsuarios();


        do {

            System.out.println("");
            System.out.println("Bienvenido al menu principal");
            System.out.println("Por favor, elija una opcion");
            System.out.println("---------------------------");
            System.out.println("1. Crear usuario");
            System.out.println("2. Datos de usuario");
            System.out.println("3. Ingresar a su cuenta");
            System.out.println("4. Salir");


            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        us.crearUsuario();
                        break;
                    case 2:
                        System.out.println(us.usuarios.toString());
                        break;
                    case 3:
                        cs.validar();
                        break;
                    case 4:
                        System.out.println("Usted ha salido del banco, que tenga un buen dia");
                        break;


                }

            } catch (InputMismatchException a) {
                System.out.println("Error: solo se puede seleccionar numeros" + a);
                leer.nextLine();
            } catch (Exception b){
                System.out.println("Error, intente nuevamente" + b);
                leer.nextLine();

            }


        } while (opcion != 4);
    }


}
