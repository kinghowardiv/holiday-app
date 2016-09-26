package POJO;

import com.example.peter.unofficialholiday.Month;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class September extends Month {

    public void SetSeptemberInfo(){
        HashMap<Integer, String> septemberMap = popSepMap();
        setDayNumberAndPhraseMap(septemberMap);
        setMonthName("September");
    }

    public September GetSeptemberInfo() {return this;}

    private HashMap<Integer, String> popSepMap() {
        HashMap<Integer, String> sepMap = new HashMap<>();

        sepMap.put(1, "National Chicken Boy's Day\n" +
                "National No Rhyme (Nor Reason) Day");
        sepMap.put(2, "National Blueberry Popsicle Day");
        sepMap.put(3, "National Welsh Rarebit Day\n" +
                "U.S. Bowling League Day");
        sepMap.put(4, "National Wildlife Day\n" +
                "National Newspaper Carrier Day\n" +
                "National Macadamia Nut Day");
        sepMap.put(5, "National Cheese Pizza Day\n" +
                "International Bacon Day\n" +
                "National Lazy Mom's Day");
        sepMap.put(6, "National Coffee Ice Cream Day\n" +
                "National Read A Book Day");
        sepMap.put(7, "National Neither Snow Nor Rain Day\n" +
                "National Grandma Moses Day\n" +
                "National Acorn Squash Day\n" +
                "National Salami Day\n" +
                "National Labor Day");
        sepMap.put(8, "National Pediatric Hematology/Oncology Nurses Day\n" +
                "National Another Look Unlimited Day\n" +
                "*National Ants on a Log Day");
        sepMap.put(9, "National Teddy Bear Day");
        sepMap.put(10, "National Swap Ideas Day\n" +
                "National TV Dinner Day");
        sepMap.put(11, "National Make Your Bed Day\n" +
                "National Hot Cross Bun Day\n" +
                "Patriot Day and National Day of Service and Remembrance\n" +
                "Stand Up To Cancer Day ");
        sepMap.put(12, "National Video Games Day\n" +
                "National Chocolate Milkshake Day\n" +
                "National Day of Encouragement");
        sepMap.put(13, "National Kids Take Over The Kitchen Day\n" +
                "National Peanut Day\n" +
                "National Programmers Day\n" +
                "Uncle Sam Day\n" +
                "National Grandparent's Day\n" +
                "National Pet Memorial Day\n" +
                "National Hug Your Hound Day ");
        sepMap.put(14, "National Cream Filled Donut Day\n" +
                "National Eat a Hoagie Day\n" +
                "National National Boss/Employee Exchange Day ");
        sepMap.put(15, "National IT Professionals Day\n" +
                "National Linguine Day\n" +
                "National Felt Hat Day\n" +
                "National Double Cheeseburger Day\n" +
                "National LGBT Center Awareness Day\n" +
                "National Creme de Menthe Day\n" +
                "Google.com Day\n" +
                "Greenpeace Day\n" +
                "International Day of Democracy\n" +
                "International Dot Day");
        sepMap.put(16, "National Play-Doh Day\n" +
                "National Cinnamon Raisin Bread Day\n" +
                "National Step Family Day\n" +
                "Anne Bradstreet Day\n" +
                "Mayflower Day\n" +
                "Trail of Tears Commemoration Day");
        sepMap.put(17, "National Apple Dumpling Day\n" +
                "Constitution Day and Citizenship Day");
        sepMap.put(18, "National Cheeseburger Day\n" +
                "National HIV/AIDS and Aging Awareness Day\n" +
                "National Trademen Day\n" +
                "National POW/MIA Recognition Day");
        sepMap.put(19, "National Butterscotch Pudding Day\n" +
                "Talk Like A Pirate Day\n" +
                "Big Whopper Liar Day\n" +
                "Boys and Girls Club Day for Kids\n" +
                "Puppy Mill Awareness Day\n" +
                "Responsible Dog Ownership Day\n" +
                "International Eat An Apple Day\n" +
                "International Coastal Cleanup Day");
        sepMap.put(20, "National Punch Day\n" +
                "Wife Appreciation Day ");
        sepMap.put(21, "National Pecan Cookie Day\n" +
                "World's Alzheimers Day\n" +
                "International Day of Peace");
        sepMap.put(22, "National Centenarian's Day\n" +
                "National White Chocolate Day\n" +
                "AKC Responsible Dog Ownership Day\n" +
                "American Business Women's Day\n" +
                "Car Free Day\n" +
                "Dear Diary Day\n" +
                "Elephant Appreciation Day\n" +
                "Hobbit Day\n" +
                "National Ice Cream Cone Day\n" +
                "Mabon\n" +
                "International Day of Radiant Peace\n" +
                "National Woman Road Warrior Day\n" +
                "National Voter Registration Day");
        sepMap.put(23, "National Checkers/Dogs in Politics Day\n" +
                "National Great American Pot Pie Day\n" +
                "Celebrate Bi-sexuality Day\n" +
                "Restless Legs Awareness Day\n" +
                "Autumnal Equinox");
        sepMap.put(24, "National Cherries Jubilee Day\n" +
                "Punctuation Day Link\n" +
                "Schwenkfelder Thanksgiving\n" +
                "Innergize Day");
        sepMap.put(25, "National One-Hit Wonder Day\n" +
                "National Comic Book Day\n" +
                "National Tune-Up Day\n" +
                "Math Story Telling Day");
        sepMap.put(26, "National Dumpling Day*\n" +
                "National Johnny Appleseed Day\n" +
                "National Shamu the Whale Day\n" +
                "National Pancake Day\n" +
                "National Hunting and Fishing Day\n" +
                "National Family Health and Fitness Day USA\n" +
                "National Public Lands Day ");
        sepMap.put(27, "National Gay Men's HIV/AIDS Awareness Day\n" +
                "National Chocolate Milk Day\n" +
                "National Crush a Can Day\n" +
                "National Corned Beef Hash Day\n" +
                "National Gold Star Mothers Day");
        sepMap.put(28, "National Good Neighbor Day\n" +
                "National Strawberry Cream Pie Day");
        sepMap.put(29, "National Attend Your Grandchild's Birth Day\n" +
                "National Coffee Day\n" +
                "VFW Day");
        sepMap.put(30, "National Chewing Gum Day\n" +
                "National Mud Pack Day\n" +
                "National Hot Mulled Cider Day\n" +
                "Blasphemy Day\n" +
                "National Women's Health & Fitness Day ");

        return sepMap;
    }
}
