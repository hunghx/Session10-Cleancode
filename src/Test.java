public class Test {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("hgdygc");
    }
    private static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0; // kiem tra chia het cho 4
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDevisibleBy400 = year % 400 == 0;
                if(isDevisibleBy400)
                    return true;
            } else {

                return true;
            }
        }
        return false;
    }

}
