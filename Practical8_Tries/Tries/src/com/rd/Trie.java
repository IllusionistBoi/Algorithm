package com.rd;

/**
 * Trie Implemented using an Array improves
 * its efficiency and functionality
 *
 */
public class Trie {

    /**
     * Each trie node can only contains 'a'-'z' characters.
     * So we can use a small array to store the character.
     */
    static class TrieNode {

        TrieNode[] ALPHABET_SIZE;
        boolean wordEnd;

        // Initialize your data structure here.

        /**
         * Data structure initialized using
         * array which size 26 (Alphabet Size)
         */
        public TrieNode() {
            this.ALPHABET_SIZE = new TrieNode[26];
        }
    }

    /**
     * Root initialized
     */
    private static TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Method to add a word into
     * he trie
     *
     * @param word to be inserted
     */
    public static void insert(String word) {

        TrieNode T = root;

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c -'a';

            if(T.ALPHABET_SIZE[index] == null) {
                TrieNode tempNode = new TrieNode();
                T.ALPHABET_SIZE[index] = tempNode;
                T = tempNode;
            }
          else
            T = T.ALPHABET_SIZE[index];
        }

        T.wordEnd = true;
    }

    /**
     * Method to return the word if it
     * is in the trie
     *
     * @param word word search returned
     * @return false if word not found
     */
    public static boolean search(String word) {
        TrieNode r = searchNode(word);

        if(r == null)
            return false;
        else
            if(r.wordEnd)
                return true;

        return false;
    }

    /**
     * Method to search a stringNode in
     * the trie
     *
     * @param str
     * @return
     */
    public static TrieNode searchNode(String str) {
        TrieNode r = root;

        for(int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c-'a';

            if(r.ALPHABET_SIZE[index]!=null)
                r = r.ALPHABET_SIZE[index];
            else
                return null;

        }

        if(r == root)
            return null;

        return r;
    }

    public static void main(String args[]) {

//        // Input keys (use only 'a' through 'z' and lower case)
//        String keys[] = {"the", "a", "there", "answer", "any",
//                "by", "bye", "their"};
//
//        String output[] = {"Not present in trie", "Present in trie"};
//
//        // Construct trie
//        int i;
//
//        for (i = 0; i < keys.length ; i++)
//            insert(keys[i]);
//
//        // Search for different keys
//        if(search("the") == true)
//            System.out.println("the --- " + output[1]);
//        else System.out.println("the --- " + output[0]);
//
//        if(search("these") == true)
//            System.out.println("these --- " + output[1]);
//        else System.out.println("these --- " + output[0]);
//
//        if(search("their") == true)
//            System.out.println("their --- " + output[1]);
//        else System.out.println("their --- " + output[0]);
//
//        if(search("thaw") == true)
//            System.out.println("thaw --- " + output[1]);
//        else System.out.println("thaw --- " + output[0]);
    }
}
