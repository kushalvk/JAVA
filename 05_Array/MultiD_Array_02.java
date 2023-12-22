public class MultiD_Array_02 {
    public static void main(String[] args) {

        int num[][] = new int[3][4]; // 3 row and 4 colmn
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10); // for genrat a random intger number
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
