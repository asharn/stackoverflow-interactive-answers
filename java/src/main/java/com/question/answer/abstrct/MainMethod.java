package com.question.answer.abstrct;

public class MainMethod {
    public static void main(String[] args){
        Foo foo = new Choco();
        foo.check();//output: Choco class check method:
        //foo = new Bar();// Compilation error
        //foo = new Foo();
        //foo.check();//output: Foo class check method:
        Bar bar = new Choco();
        bar.check();// output: Choco class check method:
        bar.validate();// output: Choco class check method:
    }
}
