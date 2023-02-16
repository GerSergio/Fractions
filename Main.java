import java.util.Scanner;
class Fraction{
    public int num, den;
    // дробь по умолчанию
    public Fraction(){
        num = 1;
        den = 1;
    }
    //создаем дробь
    public Fraction(int a, int b) throws Exception {
        if (b != 0) {
            num = a;
            den = b;
        } else {
            throw new Exception("На 0 делить нельзя");
        }
    }
    //вывод дроби
    public void vivodFraction(){
        System.out.println(num + "/" + den);
    }
    //сумма
    public void sum(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d + b * c) + "/" + b * d);
    }
    //разность
    public void min(int a, int b, int c, int d) {System.out.println("Результат: " + (a * d - b * c) + "/" + b * d);
    }
    //умножение
    public void multiplication(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * c) + "/" + b * d);
    }
    //деление
    public void division(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d) + "/" + c * b);
    }
}
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // дробь по умолчанию
        Fraction drob1 = new Fraction();
        drob1.vivodFraction();
        //создание дроби
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя:");
        Fraction drob2 = new Fraction(in.nextInt(), in.nextInt());
        drob2.vivodFraction();
        //складывание
        System.out.println("Складывание - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob3 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Fraction drob4 = new Fraction(in.nextInt(), in.nextInt());
        drob3.sum(drob3.num, drob3.den, drob4.num, drob4.den);
        //складывание со значением
        System.out.println("Складывание - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob31 = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob41 = new Fraction();
        System.out.println("Значение по умолчанию: "+ drob41.num + "/"+ drob41.den);
        drob3.sum(drob31.num, drob31.den, drob41.num, drob41.den);
        //вычитание
        System.out.println("Вычитание - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob5 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Fraction drob6 = new Fraction(in.nextInt(), in.nextInt());
        drob5.min(drob5.num, drob5.den, drob6.num, drob6.den);
        //вычитание со значением
        System.out.println("Вычитание - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob51 = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob61 = new Fraction();
        System.out.println("Значение по умолчанию: "+ drob61.num + "/"+ drob61.den);
        drob5.min(drob51.num, drob51.den, drob61.num, drob61.den);
        //умножение
        System.out.println("Умножение - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob7 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Fraction drob8 = new Fraction(in.nextInt(), in.nextInt());
        drob7.multiplication(drob7.num, drob7.den, drob8.num, drob8.den);
        //умножение со значением
        System.out.println("Умножение - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob71 = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob81 = new Fraction();
        System.out.println("Значение по умолчанию: "+ drob81.num + "/"+ drob81.den);
        drob7.multiplication(drob71.num, drob71.den, drob81.num, drob81.den);
        //деление
        System.out.println("Деление - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob9 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Fraction drob10 = new Fraction(in.nextInt(), in.nextInt());
        drob9.division(drob9.num, drob9.den, drob10.num, drob10.den);
        //деление со значением
        System.out.println("Деление - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Fraction drob91 = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob101 = new Fraction();
        System.out.println("Значение по умолчанию: "+ drob91.num + "/"+ drob101.den);
        drob9.division(drob91.num, drob91.den, drob101.num, drob101.den);
    }
}


