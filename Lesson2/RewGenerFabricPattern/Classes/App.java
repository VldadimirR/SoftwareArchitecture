package Lesson2.RewGenerFabricPattern.Classes;

import Lesson2.RewGenerFabricPattern.Classes.Rewards.Generator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new FoodGenerator());
        fabricList.add(new WoodGenerator());
        fabricList.add(new StoneGenerator());
        fabricList.add(new MercuryGenerator());
        fabricList.add(new SulfurGenerator());
        fabricList.add(new CrystalGenerator());


        for (int i = 0; i < 50; i++) {
            ItemFabric fabric  = fabricList.get(rnd.nextInt(fabricList.size()));
            fabric.openReward();
        }
    }
}
