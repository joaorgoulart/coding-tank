public class Main {
    public static void main(String[] args) {
       testaPar(Integer.parseInt(args[0]));
        System.out.println("A");
    }
    public static void testaPar(int num){
        if(num % 2 == 0){
            System.out.printf("%d é par.\n", num);
        }else{
            System.out.printf("%d é ímpar.\n", num);
        }
    }
}

