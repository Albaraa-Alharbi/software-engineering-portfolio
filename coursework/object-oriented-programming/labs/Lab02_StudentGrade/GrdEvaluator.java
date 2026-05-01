public class GrdEvaluator {
    
    public String p(double v) { // p: Process, v: value/score
        String l; // l: letter grade
        
        if (v >= 95) {
            l = "A+";
        } else if (v >= 90) {
            l = "A";
        } else if (v >= 85) {
            l = "B+";
        } else if (v >= 80) {
            l = "B";
        } else if (v >= 75) {
            l = "C+";
        } else if (v >= 70) {
            l = "C";
        } else if (v >= 65) {
            l = "D+";
        } else if (v >= 60) {
            l = "D";
        } else {
            l = "F";
        }
        
        return l;
    }
}