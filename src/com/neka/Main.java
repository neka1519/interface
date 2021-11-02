package com.neka;

/*interface Writer{
    void write();
    //by deafult,
    //public abstract void write();
}

class Pen implements Writer{
    @Override
    public void write() {
        System.out.println("Pen");
    }
}

    class Pencil implements Writer{
@Override
public void write() {
        System.out.println("Pen");
        }
        }

        class Kit{
    public void doSomething(Writer p){
        p.write();
    }
        }



public class Main {

    public static void main(String[] args) {
	Kit k = new Kit();
    Writer p = new Pen();
    Writer pc = new Pencil();
        //you can only create ref of interface not objects

    k.doSomething(pc);
    }
}
/*
You can't implement multiple inheritance
you use interface for that--->implements
use "interface" ---> implements
class Pen extends Abc implements Writer
In interface, you can't define any methods ---> only declare them
By default, its "public abstract" void methodName(){}
 */

/*
Df/bt abs and interface is that, you can't define method in interface.
In abstarct you can.
 */

//IRL , we use interface so that methods can be declared from product manager
// and you have to just define those methods as a developer

interface Abc{
    void show();
}

class test implements Abc{
    public void show(){
        System.out.println("Here we are defining the method. In interface the method is called");
    }
}

public class Main {

    public static void main(String[] args) {
Abc obj = new test(); //test obj = new test();
obj.show();
    }
}
