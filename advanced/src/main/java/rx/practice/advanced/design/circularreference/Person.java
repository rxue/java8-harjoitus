package rx.practice.advanced.design.circularreference;

public class Person {
    private Person couple;
    public void setCouple(Person couple) {
        this.couple = couple;
        if (couple.couple == null)
            couple.setCouple(this);
    }

    public static void main(String[] args) {
        Person male = new Person();
        Person female = new Person();
        male.setCouple(female);
    }
}
