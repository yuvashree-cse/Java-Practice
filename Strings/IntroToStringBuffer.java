public class Main {
  
    public static void main(String[] args) {
    
        // Create a new StringBuilder
        // String sb = "GITAM";
        
        StringBuffer sb = new StringBuffer("Gitam");
        System.out.println("Initial StringBuilder: " + sb);

        // 1. Append a string to the StringBuilder
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        // 2. Insert a substring at a specific position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // 3. Replace a substring with another string
        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        // 4. Delete a substring from the StringBuilder
        sb.delete(0, 11);
        System.out.println("After delete: " + sb);

        // 5. Reverse the content of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);


        // 6. Get the length of the StringBuilder
        int length = sb.length();
        System.out.println("Current length: " + length);

        // 7. Access a character at a specific index
        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // 8. Set a character at a specific index
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        // 9. Get a substring from the StringBuilder
        String substring = sb.substring(5, 10);
        System.out.println("Substring (5 to 10): " + substring);

        // 10. Find the index of a specific substring
        sb.reverse(); // Reversing back to original order for search
        int indexOfGeeks = sb.indexOf("is");
        System.out.println("Index of 'avaJ': " + indexOfGeeks);

        // 11. Delete a character at a specific index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 12. Convert the StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}