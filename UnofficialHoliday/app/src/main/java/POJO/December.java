package POJO;

import com.example.peter.unofficialholiday.Month;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class December extends Month {

    public void SetDecemberInfo(){
        HashMap<Integer, String> decemberMap = popDecMap();
        setDayNumberAndPhraseMap(decemberMap);
        setMonthName("December");
    }

    public December GetDecemberInfo() {return this;}

    private HashMap<Integer, String> popDecMap(){
        HashMap<Integer, String> decMap = new HashMap<>();

        decMap.put(1, "National Pie Day\n" +
                "National Eat a Red Apple Day\n" +
                "Bifocals at the Monitor Liberation Day\n" +
                "Day With(out) Art Day\n" +
                "Rosa Parks Day\n" +
                "World Aids Day\n" +
                "National Day of Giving");
        decMap.put(2, "National Fritters Day\n" +
                "National Mutt Day\n" +
                "Special Education Day\n" +
                "International Day for the Abolition of Slavery Day");
        decMap.put(3, "National Roof Over Your Head Day\n" +
                "International Day of Persons With Disabilities");
        decMap.put(4, "National Cookie Day\n" +
                "National Dice Day\n" +
                "Faux Fur Friday ");
        decMap.put(5, "National Sacher Torte Day\n" +
                "AFL-CIO Day\n" +
                "Bathtub Party Day\n" +
                "International Ninja Day\n" +
                "International Volunteer Day for Economic & Social Development\n" +
                "*National Rhubarb Vodka Day\n" +
                "Skywarn Recognition Day ");
        decMap.put(6, "National Pawnbrokers Day\n" +
                "National Microwave Oven Day\n" +
                "National Gazpacho Day\n" +
                "St. Nicholas Day\n" +
                "Miners? Day");
        decMap.put(7, "National Pearl Harbor Remembrance Day\n" +
                "National Cotton Candy Day\n" +
                "International Civil Aviation Day");
        decMap.put(8, "National Brownie Day\n" +
                "Pretend To Be A Time Traveler Day");
        decMap.put(9, "National Pastry Day\n" +
                "Weary Willie Day\n" +
                "International Anti-corruption Day");
        decMap.put(10, "Dewey Decimal System Day\n" +
                "Human Rights Day\n" +
                "Nobel Prize Day");
        decMap.put(11, "National Noodle Ring Day\n" +
                "UNICEF Birthday\n" +
                "International Mountain Day\n" +
                "National Ugly Christmas Sweater Day ");
        decMap.put(12, "National Ambrosia Day\n" +
                "National Ding-a-Ling Day\n" +
                "Gingerbread House Day\n" +
                "Poinsettia Day\n" +
                "National Wreaths Across America Day\n" +
                "International Shareware Day ");
        decMap.put(13, "National Cocoa Day\n" +
                "National Violin Day\n" +
                "National Day Of The Horse\n" +
                "Pick A Pathologist Pal Day\n" +
                "Worldwide Candle Lighting Day (The Compassionate Friends)\n" +
                "World Choral Day");
        decMap.put(14, "National Bouillabaisse Day\n" +
                "Monkey Day\n");
        decMap.put(15, "National Cupcake/ Lemon Cupcake Day\n" +
                "Bill of Rights Day\n" +
                "Cat Herders Day");
        decMap.put(16, "National Chocolate-covered Anything Day\n" +
                "Barbie and Barney Backlash Day\n" +
                "Chanukah");
        decMap.put(17, "National Maple Syrup Day\n" +
                "Wright Brothers Day\n" +
                "National Re-Gifting Day ");
        decMap.put(18, "National Roast Suckling Pig Day\n" +
                "Free Shipping Day \n" +
                "Answer The Telephone Like Buddy The Elf Day\n" +
                "International Migrants Day\n" +
                "Underdog Day");
        decMap.put(19, "National Hard Candy Day\n" +
                "National Oatmeal Muffin Day\n");
        decMap.put(20, "National Sangria Day\n" +
                "International Human Solidarity Day\n" +
                "Mudd Day");
        decMap.put(21, "National French Fried Shrimp Day\n" +
                "Crossword Puzzle Day\n" +
                "Humbug Day\n" +
                "Phileas Fogg Win A Wager Day");
        decMap.put(22, "National Date Nut Bread Day\n" +
                "Ann & Samantha Day\n" +
                "Forefathers Day\n" +
                "Winter Solstice  Day\n" +
                "National Flashlight Day\n" +
                "National Homeless Persons? Remembrance Day\n" +
                "Yule");
        decMap.put(23, "National Pfeffernusse Day\n" +
                "National Roots Day\n" +
                "Festivus");
        decMap.put(24, "National Eggnog Day\n" +
                "Christmas Eve");
        decMap.put(25, "National Pumpkin Pie Day\n" +
                "AlPhabet Day or No ?L? Day\n" +
                "Christmas");
        decMap.put(26, "National Candy Cane Day\n" +
                "National Thank-you Note Day\n" +
                "National Whiner?s Day");
        decMap.put(27, "National Fruitcake Day");
        decMap.put(28, "National Chocolate Candy Day\n" +
                "National Card Playing Day\n" +
                "Holy Innocents Day\n" +
                "Pledge of Allegiance Day");
        decMap.put(29, "National Pepper Pot Day\n" +
                "Tick Tock Day");
        decMap.put(30, "National Bicarbonate of Soda Day\n" +
                "Falling Needles Family Fest Day\n" +
                "Bacon Day");
        decMap.put(31, "National Champagne Day\n" +
                "Make Up Your Mind Day\n" +
                "New Years Eve\n" +
                "No Interruptions Day \n" +
                "Universal Hour of Peace ");

        return decMap;
    }

}
