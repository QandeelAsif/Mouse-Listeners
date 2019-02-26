/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_mouselistner;
import javax. swing.*;
public class GUI_mouseListner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListnerCLass obj = new ListnerCLass();
        obj.setSize(400,200);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }
    
}
