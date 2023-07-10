package Lesson1.Homework.ModelElements;

import java.util.List;

public class Scene {

    public int id;

    public List<PoligonalModel> models;

    public List<Flash> flashes;

    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0){
            this.models = models;
        } else {
            throw new Exception("");
        }
        this.flashes = flashes;
        if (cameras.size() > 0){
            this.cameras = cameras;
        } else {
            throw new Exception("");
        }
    }

    public <T> T method1(T type) {
        return type;
    }

    public <T, E> T method2(T type, E type2) {
        return type;
    }
}
