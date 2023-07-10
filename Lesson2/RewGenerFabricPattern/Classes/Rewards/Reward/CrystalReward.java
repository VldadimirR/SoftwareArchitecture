package Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward;

import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class CrystalReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Crystal");
    }
}
