/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1.sophiaherrera;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Actividad1SophiaHerrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cantidadTexto = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
        int cantidadEmpleados = Integer.parseInt(cantidadTexto);
        
        int sumaSalarios = 0;
        
        for (int i = 1; i <= cantidadEmpleados; i++) {
            String salarioTexto = JOptionPane.showInputDialog("Ingrese el salario del empleado #" + i + ":");
            int salarioIndividual = Integer.parseInt(salarioTexto);
            
            sumaSalarios = sumaSalarios + salarioIndividual;
        }
        
        int montoSEM = (sumaSalarios * 925) / 10000;
        int montoIVM = (sumaSalarios * 508) / 10000;
        int totalCCSS = montoSEM + montoIVM;
        
        String resultado = "La empresa deberá abonar a la CCSS el monto de ₡" + totalCCSS + " por concepto de SEM y IVM";
        
        JOptionPane.showMessageDialog(null, resultado);
    }
 }
    
