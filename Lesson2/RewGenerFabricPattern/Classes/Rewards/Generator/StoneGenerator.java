package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.StoneReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class StoneGenerator  extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new StoneReward();
    }
}
