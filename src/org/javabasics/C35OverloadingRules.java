package org.javabasics;

import java.io.IOException;

public class C35OverloadingRules {
}

class Math{
    public void method(int i, String s, float f){}
    public void method(int i, String s){}
    private int method(int i, float f){return 1;}
    public void method(float f, String s) throws IOException{}
}