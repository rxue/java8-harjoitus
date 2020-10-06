package rx.practice.advanced.design.circularreference;

/**
 * Problem: Without a dereference to each other, this will not be able to be collected by garbage collector
 */
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
