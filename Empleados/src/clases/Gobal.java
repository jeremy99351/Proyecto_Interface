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

    int cont1 = 0001;
   Empleados clases = new Empleados();

    Vector vPrincipal = new Vector();

    private String fecha = fechaA();
    private String codigo;

    public String getCodigo() {
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

    public String Validacion_Ceros() {
        if (cod() <= 9) {
            codigo = "000" + cod();
            return codigo;
        }
        if (cod() > 9 && cod() < 99) {
            codigo = "00" + cod();
            return codigo;
        }
        if (cod() > 99 && cod() < 999) {
            codigo = "0" + cod();
            return codigo;
        } else {
            codigo = "" + cod();
            return codigo;
        }
    }

    public int cod() {
        int cont = 1;
        try {
            FileReader fr = new FileReader("DB_EMPLEADOS.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;

            while ((d = br.readLine()) != null) {
                cont++;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

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
            linea.print("|" + cod());
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
                
                String[] prueba = new String[d.length()];
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();

                prueba[cont1] = d;
                System.out.println(prueba[cont1]);
                cont1 = cont1 + 1;
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
    
    public  void datos(){
        
         try {
            FileReader fr = new FileReader("DB_EMPLEADOS.txt");
            //llamar al archivo en textro
            BufferedReader br = new BufferedReader(fr);
            // leer el archivo de texto
            String d;
            //contiene los datos 

            while ((d = br.readLine()) != null) {
                
                String[] prueba = new String[d.length()];
               
               

                prueba[cont1] = d;
                System.out.println(prueba[cont1]);
                cont1 = cont1 + 1;
                
               

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public  boolean validar_Letras(String dato){
        for(int i = 0;i<dato.length(); i++){
            char caracter = dato.toUpperCase().charAt(i);
            int ASCII = (int)caracter;
            if(ASCII!=165&&(ASCII<65||ASCII>90)){
                JOptionPane.showMessageDialog(null, "error solo se permiten letras");
                return false;
            }
        }
        return true;
    }
    
    
    public  boolean validar_Numeros(String dato) {
        boolean ve = false;
        if (dato.matches("[0-9]*") == true) {
            System.out.println("correcto");
            ve = true;

        } else {
            System.out.println("incorecto");
            ve = false;
        }

        return ve;

    }

    public  boolean validar_Cedula(String dato) {
        boolean ve = false;
        if (validar_Numeros(dato) == true) {
            if ((Integer.parseInt(dato) > 999999999) || (Integer.parseInt(dato) <= 0)) {
                System.out.println("nnnnnnnnnnnnien");
                ve = true;
                return ve;
            }

            System.out.println("dato b");
            ve = false;

        } else {
            System.out.println("si se pudo burro");
        }
        return ve;

    }
   
    
}
