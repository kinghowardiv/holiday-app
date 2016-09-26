package POJO;

import com.example.peter.unofficialholiday.Month;

import java.util.HashMap;

/**
 * Created by peter on 12/17/2015.
 */
public class January extends Month {

        public void SetJanuaryInfo(){
        HashMap<Integer, String> janMap = popJanuaryMap();
        setDayNumberAndPhraseMap(janMap);
        setMonthName("January");
    }

        public January GetJanuaryInfo(){
            return this;
        }

        private HashMap<Integer, String> popJanuaryMap(){
            HashMap<Integer, String> janMap = new HashMap<>();
            janMap.put(1, "New Years Day");
            janMap.put(2, "National Science Fiction Day\n" +
                    "National Personal Trainer Awareness Day\n" +
                    "National Buffet Day\n" +
                    "National Cream Puff Day");
            janMap.put(3, "National Chocolate Covered Cherry Day\n" +
                    "National Drinking Straw Day\n" +
                    "National Fruitcake Toss Day ");
            janMap.put(4, "National Spaghetti Day\n" +
                    "National Trivia Day");
            janMap.put(5, "National Bird Day\n" +
                    "National Whipped Cream Day\n" +
                    "National Thank God It's Monday Day ");
            janMap.put(6, "National Bean Day\n" +
                    "National Shortbread Day");
            janMap.put(7, "National Bobblehead Day*\n" +
                    "National Tempura Day");
            janMap.put(8, "National Argyle Day\n" +
                    "National Bubble Bath Day\n" +
                    "National English Toffee Day\n" +
                    "National JoyGerm Day");
            janMap.put(9, "National Static Electricity Day\n" +
                    "National Apricot Day");
            janMap.put(10, "National Bittersweet Chocolate Day\n" +
                    "National Cut Your Energy Costs Day\n" +
                    "National Save The Eagles Day");
            janMap.put(11, "National Milk Day\n" +
                    "National Human Trafficking Awareness Day\n" +
                    "National Step in the Puddle and Splash Your Friends Day");
            janMap.put(12, "National Pharmacist Day\n" +
                    "National Curried Chicken Day\n" +
                    "National Marzipan Day\n" +
                    "National Clean Off Your Desk Day ");
            janMap.put(13, "National Rubber Ducky Day\n" +
                    "National Peach Melba Day\n" +
                    "Stephen Foster Memorial Day");
            janMap.put(14, "National Hot Pastrami Sandwich Day\n" +
                    "National Dress Up Your Pet Day\n" +
                    "Ratification Day");
            janMap.put(15, "National Hat Day\n" +
                    "National Strawberry Ice Cream Day");
            janMap.put(16, "National Nothing Day\n" +
                    "National Religious Freedom Day\n" +
                    "National Fig Newton Day");
            janMap.put(17, "National Hot Buttered Rum Day");
            janMap.put(18, "National Winnie The Pooh Day\n" +
                    "National Peking Duck Day  ");
            janMap.put(19, "National Popcorn Day\n" +
                    "Martin Luther King Jr. Day ");
            janMap.put(20, "National Buttercrunch Day\n" +
                    "National Disc Jockey Day\n" +
                    "National Cheese Lover's Day");
            janMap.put(21, "National Hugging Day\n" +
                    "National Granola Bar Day\n" +
                    "Squirrel Appreciation Day");
            janMap.put(22, "National Blonde Brownie Day\n" +
                    "Celebration of Life Day");
            janMap.put(23, "National Pie Day\n" +
                    "National Handwriting Day");
            janMap.put(24, "National Compliment Day\n" +
                    "National Peanut Butter Day\n" +
                    "Beer Can Appreciation Day");
            janMap.put(25, "National Opposite Day\n" +
                    "National Irish Coffee Day");
            janMap.put(26, "National Spouses Day\n" +
                    "National Peanut Brittle Day\n" +
                    "*National Ellen Degeneres Day*");
            janMap.put(27, "National Chocolate Cake Day");
            janMap.put(28, "National Have Fun At Work Day\n" +
                    "National Kazoo Day\n" +
                    "National Blueberry Pancake Day");
            janMap.put(29, "National Puzzle Day\n" +
                    "National Corn Chip Day");
            janMap.put(30, "National Croissant Day\n" +
                    "National Seed Swap Day ");
            janMap.put(31, "National Backward Day\n" +
                    "National Inspire Your Heart With Art Day");

            return janMap;
    }
}
