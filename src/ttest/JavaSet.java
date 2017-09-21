package ttest;

import java.io.BufferedOutputStream;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.LinkedList;
        import java.util.List;
        import java.util.Scanner;

class JavaSet {
    private static Scanner sc = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) throws IOException {
        int N = sc.nextInt();
        List<String> L = new LinkedList<>();
        List<String> S = new LinkedList<>();
        for(int i=1;i<=20;i++)
        {
            S.add(i+"");
        }
        for(int z =0; z<N;z++){
            String str = sc.next();
            String num="";
            if(!str.equals("all") && !str.equals("empty")){
                num = sc.next();
            }
            if (str.equals("add"))
            {
                if(!L.contains(num)){
                    L.add(num);
                }
            }
            else if (str.equals("remove"))
            {
                if(L.contains(num)){
                    L.remove(num);
                }
            }
            else if (str.equals("check"))
            {
                if(L.contains(num)){
                    out.println(1);
                }
                else{
                    out.println(0);
                }
            }
            else if (str.equals("toggle"))
            {
                if(L.contains(num)){
                    L.remove(num);
                }
                else{
                    L.add(num);
                }
            }
            else if (str.equals("all"))
            {
                L.clear();
                L.addAll(S);
            }
            else if (str.equals("empty"))
            {
                L.clear();
            }
        }
        out.flush();
    }
}


