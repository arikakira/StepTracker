public class StepTracker {
    private int goal;
    private int totalSteps;
    private int days;
    private int activeDays;

    public StepTracker(int num) {
        goal = num;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if(days==0) {
            return 0;
        }
        return (double) totalSteps/days;
    }

    public void addDailySteps(int num) {
        days++;
        totalSteps += num;
        if(num >= goal) {
            activeDays++;
        }
    }
}