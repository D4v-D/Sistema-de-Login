import java.util.Scanner;



public class Login_system {


    public static void login() {
    Scanner scan = new Scanner(System.in);

    String user_adm = "admi";
    String pass_adm = "321";

    String usuario = "user";
    String senha = "Teste123";

    System.out.println("----------------------------------");
    System.out.println("Digite o usuario e a senha");
    String user_r = scan.next();
    String pass_r = scan.next();

        if(user_r.compareTo(usuario) == 0 && pass_r.compareTo(senha) == 0) {
            System.out.println("Login efetuado");


        } else if(user_r.compareTo(user_adm) == 0 && pass_r.compareTo(pass_adm) == 0) {
            System.out.println("----------------------------------");
            System.out.println("LOGIN ADM");

        } else {

            int quant = 3;

            for(int i = 1; i <= quant; i++) {
                quant--;
                String user2 = user_r;
                String pass2 = pass_r;

                System.out.println("----------------------------------");
                System.out.printf("Usuario ou senha incorretos - ");
                System.out.printf("%d tentativas restantes\n", quant);
                System.out.println("");

                System.out.println("Digite o usuario e a senha novamente");
                user2 = scan.next();
                pass2 = scan.next();

                    if (user2.compareTo(usuario) == 0 && pass2.compareTo(senha) == 0) {
                        System.out.println("Login efetuado");

                        break;  
                    }
            }

        }

}


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Já possui login?");
    String res = scanner.next();


    if(res.compareToIgnoreCase("sim") == 0) {
        login();
       
        
    } else if(res.compareToIgnoreCase("nao") == 0) {
        System.out.println("Digite o nome de usuario");
        String new_user = scanner.next();

        System.out.println("Digite a senha: ");
        String new_pass = scanner.next();
        System.out.println("Digite a senha novamente: ");
        String new_pass2 = scanner.next();

        if(new_pass2.compareTo(new_pass) == 0) {
            System.out.println("Conta criada");

            login();

        } else if(new_pass2.compareTo(new_pass) != 0) {

            System.out.println("Digite a senha novamente");
            String senha = scanner.next();

            if(senha.compareTo(new_pass) == 0) {

                login();

            } else {
            System.out.println("ERRO");
        }

            
        } else {
            System.out.println("ERRO");
        }

        
        
    }


    
}

}