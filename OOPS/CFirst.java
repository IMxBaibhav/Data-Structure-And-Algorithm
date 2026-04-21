
import java.util.Arrays;

public class CFirst{
public static void main(String[] args) {
    // if we need to store the data of 5 student in which we need to store roll no name and marks
/* 
    int[] rollno= new int[5];
    String[] name = new String[5];
    float[] marks= new float[5];
*/
    // aise me har baar students ke liye alag alag likhna pdega agar hum ek student naam ka ek alag class bna le jisme teeno properties ho toh ek sath call kr skte hai

Student[] students = new Student[5];
// like this iske liye ek alag se class bna lete hai aur usi ko call kr lete hai

Student baibhav;

System.out.println(Arrays.toString(students));
// ab isme baibhav ke pass teeno properties hai

}




};
class Student{
    // this is the data type for every single student
 int rollno;
    String name;
    float marks;


}