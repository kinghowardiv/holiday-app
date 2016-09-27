package com.example.peter.unofficialholiday.Months;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class November extends Month {

    @Override
    public void SetMonthInfo(){
        HashMap<Integer, String> novemberMap = popNovMap();
        setDayNumberAndPhraseMap(novemberMap);
        setMonthName("November");
    }

    @Override
    public Month GetMonthInfo() {return this;}

    private HashMap<Integer, String> popNovMap(){
        HashMap novMap = new HashMap();

        novMap.put(1, "National Authors Day\n" +
                "National Family Literacy Day\n" +
                "National  Cook For Your Pets Day\n" +
                "National Vinegar Day\n" +
                "National Deep Fried Clams Day\n" +
                "Daylight Saving Time Ends");
        novMap.put(2, "National Deviled Egg Day");
        novMap.put(3, "National Housewifes Day\n" +
                "National Sandwich Day");
        novMap.put(4, "National Chicken Lady Day\n" +
                "National Candy Day\n" +
                "Traffic Directors Day");
        novMap.put(5, "National Doughnut Day\n" +
                "National Men Make Dinner Day ");
        novMap.put(6, "National Nachos Day\n" +
                "Saxophone Day");
        novMap.put(7, "National Bittersweet Chocolate with Almonds Day\n" +
                "National Canine Lymphoma Awareness Day");
        novMap.put(8, "National Cappuccino Day\n" +
                "National Harvey Wallbanger Day\n" +
                "National Parents as Teachers Day ");
        novMap.put(9, "National Scrapple Day");
        novMap.put(10, "Marine Corps Birthday\n" +
                "National Forget-Me-Not Day\n" +
                "National Vanilla Cupcake Day");
        novMap.put(11, "National Sundae Day\n" +
                "Veterans Day");
        novMap.put(12, "National Pizza with the Works Except Anchovies Day\n" +
                "National Chicken Soup for the Soul Day");
        novMap.put(13, "National Indian Pudding Day");
        novMap.put(14, "National Pickle Day\n" +
                "National Spicy Guacamole Day");
        novMap.put(15, "National Bundt (Pan) Day\n" +
                "National Philanthropy Day\n" +
                "National Clean Out Your Refrigerator Day\n" +
                "National Spicy Hermit Cookie Day\n" +
                "National Raisin Bran Cereal Day\n" +
                "America Recycles Day");
        novMap.put(16, "National Fast Food Day\n" +
                "National Button Day");
        novMap.put(17, "National Baklava Day\n" +
                "National Take A Hike Day");
        novMap.put(18, "National Vichyssoise Day\n" +
                "Mickey Mouse Birthday\n" +
                "National Educational Support Professionals Day ");
        novMap.put(19, "National Carbonated Beverage With Caffeine Day\n" +
                "National Play Monopoly Day\n" +
                "Great American Smokeout ");
        novMap.put(20, "National Peanut Butter Fudge Day\n" +
                "National Absurdity Day");
        novMap.put(21, "National Stuffing Day\n" +
                "National Adoption Day ");
        novMap.put(22, "National Cranberry Relish Day");
        novMap.put(23, "National Cashew Day\n" +
                "National Eat a Cranberry Day\n" +
                "National Espresso Day");
        novMap.put(24, "National Sardines Day");
        novMap.put(25, "National Parfait Day\n" +
                "Blase Day\n" +
                "Shopping Reminder Day\n" +
                "International Day For the Elimination of Violence Against Women Day\n" +
                "Tie One On Day ");
        novMap.put(26, "National Cake Day\n" +
                "National Day of Mourning\n" +
                "Thanksgiving Day ");
        novMap.put(27, "National Bavarian Cream Pie Day\n" +
                "National Day of Listening\n" +
                "National Native American Heritage Day\n" +
                "Turkey-free Thanksgiving ?\n" +
                "Black Friday\n" +
                "Buy Nothing Day\n" +
                "Flossing Day\n" +
                "Maize Day\n" +
                "You're Welcomegiving Day");
        novMap.put(28, "National French Toast Day\n" +
                "Small Business Saturday\n" +
                "International Aura Awareness Day");
        novMap.put(29, "Electronic Greetings Day\n" +
                "International Day of Solidarity With The Palestinian People");
        novMap.put(30, "National Mousse Day\n" +
                "National Meth Awareness Day\n" +
                "Computer Security Day\n" +
                "Stay Home Because You're Well Day\n" +
                "Cyber Monday ");

        return novMap;
    }
}
