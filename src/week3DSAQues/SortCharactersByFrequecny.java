package week3DSAQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCharactersByFrequecny {

    class Pair{
        int count;
        char ch;
        Pair(int count,char ch){
            this.count=count;
            this.ch=ch;
        }
    }

    public String frequencySort(String s){

        int freq[]=new int[123];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }

        ArrayList<Pair> freqList= new ArrayList<>();

        for(int i=0;i<=122;i++){
            if(freq[i]>0){
                freqList.add(new Pair(freq[i],(char)i));

            }
        }

        Collections.sort(freqList,new Comparator<Pair>(){

            public int compare(Pair a, Pair b){
                return b.count-a.count;
            }

        });

        StringBuilder sb=new StringBuilder();

        for(Pair p:freqList){
            int count=p.count;
            while(count>0){
                sb.append(p.ch);
                count--;
            }
        }

        return sb.toString();

    }

    public static void main(String[] args){
        SortCharactersByFrequecny obj=new SortCharactersByFrequecny();
        System.out.println(obj.frequencySort("tree"));
    }
}
