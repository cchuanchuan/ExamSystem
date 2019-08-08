package top.cllccc.exam;

public class Rational {
    private long numerator;
    private long denominator;
    public Rational(long numerator,long denominator)
    {
        assert denominator==0:"not equal 0";
        if(denominator==0)
            throw new IndexOutOfBoundsException("分母不可为零");
        if(denominator<0)
        {
            numerator=-1*numerator;
            denominator=-1*denominator;
        }
        long cd=gcd(Math.abs(numerator),Math.abs(denominator));
        this.numerator=numerator/cd;
        this.denominator=denominator/cd;
    }
//最大公约数 欧几里得算法
    private long gcd(long abs, long abs1) {
        if(abs1==0)
            return abs;
        long temp=abs%abs1;
        return gcd(abs1,temp);
    }
    public String toString()
    {
        if(denominator==1)
            return numerator+"";
        else
            return numerator+"/"+denominator;
    }

    public long getDenominator() {
        return denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }
    public Rational plus(Rational b)//jia
    {
        long num=b.getNumerator();
        long den=b.getDenominator();
//        long tempnum=num*denominator+numerator*den;
        long tempnum=num*denominator+numerator*den;
        long temp=denominator*den;
        return new Rational(tempnum,temp);
    }
    public Rational minus(Rational b)//jian
    {
        long num=b.getNumerator();
        long den=b.getDenominator();
        long tempnum=num*denominator-numerator*den;
        long temp=denominator*den;
        return new Rational(tempnum,temp);
    }
    public Rational times(Rational b)//ji
    {
        long num=b.getNumerator();
        long den=b.getDenominator();
        long tempnum=num*numerator;
        long temp=den*denominator;
        return new Rational(tempnum,temp);
    }
    public  Rational divides(Rational b)
    {
        long num=b.getNumerator();
        long den=b.getDenominator();
        long tempnum=num*denominator;
        long temp=numerator*den;
        return new Rational(tempnum,temp);
    }
    public boolean equals(Rational that)
    {
        long num=that.getNumerator();
        long den=that.getDenominator();
        long cd=gcd(Math.abs(num),Math.abs(den));
        num=num/cd;
        den=den/cd;
        if(num==numerator&&den==denominator)
        {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        Rational rational=new Rational(1,1);
        //Rational rational1=new Rational(1,4);
       System.out.println(rational.toString());
    }
}
