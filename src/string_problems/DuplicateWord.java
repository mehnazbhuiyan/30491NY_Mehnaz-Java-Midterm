package string_problems;

public class DuplicateWord {

    /**
     * INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        // Implement here

        // convert the string into lowercase
        st = st.toLowerCase();

        // replace period with empty string
        st = st.replace(".", "");

        // split the string into words using built-in function
        String words[] = st.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;

                    // set words[j] to 0 to avoid printing visited word
                    words[j] = "0";

                }
            }
            // displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i]);
            }
        }

    }
}


