package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.GoldReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
