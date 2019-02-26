/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_mouselistner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.*;


// HEre we need to demonstarte all the actions of static mouse or moving mouse so we implemented this MouseinputListener
// but if we have to use only one event and need to only over ride that , then we can use adapter class named MouseAdapter there (*)
public class ListnerCLass extends JFrame implements MouseInputListener{
    private JLabel mouseStatus;
    private JPanel mousepanel;
    
    
    public ListnerCLass()
    {
        setTitle("Mouse Events");
        //not setting the layout
        
        //setting up the mouse sensitvity area, the area where mouse will work
        mousepanel= new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel,BorderLayout.CENTER);  //setting orientation
        
        mouseStatus= new JLabel("default"); //the default mouseStatus
        add(mouseStatus,BorderLayout.SOUTH);
        
        
        //listners to sense the changes
        addMouseListener(this);
        addMouseMotionListener(this);
        
        //(*): here , change it to addMouseListener( new whatever class) , than extend it with MouseADapter and BAmmm
    }

    
        //interfaces implemntations
    @Override
    public void mouseClicked(MouseEvent e) {
        mouseStatus.setText(String.format("clicked at (%d,%d)", e.getX(),e.getY()));
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseStatus.setText("you pressed the mouse");
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseStatus.setText("you released the mouse, thank GAWD");
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseStatus.setText("you have entered the mouse sensitive region. Brace yourself");
        mousepanel.setBackground(Color.GRAY);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseStatus.setText("you have exited the mouse sensitive region, bbye");
        mousepanel.setBackground(Color.WHITE);
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseStatus.setText("you are dragging the mouse, STOP FELLA");
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseStatus.setText("you are mvoing me , can you stop ?");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
