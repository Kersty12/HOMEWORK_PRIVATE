public class TASK2 {
    public static void main(String[] args) {

        String[] letter = {"a", "b", "c", "d"};
        int[] num = {1, 2, 3, 4, 5};
        int i;
        int j;
        for (i = 0; i < letter.length; ++i)
            for (j = 0; j < num.length; ++j) {
                System.out.println(num[j] + letter[i]);

            }
    }
}