public class ArrayTest {

    public static void main(String[] args) {

        int[][] tabOne = {{1,2,3},{3,4,5}};
        int[][] tabTwo = {{1,2,3},{3,4,5}};

        ArrayComparator comparator = new ArrayComparator();

        System.out.println(comparator.comp(tabOne,tabTwo));



    }
}
