package Lesson1.Homework.InMemoryModel;

import Lesson1.Homework.ModelElements.Camera;
import Lesson1.Homework.ModelElements.Flash;
import Lesson1.Homework.ModelElements.PoligonalModel;
import Lesson1.Homework.ModelElements.Scene;

public class ModelStore implements IModelChanged {

    public PoligonalModel Model;

    public Scene Scenes;

    public Flash Flashes;

    public Camera Cameras;

    private IModelChangedObserver changedObserver;



    public Scene GetScene(int i){
        return null;
    }

    public void NotifyChanged(IModelChanged sender){

    }
}
