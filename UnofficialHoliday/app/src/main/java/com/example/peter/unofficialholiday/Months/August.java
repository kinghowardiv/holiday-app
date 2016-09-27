package com.example.peter.unofficialholiday.Months;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class August extends Month {

    @Override
    public void SetMonthInfo(){
        HashMap<Integer, String> augustMap = popAugMap();
        setDayNumberAndPhraseMap(augustMap);
        setMonthName("August");
    }

    @Override
    public Month GetMonthInfo() {return this;}

    private HashMap<Integer, String> popAugMap(){
        HashMap<Integer, String> augMap = new HashMap<>();

        augMap.put(1, "National Raspberry Cream Pie Day\n" +
                "National Girlfriends Day\n" +
                "National Minority Donor Awareness Day\n" +
                "Respect for Parents Day\n" +
                "National Mustard Day\n" +
                "Mead Day ");
        augMap.put(2, "National Coloring Book Day*\n" +
                "National Ice Cream Sandwich Day\n" +
                "National Kids Day\n" +
                "American Family Day\n" +
                "National Friendship Day ");
        augMap.put(3, "National Watermelon Day\n" +
                "National Sisters Day\n" +
                "National Grab Some Nuts Day");
        augMap.put(4, "National Chocolate Chip Day\n" +
                "National Coast Guard Day\n" +
                "National Night Out Day ");
        augMap.put(5, "National Underwear Day\n" +
                "National Oyster Day");
        augMap.put(6, "National Root Beer Float Day\n" +
                "National Fresh Breath Day\n" +
                "National Wiggle Your Toes Day");
        augMap.put(7, "Purple Heart Day\n" +
                "National Lighthouse Day\n" +
                "National Raspberries N Cream Day");
        augMap.put(8, "National Happiness Happens Day\n" +
                "National Frozen Custard Day\n" +
                "National Sneak Some Zucchini Into Your Neighbors Porch Day\n" +
                "National Dollar Day\n" +
                "National Bowling Day\n" +
                "National Garage Sale Day ");
        augMap.put(9, "National Rice Pudding Day\n" +
                "National Veep Day\n" +
                "National Book Lovers Day");
        augMap.put(10, "National Lazy Day\n" +
                "National Smore's Day");
        augMap.put(11, "National Presidential Joke Day\n" +
                "National Raspberry Bombe Day");
        augMap.put(12, "National Julienne Fries Day\n" +
                "National Vinyl Record Day\n" +
                "National Middle Child Day");
        augMap.put(13, "National Filet Mignon Day");
        augMap.put(14, "National V-J Day (Victory of Japan Day)\n" +
                "National Creamsicle Day");
        augMap.put(15,"National Relaxation Day\n" +
                "National Lemon Meringue Pie Day");
        augMap.put(16, "National Tell a Joke Day\n" +
                "National Roller Coaster Day\n" +
                "National Airborne Day\n" +
                "National Rum Day");
        augMap.put(17, "National Thrift Shop Day");
        augMap.put(18, "National Mail Order Catalog Day\n" +
                "National Ice Cream Pie Day");
        augMap.put(19, "National Aviation Day\n" +
                "National Soft Ice Cream Day");
        augMap.put(20, "National Radio Day\n" +
                "National Chocolate Pecan Pie Day\n" +
                "National Lemonade Day");
        augMap.put(21, "National Spumoni Day\n" +
                "National Senior Citizen?s Day\n" +
                "*National Brazilian Blowout Day");
        augMap.put(22, "National Tooth Fairy Day\n" +
                "National Pecan Torte Day");
        augMap.put(23, "National Ride With The Wind Day\n" +
                "National Sponge Cake Day\n" +
                "National Hug Your Boss Day");
        augMap.put(24, "National Peach Pie Day\n" +
                "National Waffle Day");
        augMap.put(25, "National Whiskey Sour Day\n" +
                "National Kiss and Make Up Day\n" +
                "National Secondhand Wardrobe Day\n" +
                "National Banana Split Day");
        augMap.put(26, "National Dog Day\n" +
                "National Women?s Equality Day\n" +
                "National Cherry Popsicle Day");
        augMap.put(27, "National Pots De Creme Day\n" +
                "National Just Because Day");
        augMap.put(28, "National Cherry Turnovers Day\n" +
                "National College Colors Day ");
        augMap.put(29, "National Chop Suey Day");
        augMap.put(30, "National Toasted Marshmallow Day");
        augMap.put(31, "National Trail Mix Day");

        return augMap;
    }
}
