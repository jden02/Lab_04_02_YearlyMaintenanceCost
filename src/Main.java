public class Main {
    public static void main(String[] args) {
        double mCostWinter = 1200.00;
        double mCostSpring = 800.00;
        double mCostSummer = 650.00;
        double mCostFall = 999.99;

        double mCostTotal = mCostFall + mCostSpring + mCostSummer + mCostWinter;

        System.out.println("The maintenance costs for WINTER = " + mCostWinter);
        System.out.println("The maintenance costs for SPRING = " + mCostSpring);
        System.out.println("The maintenance costs for SUMMER = " + mCostSummer);
        System.out.println("The maintenance costs for FALL = " + mCostFall);
        System.out.println("The total annual maintenance cost = " + mCostTotal);
    }
}