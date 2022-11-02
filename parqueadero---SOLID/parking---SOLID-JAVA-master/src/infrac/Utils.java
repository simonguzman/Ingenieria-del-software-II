package infrac;
public class Utils {

    public static long redondear(long prmValue){
        double varValue = prmValue;
        varValue = varValue / 100;
        return (long) (Math.ceil(varValue) * 100);
    }
}
