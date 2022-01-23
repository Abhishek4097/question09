class NegativeDimensionExcepti extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

 class ThrowThrowsDemo
{
    static int area(int l,int b) throws NegativeDimensionExcepti
    {
        if(l<0 || b<0)
            throw new NegativeDimensionExcepti();
        return l*b;
    }
    static void meth1() throws NegativeDimensionExcepti
    {
        System.out.println("Area is "+area(10,5));
    }

    public static void main(String[] args)
    {
        try
        {
            meth1();
        }
        catch(NegativeDimensionExcepti e)
        {
            System.out.println(e);
        }
        System.err.println("Hello it's me");
    }
}