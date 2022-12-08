package org.example.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "thisIsMyBean")
@ApplicationScoped

public class ThisIsMyBean {

    @ManagedProperty(value = "#{model}")

    private Model model;

    @ManagedProperty(value = "#{point}")

    private Point point;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    public void doExtend() {
        ExtendedPoint extendedPoint = new ExtendedPoint();
        extendedPoint.setX(point.getX());
        extendedPoint.setY(point.getY());
        extendedPoint.setR(point.getR());
        extendedPoint.selfEval();
        model.add(extendedPoint);
        System.out.println(extendedPoint);
    }

}
