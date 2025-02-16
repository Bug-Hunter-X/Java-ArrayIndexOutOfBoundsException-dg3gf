public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // Check index before accessing array element
        if(0 <= 4 && 4 < arr.length){
            arr[4] = 10; 
        }else{
            System.out.println("Index out of bound");
        }
        System.out.println(arr[4]);
    }
}