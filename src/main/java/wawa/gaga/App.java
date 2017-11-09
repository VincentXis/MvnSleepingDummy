package wawa.gaga;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        sleepDummy(args);
        if (args.length != 0) if (args[0].equals("true")) {
            ripDummy();
            System.exit(1);
        }
        System.out.println("Woo I didn't die sleeping!");
    }

    private static void sleepDummy(String[] args) {
        System.out.println("I'm gonna have a nap!");
        int deviation = new Random().nextInt(9);
        long min = 80;
        if (args.length == 2 && args[0].equals("true") && args[1].equals("short"))
            min = 14;
        min = new Random().nextBoolean() ? min - deviation : min + deviation;
        try {
            System.out.println("Zzz...");
//            Thread.sleep((min * 60) * 1000);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.exit(2);
            System.out.println("RIP");
        }
    }

    private static void ripDummy() {
        System.out.println("                _______ ");
        System.out.println("          _____/      \\\\_____  ");
        System.out.println("         |  _     ___   _   || ");
        System.out.println("         | | \\     |   | \\  || ");
        System.out.println("         | |  |    |   |  | || ");
        System.out.println("         | |_/     |   |_/  || ");
        System.out.println("         | | \\     |   |    || ");
        System.out.println("         | |  \\    |   |    || ");
        System.out.println("         | |   \\. _|_. | .  || ");
        System.out.println("         |                  || ");
        System.out.println("         |      A dummy,    || ");
        System.out.println("         |  counting sheep  || ");
        System.out.println(" *       | *   **    * **   |**      ** ");
        System.out.println(" \\\\)),),/.,(//,,..,,\\||(,,.,\\\\)/,.((//");
    }
}
