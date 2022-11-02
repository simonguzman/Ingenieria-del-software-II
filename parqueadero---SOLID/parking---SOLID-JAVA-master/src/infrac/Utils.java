package infrac;
public class Utils {

    public static long redondearValor(long prmValor){
        double varValor = prmValor;
        varValor = varValor / 100;
        return (long) (Math.ceil(varValor) * 100);
    }
}
