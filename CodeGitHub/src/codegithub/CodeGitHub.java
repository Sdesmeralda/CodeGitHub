package codegithub;
import java.util.Scanner;

public class CodeGitHub {

   
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int dni=0;
        String letras []={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V",
        "H","L","C","K","E"};
        int result []={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        int resto=0;
        
        
        System.out.println("Introduzca el DNI a comprobar");
dni= sc.nextInt();
resto=dni%23;
for (int i=0; i < result.length;i++){
if (resto==result[i]){
System.out.println("El DNI "+dni+" tiene asiganada la "+letras[i]);
}
}
    }
    
}
