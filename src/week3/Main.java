package week3;

public class Main {

//    public static void main(String[] args) {
//      WeekDay monday = new WeekDay(1, false);
//        System.out.println(WeekDay.SUNDAY);
//    }
        public static void main(String[] args) {
            String dayName = "Monday";
            switch (dayName) {
                case "Monday":
                    System.out.println("on monday step");
                case "Tuesday":
                case "Friday":	System.out.println("Workday");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println("Weekend");
                    break;}
        }
}
