public class BasicJavaTest {
    public static void main(String[] args) throws Exception {
        BasicJava java = new BasicJava();
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {-1,-2,-3,-4,-5,-6,-7};
        java.oneTo255();
        java.oneTo255Odd();
        System.out.println(java.sumTo255());
        System.out.println("------End-------");
        java.arrayIterate();
        java.printMaxValue(a);
        java.oddArray();
    }
}
