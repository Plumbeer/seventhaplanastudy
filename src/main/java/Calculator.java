import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println ("Калькулятор запущен. \nВведите первое число: ");
        Scanner Digit = new Scanner(System.in);

        //Считываем первое значение введённое пользователем в переменную "firstUserNum"
        double firstUserNum = Digit.nextDouble();
        System.out.println ("Введите второе число: ");
        //Считываем второе значение введённое пользователем в переменную "secondUserNum"
        double secondUserNum = Digit.nextDouble();

        System.out.println("Введите одно из четырёх арифметических действий (+,-,/,*): ");
        //Считываем арифметическое действие введённое пользователем в переменную "arithOp"
        String userArithOp = Digit.next();

        String plusMob = "+";
        String minusMob = "-";
        String umnozMob = "*";
        String delenMob = "/";



        if (userArithOp.equals(plusMob)) {
            //Вычисляем сумму чисел
            Addition summa = new Addition();
            summa.addition(firstUserNum, secondUserNum);
        }
        else {
            if (userArithOp.equals(minusMob)) {
                //Вычисляем разность чисел
                Division raznost = new Division();
                raznost.division(firstUserNum, secondUserNum);
            }
            else {
                if (userArithOp.equals(umnozMob)) {
                    //Вычисляем произведение чисел
                    Multiplication proizved = new Multiplication();
                    proizved.multiplic(firstUserNum, secondUserNum);
                } else {
                    if (userArithOp.equals(delenMob)) {
                        //Вычисляем частное чисел
                        Substraction delenie = new Substraction();
                        delenie.substract(firstUserNum, secondUserNum);
                    }
                    else {
                        System.out.print("Введены некорректные данные");
                    }
                }
            }
        }
    }
}
