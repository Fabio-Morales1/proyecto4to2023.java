package poomenu10;

import java.util.Scanner;

public class POOmenu10 {

    static int contador = 0;

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        Profesor misMaestros[] = new Profesor[10];

        try {
            do {
                System.out.println("    1. Crear Profesor");
                System.out.println("    2. Ver Profesores");
                System.out.println("    3. Ver Profesor");
                System.out.println("    4. Actulizar Datos del Profesor");
                System.out.println("    5. Salir");
                System.out.println("Ingrese el Numero de Opcion");

                op = entrada.nextInt();
                switch (op) {
                    case 1:
                        Scanner teclado = new Scanner(System.in);
                        System.out.println("-------------NUEVO_PROFESOR-------------");
                        System.out.println("______Ingrese el Nombre del Profesor____________");
                        String Nombre = entrada.nextLine();
                        System.out.println("______Ingrese La Especialidad Del Profesor_______");
                        String Materia = entrada.nextLine();
                        misMaestros[contador] = new Profesor[Nombre
                        ,Materia
                        ];
                      contador++;
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
