/*write a java program to create a class with 3 abstract method and 2 non abstract method, derive the class from child class also create another abstract class to implement by using abstract method of base class in java */

import java.io.*;
abstract class j_006 
{
    abstract void abstractMethod1();
    abstract void abstractMethod2();
    abstract void abstractMethod3();

    void nonAbstractMethod1() 
	{
        System.out.println("This is non-abstract method 1");
    }

    void nonAbstractMethod2() 
	{
        System.out.println("This is non-abstract method 2");
    }
}

class DerivedClass extends j_006  
{
    @Override
    void abstractMethod1() 
	{
        System.out.println("Abstract method 1 implemented in DerivedClass");
    }

    @Override
    void abstractMethod2() 
	{
        System.out.println("Abstract method 2 implemented in DerivedClass");
    }

    @Override
    void abstractMethod3() 
	{
        System.out.println("Abstract method 3 implemented in DerivedClass");
    }
}

// Another abstract class implementing abstract methods of BaseClass
abstract class AnotherAbstractClass extends j_006  
{
    @Override
    void abstractMethod1() 
	{
        System.out.println("Abstract method 1 implemented in AnotherAbstractClass");
    }
}

class ConcreteClass extends AnotherAbstractClass 
{
    @Override
    void abstractMethod2() 
	{
        System.out.println("Abstract method 2 implemented in ConcreteClass");
    }

    @Override
    void abstractMethod3() 
	{
        System.out.println("Abstract method 3 implemented in ConcreteClass");
    }
}

public class Main
{
    public static void main(String[] args) 
	{
        ConcreteClass concreteObj = new ConcreteClass();
        
        concreteObj.abstractMethod1();
        concreteObj.abstractMethod2();
        concreteObj.abstractMethod3();

        concreteObj.nonAbstractMethod1();
        concreteObj.nonAbstractMethod2();
    }
}
