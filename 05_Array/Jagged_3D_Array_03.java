public class Jagged_3D_Array_03 {
    public static void main(String[] args) {
        int num[][] = new int[3][4];
        // int num[][][] = new int[3][4][5];     // 3D Array

        num[0] = new int[3]; // Jagged array
        num[1] = new int[4];
        num[2] = new int[2];
        
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10); // for genrat a random intger number
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
