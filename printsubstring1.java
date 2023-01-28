public class printSubstrings1 {
    public static void substrings ( String str){
        for( int start = 0 ; start < str.length(); start ++){
            for(int end = start ; end < str.length(); end ++){
               System.out.println(str.substring(start, end+1));
            }
        }
    }
    public static void main (String args[]){
        String str = "pqrs";
        substrings(str);

    }
    
}
