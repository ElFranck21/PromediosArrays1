/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedios_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author trini
 */
public class Promedios_arrays {
    
    //Bufer de entrada como variable global
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public static double[] leerCalificaciones(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println("Escriba calificaciones del grupo 1A: ");
        for(int i = 0; i < n; i++){
            System.out.println("Escriba la calificacion del alumno con el id: "+ i +":");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }
    
    
    
    public static double[] leerCalificaciones1b(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println("Escriba calificaciones del grupo 1B: ");
        for(int i = 0; i < n; i++){
            System.out.println("Escriba la calificacion del alumno con el id: "+ i +":");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }

    public static double[] leerCalificaciones4A(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println("Escriba calificaciones del grupo 4A: ");
        for(int i = 0; i < n; i++){
            System.out.println("Escriba la calificacion del alumno con el id: "+ i +":");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }
    public static double[] leerCalificaciones4B(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println("Escriba calificaciones del grupo 4B: ");
        for(int i = 0; i < n; i++){
            System.out.println("Escriba la calificacion del alumno con el id: "+ i +":");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }
    public static double[] leerCalificaciones4C(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println("Escriba calificaciones del grupo 4C: ");
        for(int i = 0; i < n; i++){
            System.out.println("Escriba la calificacion del alumno con el id: "+ i +":");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }
    public static double calcularPromedioGrupo(double[] proms){
        double suma = 0;
        /*for(int i = 0; i < proms.length; i++)
            suma = suma + proms[i];*/
        
        // Con el for extendido
        for (double prom : proms)
            suma = suma + prom;
        
        return (suma/proms.length);
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void imprimirCalificaciones(double[] califs) throws IOException {
        int i = 0;
        System.out.println("Los promedios individuales del grupo son:");
        System.out.println("idAlumno   Promedio Individual");
        System.out.println("--------------------------------------------");
        for (double calif : califs) {
            System.out.println("" + i + "             " + calif);
            i++;
        }
    }
    
    public static void imprimirCalificacionesFinales(double[] califin) throws IOException {
        int i = 0; //3
        System.out.println("Los promedios finales de cada grupo son: ");
        System.out.println("Grupo         Promedio");
        System.out.println("--------------------------------------------");
        for (double calisfinal : califin){
            System.out.println(" "+ i + "           "+ calisfinal);
            i++;
        }
    }



    public static void main(String[] args) throws IOException {
        //Declaración de una variable t
        int t;
        
        // Declaración de un arreglo de double
        double[] calificaciones;
        double[] promGrupo = new double[5];
        double promFinal;
        

        // Encontrar el promedio de un grupo
        System.out.println();
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        calificaciones = leerCalificaciones(t);
        System.out.println();
        
        imprimirCalificaciones(calificaciones);
        promGrupo[0] = calcularPromedioGrupo(calificaciones);
        //---------------------------------------------------------
        
        // Encontrar el promedio de un grupo5
        calificaciones = leerCalificaciones1b(t);
        System.out.println();
        
        imprimirCalificaciones(calificaciones);
        promGrupo[1] = calcularPromedioGrupo(calificaciones);
        //---------------------------------------------------------
        
        // Encontrar el promedio de un grupo5
        calificaciones = leerCalificaciones4A(t);
        System.out.println();
        
        imprimirCalificaciones(calificaciones);
        promGrupo[2] = calcularPromedioGrupo(calificaciones);
        //---------------------------------------------------------
        
        // Encontrar el promedio de un grupo5
        calificaciones = leerCalificaciones4B(t);
        System.out.println();
        
        imprimirCalificaciones(calificaciones);
        promGrupo[3] = calcularPromedioGrupo(calificaciones);
        //---------------------------------------------------------
        
        // Encontrar el promedio de un grupo5
        calificaciones = leerCalificaciones4C(t);
        System.out.println();
        
        imprimirCalificaciones(calificaciones);
        promGrupo[4] = calcularPromedioGrupo(calificaciones);
        //---------------------------------------------------------
        
        imprimirCalificacionesFinales(promGrupo);

        promFinal = calcularPromedioGrupo(promGrupo);
        System.out.println("El promedio final es: "+ promFinal);
    }
}
