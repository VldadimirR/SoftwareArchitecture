package Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator;

import Lesson2.RewGenerFabricPattern.Classes.ItemFabric;
import Lesson2.RewGenerFabricPattern.Classes.Rewards.Reward.CrystalReward;
import Lesson2.RewGenerFabricPattern.Classes.iGameItem;

public class CrystalGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new CrystalReward();
    }
}
