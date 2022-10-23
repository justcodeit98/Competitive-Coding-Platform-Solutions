import java.util.*;
class TrappingRainWater{
    public static int trap(int[] height) {
        int n=height.length;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=height[0];
        for (int i=1;i<n;i++)
        {
            if(l[i-1]>height[i])
                l[i]=l[i-1];
            else
                l[i]=height[i];
        }
        r[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--)
        {
            if(r[i+1]>height[i])
                r[i]=r[i+1];
            else
                r[i]=height[i];
        }
        int res=0;
        for (int i=1;i<n;i++)
        {
            res=res+(Math.min(l[i],r[i])-height[i]);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the no. of buildings");
        int n=S.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the heights of building");
        for(int i=0;i<n;i++)
            a[i]=S.nextInt();
        int res=trap(a);
        System.out.println(res);
    }
}
