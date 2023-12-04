package oop.AccessModifiers;

public class AccessModifier {

    public void publicMethod() { // accessible from any class
        System.out.println("This is a public method.");
    }

    private void privateMethod() { // accessible only within this class
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() { // accessible within the same package and subclasses
        System.out.println("This is a protected method.");
    }

    void defaultMethod() { //(no access modifier specified), accessible within the same package
        System.out.println("This is a default (package-private) method.");
    }
}
