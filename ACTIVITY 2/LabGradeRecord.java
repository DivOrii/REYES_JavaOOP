package mainact2;

class LabGradeRecord {

    private String studentname;
    private int quizscore;
    private int labscore;

    public LabGradeRecord(String studentname, int quizscore, int labscore) {
        this.studentname = studentname;

        if (quizscore >= 0 && quizscore <= 100) {
            this.quizscore = quizscore;
        } else {
            this.quizscore = 0;
        }

        if (labscore >= 0 && labscore <= 100) {
            this.labscore = labscore;
        } else {
            this.labscore = 0;
        }
    }

    public boolean updatescores(int quizscore, int labscore) {
        if (quizscore < 0 || quizscore > 100 || labscore < 0 || labscore > 100) {
            return false;
        }
        this.quizscore = quizscore;
        this.labscore = labscore;

        return true;

    }

    public double getfinalgrade() {
        return (this.quizscore * 0.40) + (this.labscore * 0.60);
    }

    public boolean ispassing() {
        return getfinalgrade() >= 75.0;
    }

    public String getstudentname() {
        return this.studentname;
    }

}
