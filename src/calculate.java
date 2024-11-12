public class calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if(args[0].equals("soma")){

            soma(x,y);
        }else if(args[0].equals("menos")){
            menos(x,y);
        }else if(args[0].equals("divisao")){
            divisao(x,y);
        }else if(args[0].equals("mult")){
            mult(x,y);
        }else{
            System.out.println("Esta operacao nao existe!");
        }


    }


    static void soma(int x, int y){
        System.out.println(x+y);
    }
    static void menos(int x, int y){
        System.out.println(x-y);
    }
    static void divisao(int x, int y){
        System.out.println(x/y);
    }
    static void mult(int x, int y){
        System.out.println(x*y);
    }
}
