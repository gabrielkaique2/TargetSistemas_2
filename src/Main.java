import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string=new String();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        string=scanner.nextLine();
        int cont = 0;

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='a' || string.charAt(i)=='A'){
                cont = cont + 1;
            }

        }if(cont != 0){
            System.out.println("A string "+string+" possui "+cont +" letras A");;
        }else{
            System.out.println("A string "+string+" não possui letras A");
        }

        //System.out.println(string.contains("a"));

    }
}