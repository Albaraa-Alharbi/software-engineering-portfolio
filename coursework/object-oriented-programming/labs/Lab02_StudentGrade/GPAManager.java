public class GPAManager {
    double[] g_lst; // Grades list (points: 4.0, 3.5, etc.)
    int[] c_hrs;    // Credit hours list

    public GPAManager(double[] g, int[] c) {
        this.g_lst = g;
        this.c_hrs = c;
    }

    public double calc_final() { 
        double t_p = 0; // Total quality points
        int t_h = 0;   // Total credit hours
        
        for (int i = 0; i < g_lst.length; i++) {
            t_p += g_lst[i] * c_hrs[i];
            t_h += c_hrs[i];
        }
        
        if (t_h == 0) return 0;
        
        return t_p / t_h;
    }
}