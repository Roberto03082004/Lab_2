package app;

public class Controller {

    //----------------------------------------------------------------------------
    //beginning of public static void main (String [] args) method

    public static void main (String [] args){
        yourInfoHeader();


        //=============================
        //Step 3
        //=============================
        int minutes = 33;
        int hours = 15;
        int days = 4;

        int secondsInMinute = minutes * 60;
        int secondsInHour = (hours * 60)*60;
        int secondsInDay = ((days * 24)*60)*60;
        int totalSeconds = secondsInDay + secondsInHour + secondsInMinute;

        printStepHeader(3);
        System.out.printf("Number of seconds in 4 days, 15 hours and 33 minutes %6s", totalSeconds);

        //=============================
        //Step 4
        //=============================
        double initialInvestment = 125000.00;

        double year1InterestRate = 5;
        double year2InterestRate = 9;
        double year3InterestRate = -3.5;
        double year4InterestRate = 7;

        double year1InvestmentValue = initialInvestment * (1+year1InterestRate/100);

        double year2InvestmentValue = year1InvestmentValue * (1+year2InterestRate/100);
        double year3InvestmentValue = year2InvestmentValue * (1+year3InterestRate/100);

        double year4InvestmentValue = year3InvestmentValue * (1+year4InterestRate/100);
        double totalInterestEarned = year4InvestmentValue - initialInvestment;

        printStepHeader(4);
        //using println
        System.out.println(initialInvestment);
        System.out.println(year1InvestmentValue);
        System.out.println(year2InvestmentValue);
        System.out.println(year3InvestmentValue);
        System.out.println(year4InvestmentValue);
        System.out.println(totalInterestEarned);
        System.out.println();

        //using printf
        System.out.printf("initialInvestment:    %10.2f\n", initialInvestment);
        System.out.printf("year1InvestmentValue: %10.2f\n", year1InvestmentValue);
        System.out.printf("year2InvestmentValue: %10.2f\n", year2InvestmentValue);
        System.out.printf("year3InvestmentValue: %10.2f\n", year3InvestmentValue);
        System.out.printf("year4InvestmentValue: %10.2f\n", year4InvestmentValue);
        System.out.printf("totalInterestEarned: %10.2f\n", totalInterestEarned);

        //=============================
        //Step 5
        //=============================
        double diameter = 17.3543;
        double r = diameter/2;
        double circleCircumference = 2*Math.PI*r;
        double circleArea = Math.PI*Math.pow(r, 2);

        printStepHeader(5);
        System.out.printf("circleDiameter: \t\t%-10.4f\n", diameter);
        System.out.printf("circleRadius:   \t\t%-10.4f\n", r);
        System.out.printf("circleCircumference: \t%-10.4f\n", circleCircumference);
        System.out.printf("circleArea:     \t\t%-10.4f\n", circleArea);


        //=============================
        //Step 6
        //=============================
        double rectangleHeight = 19.4;
        double rectangleWidth = 34.7;

        double triangleHeight = 16.4;
        double triangleBase = 20.1;

        double rectanglePerimeter = 2*(rectangleHeight+rectangleWidth);
        double rectangleArea = rectangleHeight*rectangleWidth;

        double triangleHypotenuse = Math.sqrt(Math.pow(triangleHeight, 2)+ Math.pow(triangleBase, 2));

        double trianglePerimeter = triangleHypotenuse+triangleBase+triangleHeight;
        double triangleArea = 0.5*triangleHeight*triangleBase;

        double totalPerimeter = rectanglePerimeter+trianglePerimeter;
        double totalArea = rectangleArea+triangleArea;

        printStepHeader(6);

        System.out.printf("rectangleHeight:    %8.1f\n", rectangleHeight);
        System.out.printf("rectangleWidth:  \t%8.1f\n", rectangleWidth);
        System.out.printf("triangleHeight:  \t%8.1f\n", triangleHeight);
        System.out.printf("rectanglePerimeter: %8.1f\n", rectanglePerimeter);
        System.out.printf("rectangleArea: \t\t%8.1f\n", rectangleArea);
        System.out.printf("triangleHypotenuse: %8.1f\n", triangleHypotenuse);
        System.out.printf("trianglePerimeter:  %8.1f\n", trianglePerimeter);
        System.out.printf("totalPerimeter: \t%8.1f\n", totalPerimeter);
        System.out.printf("totalArea: \t\t\t%8.1f\n", totalArea);




        //=============================
        //Step 7
        //=============================

        //Variables
        double airflow = 1.253;
        double x = 1.392;
        double y = 0.72;
        double z = 4.2932;

        //Temps
        double temp1 = Math.cos(Math.pow(airflow, 3));
        double temp2 = Math.pow(Math.exp(1), 6*x*Math.pow(y, 4));
        double temp3 = 2*Math.sqrt(7*x*Math.pow(y, 5.32)*z);
        double temp4 = 1.8*x*y*z;
        double temp5 = Math.pow(0.75, Math.pow(2, x*y*z));
        double temp6 = Math.sqrt(airflow + x);

        double boost = temp1*((temp2+temp3)/temp6)+temp4+temp5;


        printStepHeader(7);
        System.out.printf("airFlow:\t%-8.6f\n", airflow);
        System.out.printf("x: \t\t\t%-8.6f\n", x);
        System.out.printf("y: \t\t\t%-8.6f\n", y);
        System.out.printf("z: \t\t\t%-8.6f\n", z);
        System.out.printf("temp1:\t\t%-8.6f\n", temp1);
        System.out.printf("temp2:\t\t%-8.6f\n", temp2);
        System.out.printf("temp3:\t\t%-8.6f\n", temp3);
        System.out.printf("temp4:\t\t%-8.6f\n", temp4);
        System.out.printf("temp5:\t\t%-8.6f\n", temp5);
        System.out.printf("temp6:\t\t%-8.6f\n", temp6);
        System.out.printf("boost:\t\t%-8.6f\n", boost);








    }//end main


    //----------------------------------------------------------------------------
    //Beginning of yourInfoHeader() method
    public static void yourInfoHeader() {
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASSTIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 1.5");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and i certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();
    }

    //----------------------------------------------------------------------------
    //Beginning of printStepHeader(int stepNumber) method

    public static void printStepHeader(int stepNumber){


        System.out.println();
        System.out.println();
        System.out.println("=============================================");
        System.out.println("Step: " + stepNumber);
        System.out.println("=============================================");
    }//end printStepHeader

    //------------------------------------------------------------------------------

}//end Controller
