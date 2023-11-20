public class TaskX {
    public static void main(String[] args) {
        int stroki = 5;
        int stolbcy = 7;
        int[][] ints = new int[stroki][stolbcy];
        int num = 0;

        for (int i = 0; i < stroki; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < stolbcy; j++) {
                    ints[i][j] = num++;
                }
            } else {
                for (int j = stolbcy - 1; j >= 0; j--) {
                    ints[i][j] = num++;
                }
            }
        }

        for (int[] row : ints) {
            for (int cell : row) {
                System.out.printf(cell + " ");
            }
            System.out.println();
        }
    }
}
