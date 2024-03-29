package Memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void recoveryMemento(Memento memento) {
        setState(memento.getState());
    }

    public void showState() {
        System.out.println(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
