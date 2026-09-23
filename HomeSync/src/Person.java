public class Person {
    protected String name;
    protected int age;
    protected int points;
    protected int punishementCounter;



    public Person(String name, int age, int points, int punishementCounter){
    this.name = name;
    this.age = age;
    this.points = points;
    this.punishementCounter = punishementCounter;
    }

    // getters and setters for name, age, points, and punishementCounter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPunishementCounter() {
        return punishementCounter;
    }

    public void setPunishementCounter(int punishementCounter) {
        this.punishementCounter = punishementCounter;
    }

    public void incrementPunishementCounter() {
        this.punishementCounter++;
    }
}
