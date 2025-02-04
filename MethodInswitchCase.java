package conditionals;

class MethodInswitchCase {
    static public void printDay(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int dayNumber = 4; 

        switch (dayNumber) {
            case 1:
                printDay("Monday");
                break;
            case 2:
                printDay("Tuesday");
                break;
            case 3:
                printDay("Wednesday");
                break;
            case 4:
                printDay("Thursday");
                break;
            case 5:
                printDay("Friday");
                break;
            case 6:
                printDay("Saturday");
                break;
            case 7:
                printDay("Sunday");
                break;
            default:
                System.out.println("Invalid day number"); 
        }
    }
}