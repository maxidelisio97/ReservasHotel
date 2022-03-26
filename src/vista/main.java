/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.ConsultasSQL;
import controlador.Controlador;

/**
 *
 * @author ferc
 */
public class main {

    public static void main(String[] args) {

        Vista v = new Vista();
        ConsultasSQL bd = new ConsultasSQL();
       
 
        
        
        Controlador controlador = new Controlador(v, bd);

      
          v.setVisible(true);
       

    }
}
