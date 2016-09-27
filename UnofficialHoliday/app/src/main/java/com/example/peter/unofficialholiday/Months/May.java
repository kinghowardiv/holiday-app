package com.example.peter.unofficialholiday.Months;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class May extends Month {

    @Override
    public void SetMonthInfo(){
        HashMap<Integer, String> mayMap = popMayMap();
        setDayNumberAndPhraseMap(mayMap);
        setMonthName("May");
    }

    @Override
    public Month GetMonthInfo() {return this;}

    private HashMap<Integer, String> popMayMap(){
        HashMap<Integer, String> mayMap = new HashMap<>();

        mayMap.put(1, "National Loyalty Day\n" +
                "National Mother Goose Day\n" +
                "National Chocolate Parfait Day\n" +
                "National Space Day\n" +
                "Law Day\n" +
                "Silver Star Service Banner Day");
        mayMap.put(2, "National Bombshells Day\n" +
                "*National Start Seeing Monarchs Day\n" +
                "National Truffle Day\n" +
                "National Life Insurance Day\n" +
                "National Scrapbook Day\n" +
                "National Homebrew Day ");
        mayMap.put(3, "National Lumpy Rug Day\n" +
                "National Garden Meditation Day\n" +
                "National Specially-Able Pets Day\n" +
                "National Two Different Colored Shoes Day\n" +
                "National Paranormal Day\n" +
                "National Chocolate Custard Day\n" +
                "National Raspberry Pop Over Day\n" +
                "National Infertility Survival Day");
        mayMap.put(4, "National Star Wars Day\n" +
                "National Weather Observers Day\n" +
                "National Renewal Day\n" +
                "National Orange Juice Day\n" +
                "National Candied Orange Peel Day\n" +
                "National Melanoma Monday");
        mayMap.put(5, "National Cartoonists Day\n" +
                "National Totally Chipotle Day\n" +
                "National Hoagie Day\n" +
                "Cinco de Mayo\n" +
                "National Teacher Appreciation Day ");
        mayMap.put(6, "National Nurses Day\n" +
                "National Beverage Day\n" +
                "National Crepe Suzette Day\n" +
                "National School Nurse Day");
        mayMap.put(7, "National Packaging Design Day*\n" +
                "National Paste-Up Day\n" +
                "National Barrier Awareness Day\n" +
                "National Roast Leg of Lamb Day\n" +
                "National Day of Prayer\n" +
                "National Day of Reason ");
        mayMap.put(8, "National Coconut Cream Pie Day\n" +
                "National Have A Coke Day\n" +
                "National Military Spouse Appreciation Day\n" +
                "National Provider Appreciation Day");
        mayMap.put(9, "National Archery Day\n" +
                "National Lost Sock Memorial Day\n" +
                "National Moscato Day\n" +
                "National Butterscotch Brownie Day\n" +
                "National Babysitter's Day\n" +
                "National Birth Mothers Day\n" +
                "National Miniature Golf Day\n" +
                "Cornelia De Lange Syndrome Awareness Day\n" +
                "Stamp Out Hunger Food Drive Day ");
        mayMap.put(10, "National Lipid Day*\n" +
                "National Shrimp Day\n" +
                "National Train Day\n" +
                "Mothers Day ");
        mayMap.put(11, "National Twilight Zone Day\n" +
                "National Women's Checkup Day");
        mayMap.put(12, "National Limerick Day\n" +
                "National Odometer Day\n" +
                "National Nutty Fudge Day\n" +
                "National Fibromyalgia Awareness Day");
        mayMap.put(13, "National Crouton Day\n" +
                "National Frog Jumping Day\n" +
                "National Apple Pie Day\n" +
                "National Fruit Cocktail Day\n" +
                "National Receptionists Day\n" +
                "National Third Shift Workers Day ");
        mayMap.put(14, "National Dance Like a Chicken Day\n" +
                "National Underground America Day\n" +
                "National Buttermilk Biscuit Day");
        mayMap.put(15, "Peace Officers Memorial Day\n" +
                "National Chocolate Chip Day\n" +
                "National Nylon Stocking Day\n" +
                "National Endangered Species Day\n" +
                "National Defense Transportation Day\n" +
                "National Pizza Party Day\n" +
                "National Bike to Work Day\n" +
                "NASCAR Day ");
        mayMap.put(16, "National Love a Tree Day\n" +
                "National Piercing Day\n" +
                "National Sea Monkey Day\n" +
                "National Biographer's Day\n" +
                "National Coquilles Saint Jacques Day\n" +
                "National Armed Forces Day\n" +
                "National Learn to Swim Day ");
        mayMap.put(17, "National Pack Rat Day\n" +
                "National Cherry Cobbler Day\n" +
                "National Walnut Day");
        mayMap.put(18, "National HIV Vaccine Awareness Day\n" +
                "National Visit Your Relatives Day\n" +
                "National No Dirty Dishes Day\n" +
                "National Cheese Souffle Day");
        mayMap.put(19, "National May Ray Day\n" +
                "National Devil's Food Cake Day");
        mayMap.put(20, "National Be a Millionaire Day\n" +
                "National Pick Strawberries Day\n" +
                "National Quiche Lorraine Day\n" +
                "Emergency Medical Services for Children Day");
        mayMap.put(21, "National American Red Cross Founder's Day\n" +
                "National Waitstaff Day\n" +
                "National Strawberries and Cream Day\n" +
                "National Memo Day\n" +
                "World Meterology  Day");
        mayMap.put(22, "National Maritime Day\n" +
                "National Buy a Musical Instrument Day\n" +
                "National Vanilla Pudding Day\n" +
                "National Don't Fry Day");
        mayMap.put(23, "National Lucky Penny Day\n" +
                "National Taffy Day");
        mayMap.put(24, "National Scavenger Hunt Day\n" +
                "National Escargot Day");
        mayMap.put(25, "National Missing Childrens Day\n" +
                "National Tap Dance Day\n" +
                "National Brown-Bag It Day\n" +
                "National Wine Day\n" +
                "National Memorial Day");
        mayMap.put(26, "National Blueberry Cheesecake Day");
        mayMap.put(27, "National Cellophane Tape Day\n" +
                "National Grape Popsicle Day\n" +
                "National Senior Health & Fitness Day");
        mayMap.put(28, "National Brisket Day\n" +
                "National Hamburger Day");
        mayMap.put(29, "National Paperclip Day\n" +
                "National Coq Au Vin Day\n" +
                "National Heat Awareness Day ");
        mayMap.put(30, "National Water a Flower Day\n" +
                "National Hole In My Bucket Day\n" +
                "National Mint Julep Day\n" +
                "Loomis Day");
        mayMap.put(31, "National Save Your Hearing Day\n" +
                "National Speak in Sentences Day\n" +
                "National Macaroon Day");

        return mayMap;
    }
}
