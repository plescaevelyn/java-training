package code._4_student_effort;

public class codeChallenge2 {
    public static void main(String[] args) {

    }

    static String compute(int number) {
        String value1 = "", value2 = "", value;

        if (number == 0)
            return "*";

        if (divThree(number))
            value1 += "Foo";
        if (divFive(number))
            value1 += "Bar";
        if (divSeven(number))
            value1 += "Qix";

        if (value1 == "")
            value = replaceWithZero(number);
        else
            value = value1 + fooBarQix(number, value2);

        return value;
    }

    static boolean divThree(int number) {
        return number % 3 == 0;
    }

    static boolean divFive(int number) {
        return number % 5 == 0;
    }

    static boolean divSeven(int number) {
        return number % 7 == 0;
    }

    static String fooBarQix(int number, String value) {
        int lastDigit, newNumber = 0;

        while (number != 0) {
            lastDigit = number % 10;

            switch (lastDigit) {
                case 3:
                    value = "Foo" + value;
                    break;
                case 5:
                    value = "Bar" + value;
                    break;
                case 7:
                    value = "Qix" + value;
                    break;
                case 0:
                    value = "*" + value;
                    break;
            }
            number /= 10;
        }
        return value;
    }

    static String replaceWithZero(int number) {
        int digit;
        String newNumber = "";

        while(number != 0) {
            digit = number % 10;
            if (digit == 0)
                newNumber = newNumber + "*";
            else
                newNumber = newNumber + String.valueOf(digit);
            number /= 10;
        }

        return newNumber;
    }
}