package Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward;

import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class WoodReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Wood");
    }
}
