import models.enums.Gender;
import models.person.Actor;
import models.person.Director;
import models.person.Person;
import models.show.Ballet;
import models.show.Opera;
import models.show.Show;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor firstActor = new Actor("Matthew", "McConaughey", Gender.MALE, 182);
        Actor secondActor = new Actor("Charles", "Hunnam", Gender.MALE, 183);
        Actor thirdActor = new Actor("Scarlett", "Johansson", Gender.FEMALE, 160);

        Director firstDirector = new Director("Guy", "Ritchie", Gender.MALE, 10);
        Director secondDirector = new Director("Christopher", "Nolan", Gender.MALE, 12);

        Person musicAuthor = new Person("Hans", "Zimmer", Gender.MALE);

        Person choreographer = new Person("Ryan", "Heffington", Gender.MALE);


        Show firstShow = new Show("The Gentlemen", 90, firstDirector, new ArrayList<>());
        firstShow.addActor(firstActor);
        firstShow.addActor(secondActor);

        Opera secondShow = new Opera("The Avengers", 85, secondDirector, new ArrayList<>(), musicAuthor, "Example libretto", 50);
        secondShow.addActor(secondActor);
        secondShow.addActor(thirdActor);

        Ballet thirdShow = new Ballet("Swan Lake", 100, secondDirector, new ArrayList<>(), musicAuthor, "Example libretto text", choreographer);
        thirdShow.addActor(firstActor);
        thirdShow.addActor(secondActor);
        thirdShow.addActor(thirdActor);


        System.out.println("Для каждого спектакля выведите на экран список актёров.");
        System.out.println(firstShow);
        firstShow.printListOfActors();
        System.out.println();

        System.out.println(secondShow);
        secondShow.printListOfActors();
        System.out.println();

        System.out.println(thirdShow);
        thirdShow.printListOfActors();
        System.out.println();

        System.out.println("Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.");
        firstShow.changeActor(firstActor, thirdActor);
        System.out.println(firstShow);
        firstShow.printListOfActors();
        System.out.println();

        System.out.println("Попробуйте заменить в другом спектакле несуществующего актёра.");
        secondShow.changeActor(new Actor("Alex", "Petrov", Gender.MALE, 175), firstActor);
        System.out.println();

        System.out.println("Для оперного и балетного спектакля выведите на экран текст либретто.");
        System.out.println(secondShow);
        secondShow.printLibrettoText();
        System.out.println();

        System.out.println(thirdShow);
        thirdShow.printLibrettoText();
        System.out.println();
    }
}
