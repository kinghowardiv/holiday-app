package POJO;

import com.example.peter.unofficialholiday.Month;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class March extends Month {

    public void SetMarchInfo(){
        HashMap<Integer, String> marchMap = popMarchMap();
        setDayNumberAndPhraseMap(marchMap);
        setMonthName("March");
    }

    public March GetMarchInfo() {return this;}

    private HashMap<Integer, String> popMarchMap(){
        HashMap<Integer, String> marchMap = new HashMap<>();

        marchMap.put(1, "National Peanut Butter Lover's Day\n" +
                "National Fruit Compote Day\n" +
                "National Horse Protection Day\n" +
                "National Pig Day");
        marchMap.put(2, "National Peanut Butter Lover's Day\n" +
                "National Fruit Compote Day\n" +
                "National Horse Protection Day\n" +
                "National Pig Day");
        marchMap.put(3, "National Anthem Day\n" +
                "National I Want You to be Happy Day\n" +
                "National Cold Cuts Day\n" +
                "National Mulled Wine Day ");
        marchMap.put(4, "National Pound Cake Day\n" +
                "National Hug a G.I. Day\n" +
                "National Grammar Day");
        marchMap.put(5, "National Multiple Personality Day\n" +
                "National Cheese Doodle Day\n" +
                "National Absinthe Day");
        marchMap.put(6, "National Dentist's Day\n" +
                "National Frozen Food Day\n" +
                "National White Chocolate Cheesecake Day\n" +
                "National Oreo Cookie Day \n" +
                "National Day of Unplugging\n" +
                "National Employee Appreciation Day\n" +
                "National Salesperson Day");
        marchMap.put(7, "National Be Heard  Day\n" +
                "National Cereal Day\n" +
                "National Crown of Roast Pork Day ");
        marchMap.put(8, "National Peanut Cluster Day\n" +
                "National Proofreading Day\n" +
                "Return of Daylight Savings ");
        marchMap.put(9, "National Barbie Day\n" +
                "National Crabmeat Day\n" +
                "National Meatball Day\n" +
                "National Get Over it Day\n" +
                "National Napping Day ");
        marchMap.put(10, "National Mario Day\n" +
                "National Blueberry Popover Day\n" +
                "National Pack Your Lunch Day\n" +
                "National Women and Girls HIV/AIDS Awareness Day");
        marchMap.put(11, "National Johnny Appleseed Day\n" +
                "National Worship of Tools Day\n" +
                "National Oatmeal Nut Waffles Day\n" +
                "National Registered Dietitian Nutritionist Day");
        marchMap.put(12, "National Girl Scout Day\n" +
                "National Plant a Flower Day\n" +
                "National Baked Scallops Day");
        marchMap.put(13, "National Good Samaritan Day\n" +
                "National Earmuff Day\n" +
                "National Open an Umbrella Indoors Day\n" +
                "National Coconut Torte Day\n" +
                "National K9 Veterans Day\n" +
                "National Jewel Day");
        marchMap.put(14, "National Good Samaritan Day\n" +
                "National Earmuff Day\n" +
                "National Open an Umbrella Indoors Day\n" +
                "National Coconut Torte Day\n" +
                "National K9 Veterans Day\n" +
                "National Jewel Day");
        marchMap.put(15, "*National Shoe the World Day*\n" +
                "National Pears Helene Day\n" +
                "National Everything You Think is Wrong Day");
        marchMap.put(16, "National Freedom of Information Day\n" +
                "National Everything You Do is Right Day\n" +
                "National Artichoke Hearts Day");
        marchMap.put(17, "National Corned Beef and Cabbage Day\n" +
                "St. Patrick's Day");
        marchMap.put(18, "National Awkward Moments Day\n" +
                "National Oatmeal Cookie Day\n" +
                "National Sloppy Joe Day\n" +
                "National Biodiesel Day\n" +
                "National Supreme Sacrifice Day\n" +
                "National Kick Butts Day\n" +
                "National Ag Day ");
        marchMap.put(19, "National Poultry Day\n" +
                "National Chocolate Caramel Day\n" +
                "National Let's Laugh Day\n" +
                "National Certified Nurses Day");
        marchMap.put(20, "National Ravioli Day\n" +
                "National Native HIV/AIDS Awareness Day\n" +
                "Spring Begins\n" +
                "National Proposal Day");
        marchMap.put(21, "National Common Courtesy Day\n" +
                "National Single Parents Day\n" +
                "National Fragrance Day\n" +
                "National California Strawberry Day\n" +
                "National French Bread Day\n" +
                "National Quilting Day");
        marchMap.put(22, "National Goof Off Day\n" +
                "National Bavarian Crepes Day");
        marchMap.put(23, "National Chip and Dip Day\n" +
                "National Near Miss Day\n" +
                "National Melba Toast Day\n" +
                "National Puppy Day");
        marchMap.put(24, "National Chocolate Covered Raisin Day\n" +
                "National American Diabetes Association Alert Day ");
        marchMap.put(25, "National Lobster Newburg Day\n" +
                "National Medal of Honor Day\n" +
                "National Tolkein Reading Day\n" +
                "Manatee Appreciation Day ");
        marchMap.put(26, "National Spinach Day\n" +
                "National Nougat Day\n" +
                "Purple Day " +
                "Epilepsy Awareness Day");
        marchMap.put(27, "National Joe Day\n" +
                "National Spanish Paella Day");
        marchMap.put(28, "National Weed Appreciation Day\n" +
                "National Something on a Stick Day\n" +
                "National Black Forest Cake Day");
        marchMap.put(29, "National Mom and Pop Business Owners Day\n" +
                "National Lemon Chiffon Cake Day");
        marchMap.put(30, "National Take a Walk in the Park Day\n" +
                "National I Am in Control Day\n" +
                "National Doctors Day\n" +
                "National Pencil Day\n" +
                "National Turkey Neck Soup Day");
        marchMap.put(31, "National Tater Day\n" +
                "National Bunsen Burner Day\n" +
                "National Clams on the Half Shell Day\n" +
                "World Backup Day\n" +
                "National Education and Sharing Day ");

        return marchMap;
    }
}
