/**
 * ACS-3913-770 - Assignment 1 F2026
 */

import java.util.ArrayList;

public class PlayerData implements Subject{
    private int fitness;
    private String workout;
    private int steps;
    private ArrayList<Observer> observers;

    public PlayerData(){
        fitness = 10;
        workout = "";
        steps = 0;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void performWorkout(String workout){
        this.workout = workout;

        if(workout.equals("Strength")){
            fitness += 10;
        }
        else if(workout.equals("Running")){
            fitness += 20;
        }
        else if(workout.equals("HIIT")){
            fitness += 30;
        }

        if(fitness > 100){
            fitness = 100;
        }

        notifyObservers();
    }

    public void logSteps(){
        workout = "Steps";
        steps += 1000;
        notifyObservers();
    }

    public int getFitness(){
        return fitness;
    }

    public String getWorkout(){
        return workout;
    }

    public int getSteps(){
        return steps;
    }
}
