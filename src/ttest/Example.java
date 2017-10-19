package ttest;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Example {

    static private int k = 1;

    static void display(){
        System.out.println("study");
    }


    static class InnerClass{
        private int a = 36;
        public void printK(){
            System.out.println(k + a);
            display();

            List<String> L = new LinkedList<String>();
            List<String> S = new LinkedList<String>();

            PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

            out.flush();
            boolean[] wNum = new boolean[10];

            for(int i =0 ; ; i++){

            }

        }
    }
}

class Text{
    public static void main(String[] args) {

        Example.InnerClass ttest = new Example.InnerClass();
        ttest.printK();
    }
}
