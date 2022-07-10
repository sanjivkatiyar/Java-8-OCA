package org.enthuware.oca.test2;

public class Q55 {
}

class AA{
    int i;
    public AA(int x) { this.i = x; }
}
class B extends AA{
    int j;
    public B(int x, int y) { super(x);  this.j = y; }
    //B(int y ) { super(y*2 ); j = y; }        // ok
    //B(int z ) { this(z, z); }                // ok it will call super(z)
}
