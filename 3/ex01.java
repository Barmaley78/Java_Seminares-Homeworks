// для чисел a b c d определить количество маршрутов преобразования числа a в число b 
// прибавлением числа c и умножением на число d

// ввод данных
// проверка а и б на больших
// проверка разницы а и б с ц и д на возможность получения маршрутов
// критерий остановки 

public class ex01 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2222;
        int c = 5;
        int d = 10;
        System.out.println(FindWay(a, b, c, d));

        //System.out.println(Reduct(a, b, opC, opD));
    }
    // public static int Reduct(int a, int b, int opC, int opD) {
    //     // int laC = 0;
    //     // int laD = 0;
    //     if (a > b) return 0;
    //     else 
    //         if (a == b) return 1;
    //             else
    //                 if (a < b) {
    //                     // laC = 
    //                     // laD = ;
    //                     return Reduct(a + opC, b, opC, opD)+ Reduct(a * opD, b, opC, opD);
    //                 }
    // }
    public static int FindWay(int a, int b, int c, int d) {
        int[] way = new int[b + 1];
        way[a] = 1;
        for (int i = a + c; i <= b; i++) {
            //way[i] = i % d == 0? way[i - 1] + way[i / d] : way[i -c]; закоменченая строка аналог if
            if (i % d == 0)
                way[i] = way[i - 1] + way[i / d];
            else
                way[i] = way[i -c];
        }
        return (way[b]);
    }        
}

