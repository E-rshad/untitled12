import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String TheUserInPut;
        boolean flag;
        do {
            System.out.println(
                    "Calculation Of area and circumference of a circle Put A\n\n" +
                            "Convert temperatures from Celsius to Fahrenheit and vice versa Put B.\n\n" +
                            "Assembly result calculation Put C\n\n" +
                            "Calculation of the sum of the natural numbers in the range Put D\n\n" +
                            "Checking whether any number is prime Put E\n\n" +
                            "Checking whether a five-digit number is a palindrome put F\n\n" +
                            "Print prime numbers in a range put G\n\n" +
                            "GCD calculation put H\n\n" +
                            "Calculating the results of a quadratic equation put I\n\n" +
                            "Calculation of compound interest put J\n\n" +
                            "Checking whether a number is part of the Fibonacci series put K\n\n" +
                            "Printing a narcissistic number put L\n\n");
            TheUserInPut = scanner.next();
            if (       !Objects.equals(TheUserInPut, "A")
                    && !Objects.equals(TheUserInPut, "B")
                    && !Objects.equals(TheUserInPut, "C")
                    && !Objects.equals(TheUserInPut, "D")
                    && !Objects.equals(TheUserInPut, "E")
                    && !Objects.equals(TheUserInPut, "F")
                    && !Objects.equals(TheUserInPut, "G")
                    && !Objects.equals(TheUserInPut, "H")
                    && !Objects.equals(TheUserInPut, "I")
                    && !Objects.equals(TheUserInPut, "J")
                    && !Objects.equals(TheUserInPut, "K")
                    && !Objects.equals(TheUserInPut, "L")) {

                flag = true;
                System.out.println("no Return");
            } else {
                flag = false;
                System.out.println("its true");
            }

        } while (flag);

        if (TheUserInPut.equals("A")) {
            int p1 = CalculationOfareaandcircumferenceofacircle();
            System.out.println(p1);

        }
        if (TheUserInPut.equals("B")) {
            int p2 = ConvertTemperaturesFromCelsiusToFahrenheitAndViceVersaice();
            System.out.println();
        }
        if (TheUserInPut.equals("C")) {
            int p3 = AssemblyResultCalculation();
            System.out.println(p3);
        }
        if (TheUserInPut.equals("D")) {
            int p4 = CalculationOfTheSumOfTheNaturalNumbersInTheRange();
            System.out.println(p4);
        }
        if (TheUserInPut.equals("E")) {
            int p5 = CheckingWhetherAnyNumberIsPrime();
            System.out.println(p5);
        }
        if (TheUserInPut.equals("F")) {
            int p6 = IsTheNumberPalindrome();
            System.out.println(p6);
        }
        if (TheUserInPut.equals("G")) {
            int p7 = PrintPrimeNumbersInARange();
            System.out.println(p7);
        }
        if (TheUserInPut.equals("H")) {
            int p8 = GCDCalculator();
            System.out.println(p8);
        }
        if (TheUserInPut.equals("I")) {
            int p9 = CalculatingTheResultsOfAQuadraticEquation();
            System.out.println(p9);
        }
        if (TheUserInPut.equals("J")) {
            int p10 = CalculationOfCompoundInterest();
            System.out.println(p10);
        }
        if (TheUserInPut.equals("K")) {
            int p11 = FibonacciChecker();
            System.out.println(p11);
        }
        if (TheUserInPut.equals("L")) {
            int p12 =  PrintingANarcissisticNumber ();
            System.out.println(p12);
        }

    }

    public static int CalculationOfareaandcircumferenceofacircle() {
        float CircleArea, radius, pi = 3.14f, CircleCircumference;
        System.out.println("Enter the radius");
        Scanner input = new Scanner(System.in);
        radius = input.nextFloat();

        CircleArea = (pi + radius * radius);
        System.out.println("Area circle=" + CircleArea);
        CircleCircumference = (2 * radius * pi);
        System.out.println("CircleCircumference" + CircleCircumference);
        return 0;

    }

    public static int ConvertTemperaturesFromCelsiusToFahrenheitAndViceVersaice() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a temperature base (C for Celsius, F for Fahrenheit):");
        char base = scanner.next().charAt(0);

        System.out.println("choose temperature:");
        double temperature = scanner.nextDouble();

        if (base == 'C' || base == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("temperature in Fahrenheit: " + fahrenheit + " F");
        } else if (base == 'F' || base == 'f') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("temperature in Celsius " + celsius + " C");
        } else {
            System.out.println("Enter a C for Celsius, F for Fahrenheit)");
        }


        return 0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }//שייך ל B

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }//שייך ל B

    public static int AssemblyResultCalculation() {
        System.out.println("Enter the positive number:");
        int Number;
        Scanner input = new Scanner(System.in);
        Number = input.nextInt();
        for (int i = 0; i >= Number; i++) ;
        int sum = Number + Number;
        if (Number > 0) {
            System.out.println("the aggregation is " + sum);
        } else System.out.println("Enter the positive number");
        return Number;
    }

    public static int CalculationOfTheSumOfTheNaturalNumbersInTheRange() {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int end;
        int sum = 0;

        do {
            System.out.print("Enter first number: ");
            firstNumber = scanner.nextInt();
            System.out.print("Enter second number: ");
            end = scanner.nextInt();

            if (firstNumber == end) {
                System.out.println("something wrong try agine .");
            }
        } while (firstNumber == end);

        if (firstNumber > end) {
            int temp = firstNumber;
            firstNumber = end;
            end = temp;
        }

        for (int i = firstNumber; i <= end; i++) {
            sum += i;
        }

        System.out.println(" calculate Sum " + firstNumber + "to " + end + " is " + sum);


        return firstNumber;
    }

    public static int CheckingWhetherAnyNumberIsPrime() {
        System.out.println("Enter the number:");
        int number;
        boolean a = false;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                a = true;
                break;
            }
        }
        if (a == true) {
            System.out.println("The number" + number + "is not prime");
        } else {
            System.out.println("The number" + number + "is prime");
        }

        return number;
    }

    public static int IsTheNumberPalindrome() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter natural number with 5 digits");
            number = scanner.nextInt();
            if (number < 10000 || number > 99999) {
                System.out.println(" wrong the number dose not have 5 digits try agine ");
            }
        } while (number < 10000 || number > 99999);

        if (isPalindrome(number)) {
            System.out.println(number + " the number is Palindrome ");
        } else {
            System.out.println(number + " the number is NOT  Palindrome.");
        }


        return number;
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }


        return false;
    }//שייך F

    public static int PrintPrimeNumbersInARange() {
        System.out.println("Enter the numbers:");
        int p;
        boolean a = false;
        Scanner input = new Scanner(System.in);
        p = input.nextInt();
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                a = true;
                break;
            }
        }

        int p1;
        boolean t = false;
        Scanner input1 = new Scanner(System.in);
        p1 = input.nextInt();
        for (int i = 2; i < p1; i++) {
            if (p1 % i == 0) {
                t = true;
                break;
            }
        }

        int p2;
        boolean s = false;
        Scanner input2 = new Scanner(System.in);
        p2 = input.nextInt();
        for (int i = 2; i < p2; i++) {
            if (p2 % i == 0) {
                s = true;
                break;
            }
        }

        int p3;
        boolean n = false;
        Scanner input3 = new Scanner(System.in);
        p3 = input.nextInt();
        for (int i = 2; i < p3; i++) {
            if (p3 % i == 0) {
                n = true;
                break;
            }
        }

        int p4;
        boolean f = false;
        Scanner input4 = new Scanner(System.in);
        p4 = input.nextInt();
        for (int i = 2; i < p4; i++) {
            if (p4 % i == 0) {
                f = true;
                break;
            }
        }

        int p5;
        boolean r = false;
        Scanner input5 = new Scanner(System.in);
        p5 = input.nextInt();
        for (int i = 2; i < p5; i++) {
            if (p5 % i == 0) {
                r = true;
                break;
            }
        }

        int p6;
        boolean l = false;
        Scanner input6 = new Scanner(System.in);
        p6 = input.nextInt();
        for (int i = 2; i < p6; i++) {
            if (p6 % i == 0) {
                l = true;
                break;
            }
        }

        if (a == true) {
        } else {
            System.out.println("The prime number is" + p);
        }
        if (t == true) {
        } else {
            System.out.println("The prime number is" + p1);
        }
        if (s == true) {
        } else {
            System.out.println("The prime number is" + p2);
        }
        if (n == true) {
        } else {
            System.out.println("The  prime number is" + p3);
        }
        if (f == true) {
        } else {
            System.out.println("The  prime number is" + p4);
        }
        if (r == true) {
        } else {
            System.out.println("The  prime number is" + p5);
        }
        if (l == true) {
        } else {
            System.out.println("The  prime number is" + p6);
        }

        System.out.println("ifyou didn't get any thing this means no prime numbers");

        return p;
    }


    public static int GCDCalculator() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


        int gcd = findGCD(num1, num2);
        System.out.println("the GCD " + num1 + " and" + num2 + " is " + gcd);
        return num1;
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }//שייךH

    public static int CalculatingTheResultsOfAQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a b c of the ax^2 + bx + c = 0:");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("do NOT have answers.");
        } else if (discriminant == 0) {
            double solution = -b / (2 * a);
            System.out.println ("the answer for x is :" + solution);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("there is tow answers :");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        }


        return 0;
    }


    public static int CalculationOfCompoundInterest(){
        Scanner scanner = new Scanner(System.in);

        // קליטת הקלט מהמשתמש
        System.out.print("נא הכנס את סכום ההשקעה הראשוני: ");
        double theNum = scanner.nextDouble();

        System.out.print("נא הכנס את ריבית החודשית הרגילה באחוזים: ");
        double monthlyInterestRate = scanner.nextDouble() / 100; // המרת אחוזים לשבר מספרי

        // סימולציה של סכום ההשקעה לפי מספר חודשים
        int[] months = {3, 6, 9, 12, 24, 36};
        for (int i = 0; i < months.length ; i++) {        // 5* 2 = 10
            int theMonth = months[i];                     // 10 * 3 = 30
            double currentInvestment = theNum;
            for (int j = 0; j < theMonth; j++) {
                currentInvestment *= (1 + monthlyInterestRate);
            }
            if (theMonth % 12 == 0) { // אם מספר החודשים הוא שנה מלאה
                System.out.printf("לאחר %d חודשים תקבלו סכום של: %.2f%n", theMonth, currentInvestment);
            } else { // אם מספר החודשים אינו שנה מלאה
                double profit = currentInvestment - theNum;
                currentInvestment -= profit / 2; // קיזוז 50% מהרווח
                System.out.printf("לאחר %d חודשים תקבלו סכום של: %.2f (חסכתם %.2f)%n", theMonth, currentInvestment, profit / 2);
            }
        }

        scanner.close(); // סגירת הסורק

        return 0;
    }

    public static int FibonacciChecker(){    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " It is a part of Fibonacci");
        } else {
            System.out.println(number + " It NOT is a part of Fibonacci");
        }
        return number;
    }

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }


    public static int PrintingANarcissisticNumber(){
        int n=20,firseNum=0,secandNum=1;
        int nextNum;

        for (int i=1;i<=n;i++){
            System.out.println(firseNum + ", ");
            nextNum=firseNum+secandNum;
            firseNum=secandNum;
            secandNum=nextNum;
        }
        return n;
    }

}
