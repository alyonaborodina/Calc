//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;



class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Введите строку через пробелы ");
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            System.out.println("Вы ввели " + input);
            try {
                String[] strings = input.split(" ");
                int first = RomToNum(strings[0]);
                String sgn = strings[1];
                int second = RomToNum(strings[2]);
                String cl = calc(first, sgn, second);
                String[] rom = cl.split("");
                char bool = input.charAt(0);
                    if (Character.isDigit(bool) == true)
                        System.out.printf("Полученное значение " + cl);
                    else {
                    if (Integer.parseInt(cl) >= 10) {
                        String s1 = NumToRomT(Integer.parseInt(rom[0]));
                        String s2 = NumToRomU(Integer.parseInt(rom[1]));
                        System.out.printf("Полученное значение " + s1 + s2);
                    } else {
                        String s2 = NumToRomU(Integer.parseInt(rom[0]));
                        System.out.printf("Полученное значение " + s2);
                    }
                }
            } catch (ArithmeticException e)
            {
                System.err.println(e.getMessage());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    static String calc(int frst, String sg, int scnd) {

        int rzlt = 0;

        if ((frst > 0) && (frst <= 10) && (scnd > 0) && (scnd <= 10))
            if (sg.equals("+"))
                rzlt = frst + scnd;
            else if (sg.equals("-"))
                rzlt = frst - scnd;
            else if (sg.equals("*"))
                rzlt = frst * scnd;
            else if (sg.equals("/"))
                rzlt = frst / scnd;
        return String.valueOf(rzlt);


    }

    private static int RomToNum(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return Integer.parseInt(roman);
        }
    }

    private static String NumToRomU(int number) {
        String rtrn = "";
        if (number == 1) {
            rtrn =  "I";
        } else if (number == 2) {
            rtrn =   "II";
        } else if (number == 3) {
            rtrn =   "III";
        } else if (number == 4) {
            rtrn =   "IV";
        } else if (number == 5) {
            rtrn =   "V";
        } else if (number == 6) {
            rtrn =   "VI";
        } else if (number == 7)  {
            rtrn =   "VII";
        } else if (number == 8) {
            rtrn =   "VIII";
        } else if (number == 9) {
            rtrn =   "IX";
        } else if (number == 10) {
            rtrn =   "X";
        } else {
            rtrn = "";
        }
        return rtrn;
    }

    private static String NumToRomT(int number) {
        String rtrn = "";
        if (number == 1) {
            rtrn =  "Х";
        } else if (number == 2) {
            rtrn =   "ХХ";
        } else if (number == 3) {
            rtrn =   "ХХХ";
        } else if (number == 4) {
            rtrn =   "ХL";
        } else if (number == 5) {
            rtrn =   "L";
        } else if (number == 6) {
            rtrn =   "LX";
        } else if (number == 7)  {
            rtrn =   "LXX";
        } else if (number == 8) {
            rtrn =   "LXXX";
        } else if (number == 9) {
            rtrn =   "XC";
        } else {
            rtrn = "";
        }
        return rtrn;
    }
}

