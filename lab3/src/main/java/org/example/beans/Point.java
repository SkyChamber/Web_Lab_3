package org.example.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.time.ZoneId;

@ManagedBean(name = "point")
@ApplicationScoped

public class Point implements Serializable {
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double x=-5;
    private double y=-3;
    private double r=1;

    public Point(){

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }


}
