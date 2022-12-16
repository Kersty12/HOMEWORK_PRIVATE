
public class task3
{
    public static void main(String[] args)
    {
        int N;
        N = 12;
        int k = 1;
        int p = 1;
        N = N + 1;

        System.out.println("Геометрична прогресія for");
        for(int i=1;i<=N;i++)
        {
            p = p * 2;
        }
        int Sn = ((1 - p)/(1 - 2))/2;
        System.out.println("Сума геометрична прогресії="+Sn);
        System.out.println("Останній член геометричної прогресії="+((1+Sn)/2));

        System.out.println("Геометрична прогресія while");
        int k1 = 1;
        int p1 = 1;
        while(k1 <= N)
        {
            p1 = p1 * 2;
            k1++;
        }
        int SnW = ((1 - p1)/(1 - 2))/2;
        System.out.println("Сума геометрична прогресії="+SnW);
        System.out.println("Останній член геометричної прогресії="+((1+SnW)/2));

        System.out.println("Геометрична прогресія do while");
        int k2 = 1;
        int p2 = 1;
        do
        {
            p2 = p2 * 2;
            k2++;
        }while(k2 <= N);
        int SnWD = ((1 - p2)/(1 - 2))/2;
        System.out.println("Сума геометрична прогресії="+SnWD);
        System.out.println("Останній член геометричної прогресії="+((1+SnWD)/2));

        System.out.println("Арифметична прогресія for");
        System.out.println("Члени арифметичної прогресії");
        int n;
        n = 12;
        int SUMn = 0;
        int[] point = new int[(n*2)];
        for(int i=1;i<(n*2);i=i+2)
        {
            point[i] = i;
            System.out.println(point[i]);
            SUMn = SUMn + point[i];
        }
        System.out.println("Сума арефметичної прогресії="+SUMn);

        System.out.println("Арифметична прогресія while");
        System.out.println("Члени арифметичної прогресії");
        int[] pointW = new int[(n*2)];
        pointW[1] = 1;
        int w=1;
        int SUMnW = 1;
        System.out.println(pointW[w]);
        while(w<(n*2)-1)
        {
            w=w+2;
            pointW[w] = w;
            System.out.println(pointW[w]);
            SUMnW = SUMnW + pointW[w];
        }
        System.out.println("Сума арефметичної прогресії="+SUMnW);

        System.out.println("Арифметична прогресія do while");
        System.out.println("Члени арифметичної прогресії");
        int SUMnWD = 1;
        int[] pointWD = new int[(n*2)];
        pointWD[1] = 1;
        int d=1;
        System.out.println(pointW[d]);
        do
        {
            d=d+2;
            pointWD[d] = d;
            System.out.println(pointWD[d]);
            SUMnWD = SUMnWD + pointWD[d];
        }while(d<(n*2)-1);
        System.out.println("Сума арефметичної прогресії="+SUMnWD);
    }
}

import java.util.Scanner;

public class task3
{
    public static int fib(int n)
    {
        int fib0 = 0;
        int fib1 = 1;
        if (n == 0)
            return fib0;
        else if (n == 1)
            return fib1;
        else
            return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть кількість чисел для послідовності Фібоначчі(Наприклад 13):");
        int num = in.nextInt();
        int N = 0;
        System.out.println("Числа Фібоначчі:");
        for (int count = N; count < num; ++count)
        {
            System.out.println(fib(count)+" ");
        }
    }
}
