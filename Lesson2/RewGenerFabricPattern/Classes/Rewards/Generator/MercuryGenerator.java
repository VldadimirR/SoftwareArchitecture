package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.MercuryReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class MercuryGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new MercuryReward();
    }
}
