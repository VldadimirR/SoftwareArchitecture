package Lesson1.Homework.ModelElements;

import Lesson1.Homework.Stuff.Angle3D;
import Lesson1.Homework.Stuff.Point3D;

import java.awt.*;
import java.awt.geom.Point2D;

public class Flash {

    public Point3D location;

    public Angle3D angle;

    public Color color;

    public float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angle3D angle){

    }

    public void Move(Point3D point){

    }
}
