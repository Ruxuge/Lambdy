public class zadanie5 {

        public static void oldSwitch(String day) {
            String result = "";
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    result = "week day";
                    break;
                case "Saturday":
                case "Sunday":
                    result = "weekend";
                    break;
            }
            System.out.println(result);
        }





        public static void newSwitch(String day) {
            var result = switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "week day";
                case "Saturday", "Sunday" -> "weekend";
                default -> "";
            };
            System.out.println(result);
        }

        public static void main(String[] args) {
            oldSwitch("Sunday");
            newSwitch("Wednesday");

        }
}
