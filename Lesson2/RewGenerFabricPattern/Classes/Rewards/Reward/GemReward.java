package Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward;

import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class GemReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gem");
    }
}
