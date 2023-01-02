package packagecom.blz;

public class Gambler {
    public static final int BET = 1;
    public static final int AMOUNT = 100;

    public static int WON = 0;
    public static int LOSE = 0;

    public static void main(String[] args) {
        double amount = 0;
        int day;
        for (day = 0; day < 20; day++) {
            int stake = 100;
            while (stake > (0.5 * AMOUNT) && stake < (1.5 * AMOUNT)) {
                int bet = (int) (Math.floor(Math.random() * 10) % 2);
                if (bet == BET) {
                    WON++;
                    stake++;
                } else if (bet == 0) {
                    LOSE++;
                    stake--;
                }
            }
            if (stake > AMOUNT) {
                WON++;
                amount = amount + 50;
            } else if (stake < AMOUNT) {
                LOSE++;
                amount = amount - 50;
            }
        }
        if (WON > LOSE) {
            System.out.println("After Day " + day + ", the total amount won is $" + amount);
        } else if (LOSE > WON) {
            System.out.println("After Day " + day + ", the total amount lose is $" + amount);
        } else System.out.println("Neither Won nor Lose");
    }
}


    public static void main(String[] args) {


        int stake = 100;

        while (stake > (0.5 * AMOUNT) && stake < (1.5 * AMOUNT)) {
            int bet = (int) (Math.floor(Math.random() * 10) % 2);
            if (bet == 1) {
                System.out.println("Won $1");
                System.out.println("Initial Stake is $" + stake + ", won $1 " + "and total is " + "$"+(stake + BET));
                stake++;
            } else if (bet == 0) {
                System.out.println("Loss $1");
                System.out.println("Initial Stake is $" + stake + ", lost $1 " + "and total is " + "$"+(stake - BET));
                stake--;
            }
        }
    }
}

        int won = 0;
        int bet = (int) (Math.floor(Math.random()*10)%2);
        if (bet == 1){
            System.out.println("Won $1");
            System.out.println("Initial Stake is $" +AMOUNT+ ", won $1 "+"and total is $100");
        }else {
            System.out.println("Loss $1");
            System.out.println("Initial Stake is $" + AMOUNT + ", lost $1 "+"and total is $99");
        }
    }}


