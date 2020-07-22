package com.question.answer.misc;

public class CompilerError {
    public boolean isEven(int x) {
        if(x / 2 == 0) {
            return true;
        }
    }
    public void m(String x) {
        String y = x;
        Obj o = new Obj();
        o.x =y                            // I thaught that mabye this should be y = o.x(); ?
    }
}
