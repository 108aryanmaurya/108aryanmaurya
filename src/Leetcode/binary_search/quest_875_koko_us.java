package Leetcode.binary_search;

public class quest_875_koko_us {
    public static void main(String[] args) {
        int max=0;
        int[] p={30,11,23,4,20};
        int h=6;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]>max)
            {
                max=p[i];
            }
        }
        if(h==p.length)
        {
            System.out.println(max);

        }
        System.out.println(max);
        int s=1;
        int e=max;
        int k=0;
        int a=0;
        while(s<=max)
        {
            int  m=s+(e-s)/2;
            for(int j=0;j<p.length;j++)
            {
                k+=(int)Math.ceil((p[j]*1.0)/m);

            }

            if(k<=h)
            {a=m;
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
//        return a;/
        System.out.println(a);
    }
}
