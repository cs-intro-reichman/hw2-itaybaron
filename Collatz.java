// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;

            if (mode.equals("v")) {

                while (true) {
                    System.out.print(current + " ");
                    if (current == 1 && steps > 1) {
                        break;
                    }
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                    steps++;
                }
                System.out.println("(" + steps + ")");
            } else {
                while (!(current == 1 && steps > 1)) {
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                    steps++;
                }
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

