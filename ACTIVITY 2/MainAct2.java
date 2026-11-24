
package mainact2;

public class MainAct2 {

    public static void main(String[] args) {
        
        LabGradeRecord ana = new LabGradeRecord("Ana", 80, 90);
        LabGradeRecord ben = new LabGradeRecord("Ben", 101, 85);
        
        System.out.println("  INITIAL GRADES");
        System.out.println(ana.getstudentname() + ": " + ana.getfinalgrade());
        System.out.println("Passed: " + ana.ispassing());
        System.out.println(ben.getstudentname() + ": " + ben.getfinalgrade());
        System.out.println("Passed: " + ben.ispassing());
        
        System.out.println("\n  UPDATES ON ANA'S SCORES");
        System.out.println("Updated to 95 and 101: " + ana.updatescores(95, 101));
        System.out.println("Final Grade: " + ana.getfinalgrade());
        
        System.out.println("\nUpdated to 74 and 75: "+ ana.updatescores(74, 75));
        System.out.println("Final Grade: " + ana.getfinalgrade());
        System.out.println("Passing: " + ana.ispassing());

        System.out.println("\nUpdated to 75 and 75: " + ana.updatescores(75, 75));
        System.out.println("Final Grade: " + ana.getfinalgrade());
        System.out.println("Passing: " + ana.ispassing());

        System.out.println("\n  BEN'S FINAL RECORD");
        System.out.println(ben.getstudentname() + ": "+ ben.getfinalgrade());
        System.out.println("Passing: " + ben.ispassing());
    }
    
}

/*
Why must you validate both new scores before assigning either one?
Both scores must be validated first to prevent only one score from being updated when the other score is invalid. 
This ensures that the old scores remain unchanged whenever an update fails.

*/