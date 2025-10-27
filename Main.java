// this is java syntax 
public class Main {
  public static void main(String[] args) {
    System.out.println("naveen");
// print text using double quotes , print() method , println() method 

    System.out.print("NAVEENKUMAR");
    System.out.print("NAVEENKUMAR");
// println() methed 
    System.out.println( "NAVEENKUMAR");
    System.out.println("NAVEENKUMAR");
// Double quotes to print 
    System.out.println("NAVEENKUMAR");
// single line comment means give one line comment to why we use this line in the program using "//" this special character
// multipleline comment means give two or more line comment for explain the code why we use the code using"/* */" this special character
// java variable 
   int num = 10;
   String name ="Naveen";
   float number = 10;
   boolean value = true; 
   boolean valu = false;
   char nam ='A';
   System.out.println(num);
   System.out.println(name);
   System.out.println(number);
   System.out.println(value);
   System.out.println(valu);
   System.out.println(nam);
//final variable final variable is help to constant the variable value we can assing it will give error message like error: cannot assign a value to final variable javanu
  final int javanu = 10 ;
   System.out.println(javanu);
// display variable 
String firstname = "NAVEEN";
String lastname = "KUMAR";
System.out.println(firstname + lastname);
//mixing text and number 
String stringname = "Naveenkumar S";
int integer = 19;
System.out.println("My name is " + stringname + "And My age is " + integer);
// one value to multiple variable 
int x,y;
x=10;
y=15;
System.out.println(x + y);
// one value to multiple variable 
int a,b,c;
a=b=c=50;
System.out.println(a+b+c);
// identifier means each variable should have some unique name that is called identifier like " int value = 10; " value is the unique name in the variable
/*  type casting, which means we change one variable type to another variable type like int to float or double.
    type casting have two type they are wideing  and narrowing casting. wideing means converting automatically smaller datatype size to larger datatype size.
    Narrowing casting means converting manual larger datatype to smaller datatype.*/
    // this is Wideing casting (automatic)
    int Firstnum = 10;
    float Lastnum = Firstnum;
    System.out.println(Lastnum);
    // this is narrowing casting (manual)
    float  fnum = 10;
    int lnum = (int) fnum;
    System.out.println(lnum);
// java operater 
// arithemetic operater ("+")
int d = 10;
int f = 5;
int g = d+f;
System.out.println(g);
// or 
System.out.println(d+f);
// arithematic operater ("-")
System.out.println(d-f);
// arithemetic operater ("*")
System.out.println(d*f);
// arithemetic operater ("%")
System.out.println(d%f);
// arithemetic operater ("/")
System.out.println(d/f);
// comparision operater like <(grater than),>(less than),==(equal to),<=(greater than or equal to),>=(less than or equal to )
//bitwise operater like &&(and),||(or),!=(not equal)
/*  precedence, which means if we some time we can do three calculation like 3+2*2 on that time the compiler is confused to say 
like error so we use brackets to say the compiler to star first calculation is 3+2 and second calculation is 5*2 so we use (3+2)*2 this is help to the compiler */
int h,i,j;
h = 2;
i = 3;
j = 2;
System.out.println((h+i)*2);
  }
}