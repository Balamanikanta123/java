import java.util.Scanner;
class Grade_calculation{
public static void main(String []args){
int sum,per;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first subject marks");
int a=sc.nextInt();
System.out.print("Enter second subject marks");
int b=sc.nextInt();
System.out.print("Enter third subject marks");
int c=sc.nextInt();
System.out.print("Enter fourth subject marks");
int d=sc.nextInt();
sum=a+b+c+d;
per=sum/4;
if(per>85){
System.out.print("Grade is Distinction");
}
else if(per>=70 && per<80){
System.out.print("Grade is First division");
}
else if(per>=60 && per<70){
System.out.print("Grade is Second division");
}
else if(per>=50 && per<60){
System.out.print("Grade is Third division");
}
else{System.out.print("Grade is Fail");}
}


}