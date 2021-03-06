package org.javaadvanced;

public class C12GenericInterface {
    public static void main(String[] args) {
        new MoveFeline().move(new Cat());
        new MoveCanine().move(new Dog());
        new SomeMovable<Dog>().move(new Dog());
        new SomeMovable<Cat>().move(new Cat());
    }
}

interface Moveable<T>{
    void move(T t);
}
class MoveFeline implements Moveable<Cat>{
    @Override
    public void move(Cat cat) {}
}
class MoveCanine implements Moveable<Dog>{
    @Override
    public void move(Dog dog) {}
}
class SomeMovable<U> implements Moveable<U>{
    @Override
    public void move(U u) {}
}