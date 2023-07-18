//ROTATED HALF PYRAMID

package JAVA.PATTERNS;

    
    public class pattern5 {
        public static void main(String[] args) {
            int a = 5;
    
            //OUTER LOOP--------------------------->
            for (int i = 1; i <= a; i++) {

                //INNER LOOP SPACE PRINT---------------------->
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }

                //INNER LOOP PRINT------------------------>

                for(int j=1;j<=i;j++){

                    System.out.print("*");
                }

            System.out.println();
            }
        }
    }

//     public class Pattern5 {
//     public static void main(String[] args) {
//         int a = 5;

//         // OUTER LOOP --------------------------->
//         for (int i = 1; i <= a; i++) {

//             // INNER LOOP SPACE PRINT ---------------------->
//             for (int j = 1; j <= a - i; j++) {
//                 System.out.print(" ");
//             }

//             // INNER LOOP PRINT ------------------------>

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

    
