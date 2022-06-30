package com.com.section6;

public class Cluboid extends Rectangle{

    private double height;

    public Cluboid(double width, double length, double height){
        super(width, length);
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return (getArea() * height);
    }







}
