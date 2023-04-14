import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

public class Assessment {

    public static String printHelloWorld() {
        System.out.println("Hello World");
        return "Hello World";
    }

    public static int findSecondLargest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                secondLargest= max;
                max = numbers[i];
            }}
        System.out.println(secondLargest);
        return secondLargest;

    }

    public static void printLettersInSeperateLines(String semicolon) {

        for (int i = 0; i <semicolon.length() ; i++) {
            System.out.println(semicolon.charAt(i));}}

    public static void printLettersWithTwoLettersInSeperateLines(String word) {
        int count = 1;
        for (int i = 0; i < word.length(); i+=2) {
            if(count < word.length()){
                System.out.print(word.charAt(i)+""+""+word.charAt(count));
            count+=2;}
            System.out.println();}
    }




    public static void findNumberOfOcurrenceInString(String semicolon, String s, String i) {
        int sCount = 0;
        int iCount = 0;
        int [] ocurrence = new int[2];
        for (int index = 0; index < semicolon.length(); index++) {
            if(semicolon.charAt(index) == 's'){sCount++;
            ocurrence[0] = sCount;}
            else if(semicolon.charAt(index) == 'i'){iCount++;
                ocurrence[1] = sCount;}
        }
        System.out.println(Arrays.toString(ocurrence));


    }

    public static int firstNonRepeatingInteger(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if(num[i] != num[j] && j == num.length-1){
                    return num[i];
                }

            }

        }
        return 0;
    }

    public static LinkedList<Integer> removeDuplicatesInLinkedList(LinkedList<Integer> numbers) {
        TreeSet <Integer> sortedList = new TreeSet<>();
        for (int index = 0; index < numbers.size(); index++) {
            sortedList.add(numbers.get(index));
            numbers.remove(index);
        }
        for (int num: sortedList) {
            numbers.add(num);}
        return numbers;
    }
}
