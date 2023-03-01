package Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator("state1");
        originator.showState();
        Caretaker caretaker = new Caretaker(originator.createMemento());
        originator.setState("state2");
        originator.showState();
        originator.recoveryMemento(caretaker.getMemento());
        originator.showState();

    }
}
