public class Change {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("Change for 6c: " + NumberOfWayToMakeChange(6));
        System.out.println("Change for 11c: " + NumberOfWayToMakeChange(11));
    }
    // Count the number of ways to make change for a given amount of money.
    // Hard coded to 1, 5, 10, and 25c cent coins.
    // Example: NumberOfWaysToMakeChange(6) = 2
    // Example: NumberOfWaysToMakeChange(11) = 4
    // Assume that there is one way to make change for zero cents (no coins).
    public static int NumberOfWaysToMakeChange(int cents) {
        // Assume cents is non-negative. 
        if (cents == 0) {
            return 1;
        }
        if (cents < 5) {
            return 1;
        }

        // Game plan: 
        // Constrain ourselves to a subset of the coins available and solve an easier problem.
        // Step one would be "just pennies".

    }
}