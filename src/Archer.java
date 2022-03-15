public class Archer extends Player {
    private String bow;

    public Archer(String name, int level, boolean online, String sword) {
        super(name, level, online);
        this.bow = bow;
    }

    public String getBow() {
        return bow;
    }

    public void refillArrows() {
        System.out.println("Arrows Refilled!");
    }
}
