package functions;
public class Tools {
    public int somar(int x, int y){
        System.out.println(x + y);
        return x + y;
    }

    public int subtrair(int x, int y){
        System.out.println(x - y);
        return x - y;
    }

    public int multiplicar(int x, int y){
        System.out.println(x * y);
        return x * y;
    }

    public int dividir(int x, int y){
        System.out.println(x / y);
        return x / y;
    }

    public static void main(String[] args){
        Tools tools = new Tools();
    }
}