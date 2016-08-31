/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitysim;

/**
 *
 * @author Austin
 */
public class Body {
    private double x,y,dens,r,mass,vx,vy;
    private int size;
    
    public Body(double x, double y, double dens, int size, double r, double mass, double vx,double vy){
        this.x = x;
        this.y = y;
        this.dens = dens;
        this.size = size;
        this.r = r;
        this.mass = mass;
        this.vx = vx;
        this.vy = vy;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getDensity(){
        return dens;
    }
    
    public int getSize(){
        return size;
    }
    
    public double getR(){
        return r;
    }
    
    public double getMass(){
        return mass;
    }
    
    public double getVX(){
        return vx;
    }
    
    public double getVY(){
        return vy;
    }
    
    public void setX(double in_x){
        x = in_x;
    }
    
    public void setY(double in_y){
        y = in_y;
    }
    
    public void setVX(double in_vx){
        vx = in_vx;
    }
    
    public void setVY(double in_vy){
        vy = in_vy;
    }
    
    public void setSize(int in_size){
        size = in_size;
    }
    
    public void setMass(double in_mass){
        mass = in_mass;
    }
    
    public void setDensity(double in_dens){
        dens = in_dens;
    }
    
    public void setR(double in_r){
        r = in_r;
    }
}
