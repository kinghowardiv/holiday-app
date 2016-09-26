package POJO;

import com.example.peter.unofficialholiday.Month;

import java.util.HashMap;

/**
 * Created by peter on 12/19/2015.
 */
public class June extends Month {

    public void SetJanuaryInfo(){
        HashMap<Integer, String> juneMap = popJuneMap();
        setDayNumberAndPhraseMap(juneMap);
        setMonthName("June");
    }

    public June GetJuneMonth() {return this;}

    private HashMap<Integer, String> popJuneMap(){
        HashMap<Integer, String> juneMap = new HashMap<>();

        juneMap.put(1, "National Heimlich Maneuver Day\n" +
                "National Go Barefoot Day\n" +
                "National Say Something Nice Day\n" +
                "National Penpal Day\n" +
                "National Hazelnut Cake Day");
        juneMap.put(2, "National Rotisserie Chicken Day*\n" +
                "National Rocky Road Day\n" +
                "National Bubba Day\n" +
                "National Leave The Office Early Day ");
        juneMap.put(3, "National Repeat Day\n" +
                "National Chocolate Macaroons Day\n" +
                "National Running Day ");
        juneMap.put(4, "National Old Maids Day\n" +
                "National Cheese Day\n" +
                "National Cognac Day");
        juneMap.put(5, "National Moonshine Day\n" +
                "National Gingerbread Day\n" +
                "National Doughnut Day");
        juneMap.put(6, "National Higher Education Day*\n" +
                "National Gardening Exercise Day\n" +
                "National Yo-Yo Day\n" +
                "National Drive In Movie Day\n" +
                "National Applesauce Cake Day\n" +
                "National Trails Day");
        juneMap.put(7, "National VCR Day\n" +
                "National Chocolate Ice Cream Day\n" +
                "National Cancer Survivor's Day ");
        juneMap.put(8, "National Best Friends Day\n" +
                "National Name Your Poison Day\n" +
                "National Upsy Daisy Day");
        juneMap.put(9, "National Donald Duck Day\n" +
                "National Strawberry Rhubarb Pie Day");
        juneMap.put(10, "National Ballpoint Pen Day\n" +
                "National Iced Tea Day\n" +
                "National Black Cow Day\n" +
                "National Herbs and Spices Day");
        juneMap.put(11, "National Making Life Beautiful Day*\n" +
                "National Corn on the Cob Day\n" +
                "National German Chocolate Cake Day\n" +
                "National Career Nurse Assistants Day ");
        juneMap.put(12, "National Red Rose Day\n" +
                "National Jerky Day\n" +
                "National Peanut Butter Cookie Day\n" +
                "National Loving Day");
        juneMap.put(13, "National Rose Day\n" +
                "National Kitchen Klutzes of America Day\n" +
                "National Weed Your Garden Day\n" +
                "National Sewing Machine Day");
        juneMap.put(14, "National Strawberry Shortcake Day\n" +
                "National Pop Goes the Weasel Day\n" +
                "National Flag Day\n" +
                "National Bourbon Day");
        juneMap.put(15, "National Lobster Day\n" +
                "National Smile Power Day\n" +
                "Nature Photography Day");
        juneMap.put(16, "National Fudge Day");
        juneMap.put(17, "National Eat Your Vegetables Day\n" +
                "National Stewart's Root Beer Day\n" +
                "National Apple Strudel Day\n" +
                "National Cherry Tart Day");
        juneMap.put(18, "National Go Fishing Day\n" +
                "National Splurge Day\n" +
                "National Dump the Pump Day ");
        juneMap.put(19, "National Martini Day\n" +
                "National Flip Flop Day ");
        juneMap.put(20, "National Kouign Amann Day*\n" +
                "American Eagle Day\n" +
                "National Vanilla Milkshake Day\n" +
                "National Ice Cream Soda Day");
        juneMap.put(21, "Father's Day\n" +
                "National Peaches N Cream Day\n" +
                "National Daylight Appreciation Day");
        juneMap.put(22, "National Chocolate Eclair Day\n" +
                "National Onion Rings Day");
        juneMap.put(23, "National Pink Day\n" +
                "National Pecan Sandies Day");
        juneMap.put(24, "National Pralines Day");
        juneMap.put(25, "National Strawberry Parfait Day\n" +
                "National Catfish Day\n" +
                "National Leon Day\n" +
                "National Bomb Pop Day\n" +
                "National Handshake Day");
        juneMap.put(26, "National Beautician?s Day\n" +
                "National Chocolate Pudding Day");
        juneMap.put(27, "National Sun Glasses Day\n" +
                "National Orange Blossom Day");
        juneMap.put(28, "National Paul Bunyan Day\n" +
                "National Insurance Awareness Day");
        juneMap.put(29, "National Camera Day\n" +
                "National Waffle Iron Day\n" +
                "National Almond Buttercrunch Day");
        juneMap.put(30, "National Meteor Watch Day");

        return juneMap;
    }

}
