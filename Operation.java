1.class Operation{  
2. int data=50;  
3.  
4. void change(int data){  
5. data=data+100;//changes will be in the local variable only  
6. }  
7.     
8. public static void main(String args[]){  
9.   Operation op=new Operation();  
10.  
11.   System.out.println("before change "+op.data);  
12.   op.change(500);  
13.   System.out.println("after change "+op.data);  
14.  
15. }  
16.}  
