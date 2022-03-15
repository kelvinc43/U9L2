public class Player {
    private String name;
    private int level;
    private boolean online;

    public Player(String name, int level, boolean online) {
        this.name = name;
        this.level = level;
        this.online = online;
    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public boolean isOnline() {
        return online;
    }

    public void levelup() {
        System.out.println("Level up!");
        level++;
    }
    public void logOff() {
        System.out.println("Bye bye!");
    }


}
