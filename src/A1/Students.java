package A1;
                                    // Question# 4
abstract class Students {
    float course_fee;
    int No_of_courses;
    abstract float Calculate_fee();
}

class NonScholarStudent extends Students
{
    float Calculate_fee(){
        float res;
        res= course_fee*No_of_courses;
        return res;
    }
}

class ScholarStudent extends Students
{
    float Calculate_fee(){
        float res;
        res= course_fee*No_of_courses;
        res=res/2;
        return res;
    }
}

class Main2
{
    public static void main(String[] args)
    {
        Students B= new ScholarStudent();
        B.course_fee= 25000;
        B.No_of_courses= 5;
        float fee=B.Calculate_fee();
        System.out.println(fee);
    }
}
