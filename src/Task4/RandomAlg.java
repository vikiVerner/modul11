package Task4;

public class RandomAlg {
    private long a,c,m;

    public RandomAlg(long a, long m){
        this.a=a;
        this.m=m;
    }
    public RandomAlg c(long c){
        this.c = c;
        return this;
    }
    public long next(){
        long i = a%2+m*c;
        a++;
        m-=2;
        c+=2;
        return (i+654)%543  ;
    }

}
