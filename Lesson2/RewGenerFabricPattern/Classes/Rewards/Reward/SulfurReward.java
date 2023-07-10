package Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward;

import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class SulfurReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Sulfur");
    }
}
