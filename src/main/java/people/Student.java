package people;
public class Student extends Person {

    private int credits;
    public Student(String name, String address){
        super(name,address);
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + " " + getCredits();
    }
    public String getCredits() {
        return "credits" + " " + this.credits;
    }
    public void study() {
        credits++;
    }


}
