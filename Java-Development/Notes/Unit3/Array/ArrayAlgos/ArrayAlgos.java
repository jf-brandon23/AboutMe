public class ArrayAlgos{
    public static void main(String[] args) {
         double[] test = {12,7,13,8,4.0,3,72};
         double[] test2 = {120,57,1.3,8.5,0,3,7};
         
         System.out.println("Sum: %f",sum(test));       
         System.out.println("Ave: %f",ave(test));
         System.out.println("Min: %f",min(test));
         System.out.println("Max: %f",max(test));
         
         //returns the index if found, if not, -1
         System.out.printf("Find: %f",find(test,8));
         System.out.printf("Reverse: "+printArray(reverse(test)));
         System.out.printf("Sorted: "+printArray(sort(test)));     //Our stuff
         System.out.printf("Merge: "+printArray(merge(test,test2)));
    }

    //ReceSpencer
    public static String printArray(double[] grades) {
        String out = "";
        for (int i = 0; i < grades.length; i++) {
            if (i != grades.length-1) {
                out += (grades[i]+",");
            }
            else {
                out += (grades[i]);
            }
        }
        return out;
    }
    public static double min(double[] one){
        double min = one[0];
        for(int i=0;i<one.length;i++){
            if(one[i]<min){
                min=one[i];
            }
        }
        return min;
    }
    public static double[] reverse(double[] arr) {
        double[] sorted = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[(arr.length-1)-i];
        }
        return sorted;
    }



    //Masonlandon

    public static double[] merge(double[] arr, double[] arr2) {
        double[] mergedArray = new double[arr.length + arr2.length];
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            mergedArray[start] = arr[i];
            start += 1;
            mergedArray[start] = arr2[i];
            start += 1;
        }
        return mergedArray;
    }
    public static double sum(double[] arr) {
            double total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
            return total;
        }



    //Adam Kayden
    public static double max(double[] arr){
        double pastnum=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i] > pastnum){
                pastnum = arr[i];
            }
        }
        System.out.println("Max Value is: "+pastnum);
    }
    public static int find(double[] arr,double i){
        int index=-1;
        //-1 is similar to an error code
        for(int j=0; j<arr.length; j++){
            if(i==arr[j]){
                index=j;
            }
        }

        return index;
    }






    public static double ave(double[] arr) {
        int n = arr.length;
        double total = 0;
        for(int i = 0;i<arr.length;i++){
            total+=arr[i];
        }
        return total/n;
    }

    public static double[] sort(double[] arr){
        for (int i=0;i<arr.length;i++){
            double characterval= arr[i];
            boolean sorted = false;
            System.out.println(checkVal);
            for (int j=0;j<check;j++){
                if (newArr[j])<=checkVal<newArr[j+i]||(newArr[j]==0.0&&newArr[j+1]==0){
                    
                }
            }
        }
        return newArr;
    }

    public static double[] insert(double[] arr,int index,double val){
        double[] newArr = new double[arr.length];
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }
        for(int i=index+1;arr.length;i++){
            newArr[i]= arr[i];
        }
        return newArr;
    }

    public static void printArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
    }












    




}