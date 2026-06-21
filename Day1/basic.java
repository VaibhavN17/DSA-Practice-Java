public class basic {
    public static void main(String[] args) {
        System.out.println("Basic of Java");

        //Variable Declaration and Initialization

        int a = 10;
        float b = 20.5f;
        char ch = 'A';
        String str = "Hello";

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Character: " + ch);
        System.out.println("String: " + str);


        //Operators

        int x = 10;
        int y = 5;
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));

        //Control Flow Statements

        //1. if

        if(a>b)
        {
            System.out.println("a is greater than b");
        }

        //2. if-else

        if (a>b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

        //3. if-else-if

        if (a>b) {
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a is equal to b");
        }

        //4. switch

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


        //Loops

        //1.for loop 

        for (int i=0; i<5; i++) {
            System.out.println("For Loop: " + i);
        }

        //2. while loop

        int i=0;
        while (i<5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        //3. do-while loop
        do{
            System.out.println("Do-While Loop: " + i);
            i++;
        }while (i<5);
        



    }
}