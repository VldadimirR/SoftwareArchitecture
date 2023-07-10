package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.GemReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class GemGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
