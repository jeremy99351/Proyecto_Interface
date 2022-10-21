/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import clases.Empleados;

/**
 *
 * @author jerem
 */
public class Gobal {

    Vector vPrincipal = new Vector();

    private String fecha = fechaA();
    private int cont = 0000, codigo = cod(cont);

    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static String fechaA() {
        Date fecha = new Date();
        SimpleDateFormat FFecha = new SimpleDateFormat("dd/MM/yyyy");
        return FFecha.format(fecha);
    }

    public static int cod(int cont) {

        if (cont != cont) {
            cont = cont + 1;
        } else {
            cont = cont + 1;
        }
        return cont;
    }

    // se hace un vector para para poder enbloquear los archivos de cada empleado
    public void guardar(Empleados empleado) {
        vPrincipal.addElement(empleado);

    }

    // se gurdan y se genera un archivo en txt para poder almacenar los datos 
    public void archivo(Empleados empleados) throws IOException {

        File archivo = new File("DB_EMPLEADOS.txt");
        FileWriter escribir;
        PrintWriter linea;

        if (!archivo.exists()) {

            //System.out.println(" el proveedor es " + proveedor.getRazonSocial() + " con el codigo " + proveedor.getCod());
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

//            linea.print(empleado.getNombre() + " " + empleado.getApellido() + " " + empleado.getApellido2() + ""
//                    + empleado.getId() + " " + clase.getCodigo() + ""
//                            + " " + empleado.getSalario() + " " + clase.getFecha());
            linea.print("|" + getCodigo());
            linea.print("|" + empleados.getNombre());
            linea.print("|" + empleados.getApellido());
            linea.print("|" + empleados.getApellido2());
            linea.print("|" + empleados.getId());
            linea.print("|" + empleados.getSalario());
            linea.print("|" + empleados.getPuesto());
            linea.println("|" + getFecha());

            linea.close();
            escribir.close();

        } else {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

            linea.print("|" + getCodigo());
            linea.print("|" + empleados.getNombre());
            linea.print("|" + empleados.getApellido());
            linea.print("|" + empleados.getApellido2());
            linea.print("|" + empleados.getId());
            linea.print("|" + empleados.getSalario());
            linea.print("|" + empleados.getPuesto());
            linea.println("|" + getFecha());
            linea.close();
            escribir.close();
        }
    }

    public DefaultTableModel listarDaotos() {
        Vector columnas = new Vector();

        columnas.addElement("Codigo");
        columnas.addElement("Nombre");
        columnas.addElement("Apellido 1");
        columnas.addElement("Apellido 2");
        columnas.addElement("CEDULA");
        columnas.addElement("Salario");
        columnas.addElement("Puesto");
        columnas.addElement("FECHA");

        // SE CREA LAS COLUMNAS QUE TENDRAN LOS DATOS DE LA TABLA
        // GENERAMOS UN MODELO DE LA TABLA
        DefaultTableModel mdlTabla = new DefaultTableModel(columnas, 0);

        try {
            FileReader fr = new FileReader("DB_EMPLEADOS.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                cont++;
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
}
