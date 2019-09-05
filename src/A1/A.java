package A1;
                                  // Question# 3
class A {
    protected void DoThis(){
        System.out.println("Registration Period is active!");
    }
    private void DoThat(){
        System.out.println("Registration Period is active!");
    }
}

class B extends A
{
    public void Test(){
        A obj= new A();
        obj.DoThis(); //We can also call DoThis() without creating an instance of A here.
    }
}

class Main1{
            public static void main(String[] args){
                B obj1= new B();
                obj1.Test();
        }
}
