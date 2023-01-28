public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ans = "";
        int currentWordstart = 0;
        int i = 0 ;
        for(  ; i< str.length(); i++){
            if(str.charAt(i)== ' '){
                int currentWordend = i-1 ;
                String reversedWord = "";
                for( int j = currentWordstart ; j<= currentWordend ; j++){
                    reversedWord = str.charAt(j) + reversedWord ;
                }
                ans += reversedWord + " ";
                currentWordstart = i+1 ;
            }
        }
        int currentWordend = i-1 ;
        String reversedWord = "";
        for( int j = currentWordstart ; j<= currentWordend ; j++){
            reversedWord = str.charAt(j) + reversedWord ;
        }
        ans += reversedWord ;
        return ans ;
    }
    public static void main (String args[]){
        String str = "abc def ghi";
        System.out.println(reverseEachWord(str));

    }
}
