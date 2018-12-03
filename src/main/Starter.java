public class Starter {
    public static void main(String[] args) {

        int[] arrayToSort = {5, 6, 4, 1, 6, 7, 3, 8,9,10};

        BubbleSorter bubbleSorter = new BubbleSorter();
        SpecialBubbleSorter specialBubbleSorter = new SpecialBubbleSorter();

        System.out.println(specialBubbleSorter.reverseSortArray(arrayToSort).toString());
    }

}


