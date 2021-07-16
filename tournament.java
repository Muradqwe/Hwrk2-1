package HMWRK1;

public class tournament {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Barsik", 1000,500),
                new Cat( "Gektor", 1100,600),
                new Human("Nikita",1200,700),
                new Human( "Maga", 1500,800),
                new Robot("R2D2",2000,2000),
                new Robot("Samsung", 3000,3000)
        };
    Trap[] traps = {
            new Track(700),
            new Wall(600),
            new Track(1200),
            new Wall(800),
            new Track(1500),
            new Wall(800),

    };
    for (Participant p : participants) {
        for (Trap t : traps){
            if (!t.overcome(p))break;
        }
    }
    }

}
