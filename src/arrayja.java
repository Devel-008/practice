public class arrayja {
    public static void main(String[] args) {
        //int[] a=new int[5];
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~`1-D ARRAY
        /*int[] a = {2, 23, 43, 554, 5};
        System.out.println("~~`for lop!!!!!!");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        System.out.println("~~using for each loop!!!!!!!");
        for (int j : a)
            System.out.println(j);*/
        //~~~~~~~~~~~~~~~2 DIMENSIONAL ARRAY~~~~~~~~~~~~~~~~~~

        int [][] a=new int[2][3];
        a[0][0]=1;
        a[0][1]=11;
        a[0][2]=111;
        a[1][0]=2;
        a[1][1]=22;
        a[1][2]=222;
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
