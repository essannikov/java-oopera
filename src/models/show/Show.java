package models.show;

import models.person.Actor;
import models.person.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirector(){
        System.out.println(director);
    }

    public void printListOfActors() {
        for (Actor actor: listOfActors){
            System.out.println(actor);
        }
    }

    public boolean addActor(Actor newActor){
        if (listOfActors.contains(newActor)){
            System.out.println("ERROR. The actor has already been added");
            return false;
        }

        return listOfActors.add(newActor);
    }

    public boolean changeActor(String oldActorSurname, Actor newActor){
        int indexNewActor = listOfActors.indexOf(newActor);
        if (indexNewActor >= 0){
            System.out.println("ERROR. New actor has already been added");
            return false;
        }

        int countOldActors = 0;
        for (Actor actor: listOfActors){
            if (actor.getSurname().equals(oldActorSurname)){
                listOfActors.remove(actor);
                countOldActors++;
            }
        }
        if (countOldActors < 1){
            System.out.println("ERROR. Old actor not found");
            return false;
        }

        return listOfActors.add(newActor);
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                '}';
    }
}
