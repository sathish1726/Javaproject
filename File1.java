<<<<<<< HEAD
<<<<<<< HEAD
class Hai{
public static void main(String args[]){
System.out.println("hai");
}
}
=======
=======
>>>>>>> Test
public class MyDuplicateElements {

 

    public static int[] removeDuplicates(int[] input){

         

        int j = 0;

        int i = 1;

        //return if the array length is less than 2

        if(input.length < 2){

            return input;

        }

        while(i < input.length){

            if(input[i] == input[j]){

                i++;

            }else{

                input[++j] = input[i++];

            }    

        }

        int[] output = new int[j+1];

        for(int k=0; k<output.length; k++){

            output[k] = input[k];

        }

         

        return output;

    }

     

    public static void main(String a[]){

        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};

        int[] output = removeDuplicates(input1);

        for(int i:output){

            System.out.print(i+" ");

        }

    }

}
<<<<<<< HEAD
- See more at: http://www.java2novice.com/java-interview-programs/remove-duplicates-sorted-array/#sthash.t8qGes5E.dpuf
>>>>>>> 6b8e965... Adding the File1.java to Test Bbanch 4:03
=======
- See more at: http://www.java2novice.com/java-interview-programs/remove-duplicates-sorted-array/#sthash.t8qGes5E.dpuf
>>>>>>> Test
