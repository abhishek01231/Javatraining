package com.healthasyst;
class Parent {
    void show()
    {
        System.out.println("Parent");
    }
}
 
// Parent inherit in Child class
class Child extends Parent {
 
    // override show() of Parent
    void show()
    {
        System.out.println("Child");
    }
}
 
class GFG {
    public static void main(String[] args)
    {
        Parent p = new Parent();
        // calling Parent's show()
        p.show();
 
        Parent c = new Child();
        // calling Child's show()
        c.show();
    }
}