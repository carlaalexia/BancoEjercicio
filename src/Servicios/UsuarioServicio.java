package Servicios;

import Entidades.Cuenta;
import Entidades.Usuario;

import java.util.*;

public class UsuarioServicio extends ServicioBanco {

    static int aleatorio;



    public static void crearUsuario() {

        Cuenta c = new Cuenta();
        String enc;


        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        c.setNombre(nombre);
        System.out.println("y su apellido");
        String apellido = leer.next();
        c.setApellido(apellido);

        do {
            System.out.println("Ingrese su edad");
            try {
                int edad = leer.nextInt();
                c.setEdad(edad);

                if (edad < 18) {

                    System.out.println("Tiene que ser mayor de 18 para crear una cuenta");
                }

            } catch (InputMismatchException b) {

                System.out.println("Error: solo debe ingresar numeros " + b);
                leer.next();
            }


        } while (c.getEdad() < 18);

        leer.nextLine();


        System.out.println("ingrese su direccion");
        String dir = leer.next();
        c.setDireccion(dir);

        do{
            try {
                System.out.println("Ingrese su telefono");
                int tel = leer.nextInt();
                c.setTelefono(tel);
                enc = "no";
                leer.nextLine();
            }catch (InputMismatchException b){
                System.out.println("Error: solo se pueden ingresar numeros " + b);
                enc = "si";
                leer.nextLine();
            }
        } while(enc =="si");

        System.out.println("Ingrese su email");
        String email = leer.next();
        c.setEmail(email);

        String usuario = (nombre +"."+apellido).toLowerCase();

        c.setUsuarioNombre(usuario);

        System.out.println("Su nombre de usuario es: " + c.getUsuarioNombre());


        do {
            try {
                System.out.println("Genere una contraseña personal");
                int contra = leer.nextInt();
                c.setContraseña(contra);
                enc = "no";
            } catch (InputMismatchException b) {
                System.out.println("Error: solo se pueden ingresar numeros " + b);
                enc = "si";
                leer.nextLine();
            }
        }while(enc =="si");

        c.setNumeroDeTarjeta(crearTarjeta());
        System.out.println("El numero de su tarjeta es: " + c.getNumeroDeTarjeta());

        System.out.println("Muchas gracias por registrarse en nuestro banco");
        System.out.println("Se le ha otorgado $5000");

        c.setMontoDinero(5000);

        usuarios.add(c);



    }


    public static int crearTarjeta() {

        Random r = new Random();


        Set<Double> generados = new HashSet<>();

        for (int i = 1; i <= usuarios.size(); i++) {
            boolean generado = false;
            while (!generado) {
                int posible = r.nextInt(900000000) + 100000000;
                if (!generados.contains(posible)) {
                    generados.add(Double.valueOf(posible));
                    aleatorio = posible;
                    generado = true;
                }
            }


        }
        return aleatorio;
    }


    public static void agregarUsuarios(){

        Cuenta c1 = new Cuenta("Andres", "Moncalvo", "moncalvoandres@gmail.com", 30,
                11303030, "Vilela 2964", 122456789,
                "andres.moncalvo", 23444, 10000);

        Cuenta c2 = new Cuenta("Carla", "Marquez", "mcarlaalexia@gmail.com", 26,
                1160323634, "Vilela 2970", 123456789,
                "carla.marquez", 12345, 150000);

        Cuenta c3 = new Cuenta("Anabella", "Delgado", "anadel@gmail.com", 27,
                11793426, "Ecuador 123", 123456666,
                "anabella.delgado", 66653, 6500);

       Cuenta c4 = new Cuenta("Monica", "Barreto", "barretom@gmail.com", 56,
                11444366, "Gelly y Obes 992", 198765432,
                "monica.barreto", 29941, 4000);

       Cuenta c5 = new Cuenta("Victoria", "Corton", "cortonv@gmail.com", 27, 11454545, "vidt 456", 454545454,
               "victoria.corton", 12344, 80000  );

       Cuenta c6 = new Cuenta("Soledad", "Marquez", "marquezsol@gmail.com", 32, 11676767, "Gelly y obes 990",
               676767678, "soledad.marquez", 12345, 10000);

        usuarios.add(c1);
        usuarios.add(c2);
        usuarios.add(c3);
        usuarios.add(c4);


    }

}
