package wrapperClass;

public class UnBoxing {
	public static void main(String[] args) {
        int a=300;
        long b=500;
        float c=3.0f;
        double d=77.0D;
        char e='v';
        Integer s=a;
        Long l=b;
        Float x=c;
        double y=d;
        System.out.println("AutoBox Converstion "+s+" "+l+" "+x+" "+y);
        int a1=s;
        System.out.println("Unbox Converstionl :"+a1);
        
        //another Way of Unboxing
        Integer i=new Integer(100);
        int val=i.intValue();
        System.out.println("Unboxing value is :"+val);
        Double dd=new Double(12.4);
        double dd1=dd.doubleValue();
        System.out.println("Double unbox value :"+dd1);
        
	}
}
