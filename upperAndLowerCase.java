public class upperAndLowerCase{
    public static void main(String[] args){
        String s = "HELlo";
        int lc = 0; // count for lowercase characters
        int uc = 0; // count for uppercase characters
        
        // Iterate over each character in the string
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                uc++; // Increment uppercase counter
            } else if(Character.isLowerCase(c)){
                lc++; // Increment lowercase counter
            }
        }
        
        // Compare counts and print the string in lowercase or uppercase
        if(lc > uc){
            System.out.print(s.toLowerCase());
        } else{
            System.out.print(s.toUpperCase());
        }
    }
}
