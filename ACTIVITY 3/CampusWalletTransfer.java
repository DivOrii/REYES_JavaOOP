
package mainact3;

class CampusWalletTransfer {
    private String owner;
    private int balance;

    public CampusWalletTransfer(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public CampusWalletTransfer(String owner) {
        this(owner, 0);
    }

    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.balance += amount;
        return true;
    }

    public boolean transferTo(CampusWalletTransfer recipient, int amount) {
        if (recipient == null || recipient == this ||
            amount <= 0 || amount > this.balance) {
            return false;
        }

        this.balance -= amount;
        recipient.balance += amount;

        return true;
    }

    public int getBalance() {
        return this.balance;
    }
}
