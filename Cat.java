package HMWRK1;

public class Cat implements Participant {
    private String name;
    private int maxRun;
    private int maxJump;


    public Cat(String name, int maxRun, int maxJump){
        this.name = name ;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }


    @Override
    public boolean run(int length) {
        return false;
    }

    @Override
    public boolean jump(int height) {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
