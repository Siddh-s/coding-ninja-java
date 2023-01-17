public class reverseString {
    public static String reversedString(String str){
        String reversedstring = "";
        for(int i =0 ; i < str.length(); i++){
            reversedstring = str.charAt(i) + reversedstring ;
        }
        return reversedstring ;
    }
    public static void main (String[] args){
        String str = "  doppleganger";
        String reversedstring = reversedString(str);
        System.out.println(reversedstring);

    }
    
}
