package mainn;

public class Mainn {

    public static void main(String[] args) {

        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);

        System.out.println("Mia's starting credits: " + mia.getCredits());
        System.out.println("Luis's starting credits: " + luis.getCredits());
        System.out.println("\nMia prints 4 pages: " + mia.printpages(4));
        System.out.println("Mia's credits: " + mia.getCredits());
        System.out.println("\nMia tries to print 7 pages: " + mia.printpages(7));
        System.out.println("Mia's credits: " + mia.getCredits());
        System.out.println("\nMia adds -3 credits: " + mia.addcredits(-3));
        System.out.println("Mia's credits: " + mia.getCredits());
        System.out.println("\nMia adds 4 credits: " + mia.addcredits(4));
        System.out.println("Mia's credits: " + mia.getCredits());
        System.out.println("Luis' credits: " + luis.getCredits());
    }
}

/*prompt I used: 
"Don't write the entire the code for me.
What condition should I check before deducting the print credits???"

What I accepted: 
I accepted the suggestion to check whether the number if pages is positive and 
whether the acc hass enough credits before deducting.

How I checked it: 
I tested the program using the given test inputs that's also clearly confusing but fixed it abit before finalizing it, 
I checked that invalid transactions returned false and that the credits remained unchanged.

 */
