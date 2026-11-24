
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
        
        System.out.println("  \nUPDATES ON ANA'S SCORES");
        System.out.println("Updated to 95 and 101: " + ana.updatescores(95, 101));
        System.out.println("Final Grade: " + ana.getfinalgrade());
        
        System.out.println("\nUpdated to 85 and 101: " + ana.updatescores(95, 101));
        System.out.println("Final Grade: " + ana.getfinalgrade());
    }
    
}
