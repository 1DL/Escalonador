/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Luiz
 */
public class Escalonador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciamento do objeto JForm "Tela", e exibição do mesmo
        
        Tela tela = new Tela();
        tela.setVisible(true);
        
        //código pra fazer a janela sempre aparecer no centro da tela, indifere a resolução
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        tela.setLocation(dim.width/2-tela.getSize().width/2, dim.height/2-tela.getSize().height/2);
    }
    
}
