package com.practica.projectpatrones.fisicas;


import java.util.Objects;

public class Vector2D{

    private double posX;
    private double posy;
    private double magnitud;
    private double direccion;
    

    public Vector2D() {
    }

    public Vector2D(double posX, double posy, double magnitud, double direccion) {
        this.posX = posX;
        this.posy = posy;
        this.magnitud = magnitud;
        this.direccion = direccion;
    }

    public double getPosX() {
        return this.posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosy() {
        return this.posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public double getMagnitud() {
        return this.magnitud;
    }

    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }

    public double getDireccion() {
        return this.direccion;
    }

    public void setDireccion(double direccion) {
        this.direccion = direccion;
    }

    public Vector2D posX(double posX) {
        setPosX(posX);
        return this;
    }

    public Vector2D posy(double posy) {
        setPosy(posy);
        return this;
    }

    public Vector2D magnitud(double magnitud) {
        setMagnitud(magnitud);
        return this;
    }

    public Vector2D direccion(double direccion) {
        setDireccion(direccion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vector2D)) {
            return false;
        }
        Vector2D vector2D = (Vector2D) o;
        return posX == vector2D.posX && posy == vector2D.posy && magnitud == vector2D.magnitud && direccion == vector2D.direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posX, posy, magnitud, direccion);
    }
    
}
