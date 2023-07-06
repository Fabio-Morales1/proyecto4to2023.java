package poomenu10;

import java.util.Scanner;

public class POOmenu10 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        try {
            do {
                System.out.println("    1. Crear Profesor");
                System.out.println("    2. Ver Profesores");
                System.out.println("    3. Ver Profesor");
                System.out.println("    4. Actulizar Datos del Profesor");
                System.out.println("    5. Salir");
                System.out.println("");

                op = entrada.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("-------------Nuevo Profesor-------------");
                        break;

                    case 2:
                        System.out.println("------------Los_Datos_Son----------------");
                        break;

                    case 3:
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("");
                        break;

                    case 5:
                        System.out.println("");
                        System.out.println("_______Finalizado______");
                        System.out.println("");
                        break;

                }
            } while (op != 5);
        } catch (Exception e) {
            System.out.println("Palabra Incorrecta");
        }
    }

}
