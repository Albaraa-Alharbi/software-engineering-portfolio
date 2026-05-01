public class GradeCalculator {
    String s_nm; // Student Name
    int s_val;   // Student ID
    double[] d_lst; // Grades List

    public GradeCalculator(String s_nm, int s_val, double[] d_lst) {
        this.s_nm = s_nm;
        this.s_val = s_val;
        this.d_lst = d_lst;
    }

    public double get_res() { // Calculate Average
        double t = 0;
        for (double v : d_lst) {
            t += v;
        }
        return t / d_lst.length;
    }
}