package mainn;

class PrintAccount {

    private String studentname;
    private int credits;

    public PrintAccount(String studentname, int credits) {
        this.studentname = studentname;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    public boolean addcredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    public boolean printpages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }
        
        this.credits -= pages;
        return true;
    }
    
    public int getCredits(){
    return this.credits;
            
    }
    
  
}
