public class Sort {
   public static void main(String[] args) {
       int[] values = {23, 12, 13, 17, 23, 19};
       for (int i = 0; i < values.length; i++) {
           for (int j = 1; j < values.length - i; j++) {
               if (values[j-1] > values[j]) {
                   int t = values[j - 1];
                   values[j - 1] = values[j];
                   values[j] = t;
               }
           }
       }
       for (int i = 0; i < values.length - 1; i++) {
           if (values[i] > values[i + 1]) {
               int t = values[i];
               values[i] = values[i + 1];
               values[i + 1] = t;
           }
       }

           for (int i : values) {
           System.out.println(i);
       }


   }
}
