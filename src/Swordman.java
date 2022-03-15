public class Swordman extends Player {
    private String sword;

    public Swordman(String name, int level, boolean online, String sword) {
        super(name, level, online);
        this.sword = sword;
    }

    public String getSword() {
        return sword;
    }

    public void sharpenSword() {
        System.out.println("Sword Sharpened!");
    }


}
