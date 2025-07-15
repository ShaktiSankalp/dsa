public class StringBuilders {

       public static void main(String args[]) {

        StringBuilder sb1 = new StringBuilder("Apna College");
     System.out.println(sb1);



    //  StringBuilder sb1 = new StringBuilder("Tony");
    //  //Set Char
    //  System.out.println(sb1.charAt(0));



    // StringBuilder sb = new StringBuilder("Tony");
    //  //Get Char
    //  sb.setCharAt(0, 'P');
    //  System.out.println(sb);




    // StringBuilder sb = new StringBuilder("tony");
    //  //Insert char
    //  sb.insert(0, 'S');
    //  System.out.println(sb);




    // StringBuilder sb = new StringBuilder("tony");
    //  //Insert char
    //  sb.insert(0, 'S');
    //  System.out.println(sb);
    // //delete char
    //  sb.delete(0, 1);
    //  System.out.println(sb);



    // StringBuilder sb = new StringBuilder("Tony");
    //  sb.append(" Stark");
    //  System.out.println(sb); 



     StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;


       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);


       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);
   }

    
}


// Here’s a **Java String Cheat Sheet for Competitive Programming (CP)** – compact, practical, and CP-focused.

// ---

// ## 📄 **Java String Cheat Sheet for CP**

// ---

// ### ✅ **1. Basic String Operations**

// ```java
// String s = "Hello World";
// int len = s.length();
// char ch = s.charAt(0);
// String sub = s.substring(0, 5);  // "Hello"
// ```

// ---

// ### ✅ **2. Input/Output**

// ```java
// Scanner sc = new Scanner(System.in);
// String word = sc.next();         // One word
// String line = sc.nextLine();     // Full line
// ```

// ---

// ### ✅ **3. Concatenation**

// ```java
// String a = "Apna";
// String b = "College";
// String result = a + " " + b;
// ```

// ---

// ### ✅ **4. Comparison**

// ```java
// s1.equals(s2);             // Value comparison
// s1.equalsIgnoreCase(s2);   // Ignore case
// ```

// ❌ Avoid: `s1 == s2` (checks reference, not content)

// ---

// ### ✅ **5. Conversion**

// ```java
// int num = Integer.parseInt("123");
// String str = Integer.toString(123);
// char[] chars = str.toCharArray();
// ```

// ---

// ### ✅ **6. Useful String Methods**

// | Method                | Description                    |
// | --------------------- | ------------------------------ |
// | `s.contains("abc")`   | Check if substring exists      |
// | `s.indexOf('a')`      | First occurrence               |
// | `s.lastIndexOf('a')`  | Last occurrence                |
// | `s.toLowerCase()`     | Convert to lowercase           |
// | `s.toUpperCase()`     | Convert to uppercase           |
// | `s.trim()`            | Remove leading/trailing spaces |
// | `s.replace("a", "b")` | Replace substring              |
// | `s.split(" ")`        | Split into array               |


// public class StringMethodsExample {
//     public static void main(String[] args) {
//         String s = "   Abc aBc abc  ";

//         // Check for a substring
//         System.out.println("Contains 'abc'? " + s.contains("abc"));   // true

//         // Index of first and last occurrence of 'a'
//         System.out.println("Index of first 'a': " + s.indexOf('a'));      // Could be index 4 if we consider the spaces; depends on content
//         System.out.println("Index of last 'a': " + s.lastIndexOf('a'));

//         // Convert to lowercase and uppercase
//         System.out.println("Lowercase: " + s.toLowerCase());
//         System.out.println("Uppercase: " + s.toUpperCase());

//         // Trim the string
//         String trimmed = s.trim();
//         System.out.println("Trimmed: " + trimmed);

//         // Replace characters
//         String replaced = trimmed.replace("a", "b");
//         System.out.println("Replaced: " + replaced);

//         // Split the string by space (using trimmed string to avoid extra empty strings)
//         String[] words = trimmed.split(" ");
//         System.out.print("Words: ");
//         for (String word : words) {
//             System.out.print("[" + word + "] ");
//         }
//         System.out.println();
//     }
// }



// | Method                         | Description                                            |
// | ------------------------------ | ------------------------------------------------------ |
// | `s.length()`                   | Returns the number of characters in the string         |
// | `s.charAt(i)`                  | Returns the character at index `i`                     |
// | `s.substring(start, end)`      | Returns substring from `start` to `end-1`              |
// | `s.equals("text")`             | Compares two strings (case-sensitive)                  |
// | `s.equalsIgnoreCase("text")`   | Compares two strings ignoring case                     |
// | `s.startsWith("prefix")`       | Checks if the string starts with the given prefix      |
// | `s.endsWith("suffix")`         | Checks if the string ends with the given suffix        |
// | `s.replaceAll("regex", "new")` | Replaces all substrings matching regex                 |
// | `s.matches("regex")`           | Returns true if string matches the given regex pattern |
// | `String.valueOf(int/char/etc)` | Converts other types to String                         |
// | `String.join(",", list)`       | Joins multiple strings with delimiter                  |
// | `Arrays.toString(array)`       | Converts array to string for printing                  |
// | `String.format()`              | Formats string with placeholders                       |



// ---

// ### ✅ **7. StringBuilder (for Efficient Modification)**

// ```java
// StringBuilder sb = new StringBuilder("Tony");
// sb.append(" Stark");         // Append
// sb.setCharAt(0, 'P');        // Set char
// sb.insert(1, 'X');           // Insert
// sb.delete(1, 2);             // Delete
// sb.reverse();                // Reverse
// ```

// ---

// ### ✅ **8. Frequency Count (Lowercase Only)**

// ```java
// int[] freq = new int[26];
// for (char c : s.toCharArray()) {
//     freq[c - 'a']++;
// }
// ```

// ---

// ### ✅ **9. Reverse a String**

// ```java
// StringBuilder sb = new StringBuilder(s);
// String reversed = sb.reverse().toString();
// ```

// ---

// ### ✅ **10. Palindrome Check**

// ```java
// public static boolean isPalindrome(String s) {
//     int i = 0, j = s.length() - 1;
//     while (i < j) {
//         if (s.charAt(i++) != s.charAt(j--)) return false;
//     }
//     return true;
// }
// ```

// ---

// ### ✅ **11. Anagram Check (with sorting)**

// ```java
// char[] a = s1.toCharArray();
// char[] b = s2.toCharArray();
// Arrays.sort(a);
// Arrays.sort(b);
// return Arrays.equals(a, b);
// ```

// ---

// ### ✅ **12. Sliding Window (Longest Substring Without Repeat)**

// ```java
// Set<Character> set = new HashSet<>();
// int i = 0, maxLen = 0;
// for (int j = 0; j < s.length(); j++) {
//     while (set.contains(s.charAt(j))) {
//         set.remove(s.charAt(i++));
//     }
//     set.add(s.charAt(j));
//     maxLen = Math.max(maxLen, j - i + 1);
// }
// ```

// ---

// ### ✅ **13. KMP – Prefix Table (LPS Array)**

// ```java
// int[] lps = new int[pattern.length()];
// int len = 0, i = 1;
// while (i < pattern.length()) {
//     if (pattern.charAt(i) == pattern.charAt(len)) {
//         lps[i++] = ++len;
//     } else {
//         if (len != 0) len = lps[len - 1];
//         else lps[i++] = 0;
//     }
// }
// ```

// ---

// ### ✅ **14. Hashing for Substring Matching**

// Use prefix hash arrays or Rabin-Karp (modular hashing).

// ---

// ### ✅ **15. Character Map with HashMap**

// ```java
// Map<Character, Integer> map = new HashMap<>();
// for (char c : s.toCharArray()) {
//     map.put(c, map.getOrDefault(c, 0) + 1);
// }
// ```

// ---

// ### ✅ **16. Trie Node (for prefixes/autocomplete)**

// ```java
// class TrieNode {
//     TrieNode[] children = new TrieNode[26];
//     boolean isEndOfWord;
// }
// ```



// 📌 Java String Methods (Useful in CP)
// Method	Use
// .substring(start, end)	Extracts substring
// .charAt(i)	Gets character at index
// .length()	Gets string length
// .equals(str)	Compares values
// .equalsIgnoreCase(str)	Case-insensitive comparison
// .contains(str)	Checks substring
// .indexOf(c)	First occurrence
// .lastIndexOf(c)	Last occurrence
// .replace(a, b)	Replaces characters
// .split(regex)	Splits string
// .toLowerCase()	Lowercase
// .toUpperCase()	Uppercase
// .trim()	Removes leading/trailing spaces



// 🔹 7. String Matching Algorithms (for Substring Search)
// Naive Approach: Check every substring

// KMP Algorithm: Efficient pattern matching (O(N + M))

// Z-Algorithm: Also O(N + M), used in pattern detection

// Rabin-Karp: Rolling hash-based matching



//  11. Longest Prefix Suffix (LPS Array)
// Used in KMP:

// int[] lps = new int[pattern.length()];
// 🔹 12. Manacher’s Algorithm
// Finds longest palindromic substring in linear time.

// 🔹 13. Tries (Prefix Tree)
// Used in:

// Auto-complete

// Prefix-based queries

// Dictionary matching

// 🔹 14. Minimum Edit Distance / Levenshtein Distance
// DP-based algorithm to compute how many edits (insert/delete/replace) are needed to convert one string to another.

// 🔹 15. Suffix Array & Suffix Tree
// Advanced but powerful tools for:

// Lexicographical ordering

// Longest common substring

// Pattern search

// ---

// Would you like this cheat sheet as a downloadable **PDF or .txt file**? Or want a **set of problems** mapped to each topic here?
