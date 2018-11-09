package edu.vtc.cis2271;

import java.util.Scanner;
import java.lang.*;
/**
 *
 * Cannonball
 * @author Bram Moreinis
 *
 * Model a cannonball that is fired into the air.
 */


 public class Cannonball {

     public Cannonball(double xPos){
     _x = xPos;
     _y = 0;
     _xV = 0;
     _yV = 0;
     }

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public void setX(double _x) {
        this._x = _x;
    }

    public void setY(double _y) {
        this._y = _y;
    }

    public void set_yV(double _yV) {
        this._yV = _yV;
    }

    /**
     * A method shoot whose arguments are the angle 𝛼 and initial velocity v (Compute the x-velocity as
     * v cos 𝛼 and the y-velocity as v sin 𝛼; call getX and getY after every move and display the position.)
     */

    public void shoot (double 𝛼, double v) {
        _xV = v*Math.cos(Math.toRadians(𝛼));
        _yV = v*Math.sin(Math.toRadians(𝛼));
        _y=.00001;
         while (_y >0) {
             move(.1, _xV, _yV);
             _x=getX();
             _y=getY();
             System.out.println("x = [" + _x + "], y = [" + _y + "]");
         }

    }

    /**
     *  First compute the distance
     *  traveled in sec seconds, using the current velocities, then update the x- and y-positions;
     *  then update the y-velocity by taking into account the gravitational acceleration of –9.81 m ̸̸s2;
     *  the x-velocity is unchanged.
     * @param sec
     */
    public void move(double sec, double xV, double yV) {
        double dX = xV * sec;
        double dY = yV * sec + 0.5 * -9.81 * Math.pow(sec, 2);
        setX(_x+dX);
        setY(_y+dY);
        yV = yV * sec + 0.5 * -9.81 * Math.pow(sec, 2);
        set_yV(yV);
    }

    private double _x;
    private double _y;
    private double _xV;
    private double _yV;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cannonball thisBall = new Cannonball(15);
        System.out.println("Starting angle: ");
        double 𝛼 = in.nextInt();
        System.out.println("Starting velocity ");
        double v = in.nextInt();
        thisBall.shoot(𝛼,v);
        in.close();

    }
}

