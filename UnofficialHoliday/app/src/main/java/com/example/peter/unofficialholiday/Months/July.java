package com.example.peter.unofficialholiday.Months;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class July extends Month {

    @Override
    public void SetMonthInfo(){
        HashMap<Integer, String> julyMap = popJulyMap();
        setDayNumberAndPhraseMap(julyMap);
        setMonthName("July");
    }

    @Override
    public Month GetMonthInfo() {return this;}

    private HashMap<Integer, String> popJulyMap(){
        HashMap<Integer, String> julyMap = new HashMap<>();

        julyMap.put(1, "National Postal Worker Day\n" +
                "National U.S. Postage Stamp Day\n" +
                "National Creative Ice Cream Flavors Day\n" +
                "National Gingersnap Day");
        julyMap.put(2, "National Anisette Day");
        julyMap.put(3, "National Fried Clam Day\n" +
                "National Eat Your Beans Day\n" +
                "National Chocolate Wafers Day");
        julyMap.put(4, "Independence Day (USA)\n" +
                "National Country Music Day\n" +
                "National Hillbilly Day\n" +
                "National Barbecued Spareribs Day\n" +
                "National Caesar Salad Day");
        julyMap.put(5, "National Apple Turnover Day\n" +
                "Hop-a-Park Day\n" +
                "National Graham Cracker Day");
        julyMap.put(6, "National Fried Chicken Day");
        julyMap.put(7, "National Father Daughter  Take a Walk Day\n" +
                "National Strawberry Sundae Day\n" +
                "National Macaroni Day");
        julyMap.put(8, "National Chocolate with Almonds Day");
        julyMap.put(9, "National Sugar Cookie Day");
        julyMap.put(10, "National Clerihew Day\n" +
                "National Pina Colada Day\n" +
                "Collector Car Appreciation Day");
        julyMap.put(11, "National Cheer Up The Lonely Day\n" +
                "National Rainier Cherry Day\n" +
                "National Blueberry Muffin Day\n" +
                "All American Pet Photo Day\n" +
                "National Mojito Day");
        julyMap.put(12, "National Simplicity Day\n" +
                "National Different Colored Eyes Day\n" +
                "National Pecan Pie Day\n" +
                "Paper Bag Day\n" +
                "Eat Your Jello Day");
        julyMap.put(13, "National French Fry Day\n" +
                "National Beans N Franks Day");
        julyMap.put(14, "National Grand Marnier Day\n" +
                "National Tape Measure Day\n" +
                "National Nude Day");
        julyMap.put(15, "National Give Something Away Day*\n" +
                "National I Love Horses Day\n" +
                "National Pet Fire Safety Day\n" +
                "National Tapioca Pudding Day");
        julyMap.put(16, "National Corn Fritters Day\n" +
                "National Personal Chef's Day");
        julyMap.put(17, "National Peach Ice Cream Day\n" +
                "Wrong Way Corrigan Day\n" +
                "National Yellow Pig Day");
        julyMap.put(18, "National Caviar Day\n" +
                "*National Strawberry Rhubarb Wine Day\n" +
                "National Woodie Wagon Day\n" +
                "Toss Away the Could Haves and Should Haves Day ");
        julyMap.put(19, "National Daiquiri Day\n" +
                "National Ice Cream Day ");
        julyMap.put(20, "National Lollipop Day\n" +
                "National Get Out of the Dog House Day");
        julyMap.put(21, "National Junk Food Day\n" +
                "National Creme Brulee Day");
        julyMap.put(22, "National Penuche Fudge Day\n" +
                "National Hammock Day\n" +
                "National Rat Catcher?s Day");
        julyMap.put(23, "National Refreshment Day\n" +
                "National Hot Dog Day\n" +
                "National Vanilla Ice Cream Day");
        julyMap.put(24, "National Thermal Engineer Day*\n" +
                "National Tequila Day\n" +
                "National Drive-Thru Day\n" +
                "National Cousins Day");
        julyMap.put(25, "National Merry-Go-Round Day\n" +
                "National Hot Fudge Sundae Day\n" +
                "National Culinarian?s Day\n" +
                "National Threading the Needle Day\n" +
                "National Dance Day");
        julyMap.put(26, "National Aunt and Uncle?s Day\n" +
                "National Bagelfest Day\n" +
                "National Coffee Milkshake Day\n" +
                "National Parent?s Day ");
        julyMap.put(27, "National Scotch Day");
        julyMap.put(28, "National Milk Chocolate Day\n" +
                "Buffalo Soldiers Day");
        julyMap.put(29, "National Lasagna Day\n" +
                "National Chicken Wing Day");
        julyMap.put(30, "National Cheesecake Day\n" +
                "National Father-in-Law Day\n" +
                "National Chili Dog Day");
        julyMap.put(31, "National Raspberry Cake Day \n" +
                "National Mutt Day\n" +
                "National Talk in an Elevator Day\n" +
                "National System Administrators Appreciation Day ");

        return julyMap;
    }

}
