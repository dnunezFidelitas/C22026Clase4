/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22026clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22026clase4 {
    
    public String sistema;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo brazil = new Equipo();
        Equipo alemaniai =new Equipo();
        
        brazil.dt="Ancelotti";
        brazil.nombre="Brazil";
        alemaniai.dt="Nose";
        alemaniai.nombre="Alemania";    
        
        crearJapon();
        
        
        
        
        
//        miPrimermetodo();
        
        ///.... lineas
//        miPrimermetodo();
        
        ///.... lineas
        ///
//       miPrimermetodo();
    }
    
    public static void crearJapon(){
        Equipo japon = new Equipo();
        japon.dt="Goku";
        japon.nombre="Japon";
        japon.asistente2="Crillin";
        japon.asistente1="Yamcha";
        japon.cantidad=20;
        String resultado= "nombre:" + japon.nombre +"\n" +
                           "dt:" + japon.dt ;
        JOptionPane.showMessageDialog(null, resultado);
                
                
    }
    
    
    
    
    public static void miPrimermetodo(){
        for (int i = 0; i < 4; i++) {
            JOptionPane.showConfirmDialog(null, "Esto es facil "+ i);
        }
    }
    
}
