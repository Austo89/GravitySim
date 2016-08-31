/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitysim;
import java.math.*;
/**
 *
 * @author Austin
 */
public class GravitySim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tim = 6.674 * Math.pow(10, -190);
        System.out.println(tim);
        GravFrame gframe = new GravFrame();
        gframe.setVisible(true);
    }
    
}
