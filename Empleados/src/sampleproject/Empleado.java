/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sampleproject;

/**
 *
 * @author JOSUE SERRANO
 */
public class Empleado {
    private String nom;
    private String apellido;
    private int Ced;
    private String contacto;
    private double salario;
    private String codigo;

    public Empleado(String nom, String apellido, int Ced, String contacto, double salario, String codigo) {
        this.nom = nom;
        this.apellido = apellido;
        this.Ced = Ced;
        this.contacto = contacto;
        this.salario = salario;
        this.codigo = codigo;
    }

    public Empleado() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCed() {
        return Ced;
    }

    public void setCed(int Ced) {
        this.Ced = Ced;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        
        return Ced+"";
    }
    
}
