package Exam2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Calendar;

public class OrderForm {
    public String getDate(){
        String str;
        Calendar calendar=Calendar.getInstance();
        str=""+calendar.get(calendar.YEAR);
        DecimalFormat df=new DecimalFormat("00");
        str=str+df.format(calendar.get(calendar.MONTH));
        str=str+df.format(calendar.get(calendar.DATE));
        return str;
    }
    public String Random(){
        int rand= (int) (Math.random()*Math.pow(10,6));
        DecimalFormat df=new DecimalFormat("000000");
        String random=df.format(rand);
        return random;
    }
    public String[] RandomNoOrder(){
        String[] items=new String[10];
        for (int i=0;i<10;i++){
            items[i]=Random();
        }
        return items;
    }
    public String[] getNoOrder(String[] items){
        String[] Array=new String[10];
        for (int i=0;i<10;i++){
            System.out.println(Array[i]=getDate()+Random()+items[i]);
        }
        return Array;
    }
}
