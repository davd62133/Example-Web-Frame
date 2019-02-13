import Annotationes.WebGet;
import Applications.WebFrameApplication;

public class CalculadoraApplication {
    public static void main(String args[]){
        WebFrameApplication.run(CalculadoraApplication.class,35000,args);
    }

    @WebGet("/cuadrado")
    public String cuadrado(String num){
        int a = Integer.parseInt(num);
        return String.valueOf(a*a);
    }
}
