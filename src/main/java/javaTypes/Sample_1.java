package javaTypes;


public class Sample_1 {
    //Variables
    int a = 30;
    String b = "bee";
    String gender;

    //methods
    public int add(int p, int q) {
        return p + q;
    }

    //Constructor
    Sample_1(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
//        System.out.println(getDayTye(Days.Friday));
        System.out.println(getDayTye(Days.Monday));
        System.out.println((Status.Confirm));
//        A b = new A.B()

    }

    static String getDayTye(Days day) {
        if (day == Days.Saturday || day == Days.Sunday )
            return "weekend";
        else
            return "weekday";
    }
}

interface Sample_2 {
        //Variables
        public static final int b = 30;
        public static final String x = "name";


        //methods
        public abstract int sub(int z, int q);
        }


        //Constructors cannot be written

enum Days {
            Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday

        }
enum Status{
    Pending,Confirm,Failed,Held
        }


@interface Sample_4 {

        }
class A{
    @Deprecated
    public void myName(){
        System.out.println("Arpu");
    }
class B extends A{

        public void myName(){
            System.out.println("dutt");
        }
}

}
