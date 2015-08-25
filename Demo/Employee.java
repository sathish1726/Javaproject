public class Employee implements Cloneable {

       int a=0; 
       String name="";
       Employee (int a,String name){ 
       this.a=a;
        this.name=name;
}
public Employee clone() throws CloneNotSupportedException{
return (Employee ) super.clone();
}
public static void main(String[] args) {

         Employee e=new Employee (2,"Indhu");          
         System.out.println(e.name);
try {
 
Employee b=e.clone();
 System.out.println(b.name);
 
} catch (CloneNotSupportedException e1) {
e1.printStackTrace();
}
}
 
3}
