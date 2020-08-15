class StringTheory{

public static void main(String args[]){

  String s1="Saravana";
  String s2="Kumar";
  String s3="";
  //int s1l=s1.length();
  // Reverse a String

  for(int i=(s1.length()-1);i>=0;i--){
   s3=s3+s1.charAt(i);
   }
   System.out.println("Reverse of String"+s1+"  is "+s3);
  
   // Swap Strings
  System.out.println("Currenr Value of s1 : "+s1);
  System.out.println("Current Value of s2 :"+s2 );

   s1=s1+s2; // a = a + b
   s2 = s1.substring(0,s1.length()-s2.length()); // b = a - b ( index start and end )
   s1 = s1.substring(s2.length(),s1.length());

   System.out.println("Value of s1 : "+s1);
  System.out.println("Value of s2 :"+s2 );

}
}
