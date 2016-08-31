/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitysim;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.math.*;
import java.text.*;
import java.util.ArrayList;

/**
 *
 * @author Austin
 */
public class GravFrame extends javax.swing.JFrame {

    // array containing celestial objects
    ArrayList<Body> bodies;
    // variable gravitational constant, haha
    private double G = 6.675E-6;
    // scale of pixel to meters ratio
    private double scale = 1E6;
    // offset from the center of the universe
    private double panX = 0;
    private double panY = 0;

    /**
     * Creates new form GravFrame
     */
    public GravFrame() {
        initComponents();
        this.setFocusTraversalKeysEnabled(true);
        bodies = new ArrayList();
        numberLabel.setText("No. of Obj = " + bodies.size());
        scaleLabel.setText("Scale: 1 px = " + scale);

        // activate timer event
        Timer timer = new Timer(10, new TimerListener());
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paintPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        editPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        massField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vxField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vyField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rField = new javax.swing.JTextField();
        pauseButton = new javax.swing.JRadioButton();
        scaleLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        paintPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                paintPanelMouseWheelMoved(evt);
            }
        });
        paintPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paintPanelMouseClicked(evt);
            }
        });
        paintPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paintPanelMouseDragged(evt);
            }
        });
        paintPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paintPanelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Mass(kg)");

        massField.setText("6E24");

        jLabel2.setText("Velocity X(m/s)");

        vxField.setText("0");

        jLabel3.setText("Velocity Y(m/s)");

        vyField.setText("0");

        jLabel4.setText("G const");

        gField.setText("6.675E-6");

        jLabel5.setText("Radius(m)");

        rField.setText("6E6");

        pauseButton.setText("Pause");

        scaleLabel.setText("Scale: 1 px =");

        numberLabel.setText("No. of Obj =");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(massField)
                    .addComponent(vxField)
                    .addComponent(vyField)
                    .addComponent(gField)
                    .addComponent(rField)
                    .addComponent(scaleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(pauseButton)
                            .addComponent(numberLabel))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scaleLabel)
                .addContainerGap())
        );

        vxField.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paintPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanelMouseClicked
        // set focus for key commands
        paintPanel.grabFocus();

        // save the click location to avoid repeat function calls
        int mx = evt.getX();
        int my = evt.getY();

        // get data from text fields
        double iM = Double.parseDouble(massField.getText());
        double iVX = Double.parseDouble(vxField.getText());
        double iVY = Double.parseDouble(vyField.getText());
        double iR = Double.parseDouble(rField.getText());
        double iDens = 5556;

        // create a new body object to place in the frame
        Body newBod = new Body(mx * scale + panX, my * scale + panY, iDens, 6, iR, iM, iVX, iVY);
        
        // calculate and set correct density
        iDens = findDens(newBod);
        newBod.setDensity(iDens);
        
        // calculate correct size
        int newSize = findSize(newBod);
        newBod.setSize(newSize);

        // add the new object to the array
        bodies.add(newBod);
    }//GEN-LAST:event_paintPanelMouseClicked

    private void paintPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paintPanelKeyPressed

        //fuck
        //System.out.println("hell");
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE) {
            System.out.println("no space for you!");
        } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_LEFT || evt.getKeyCode() == java.awt.event.KeyEvent.VK_A) {
            panX = panX - scale * 4;
        } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_RIGHT || evt.getKeyCode() == java.awt.event.KeyEvent.VK_D) {
            panX = panX + scale * 4;
        } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN || evt.getKeyCode() == java.awt.event.KeyEvent.VK_S) {
            panY = panY + scale * 4;
        } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP || evt.getKeyCode() == java.awt.event.KeyEvent.VK_W) {
            panY = panY - scale * 4;
        }
    }//GEN-LAST:event_paintPanelKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void paintPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_paintPanelMouseWheelMoved
        // TODO add your handling code here:
        // scientific notation formatter
        NumberFormat formatter = new DecimalFormat();

        formatter = new DecimalFormat("0.#E0");
        
        // scale up or down by 2x using the mousewheel
        if (evt.getWheelRotation() == 1) {
            scale = scale * 2;
            scaleLabel.setText("Scale: 1 px = " + formatter.format(scale));
        } else if (evt.getWheelRotation() == -1) {
            scale = scale / 2;
            scaleLabel.setText("Scale: 1 px = " + formatter.format(scale));
        }
    }//GEN-LAST:event_paintPanelMouseWheelMoved

    private void paintPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanelMouseDragged
        // TODO add your handling code here:
        // duplicate of mouse click code, should refactor to a new function
        paintPanel.grabFocus();

        int mx = evt.getX();
        int my = evt.getY();

        double iM = Double.parseDouble(massField.getText());
        double iVX = Double.parseDouble(vxField.getText());
        double iVY = Double.parseDouble(vyField.getText());
        double iR = Double.parseDouble(rField.getText());
        double iDens = 5556;

        Body newBod = new Body(mx * scale + panX, my * scale + panY, iDens, 6, iR, iM, iVX, iVY);
        iDens = findDens(newBod);
        newBod.setDensity(iDens);
        int newSize = findSize(newBod);
        newBod.setSize(newSize);

        bodies.add(newBod);
    }//GEN-LAST:event_paintPanelMouseDragged

    // calculate the appropriate planet size
    public int findSize(Body bod) {
        int size = (int) ((bod.getR() * 2) * 1E-6);
        return size;
    }

    // calculate the radius of the planet
    public double findR(Body bod) {
        double v = bod.getMass() / bod.getDensity();
        double radius = (v * 3) / (4 * Math.PI);
        radius = Math.cbrt(radius);
        return radius;
    }

    // calculate the density of the planet
    public double findDens(Body bod) {  
        double d = bod.getMass() / findVol(bod);
        return d;
    }

    // calculate the volume of the planet
    public double findVol(Body bod) {
        double radius = bod.getR();
        double vol = 1.3333333 * Math.PI * (radius * radius * radius);
        return vol;
    }
    
    // updates the number of bodies displayed by the label
    public void updateNumberLabel(){
        numberLabel.setText("No. of Obj = " + bodies.size());
    }

    // Timer listener class used to update the frame
    public class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("damn");

            //update the position of all our bodies
            if (pauseButton.isSelected()) {
                //wait
            } else {
                //get gravity const
                double grav = Double.parseDouble(gField.getText());

                //calculate change in position, velocity, and accel
                for (int i = 0; i < bodies.size(); i++) {
                    Body bod = bodies.get(i);
                    for (int j = 0; j < bodies.size(); j++) {
                        Body bod2 = bodies.get(j);
                        if (bod.equals(bod2)) {
                            //do nothing
                        } else {
                            double xd = bod2.getX() - bod.getX();
                            double yd = bod2.getY() - bod.getY();
                            double d = Math.sqrt((xd * xd) + (yd * yd));

                            if (d < bod.getR()) {
                                //COLLISION!
                                //update velocity and mass to conserve momentum
                                double m1 = bod.getMass();
                                double m2 = bod2.getMass();
                                double tm = m1 + m2;
                                double d1 = bod.getDensity();
                                double d2 = bod2.getDensity();
                                double pX = bod.getMass() * bod.getVX() + bod2.getMass() * bod2.getVX();
                                double pY = bod.getMass() * bod.getVY() + bod2.getMass() * bod2.getVY();
                                bod.setMass(bod.getMass() + bod2.getMass());
                                bod.setVX(pX / bod.getMass());
                                bod.setVY(pY / bod.getMass());

                                //update density to avg of both objects
                                d1 = (m1 / tm) * d1;
                                d2 = (m2 / tm) * d2;
                                double newDens = d1 + d2;
                                bod.setDensity(newDens);

                                //update size
                                double newR = findR(bod);
                                bod.setR(newR);
                                int newSize = findSize(bod);
                                bod.setSize(newSize);

                                bodies.remove(bod2);
                            } else {
                                // calculate acceleration on both bodies
                                // G * M1 * M2
                                double force = grav * bod.getMass() * bod2.getMass();
                                // over distance squared
                                force = force / (d * d);
                                // a = F/m from F = ma
                                double acc = force / bod.getMass();
                                double accx = (xd / d) * acc;
                                double accy = (yd / d) * acc;

                                // change object velocities
                                bod.setVX(bod.getVX() + accx);
                                bod.setVY(bod.getVY() + accy);
                            }

                        }
                    }
                }

                for (Body bod : bodies) {
                    bod.setX(bod.getX() + bod.getVX());
                    bod.setY(bod.getY() + bod.getVY());
                }

            }
            
            //paint the bodies on the frame
            BufferedImage steve = new BufferedImage(paintPanel.getWidth(), paintPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D gg = steve.createGraphics();
            Graphics g = paintPanel.getGraphics();
            //paintPanel.repaint();
            //Graphics2D gg = (Graphics2D) g;
            gg.setColor(Color.BLACK);
            gg.fillRect(0, 0, paintPanel.getWidth(), paintPanel.getHeight());
            for (Body bod : bodies) {

                gg.setColor(Color.WHITE);
                int showX = (int) ((bod.getX() - bod.getR() - panX) / scale);
                int showY = (int) ((bod.getY() - bod.getR() - panY) / scale);
                int size = (int) ((bod.getR() * 2) / scale) + 1;
                gg.drawOval(showX, showY, size, size);
                gg.fillOval(showX, showY, size, size);
            }
            g.drawImage(steve, 0, 0, null);
            
            updateNumberLabel();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GravFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GravFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GravFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GravFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GravFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField gField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField massField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JPanel paintPanel;
    private javax.swing.JRadioButton pauseButton;
    private javax.swing.JTextField rField;
    private javax.swing.JLabel scaleLabel;
    private javax.swing.JTextField vxField;
    private javax.swing.JTextField vyField;
    // End of variables declaration//GEN-END:variables
}