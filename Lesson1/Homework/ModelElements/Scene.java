package Lesson1.Homework.ModelElements;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Scene {

    public int id;

    public List<PoligonalModel> models;

    public List<Flash> flashes;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;

    }

    public Type method1(Type type) {
        return null;
    }

    public Type method2(Type type, Type type2) {
        return null;
    }
}
