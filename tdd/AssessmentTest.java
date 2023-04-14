import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssessmentTest {
    @Test
    public void printHelloWorldTest(){
        assertEquals("Hello World",  Assessment.printHelloWorld());
    }

    @Test
    public void findLargestNumber(){
        int [] numbers = {3, 4, 1, 6, 2};
        assertEquals(4,  Assessment.findSecondLargest(numbers));
    }

    @Test
    public void printSemicolonInSeperateLines(){
        String semicolon = "Semicolon";
        Assessment.printLettersInSeperateLines("Semicolon");
         }

    @Test
    public void printVenturesWithTwoLettersInSeperateLines(){
        String semicolon = "Ventures";
        Assessment.printLettersWithTwoLettersInSeperateLines(semicolon);
    }

    @Test
    public void findNumberOfOcurrenceInString(){
        String semicolon = "mississippi";
        Assessment.findNumberOfOcurrenceInString(semicolon, "s", "i");
    }

    @Test
    public void firstNonRepeatingInteger(){
        int [] num = {4,5,1,2,0,4};
        System.out.println(Assessment.firstNonRepeatingInteger(num));
    }

    @Test
    public void removeDuplicatesInLinkedListTest(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(23);
        numbers.add(22);
        numbers.add(23);
        numbers.add(21);
        int[] result = new int[]{21, 22, 23};
        System.out.println(Assessment.removeDuplicatesInLinkedList(numbers));
    }

}