package oop.AccessModifiers;

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();

        obj.publicMethod(); // This is allowed from any class

        // obj.privateMethod(); // This will cause a compilation error

        obj.protectedMethod(); // This is allowed because we are in the same package

        obj.defaultMethod(); // This is allowed because we are in the same package
    }
}
