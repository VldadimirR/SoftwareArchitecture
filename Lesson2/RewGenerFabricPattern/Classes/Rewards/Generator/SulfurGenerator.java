package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.SulfurReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class SulfurGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new SulfurReward();
    }
}
