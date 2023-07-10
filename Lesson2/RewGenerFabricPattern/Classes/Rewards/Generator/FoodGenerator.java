package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.FoodReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class FoodGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new FoodReward();
    }
}
