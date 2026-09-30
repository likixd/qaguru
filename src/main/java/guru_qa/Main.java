package guru_qa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 5;
        int b = 2;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        //1) применить несколько арифметических операций над int и double в одном выражении
        int c = 3;
        double d = 3.3;
        System.out.println("c+d="+(c+d));
        System.out.println("c-d="+(c-d));

        //2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println(a>b);
        System.out.println(c<=a);
        System.out.println(d==b);
        if (a<b){
            System.out.println("a<b");
        }else
            System.out.println("a>=b");

        //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // (какие максимальные и минимальные значения есть, как их получить) и переполнение
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("float: min =" + minFloat +" max="+ maxFloat);
        System.out.println("double: min =" + minDouble +" max="+ maxDouble);


        //4) получить переполнение при арифметической операции
        System.out.println(minFloat/10000);
        System.out.println(maxFloat*109);

    }
}
