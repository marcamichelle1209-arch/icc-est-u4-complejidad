public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int [] array = new int[]{1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array);
        // for normal
        for (int i= 0; i < array.length; i++) {
            System.err.println(array[i]);
        }
        //for each
        for( int i : array){
            System.out.println(i);
        }
    }
}
