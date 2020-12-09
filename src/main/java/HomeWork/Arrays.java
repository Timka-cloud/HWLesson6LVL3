package HomeWork;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, };
//        int[] arr3 = createNewArrayAfterLast4(arr);
//        System.out.println(java.util.Arrays.toString(arr3));
//        int[] arr1 = createNewArrayAfterLast4(new int[]{5, 6, 3, 4, 3,5,4,7,8,9});
//        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(check1and4(arr));

    }
    public static int[] createNewArrayAfterLast4(int[] array){
        int[] newArray = null;
        int tempNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                tempNum = array[i];
                newArray = new int[array.length - i - 1];
                for (int j = i + 1, k = 0; j < array.length; j++, k++) {
                    if (array[j] == 4) continue;
                    newArray[k] = array[j];
                }
            }
        }
        try{
            tempNum = 1 / tempNum;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return newArray;
    }

    public static boolean check1and4(int[] arr){

        for (int a : arr) {
            if (a != 1 && a !=4)
                return false;
            if (a == 1)
                return true;
            if (a == 4)
                return true;
        }
        return true;
    }
}
