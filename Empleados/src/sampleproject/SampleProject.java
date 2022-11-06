/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE SERRANO
 */
public class SampleProject {
    
static Scanner in=new Scanner(System.in);
static ArrayList<Empleado> lista= new ArrayList();
static Empleado empleado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        
        System.out.println("Bienvenido\nIngrese la cantidad de empleados a ingresar");
        cant=in.nextInt();
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre:");
            String nombre=in.next();
            System.out.println("---\nIngrese los apellidos:");
            String apellidos=in.next();
            System.out.println("---\nIngrese los apellidos:");
            int cedula=in.nextInt();
            System.out.println("---\nIngrese el contacto:");
            String contacto=in.next();
            System.out.println("---\nIngrese el salario:");
            int salario=in.nextInt();
            System.out.println("---\nIngrese el codigo de empleado:");
            String codigo=in.next();
            empleado=new Empleado(nombre,apellidos,cedula,contacto,salario,codigo);
            lista.add(empleado);
        }
        System.out.println(lista.get(0).getNom());
        
        
    }
    
}
