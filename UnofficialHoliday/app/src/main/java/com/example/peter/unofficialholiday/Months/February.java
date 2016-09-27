package com.example.peter.unofficialholiday.Months;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class February extends Month {

    @Override
    public void SetMonthInfo(){
        HashMap<Integer, String> febMap = popFebMap();
        setDayNumberAndPhraseMap(febMap);
        setMonthName("February");
    }

    @Override
    public Month GetMonthInfo() {return this;}

    private HashMap<Integer, String> popFebMap(){
        HashMap<Integer, String> febMap = new HashMap<>();
        febMap.put(1, "National Freedom Day\n" +
                "National Baked Alaska Day\n" +
                "National Serpent Day");
        febMap.put(2, "National Groundhog Day\n" +
                "National Heavenly Hash Day");
        febMap.put(3, "National the Day the Music Died Day\n" +
                "National Carrot Cake Day");
        febMap.put(4, "National Thank a Mailman Day\n" +
                "National Homemade Soup Day\n" +
                "National Create a Vacuum day");
        febMap.put(5, "National Weatherpersons Day\n" +
                "*National Shower with  a Friend Day");
        febMap.put(6, "National Lame Duck Day\n" +
                "National Wear Red Day\n" +
                "National Frozen Yogurt Day");
        febMap.put(7, "National Send a Card to a Friend Day\n" +
                "National Fettuccine Alfredo Day");
        febMap.put(8, "National Boy Scouts Day\n" +
                "National Kite Flying Day");
        febMap.put(9, "National Pizza Day\n" +
                "National Toothache Day\n" +
                "National Bagel Day/n" +
                "National Clean Out Your Computer Day");
        febMap.put(10, "National Umbrella Day\n" +
                "National Cream Cheese Brownie Day");
        febMap.put(11, "National Make a Friend Day\n" +
                "National Don't Cry Over Spilled Milk day\n" +
                "National White Shirt Day\n" +
                "National Shut-In Visitation Day\n" +
                "National Peppermint Patty Day");
        febMap.put(12, "National Plum Pudding Day\n" +
                "Abraham Lincolns Birthday");
        febMap.put(13, "National Tortellini Day\n" +
                "National Blame Someone Else Day ");
        febMap.put(14, "National Organ Donor Day\n" +
                "National Ferris Wheel Day\n" +
                "National Cream-Filled Chocolates Day\n" +
                "Valentines Day");
        febMap.put(15, "National Gumdrop Day\n" +
                "Singles Awareness Day");
        febMap.put(16, "National Almond Day\n" +
                "National Do A Grouch a Favor Day\n" +
                "Presidents Day");
        febMap.put(17, "National Random Acts of Kindness Day\n" +
                "National Cabbage Day");
        febMap.put(18, "National Battery Day\n" +
                "National Drink Wine Day\n" +
                "National Crab Stuffed Flounder Day");
        febMap.put(19, "National Chocolate Mint Day");
        febMap.put(20, "National Cherry Pie Day\n" +
                "National Love Your Pet Day");
        febMap.put(21, "National Sticky Bun Day");
        febMap.put(22, "National Margarita Day\n" +
                "National Cook a Sweet Potato Day");
        febMap.put(23, "National Margarita Day\n" +
                "National Cook a Sweet Potato Day");
        febMap.put(24, "National Tortilla Chip Day\n" +
                "Spay Day USA ");
        febMap.put(25, "National Chocolate Covered Nut Day\n" +
                "National Clam Chowder Day");
        febMap.put(26, "National Pistachio Day\n" +
                "National Tell a Fairy Tale Day\n" +
                "National Chili Day ");
        febMap.put(27, "National Kahlua Day\n" +
                "National Strawberry Day\n" +
                "National Polar Bear Day");
        febMap.put(28, "National Public Sleeping Day\n" +
                "National Chocolate Souffle Day\n" +
                "National Floral Design Day\n" +
                "National Tooth Fairy Day\n" +
                "Rare Disease Day USA ");

        return febMap;
    }
}
