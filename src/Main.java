import java.util.Random;

public class Main {

    public static int[][] arr = {
        {1,0,0,0,0},
        {0,0,1,1,0},
        {0,1,1,0,0},
        {0,0,0,0,0},
        {1,1,0,0,1},
        {1,1,0,0,1},


    };

    public static void createIsland(int[][] arr) {

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                Random rand = new Random();
//                int x = 0;
//                if (rand.nextInt(2) + 1 == 2)
//                    arr[i][j] = 0;
//                else
//                    arr[i][j] = 1;
//
//            }
//
//
//        }




    }

    public static void printFunction(int[][] arr) {

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();

        }

    }


    public static void countIsland(int[][] arr) {

        int islands = 1;
        //System.out.println(arr.length 5 +" " + arr[1].length 6);

        int k,l=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                  k=i;
                  l=j;
                if (arr[k][l] == 1) {
                    if ( (k  < 4) &&  arr[k + 1][j] == 0) {
                        if ( (l  < 5)  && arr[k][l + 1] == 0) {
                        if ( arr[k+1][l + 1] == 0) {
                            islands++;

                        }
                    }
                }
            }

            }
        }

        System.out.println("island count = "+ islands);

    }


    public static void main(String[] args) {

        createIsland(arr);
        printFunction(arr);
        countIsland(arr);

    }
}
