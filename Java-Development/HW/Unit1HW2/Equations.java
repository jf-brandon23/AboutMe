import java.util.Scanner;
import java.lang.Math;

public class Equations {
    public static void main(String[] args){
        
        triangleArea();
        midPointTable();
        minuteYearConverter();
        triangleVolume();
    }

    public static void triangleArea() {
        Scanner ui = new Scanner(System.in);
        
        //Set 1
        System.out.println("Enter Set 1, Coordinate 1:");
        Double coord1x = ui.nextDouble();
        System.out.println("Enter Set 1, Coordinate 2:");
        Double coord1y = ui.nextDouble();

        //Set2
        System.out.println("Enter Set 2, Coordinate 1:");
        Double coord2x = ui.nextDouble();
        System.out.println("Enter Set 2, Coordinate 2:");
        Double coord2y = ui.nextDouble();

        //Set3
        System.out.println("Enter Set 3, Coordinate 1:");
        Double coord3x = ui.nextDouble();
        System.out.println("Enter Set 3, Coordinate 2:");
        Double coord3y = ui.nextDouble();
        
        //side= /(x2-x1)^2+(y2-y1)^2
        Double side1 = (Math.sqrt(Math.pow((coord1x-coord2x), 2)+Math.pow((coord1y-coord2y), 2)));

        Double side2 = (Math.sqrt(Math.pow((coord2x-coord3x), 2)+Math.pow((coord2y-coord3y), 2)));
        
        Double side3 = (Math.sqrt(Math.pow((coord3x-coord1x), 2)+Math.pow((coord3y-coord1y), 2)));
        
        Double s = (side1+side2+side3)/2;

        // /s(s-side1)(s-side2)(s-side3)

        Double solution = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.printf("Area the Triangle:%.3f "+solution);

    }

    public static void midPointTable() {
        Scanner ui = new Scanner(System.in);

        System.out.println("How many Date Sets?: ");
        int numData = ui.nextInt();
        for(int i=0;i<numData;i++){
            System.out.println("Enter Coordinate 1:");
            Double coordAx = ui.nextDouble();
            System.out.println("Enter Coordinate 2:");
            Double coordAy = ui.nextDouble();

            System.out.println("Enter Coordinate 1:");
            Double coordBx = ui.nextDouble();
            System.out.println("Enter Coordinate 2:");
            Double coordBy = ui.nextDouble();

            Double middle1 = Math.pow(((coordAx-coordBx)/2),2);
            Double middle2 = Math.pow(((coordAy-coordBy)/2),2);

            System.out.println("\t"+"A"+"\t"+"\t"+"B"+"\t"+"\t"+"Middle Point");
            System.out.printf("\t"+"("+coordAx+","+coordAy+")"+"\t"+"("+coordBx+","+coordBy+")"+"\t"+"("+middle1+","+middle2+")");
        }
    }

    public static void minuteYearConverter() {
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter the Number of Minutes: ");
        int minutes = ui.nextInt();
        int hours = minutes/60;
        int days = hours/24;
        int years = days/365;
        int extra = days%365;
        System.out.printf(minutes+" minutes is approximately: "+years+" years and "+extra+" days.");


    }

    public static void triangleVolume() {
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter length of sides: ");
        Double lengthSide = ui.nextDouble();
        Double area = ((Math.sqrt(3)/4)*Math.pow((lengthSide), 2));
        Double volume = area * lengthSide;

        System.out.printf("Area: "+Math.round(area)+"%n");
        
        System.out.printf("Volume of the Triangle: "+Math.round(volume));
        
        

    }
}
