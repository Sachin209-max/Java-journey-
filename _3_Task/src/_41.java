//43) WAP to convert binary number into decimal number
class _41 {
    public static void main(String[] args) {
        int a=10100;
        int r,i=1,sum=1,j=1,k=2,l=1;
        while (a!=0)
        {
            r=a%10;
            i=r*j;
            sum=sum+i;
            a=a/10;
            j=l*k;
            k*=2;


        }
        System.out.println(sum-1);
    }
}
