class conditionalstatement{
public static void main(String[]args){
int mark1=50,mark2=25,mark3=100;
int total=mark1+mark2+mark3;
float avg=total/3;

if(avg<50){
System.out.println("Fail");
}

else if(avg>=50 && avg<60){
System.out.println("Grade:C");
}


else if(avg>=60 && avg<70){
System.out.println("Grade:B");
}


else if(avg>=70 && avg<80){
System.out.println("Grade:B+");
}


else if(avg>=80 && avg<90){
System.out.println("Grade:A");
}

else if(avg>=90 && avg<100){
System.out.println("Grade:A+");
}

}
}