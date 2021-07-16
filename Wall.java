package HMWRK1;

public class Wall implements Trap{
    private  int height;
    public Wall(int lenght) { this.height = lenght;}

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(this.height)) {
            System.out.printf("%s %s run track of % dm.\n", participant.getClass().getSimpleName(), participant.getName(), height);

            return true;
        }
        System.out.printf("%s %s haven`t run track of %dm. \n", participant.getClass().getSimpleName(), participant.getName(),height);
        return false;

    }
}
