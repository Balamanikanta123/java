import java.util.Scanner;
class leaf_year{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter date:");
int a=sc.nextInt();
System.out.print("Enter monthy:");
int b=sc.nextInt();
System.out.print("Enter Year:");
int c=sc.nextInt();
System.out.println("Date"+a+"/"+b+"/"+c);
if((a==0) ||(b==0) ||(c==0) ||(a>31)||(b>12)){
System.out.print("Enter valid date or month or year");
}
else{

if ((c % 400 == 0)
            || ((c % 4 == 0) && (c % 100 != 0))) {
           
            
            System.out.println(a+"/"+b+"/"+c + " : Leap Year");
        }
 
        else {
            // Any condition fails- Print Non-leap year
            System.out.println(a+"/"+b+"/"+c + " : Non - Leap Year");
        }
}


}


}