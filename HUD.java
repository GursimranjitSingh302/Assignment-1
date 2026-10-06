/**
 * ACS-3913-770 - Assignment 1 F2026
 */

public class HUD implements Observer{
    private PlayerData playerData;

    public HUD(PlayerData playerData){
        this.playerData = playerData;
        playerData.registerObserver(this);
    }

    public void update(){
        int fitness = playerData.getFitness();
        int filled = fitness / 10;
        String bar = "";

        for(int i = 0; i < 10; i++){
            if(i < filled){
                bar += "#";
            }
            else{
                bar += " ";
            }
        }

        System.out.println("Fitness: [" + bar + "] " + fitness + "%");
        System.out.println("Step count: " + playerData.getSteps());
    }
}
