import java.util.LinkedList;
import java.util.List;

public class Main {

    /*

     Cracking the Coding Interview - Linked Lists

     2.6 - Palindrome:
     Implement a function to check if a linked list is a palindrome.

    */

    public static void main(String[] args) {
        List<Character> list1 = new LinkedList<>();
        List<Character> list2 = new LinkedList<>();
        List<Character> list3 = new LinkedList<>();
        list1.add('h');
        list1.add('e');
        list1.add('l');
        list1.add('l');
        list1.add('o');
        System.out.println(isPalindrome(list1));
        list2.add('m');
        list2.add('a');
        list2.add('d');
        list2.add('a');
        list2.add('m');
        System.out.println(isPalindrome(list2));
        list3.add('n');
        list3.add('u');
        list3.add('r');
        list3.add('s');
        list3.add('e');
        list3.add('s');
        list3.add(' ');
        list3.add('r');
        list3.add('u');
        list3.add('n');
        System.out.println(isPalindrome(list3));
    }

    public static boolean isPalindrome(List<Character> list) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        for (Character character : list) {
            if (character != ' ') {
                string1.append(character);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != ' ') {
                string2.append(list.get(i));
            }
        }
        return string1.toString().equals(string2.toString());
    }
}
