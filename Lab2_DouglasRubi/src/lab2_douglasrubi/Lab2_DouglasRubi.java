/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_douglasrubi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author famii
 */
public class Lab2_DouglasRubi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        ArrayList<Detective> detectives = new ArrayList();
        ArrayList<Caso> casos = new ArrayList();
        int Opcion = 0;
        while (Opcion != 6) {

            System.out.println("•••   Menu  ••• ");
            System.out.println("1. •Administrar detectives");
            System.out.println("2. •Administrar casos");
            System.out.println("3. •Listar casos");
            System.out.println("4. •Listar detectives");
            System.out.println("5. •Listar casos resueltos");
            System.out.println("6. •Listar casos resueltos");
            System.out.println("7.•Salir del programa");
            System.out.print("Ingrese la opcion deseada: ");
            Opcion = Leer.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("1. •Agregar detectives ");
                    System.out.println("2. •Eliminar detectives");
                    System.out.println("3. •Modificar detectives");
                    System.out.print("Ingrese la opcion deseada: ");
                    int opcionDetective = 0;
                    opcionDetective = Leer.nextInt();
                    boolean existeDetective = false;
                    String buscar = "";
                    int posicionEliminar = -1;
                    switch (opcionDetective) {
                        case 1:
                            System.out.println("Ingrese el nombre: ");
                            String nombre = Leer.next();
                            System.out.println("Ingrese la edad: ");
                            int edad = Leer.nextInt();
                            System.out.println("Ingrese la nacionalidad: ");
                            String nacionalidad = Leer.next();
                            System.out.println("Ingrese el años laborales: ");
                            int aniosLaborales = Leer.nextInt();
                            System.out.println("Ingrese el nivel: ");
                            int nivel = Leer.nextInt();
                            detectives.add(new Detective(nombre, edad, nacionalidad, aniosLaborales, nivel));
                            System.out.println("El detective se agrego");
                            break;
                        case 2:
                            existeDetective = false;
                            System.out.println("Ingrese el nombre del detective a actualizar:");
                            buscar = Leer.next();
                            for (int i = 0; i < detectives.size(); i++) {
                                if (detectives.get(i).nombre.equals(buscar)) {
                                    System.out.println("Ingrese el nombre: ");
                                    String nombreActualizar = Leer.next();
                                    System.out.println("Ingrese la edad: ");
                                    int edadActualizar = Leer.nextInt();
                                    System.out.println("Ingrese la nacionalidad: ");
                                    String nacionalidadActualizar = Leer.next();
                                    System.out.println("Ingrese el Años laborales: ");
                                    int aniosLaboralesActualizar = Leer.nextInt();
                                    System.out.println("Ingrese el nivel del detective: ");
                                    int nivelActualizar = Leer.nextInt();
                                    detectives.get(i).nombre = nombreActualizar;
                                    detectives.get(i).edad = edadActualizar;
                                    detectives.get(i).nacionalidad = nacionalidadActualizar;
                                    detectives.get(i).aniosLaborales = aniosLaboralesActualizar;
                                    detectives.get(i).nivel = nivelActualizar;
                                    existeDetective = true;
                                    System.out.println("El detetctive se actualizo");
                                }
                            }
                            if (existeDetective == false) {
                                System.out.println("El detective buscado no existe");
                            }
                            break;
                        case 3:
                            posicionEliminar = -1;
                            System.out.println("Ingrese el nombre del detective a eliminar:");
                            buscar = Leer.next();
                            for (int i = 0; i < detectives.size(); i++) {
                                if (detectives.get(i).nombre.equals(buscar)) {
                                    posicionEliminar = i;
                                }
                            }
                            if (posicionEliminar >= 0) {
                                detectives.remove(posicionEliminar);
                                System.out.println("El detetctive se elimino");
                            } else {
                                System.out.println("El detective que ha buscado no existe");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("5. •Registro de casos");
                    System.out.println("6. •Modicar casos");
                    System.out.println("7. •Eliminar casos");
                    System.out.print("Ingrese la opcion deseada: ");
                    int opcionCaso = 0;
                    opcionCaso = Leer.nextInt();
                    boolean existeCaso = false;
                    switch (opcionCaso) {
                        case 1:
                            System.out.println("Ingrese el lugar: ");
                            String Lugar = Leer.next();
                            System.out.println("Ingrese la descripción: ");
                            String Descripcion = Leer.next();
                            int tipoCaso = 0;
                                    System.out.println("Ingrese la opción de caso: \n1. Homicidio\n 2. Robo\n 3. Secuestro):  ");
                                    tipoCaso = Leer.nextInt();
                                    String Tipo = "";
                                    switch (tipoCaso) {
                                        case 1:
                                            Tipo = "Homicidio";
                                            break;
                                        case 2:
                                            Tipo = "Robo";
                                            break;
                                        case 3:
                                            Tipo = "Secuestro";
                                            break;
                                        default:
                                            Tipo = "Homicidio";
                                            break;
                                    }
                                    System.out.println("Ingrese el detective: ");
                                    int numeroDetective = -1;
                                    for (int j = 0; j < detectives.size(); j++) {
                                        System.out.println((j+1)+" " + detectives.get(j).nombre + " nivel " + detectives.get(j).nivel);
                                    }
                                    numeroDetective = Leer.nextInt();
                                    Detective detective = detectives.get(numeroDetective-1);
                                    System.out.println("Ingrese el estado: ");
                                    int estado = 0;
                                    System.out.println("Ingrese la opción de estado del  caso: \n1. Proceso\n 2. Resuelto:  ");
                                    estado = Leer.nextInt();
                                    String Estado = "";
                                    switch (estado) {
                                        case 1:
                                            Estado = "Proceso";
                                            break;
                                        case 2:
                                            Estado = "Resuelto";
                                            break;
                                        default:
                                            Estado = "Proceso";
                                            break;
                                    }
                            
                            Caso caso = new Caso(Lugar, Descripcion, Tipo, detective, Estado);
                            casos.add(caso);
                            for (int i = 0; i < detectives.size(); i++) {
                                if(detectives.get(i).nombre.equals(detective.nombre)){
                                    detectives.get(i).casos.add(caso);
                                }
                            }
                            System.out.println("El detective se agrego");
                            break;
                        case 2:
                            existeCaso = false;
                            System.out.println("Ingrese el nombre del detective a actualizar:");
                            buscar = Leer.next();
                            for (int i = 0; i < casos.size(); i++) {
                                if (detectives.get(i).nombre.equals(buscar)) {
                                    System.out.println("Ingrese el nombre: ");
                                    String LugarActualizar = Leer.next();
                                    System.out.println("Ingrese la descripcion: ");
                                    String DescripcionActualizar = Leer.next();
                                    System.out.println("Ingrese el tipo: ");
                                    tipoCaso = 0;
                                    System.out.println("Ingrese la opción de caso: \n1. Homicidio\n 2. Robo\n 3. Secuestro):  ");
                                    tipoCaso = Leer.nextInt();
                                    String TipoActualizar = "";
                                    switch (tipoCaso) {
                                        case 1:
                                            TipoActualizar = "Homicidio";
                                            break;
                                        case 2:
                                            TipoActualizar = "Robo";
                                            break;
                                        case 3:
                                            TipoActualizar = "Secuestro";
                                            break;
                                        default:
                                            TipoActualizar = "Homicidio";
                                            break;
                                    }
                                    System.out.println("Ingrese el detective: ");
                                    numeroDetective = -1;
                                    for (int j = 0; j < detectives.size(); j++) {
                                        System.out.println((j+1)+" " + detectives.get(j).nombre + " nivel " + detectives.get(j).nivel);
                                    }
                                    numeroDetective = Leer.nextInt();
                                    Detective detectiveActualizar = detectives.get(numeroDetective-1);
                                    System.out.println("Ingrese el estado: ");
                                    estado = 0;
                                    System.out.println("Ingrese la opción de estado del  caso: \n1. Proceso\n 2. Resuelto:  ");
                                    estado = Leer.nextInt();
                                    String EstadoActualizar = "";
                                    switch (estado) {
                                        case 1:
                                            EstadoActualizar = "Proceso";
                                            break;
                                        case 2:
                                            EstadoActualizar = "Resuelto";
                                            break;
                                        default:
                                            EstadoActualizar = "Proceso";
                                            break;
                                    }
                                    casos.get(i).lugar = LugarActualizar;
                                    casos.get(i).descripcion = DescripcionActualizar;
                                    casos.get(i).tipo = TipoActualizar;
                                    casos.get(i).detective = detectiveActualizar;
                                    casos.get(i).estado = EstadoActualizar;
                                    existeCaso = true;
                                    System.out.println("El caso se actualizo");
                                }
                            }
                            if (existeCaso == false) {
                                System.out.println("El caso buscado no existe");
                            }
                            break;
                        case 3:
                            posicionEliminar = -1;
                            System.out.println("Ingrese el nombre del caso a eliminar:");
                            buscar = Leer.next();
                            for (int i = 0; i < casos.size(); i++) {
                                if (casos.get(i).descripcion.equals(buscar)) {
                                    posicionEliminar = i;
                                }
                            }
                            if (posicionEliminar >= 0) {
                                casos.remove(posicionEliminar);
                                System.out.println("El caso se elimino");
                            } else {
                                System.out.println("El caso que ha buscado no existe");
                            }
                            break;
                    }
                    break;
            }
        }
    }

}
