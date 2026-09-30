package com.rohit.O6_access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // already covered these 2
    @Override
    public String toString() {  // used for string representation
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable { // gets call when garbage collection hits
        super.finalize();
    }

    // we will study more in further hashmap
    @Override
    public int hashCode() {
//        return super.hashCode();  // print random int value
        return num;  // prints num
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,55.7f);
        ObjectDemo obj2 = new ObjectDemo(34,65.2f);

        if(obj == obj2){
            System.out.println("Obj is equal to obj2");
        }

        if(obj.equals(obj2)){
            System.out.println("Obj is equal to obj2");
        }


        System.out.println(obj.getClass().getName());

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

    }

}
