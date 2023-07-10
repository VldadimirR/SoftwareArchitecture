package Lesson1.Homework.InMemoryModel;

import Lesson1.Homework.ModelElements.Camera;
import Lesson1.Homework.ModelElements.Flash;
import Lesson1.Homework.ModelElements.PoligonalModel;
import Lesson1.Homework.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanged {

    public List<PoligonalModel> model;

    public List<Scene> scenes;

    public List<Flash> flashes;

    public List<Camera> cameras;

    private List<IModelChangedObserver> changedObserver;

    public ModelStore(List<IModelChangedObserver> changedObserver) throws Exception {
        this.changedObserver = changedObserver;
        model = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();

        model.add(new PoligonalModel(null));
        flashes.add(new Flash(null,null,null,0));
        cameras.add(new Camera(null,null));
        scenes.add(new Scene(0,model,flashes,cameras));

    }

    public Scene GetScene(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    public void NotifyChanged(IModelChanged sender){

    }
}
