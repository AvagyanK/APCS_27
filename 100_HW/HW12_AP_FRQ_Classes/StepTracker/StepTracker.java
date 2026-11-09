import java.util.*;

public class StepTracker{
    private int active;
    private int days;
    private int count;
    private int total;

    public StepTracker(int t){
        active = t;
        days = 0;
        count = 0;
        total= 0;
    }

    public void addDailySteps(int s){
        total = total + s;
        days++;
        if (s >= active){
            count++;
        }
    }

    public int activeDays(){
        return count;
    }

    public double averageSteps(){
        double x = 0.0;
        if(days != 0){
            x = (double)total / days;
        }
        return x; 
    }
}