package org.enthuware.oca.test3;

class Game {
    public void play() throws Exception   {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    public void play(String ball)    {
        System.out.println("Playing Soccer with "+ball);
    }
}

public class Q13 {
    public static void main(String[] args) throws Exception  {
        Game g = new Soccer();
        // 1
        Soccer s = (Soccer) g;
        // 2

        // g.play("cosco"); not okay even though the object referred to by g is of class Soccer,
        // the reference type of g is Game, which does not have play(String ) method.
        s.play("cosco"); //at //2
        s.play();
        s.play("cosco");
    }
}