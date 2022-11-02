public class ArrayNotes {
    public static void main(String[] args) {

        //Array -> List... A sequence of data that is not mutable -> doesn't change
        
        /*
            Python -> List
            listy=[]
            listy=[1,2,3,"four",[1,2,3,4,5],True] 
        */

        /*
            Primitive     = binary, booleans, ints, doubles, char
            Non-primitive = Array, String, Dictionary, Tuples()

            Array -> List and ArrayList
        */

        //datatype[] nameOfArray = {the data};
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        double[] decimalNumbers = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};

        printHorizontalArray(numbers,"Beep");
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]+4);   //5
        numbers[1]=numbers[1]+4;
        // System.out.println(numbers);
        printHorizontalArray(numbers,"Beep");
        //Python listy.append()
        int[] numbersLonger = {0,1,2,3,4,5,6,7,8,9,10};
        

    }

    private static void printArray(int[] arr) {
        //length is an attribute
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void printHorizontalArray(int[] arr,String d) {
        //length is an attribute
        String out = "";
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }

    private static void printArray(double[] arr) {
            //length is an attribute
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }

}
