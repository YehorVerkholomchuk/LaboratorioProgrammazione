public class LinePrinter {
    public static void main(String[] args) {
        int length = 0;
        int direction = 0;

        if (args.length != 2) {
            System.out.println("You must enter 2 arguments!");
            return;
        }

        try {
            length = Integer.parseInt(args[0]);
            direction = Integer.parseInt(args[1]);

            if (length < 1) {
                System.out.println("You must enter a positive integer!");
                return;
            } else if (direction < 0 || direction > 1) {
                System.out.println("Number 0 or 1!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("You must enter a number!");
        }

        for (int i = 0; i < length; i++) {
            if (direction == 1) {
                System.out.print("*\t");
            } else {
                System.out.println("*");
            }
        }
    }
}