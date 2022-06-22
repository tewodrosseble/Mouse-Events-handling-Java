package MouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvent extends JFrame {
    private JPanel panel1;
    private JLabel status1;

    MouseEvent(){
        super("Mouse Event");
        panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        add(panel1,BorderLayout.CENTER);

        status1 = new JLabel("Default");
        add(status1,BorderLayout.SOUTH);

        Handlerclass hdlr = new Handlerclass();
        panel1.addMouseListener(hdlr);
        panel1.addMouseMotionListener(hdlr);
        this.setVisible(true);
        this.setSize(400,400);
            }
    public class Handlerclass implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(java.awt.event.MouseEvent event) {
            status1.setText(String.format("Clicked at %d, %d", event.getX(),event.getY()));
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            status1.setText("Mouse Pressed");
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            status1.setText("Mouse Released");
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            status1.setText("Mouse is in the panel area");
            panel1.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
        status1.setText("Mouse Excited");
        panel1.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseDragged(java.awt.event.MouseEvent e) {
            status1.setText("You are dragging the mouse");
        }

        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            status1.setText("The mouse is being moved, not dragged!");
        }
    }


}
