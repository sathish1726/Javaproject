03.public class ReverseString {
04. 
05.public static void main(String[] args) {
06. 
07.String str="Hello world";
08.String revstring="";
09. 
10.for(int i=str.length()-1;i>=0;--i){
11.revstring +=str.charAt(i);
12.}
13. 
14.System.out.println(revstring);
15.}
16.}
