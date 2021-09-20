package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        float a1=(float)a;
        float b1=(float)b;
        if (operation.equals("/"))
            return(a1 / b1);
        if (operation.equals("*"))
            return(a1 * b1);
        if (operation.equals("+"))
            return(a1 + b1);
        else
            return(a1 - b1);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
