import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int userChoice=0,firstNumber=0,secondNumber=0;

        while (userChoice!=Constants.EXIT){
        System.out.println("welcome to the CALCULATOR, please choose one of the following options: ");
        System.out.println("0.sum\n1.duplicating\n2.dividing\n3.root\n4.power\n5.exit ");
        userChoice=scanner.nextInt();
        while (invalidInput(userChoice)){
            System.out.println("your input isn't valid, please enter numbers between 0-4 only ");
            userChoice=scanner.nextInt();
        }
        if (!(invalidInput(userChoice)) && userChoice!=5){
            System.out.println("please choose 2 numbers ");
            firstNumber=scanner.nextInt();
            secondNumber=scanner.nextInt();
        }
        switch (userChoice){
            case Constants.ADDITION:
                System.out.println(firstNumber + " + " +secondNumber +" = " + addNumbers(firstNumber,secondNumber));
                break;
            case Constants.DOUBLE:
                System.out.println(firstNumber + " * "+secondNumber +" = " +duplicateNumber(firstNumber,secondNumber));
                break;
            case Constants.DIVIDE:
                System.out.println(firstNumber +" /  "+secondNumber + " = "+divideNumbers(firstNumber,secondNumber));
                break;
            case Constants.ROOT:
                System.out.println(firstNumber+" ^ " +"1/"+secondNumber + " = "+returnRoot(firstNumber,secondNumber));
                break;
            case Constants.POWER:
                System.out.println(firstNumber + " ^ "+secondNumber+" = " + returnPower(firstNumber,secondNumber));
                break;
            case Constants.EXIT:
                System.out.println("goodbye!!");
                break;





        }

    }
    }

    public static int addNumbers(int first,int second){
        return first+second;

    }
    public static int duplicateNumber(int first, int second){
        return first*second;

    }
    public static double divideNumbers(double first,double second){
       double result=0;
        try {
            result= first/second;

        }catch (ArithmeticException  e){
            System.out.println("you can't divide 0 ");
        }
        return result;
    }
    public static double returnRoot(double first,double second){
        double root= 1/second;//1/2
         double result=Math.pow(first,root);
        return result;

    }
    public static double returnPower(int first,int second){
        double result= Math.pow(first,second);

        return result;
    }
    public static boolean invalidInput(int userInput){
        return userInput < 0 || userInput > 5;

    }

}
