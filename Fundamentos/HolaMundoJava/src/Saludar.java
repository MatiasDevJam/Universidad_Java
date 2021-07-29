import java.util.Scanner;

public class Saludar {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona la calificacion:");
        int num = Integer.parseInt(consola.nextLine());
       var calificacion = "Calificacion incorrecta";
       
        switch(num){
            case 9: case 10:
            calificacion = "Su calificacion es A";
            break;
            case 8:
            calificacion = "Su calificacion es B";
            break;
                    
        }
    }
}
