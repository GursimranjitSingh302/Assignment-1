/**
 * ACS-3913-770 - Assignment 1 F2026
 */

import java.util.Random;
import javax.swing.JOptionPane;

public class PartBDriver{
    public static void main(String[] args){
        PlayerData playerData = new PlayerData();
        HUD hud = new HUD(playerData);
        Achievements achievements = new Achievements(playerData);
        Random random = new Random();

        System.out.println("**************************************");
        System.out.println("***          FITNESS GAME          ***");
        System.out.println("**************************************");
        System.out.println("Fitness: [#         ] 10%");
        System.out.println("Step count: 0");

        while(playerData.getFitness() < 100){
            int activity = random.nextInt(4);
            String item;

            if(activity == 0){
                item = "Lift some weights?";
            }
            else if(activity == 1){
                item = "Go for a run?";
            }
            else if(activity == 2){
                item = "Do a HIIT workout?";
            }
            else{
                item = "Log some steps?";
            }

            int result = JOptionPane.showConfirmDialog(
                null, item, null, JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION){
                if(activity == 0){
                    System.out.println("* Strength session completed *");
                    playerData.performWorkout("Strength");
                }
                else if(activity == 1){
                    System.out.println("* Went for a run *");
                    playerData.performWorkout("Running");
                }
                else if(activity == 2){
                    System.out.println("* High-intensity workout done *");
                    playerData.performWorkout("HIIT");
                }
                else{
                    System.out.println("* 1000 steps logged *");
                    playerData.logSteps();
                }
            }
        }

        System.out.println("*OVERTRAINING WARNING*");
        int finalActivity = random.nextInt(3);
        String finalItem;

        if(finalActivity == 0){
            finalItem = "Lift some weights?";
        }
        else if(finalActivity == 1){
            finalItem = "Go for a run?";
        }
        else{
            finalItem = "Do a HIIT workout?";
        }

        int result = JOptionPane.showConfirmDialog(
            null, finalItem, null, JOptionPane.YES_NO_OPTION);

        if(result == JOptionPane.YES_OPTION){
            if(finalActivity == 0){
                System.out.println("* Strength session completed *");
            }
            else if(finalActivity == 1){
                System.out.println("* Went for a run *");
            }
            else{
                System.out.println("* High-intensity workout done *");
            }
            System.out.println("*** Game over... Overtrained :( ***");
        }
        else{
            System.out.println("Great choice - REST DAY! Enjoy some ice cream :)");
            System.out.println("*** Training complete! ***");
        }
    }
}
