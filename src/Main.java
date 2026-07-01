//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String reverseString(String toReverse){

        if(toReverse.isEmpty())
            return "";

        Stacks<Character> stacklist = new Stacks<>();

        for(char c : toReverse.toCharArray()){
            stacklist.push(c);
        }

        StringBuilder result = new StringBuilder();

        while(!stacklist.isEmpty()){
            result.append(stacklist.pop());
        }

        return result.toString();
    }

    public static boolean isBalancedParentheses(String toCheck)
    {
        if(toCheck.isEmpty()) return true;
        Stacks<Character> stackList = new Stacks<>();
        for(char c : toCheck.toCharArray())
        {
            if(c == '(')
            {
                stackList.push(c);
            }
            else if(c == ')')
            {
                if(stackList.isEmpty())
                {
                    return false;
                }
                stackList.pop();
            }
        }

        return stackList.isEmpty();
    }

    public static void reverseStringTest()
    {
        // Explain purpose
        System.out.println("These tests confirm reverseString works");
        System.out.println("for normal words, empty strings,");
        System.out.println("single characters, palindromes, and");
        System.out.println("strings with spaces and symbols.");
        System.out.println();

        // Test 1: Normal word
        System.out.println("Test 1: Normal Word");
        System.out.println("Input: 'hello'");
        System.out.println("Expected: 'olleh'");
        System.out.println("Actual: '" + reverseString("hello") + "'");
        System.out.println();

        // Test 2: Empty string
        System.out.println("Test 2: Empty String");
        System.out.println("Input: ''");
        System.out.println("Expected: ''");
        System.out.println("Actual: '" + reverseString("") + "'");
        System.out.println();

        // Test 3: Single character
        System.out.println("Test 3: Single Character");
        System.out.println("Input: 'A'");
        System.out.println("Expected: 'A'");
        System.out.println("Actual: '" + reverseString("A") + "'");
        System.out.println();

        // Test 4: Palindrome
        System.out.println("Test 4: Palindrome");
        System.out.println("Input: 'madam'");
        System.out.println("Expected: 'madam'");
        System.out.println("Actual: '" + reverseString("madam") + "'");
        System.out.println();

        // Test 5: Spaces and symbols
        System.out.println("Test 5: Spaces and Symbols");
        System.out.println("Input: 'abc !'");
        System.out.println("Expected: '! cba'");
        System.out.println("Actual: '" + reverseString("abc !") + "'");
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm reverseString works
            for normal words, empty strings,
            single characters, palindromes, and
            strings with spaces and symbols.

            Test 1: Normal Word
            Input: 'hello'
            Expected: 'olleh'
            Actual: 'olleh'

            Test 2: Empty String
            Input: ''
            Expected: ''
            Actual: ''

            Test 3: Single Character
            Input: 'A'
            Expected: 'A'
            Actual: 'A'

            Test 4: Palindrome
            Input: 'madam'
            Expected: 'madam'
            Actual: 'madam'

            Test 5: Spaces and Symbols
            Input: 'abc !'
            Expected: '! cba'
            Actual: '! cba'
        */
    }

    public static void isBalancedParenthesesTest(){
        System.out.println("These tests confirm isBalancedParentheses");
        System.out.println("works for empty strings, simple pairs,");
        System.out.println("nested parentheses, and unbalanced cases.");
        System.out.println();

        // Test 1
        System.out.println("Test 1: Empty String");
        System.out.println("Input: ''");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses(""));
        System.out.println();

        // Test 2
        System.out.println("Test 2: Single Pair");
        System.out.println("Input: '()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()"));
        System.out.println();

        // Test 3
        System.out.println("Test 3: Missing Open");
        System.out.println("Input: ')'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses(")"));
        System.out.println();

        // Test 4
        System.out.println("Test 4: Missing Close");
        System.out.println("Input: '('");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("("));
        System.out.println();

        // Test 5
        System.out.println("Test 5: Multiple Pairs");
        System.out.println("Input: '()()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()()"));
        System.out.println();

        // Test 6
        System.out.println("Test 6: Nested Balanced");
        System.out.println("Input: '(())'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("(())"));
        System.out.println();

        // Test 7
        System.out.println("Test 7: Nested Unbalanced");
        System.out.println("Input: '(()'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("(()"));
        System.out.println();

        // Test 8
        System.out.println("Test 8: Complex Balanced");
        System.out.println("Input: '(()())()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("(()())()"));
        System.out.println();

        // Test 9
        System.out.println("Test 9: Complex Unbalanced");
        System.out.println("Input: '())(()'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("())(()"));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm isBalancedParentheses
            works for empty strings, simple pairs,
            nested parentheses, and unbalanced cases.

            Test 1: Empty String
            Input: ''
            Expected: true
            Actual: true

            Test 2: Single Pair
            Input: '()'
            Expected: true
            Actual: true

            Test 3: Missing Open
            Input: ')'
            Expected: false
            Actual: false

            Test 4: Missing Close
            Input: '('
            Expected: false
            Actual: false

            Test 5: Multiple Pairs
            Input: '()()'
            Expected: true
            Actual: true

            Test 6: Nested Balanced
            Input: '(())'
            Expected: true
            Actual: true

            Test 7: Nested Unbalanced
            Input: '(()'
            Expected: false
            Actual: false

            Test 8: Complex Balanced
            Input: '(()())()'
            Expected: true
            Actual: true

            Test 9: Complex Unbalanced
            Input: '())(()'
            Expected: false
            Actual: false
        */
    }

    public static void main(String[] args) {
        System.out.println("********************* reverse string test****************");
        reverseStringTest();
        System.out.println("********************* Balanced Parentheses test****************");
        isBalancedParenthesesTest();

    }
}