
package mainact3;

public class MainAct3 {

  
    public static void main(String[] args) {
       CampusWalletTransfer aly = new CampusWalletTransfer("Aly", 100);
        CampusWalletTransfer ben = new CampusWalletTransfer("Ben");

        System.out.println("INITIAL BALANCES");
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nWALLET TRANSFERS");

        System.out.println("Aly transfers 35 credits to Ben: "
            + aly.transferTo(ben, 35));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nAly transfers 70 credits to Ben: "
            + aly.transferTo(ben, 70));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nAly transfers 10 credits to herself: "
            + aly.transferTo(aly, 10));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nDEPOSIT ");

        System.out.println("Ben deposits 15 credits: "
            + ben.deposit(15));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nFINAL TRANSFER ");

        System.out.println("Aly transfers 65 credits to Ben: "
            + aly.transferTo(ben, 65));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nADDITIONAL TESTS");

        System.out.println("Expected result for zero-credit transfer: false");
        System.out.println("Actual result: " + aly.transferTo(ben, 0));

        System.out.println("\nExpected result for null recipient: false");
        System.out.println("Actual result: " + ben.transferTo(null, 10));

        System.out.println("\nFINAL BALANCES");
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());
    }
}