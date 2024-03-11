class Palindrome{
    String a; 
    void check(string a){
        this.a=a;
        int len=a.length();
        boolean isPalindrome = true;
        for(int i=0;i<=len;i++){
            for(int j=len;j>=0;j--){
                if(a.charAt(i)==a.charAt(j)){
                    isPalindrome = false;
                    break;
                }
            if (!isPalindrome) {
                break; 
            }
        }
    }
    if (isPalindrome) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
    public static void main(String args[]){
        Palindrome obj1=new Palindrome();
        //obj1.input("malayalam");
        obj1.check("malayalam");
    }
}