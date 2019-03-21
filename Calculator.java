public class Calculator {
    //inside the class - outside the method with static keyword
    static int a = 20; //static /class variable
    static int b = 10;

    //this method will perform addition
    static void add(){// no return type no argument user defined method

        System.out.println(a+b);
    }
    //this method will perform subtraction
    static void sub( ){
        System.out.println(a-b);
    }
    //this mesthod will perform multiplication
    static void multi(){
        System.out.println(a*b);
    }
      //This method will perform division
    static void div(){
        System.out.println(a/b);
    }
public static void main(String[] args){
        sub();
        add();
        multi();
        div();
}

}


