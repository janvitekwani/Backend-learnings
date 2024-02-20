/* testing is done by the developer or testing team , so the
testing which is done by the developer is called unit testing

in unit testing we define unit and blocks to be tested these can be
1 methods , group of methods , class and group of class
 */

// let's try writing a code to understand unit testing

 class Calc{
    //one unit
    public int divide(int num1,int num2)
    {
        return num1/num2;
    }
    // another unit
    public int multiply (int num1,int num2)
    {
        return num1*num2;
    }
}

public class Main {
    public static void main(String[] args) {
      Calc c = new Calc();
     int result= c.divide(10,5);
     if(result==2)
           System.out.println("test case passed");
     else
         System.out.println("test case is not passed");

// so this is how we perform unit testing mannally without using any frame work
    }
}
// ******************   unit testing framework (junit5) *******************************
/*      prepare(setup a text enviroment , write test methods)
        provide testing input
        run the test
        provide the expected output
        perform assertion (verify the result )
        report test Results(alert developer if test is failed (or) passed)

  so for every unit u have to invoke separetly based on the operation the perform
  in junit 5 u just need to give the input and u will get the output and rest of the
  functions are performed by junit 5
 */

/*     ************************************ understanding the junit architecture *************************
 junit5 is not junit 4+ new features

 1) junit5 provides the enviroment to run your test that is called as platform, platform is the one which is the core of the
    entire architecture
2)developer cannot directly access the platform it requires apis to access the platform
that api in our case the jupiter , but this "JUPITER" for doing only junit 5 testing
what we want to junit4 test to run on the junit 5 then we will use the api called "VINTAGE"
"Extension this will basically enhance the testing capabiltity of the junit 5 , by using the extension
 we can be able to use the platform without able to use jupiter api , means we can put the api of or own

 // all the ide are already integerated with all the  testing like junit5



 */
// so for this we need to create a maven project
/* what is maven ?
1) is basically a build tool under the licence of apache
(A build tool is a program-based utility that can be structured as a command line to automate the application-building process.)

maven is an open source build automation and project management
tool widely used for java application

 */