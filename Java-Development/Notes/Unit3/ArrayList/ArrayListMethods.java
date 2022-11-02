import java.util.ArrayList;
import java.lang.Math;
public class ArrayListMethods {
    public static void main(String[] args) {
        // 1,5,9,7,4,8,2,3,6,0,9
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int[] ia = { 1, 5, 9, 7, 4, 8, 2, 3, 6, 0, 9 };
        arrList = createArrayList(ia);
        System.out.println(arrList);
        System.out.println(minIntAl(arrList));
        System.out.println(maxIntAL(arrList));
        System.out.println(aveIntAL(arrList));
        System.out.println(sumIntAL(arrList));

        System.out.println(count(arrList,9));
        System.out.println(stdDev(arrList));
        System.out.println(removeDuplicates(arrList));
        System.out.println(mode(arrList));
    }

    // convert an int array to an int arrayList
    public static ArrayList<Integer> createArrayList(int[] iarr) {
        // hint hint... loop through the array and add it to an arraylist
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < iarr.length; i++) {
            temp.add(iarr[i]);
        }

        return temp;
    }

    public static int minIntAl(ArrayList<Integer> arrList) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arrList.size(); i++) {
            if (max < arrList.get(i)) {
                max = arrLis.get(i);
            }
        }
    }
    public static int maxIntAl(ArrayList<Integer> arrList) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrList.size(); i++) {
            if (max < arrList.get(i)) {
                max = arrLis.get(i);
            }
        }
    }
    public static int aveIntAl(ArrayList<Integer> arrList) {
        int total = 0;
        for (int i = 0; i < arrList.size(); i++) {
            total += arrList.get(i);
        }
        return (total / arrList.size());
    }
    public static int sumIntAL(ArrayList<Integer> arrList) {
        int total = 0;
        for (int i = 0; i < arrList.size(); i++) {
            total += arrList.get(i);
        }
        return total;
    }

    public static int count(ArrayList<Integer> temp){
        int count = 0;
        for(int i=0;i<arrList.size();i++){
            if(item == arrList.get(i)){
                count+=1;
            }
        } 
        return count;
    }
    public static int stdDev(ArrayList<Integer> temp){
        int totalDev = 0;
        int mean = aveIntAL(arrayList);
        for(int i = 0;i<arrayList.size();i++){
            totalDev = Math.pow(arrayList.get(i)-mean, 2);
        }
        return Math.sqrt(totalDev/arrayList.size());
    }
    public static int mode(ArrayList<Integer> temp){
        //finding the most frequent number
        //find the unique values...
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList=removeDuplicates(temp);

        //create a list of 0's that will count the amount of items in unique list
        ArrayList<Integer> countList = new ArrayList<Integer>();
        //countList=createArrayList(new int[uniqueList.size()]);
        //for each for loop
        for(int n: uniqueList){         //for(iteam in uniqueList)
            countList.add(0);
        }

        //iterate through the uniqueList and count the frequency...
        for(int n:uniqueList){
            int c = count(temp,n);
            countList.set(countList.get(n)+1,c);
        }

        //find the max value in the countList
        int modeValue = maxintAL(countList);

        //set mode to the index of uniqueList[countList]
        int mode = uniqueList.get(countList.get(modeValue));

        return mode;
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> temp){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i =0; i<al.size(); i++) {
            if (!arrList.contains(al.get(i))) {
                arrList.add(al.get(i));
            }
        }

        return arrList;
    }
}