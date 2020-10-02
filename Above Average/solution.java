
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;
import java.lang.reflect.Array; 



public class solution{
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Map<Integer,Double> table = new HashMap<Integer,Double>();
        int line = 0;
        int row;
        while(line<a){
            row = input.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(row);
            for (int i =0;i<row;i++){
                array.add(i, input.nextInt());
            }
            table.put(line,aboveaverage(array, row));
            line++;
        }
        
        for (Map.Entry<Integer,Double> entry : table.entrySet()){
            System.out.printf("%.3f%s\n",entry.getValue(),"%");
        }
        
        input.close();
    }

    public static Double aboveaverage(ArrayList<Integer> array,int ele){
        Collections.sort(array, Collections.reverseOrder());
        int sum = 0;
        double avg;
        for (Integer i : array){
            sum += i;
        }
        avg = (double)sum/ele;

        int count = 0;
        for (Integer i : array){
            if (i>avg){
                count++;
            }
        }

        return (double)count/ele*100;

    }
        
}




