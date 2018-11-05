/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezotero
 */
class Numero {

    void positivo() {
    int num = Integer.parseInt(JOptionPane.showInputDialog("teclea un numero : "));
    if (num>0) JOptionPane.showMessageDialog(null, "É positivo");
    }
    
}
