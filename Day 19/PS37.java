import java.util.Scanner;

public class PS37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        //removing the duplicate characters in the string
        String result=removeDuplicates(input);
        //printing the frequencies
        for(int i = 0; i < result.length(); i++){
            int count = checkFrequency(result.charAt(i),input);
            System.out.println("The frequency of "+result.charAt(i)+" is "+count);
        }
    }    
    static String removeDuplicates(String input){
        boolean [] seen = new boolean[256];
        StringBuilder output = new StringBuilder();

        for(char c : input.toCharArray()){
            if(! seen[c]){
                seen[c] = true;
                output.append(c);
            }
        }
        return output.toString();
    }
    static int checkFrequency(char ch, String input){
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
