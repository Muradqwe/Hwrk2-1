package HMWRK1;

public class Track implements Trap {
    private  int lenght;
    public Track(int lenght) { this.lenght = lenght;}

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(this.lenght)) {
            System.out.printf("%s %s run track of % dm.\n", participant.getClass().getSimpleName(), participant.getName(), lenght);

            return true;
        }
        System.out.printf("%s %s haven`t run track of %dm. \n", participant.getClass().getSimpleName(), participant.getName(),lenght);
        return false;

    }

}
