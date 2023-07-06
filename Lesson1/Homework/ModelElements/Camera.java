package Lesson1.Homework.ModelElements;

import Lesson1.Homework.Stuff.Angle3D;
import Lesson1.Homework.Stuff.Point3D;

import java.awt.geom.Point2D;

public class Camera {

    public Point3D location;

    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(Angle3D angle){

    }

    public void Move(Point2D point2D){

    }
}
