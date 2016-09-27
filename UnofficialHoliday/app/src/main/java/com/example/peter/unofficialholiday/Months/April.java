package com.example.peter.unofficialholiday.Months;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class April extends Month {

    @Override
    public void SetMonthInfo(){
        HashMap<Integer, String> AprilMap = popAprilMap();
        setDayNumberAndPhraseMap(AprilMap);
        setMonthName("April");
    }

    @Override
    public Month GetMonthInfo(){return this;}

    private HashMap<Integer, String> popAprilMap(){
        HashMap<Integer, String> aprilMap = new HashMap<>();

        aprilMap.put(1, "National One Cent Day\n" +
                "National Sourdough Bread Day\n" +
                "April Fools Day\n" +
                "National Walking Day\n" +
                "Childhelp National Day of Hope ");
        aprilMap.put(2, "National Reconciliation Day\n" +
                "National Peanut Butter and Jelly Day\n" +
                "National Ferret Day\n" +
                "World Autism Day");
        aprilMap.put(3, "National Tweed Day\n" +
                "National Chocolate Mousse Day\n" +
                "National Find a Rainbow Day");
        aprilMap.put(4, "National Walk Around Things Day\n" +
                "National Hug a Newsperson Day\n" +
                "National School Librarian Day\n" +
                "National Chicken Cordon Bleu Day\n" +
                "National Love Our Children Day ");
        aprilMap.put(5, "National Go For Broke Day\n" +
                "National Caramel Day\n" +
                "National Read a Road Map Day\n" +
                "National Raisin and Spice Bar Day\n" +
                "National Deep Dish Pizza Day");
        aprilMap.put(6, "National Sorry Charlie Day\n" +
                "National Caramel Popcorn Day\n" +
                "National Student-Athlete Day\n" +
                "National Teflon Day\n" +
                "National Tartan Day");
        aprilMap.put(7, "National Beer Day\n" +
                "National Coffee Cake Day\n" +
                "SAAM Day of Action\n" +
                "National No Housework Day");
        aprilMap.put(8, "National All is Ours Day\n" +
                "National Zoo Lovers Day\n" +
                "National Empanada Day");
        aprilMap.put(9, "National Cherish an Antique Day\n" +
                "National Name Yourself Day\n" +
                "National Winston Churchill Day\n" +
                "National Chinese Almond Cookie Day\n" +
                "National Former Prisoner of War Recognition Day\n" +
                "National Alcohol Screening Day  ");
        aprilMap.put(10, "National Encourage a Young Writer Day\n" +
                " National Siblings Day\n" +
                " National Cinnamon Crescent Day\n" +
                "National Farm Animals Day");
        aprilMap.put(11, "National Barber Shop Quartet Day\n" +
                "National Submarine Day\n" +
                "National Teach Children to Save Day\n" +
                "National Eight Track Tape Day\n" +
                "National Pet Day\n" +
                "National Cheese Fondue Day");
        aprilMap.put(12, "National Big Wind Day\n" +
                "National Licorice Day\n" +
                "National Grilled Cheese Sandwich Day");
        aprilMap.put(13, "National Scrabble Day\n" +
                "National Thomas Jefferson Day\n" +
                "National Peach Cobbler Day");
        aprilMap.put(14, "National Reach as High as You Can Day\n" +
                "National Pan American Day\n" +
                "National Ex Spouse Day\n" +
                "National Dolphin Day\n" +
                "National Pecan Day\n" +
                "National Equal Pay Day\n" +
                "National Library Workers Day");
        aprilMap.put(15, "National Tax Day\n" +
                "National Take a Wild Guess Day\n" +
                "National Rubber Eraser Day\n" +
                "National Titanic Remembrance Day\n" +
                "National Glazed Spiral Ham Day\n" +
                "National Bookmobile Day");
        aprilMap.put(16, "National Orchid Day\n" +
                "National Eggs Benedict Day\n" +
                "National Wear Your Pajamas to Work  Day\n" +
                "National Healthcare Decisions Day\n" +
                "National High Five Day\n" +
                "National Support Teen Literature Day ");
        aprilMap.put(17, "National Bat Appreciation Day\n" +
                "National Ellis Island Family History Day\n" +
                "National Haiku Poetry Day\n" +
                "National Cheeseball Day\n" +
                "National Day of Silence ");
        aprilMap.put(18, "National Lineman Appreciation Day\n" +
                "National Columnists Day\n" +
                "National Animal Crackers Day\n" +
                "National Auctioneers Day");
        aprilMap.put(19, "National Hanging Out Day\n" +
                "National Oklahoma City Bombing Commemoration Day\n" +
                "National Garlic Day\n" +
                "National Amaretto Day");
        aprilMap.put(20, "National Look Alike Day\n" +
                "National Lima Bean Respect Day\n" +
                "National Pineapple Upside Down Cake Day");
        aprilMap.put(21, "National Kindergarten Day\n" +
                "National Chocolate Covered Cashews Day");
        aprilMap.put(22, "National Earth Day\n" +
                "National Girl Scout Leaders Day\n" +
                "National Jelly Bean Day\n" +
                "National Administrative Professionals Day ");
        aprilMap.put(23, "National Talk Like Shakespeare Day\n" +
                "National Picnic Day\n" +
                "National Take a Chance Day\n" +
                "National Cherry Cheesecake Day\n" +
                "National Lost Dogs Awareness Day\n" +
                "National Take Our Daughters and Sons to Work Day");
        aprilMap.put(24, "National Pigs in a Blanket Day\n" +
                "National Arbor Day\n" +
                "National Hairball Awareness Day");
        aprilMap.put(25, "National Kiss of Hope Day\n" +
                "National Telephone Day\n" +
                "National East Meets West Day\n" +
                "National Zucchini Bread Day\n" +
                "National DNA Day\n" +
                "National Hug a Plumber Day\n" +
                "National Sense of Smell Day\n" +
                "National Rebuilding Day");
        aprilMap.put(26, "National Audubon Day\n" +
                "National Richter Scale Day\n" +
                "National Kids and Pets Day\n" +
                "National Pretzel Day\n" +
                "National Help a Horse Day\n" +
                "National Pet Parents Day");
        aprilMap.put(27, "National Babe Ruth Day\n" +
                "National Tell a Story Day\n" +
                "National Prime Rib Day");
        aprilMap.put(28, "National Blueberry Pie Day\n" +
                "National Great Poetry Reading Day\n" +
                "Workers Memorial Day\n" +
                "National BraveHearts Day");
        aprilMap.put(29, "National Peace Rose Day\n" +
                "National Zipper Day\n" +
                "National Shrimp Scampi Day");
        aprilMap.put(30, "National Sarcoidosis Day\n" +
                "National Honesty Day\n" +
                "National Adopt a Shelter Pet Day\n" +
                "National Bugs Bunny Day\n" +
                "National Hairstylist Appreciation Day\n" +
                "National Oatmeal Cookie Day\n" +
                "National Raisin Day\n" +
                "National Poem In Your Pocket Day ");

        return aprilMap;
    }
}
