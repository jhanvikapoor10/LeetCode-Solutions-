class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i<sentences.length; i++){
            int spaces = 0;
            for(int j = 0; j<sentences[i].length(); j++){ /*notice how here, 
            inside the array sentences, the element at i is a string. 
            so we apply j loop on that string to identify each word and its lenght
            is NOT just length, its length() because for arrays the length methid 
            is just length and for string, the length method is length()*/
                if(sentences[i].charAt(j) == ' '){
                    spaces++;
                }
            }
            int words = spaces + 1;
            if(words>max){
                max = words;
            }
        }
        return max;
    }
}
