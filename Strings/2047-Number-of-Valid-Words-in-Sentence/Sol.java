class sol {
   public int countValidWords(String sentence) {
        int count = 0;
        int n = sentence.length();

        // Flag to track if the current word is valid
        boolean valid = true;

        // To check if the word has at least one character "excluding spaces" (multiple spaces allowed)
        boolean hasChar = false;

        int hyphen = 0;

         //Iterate through each character in the sentence
        for(int i = 0; i <= n; i++){

   //End Word or space encountered
          if(i == n || sentence.charAt(i) == ' '){
             if(valid && hasChar){
                count++;
             }
            valid = true;
            hyphen = 0;
            hasChar = false;
            continue;
          }


          char ch = sentence.charAt(i);
          hasChar = true;

          //No digits allowed in valid words
          if(ch >= '0' && ch <= '9'){
            valid = false;
          }

          //Hyphen rules: Only one hyphen allowed, must be surrounded by lowercase letters
          else if(ch == '-'){
            hyphen++;

            if(hyphen > 1 ||
              i == 0 ||
              i + 1 >= n ||
              sentence.charAt(i - 1) < 'a'||
              sentence.charAt(i - 1) > 'z'||
              sentence.charAt(i + 1) < 'a'||
              sentence.charAt(i + 1) > 'z') {

              valid = false;
          }
        }

        //Punctuation rules: Only one punctuation mark allowed, must be at the end of the word
          else if(ch == '.' || ch == '!' || ch == ','){
             if(i + 1 < n && sentence.charAt(i + 1) != ' '  ){
                valid = false;
             }
          }

        //Any other character that is not a lowercase letter is invalid
         else if(!(ch >= 'a' && ch <= 'z')){
            valid = false;
         }

    }
     return count;
    }

    public static void main(String[] args) {
        sol solution = new sol();
        String sentence = "cat and  dog";
        int validWordCount = solution.countValidWords(sentence);
        System.out.println("Number of valid words: " + validWordCount);
    }
}