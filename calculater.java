public class calculater {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        calculater cal=new calculater();
         int intsum=cal.add(5,10);
         double doublesum=cal.add(3.5,7.2);

         System.out.println("integer sum:" + intsum);
        System.out.println("double sum:" +doublesum);
    }
}
