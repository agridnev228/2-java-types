package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int resn=n%k;
        int resm=m%k;
        n-=resn;
        m-=resm;
        long ln=n;
        long lm=m;
        long res=(ln*lm);
        res=res/(long)(k*k);
        return (int)res;

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1000000, 1000000, 50);
        System.out.println(result);

    }

}
