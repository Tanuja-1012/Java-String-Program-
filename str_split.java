//he split() method in Java returns an array of strings
//split(delimiter)

import java.util.Arrays;

class str_split {
    public static void main(String args[]) {
        String[] parts = "Hello World".split(" ");
        
        // Print the result as an array
        System.out.println(Arrays.toString(parts));
    }
}
