package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.WoodReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class WoodGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new WoodReward();
    }
}
