/**
 * ACS-3913-770 - Assignment 1 F2026
 */

public class Achievements implements Observer{
    private PlayerData playerData;
    private boolean metconAwarded;
    private boolean peakAwarded;
    private boolean stepGoalAwarded;

    public Achievements(PlayerData playerData){
        this.playerData = playerData;
        metconAwarded = false;
        peakAwarded = false;
        stepGoalAwarded = false;
        playerData.registerObserver(this);
    }

    public void update(){
        if(!metconAwarded && playerData.getWorkout().equals("HIIT")){
            metconAwarded = true;
            System.out.println("*** Achievement unlocked: Metcon Machine! ***");
        }

        if(!peakAwarded && playerData.getFitness() == 100){
            peakAwarded = true;
            System.out.println("*** Achievement unlocked: Peak Fitness! ***");
        }

        if(!stepGoalAwarded && playerData.getSteps() >= 10000){
            stepGoalAwarded = true;
            System.out.println("*** Achievement unlocked: Step Goal Reached! ***");
        }
    }
}
