package POJO;

import com.example.peter.unofficialholiday.Month;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class October extends Month {

    public void SetOctoberInfo(){
        HashMap<Integer, String> octoberMap = popOctMap();
        setDayNumberAndPhraseMap(octoberMap);
        setMonthName("October");
    }

    public October GetOctoberInfo() {return this;}

    private HashMap<Integer, String> popOctMap(){
        HashMap<Integer, String> octMap = new HashMap<>();

        octMap.put(1, "National Fire Pup Day\n" +
                "National Homemade Cookies Day\n" +
                "National Poetry Day ");
        octMap.put(2, "National Manufacturing Day\n" +
                "National Custodial Workers Day\n" +
                "National Name Your Car Day\n" +
                "National Fried Scallops Day\n" +
                "World Smile Day ");
        octMap.put(3, "National Techies Day");
        octMap.put(4, "National Taco Day\n" +
                "National Golf Day\n" +
                "National Vodka Day");
        octMap.put(5, "National Do Something Nice Day\n" +
                "National Apple Betty Day\n" +
                "National Child Health Day ");
        octMap.put(6, "National Mad Hatter Day\n" +
                "National German-American Day\n" +
                "National Noodle Day");
        octMap.put(7, "National Frappe Day");
        octMap.put(8, "National Fluffernutter Day\n" +
                "National Pierogy Day\n" +
                "National Emergency Nurses Day\n" +
                "National Stop Bullying Day\n" +
                "National Bring Your Teddy Bear to Work/School Day\n" +
                "American Touch Tag Day");
        octMap.put(9, "National Leif Erikson Day\n" +
                "National Pro-Life Cupcake Day\n" +
                "National Moldy Cheese Day");
        octMap.put(10, "National Angel Food Cake Day");
        octMap.put(11, "National Sausage Pizza Day\n" +
                "National Coming Out Day\n" +
                "General Pulaski Memorial Day\n" +
                "National Chess Day\n" +
                "National Costume Swap Day ");
        octMap.put(12, "National Free Thought Day\n" +
                "National Farmers Day\n" +
                "National Gumbo Day");
        octMap.put(13, "National Train Your Brain Day\n" +
                "National Yorkshire Pudding Day\n" +
                " National Kick Butt Day\n" +
                "Native American Day\n" +
                "Navy Birthday\n" +
                "Columbus Day  ");
        octMap.put(14, "National Dessert Day\n" +
                "Be Bald and Be Free Day\n" +
                "National Fossil Day ");
        octMap.put(15, "National I Love Lucy Day\n" +
                "National Cake Decorating Day\n" +
                "National Grouch Day\n" +
                "National Latino AIDS Awareness Day\n" +
                "National Pregnancy and Infant Loss Awareness Day\n" +
                "National White Cane Safety Day\n" +
                "International Day of Rural Women\n" +
                "National Get Smart About Credit Day\n" +
                "Get to Know Your Customers Day ");
        octMap.put(16, "National Liqueur Day\n" +
                "National Dictionary Day\n" +
                "National Feral Cat Day\n" +
                "National Take Your Parents To Lunch Day\n" +
                "Boss's Day (or National Boss's Day)\n" +
                "Pro-Life Day of Silent Solidarity\n" +
                "Department Store Day\n" +
                "World Food Day\n" +
                "National Mammography Day ");
        octMap.put(17, "National  Edge Day\n" +
                "National Mulligan Day\n" +
                "National Pasta Day\n" +
                "Black Poetry Day\n" +
                "National Sweetest Day");
        octMap.put(18, "National Chocolate Cupcake Day");
        octMap.put(19, "National Seafood Bisque Day\n" +
                "National Clean Your Virtual Desktop Day ");
        octMap.put(20, "National Brandied Fruit Day");
        octMap.put(21, "National Pumpkin Cheesecake Day\n" +
                "National Reptile Awareness Day\n" +
                "Hagfish Day\n" +
                "Support Your Local Chamber of Commerce\n" +
                "Medical Assistants Recognition Day ");
        octMap.put(22, "National Nut Day\n" +
                "National Color Day");
        octMap.put(23, "National Boston Cream Pie Day\n" +
                "National Mole Day\n" +
                "National TV Talk Show Host Day  (Johnny Carson's birthday)\n" +
                "Swallows Depart from San Juan Capistrano Day\n" +
                "IPod Day");
        octMap.put(24, "National Food Day\n" +
                "National Bologna Day\n" +
                "United Nations Day\n" +
                "World Development Information Day\n" +
                "National Make A Difference Day ");
        octMap.put(25, "National Greasy Food Day\n" +
                "Sourest Day\n" +
                "World Pasta Day\n" +
                "Chucky, The Notorious Killer Doll Day\n" +
                "International Bandanna Day\n" +
                "International Artists Day\n" +
                "National Mother-in-Law Day ");
        octMap.put(26, "National Day of the Deployed\n" +
                "National Mule Day\n" +
                "National Pumpkin Day\n" +
                "National Mincemeat Day");
        octMap.put(27, "National American Beer Day\n" +
                "Navy Day");
        octMap.put(28, "National Chocolate Day");
        octMap.put(29, "National Cat Day\n" +
                "National Oatmeal Day\n" +
                "National Hermit Day");
        octMap.put(30, "National Candy Corn Day\n" +
                "*National Speak Up For Service Day\n" +
                "National Pharmacy Buyer Day\n" +
                "National Breadstix (Bread Sticks) Day\n" +
                "National Frankenstien Day");
        octMap.put(31, "National Caramel Apple Day\n" +
                "National Knock-Knock Jokes Day\n" +
                "National Magic Day\n" +
                "Girl Scout Founder's Day\n" +
                "Halloween");

        return octMap;
    }

}
