package A1;

public class Q2 {                            // Question#2
    public static class Student{
        void openRegistrationPage(){
            boolean flag1= false;
            try {
                long coursesOffered[] = new long[1000000000];
            }
            catch(OutOfMemoryError e){
                System.out.println("Registration Period is active!");
                flag1= true;
                System.out.println("Warning: OutOfMemoryException");
            }
            finally{
                if (flag1==false){
                    System.out.println("Registration Period is active!");
                }
            }
        }
    }


    public static void main(String[] args) {
        Student currentStudent= new Student();
        currentStudent.openRegistrationPage();
    }
}
