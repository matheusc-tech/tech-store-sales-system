import java.util.Scanner;

public class Main {

    /// Executa o programa
    public static void main(String[] args) {


        /// Para deixar a parte de cima do terminal limpa( melhora visual )
        System.out.println("\n".repeat(50));

        /// Mensagem de boas vindas da loja
        System.out.println("Olá seja bem vindo a nossa loja!\nEsses são nossos produtos!");
        System.out.println();


        /// Produtos da loja
        Produtos p1 = new Produtos("ReDragon", "Cobra", 10, 120.00);
        Produtos p2 = new Produtos("HypeX", "B500", 20, 300.00);
        Produtos p3 = new Produtos("ReDragon", "Sylinder", 5, 530.00);

        double total = 0;


        p1.exibirInformacoes();
        System.out.println();

        p2.exibirInformacoes();
        System.out.println();

        p3.exibirInformacoes();
        System.out.println();



        Scanner input = new Scanner(System.in);

        int escolha = input.nextInt();

        if (escolha == 1) {
            p1.quantidade--;
            total += p1.valor;
            System.out.println("\n".repeat(50));
            System.out.printf("Você escolheu o %s, da marca %s!\n", p1.nome, p1.marca);
            System.out.println();
            System.out.println("===========NOTA FISCAL===========");
            System.out.println("= Produto: ReDragon Cobra       =");
            System.out.println("= Código: 24NMVPO2              =");
            System.out.println("= Valor unitário: R$ 120.00     =");
            System.out.println("=-------------------------------=");
            System.out.print("= Subtotal: R$" + total);
            System.out.print("             =\n");
            System.out.println("===========By Matheus============");

        }
        else if (escolha == 2) {
            p2.quantidade--;
            total += p2.valor;
            System.out.println("\n".repeat(50));
            System.out.printf("Você escolheu o %s, da marca %s!\n", p2.nome, p2.marca);
            System.out.println();
            System.out.println("===========NOTA FISCAL===========");
            System.out.println("= Produto: HyperX B500          =");
            System.out.println("= Código: 26SMVP42              =");
            System.out.println("= Valor unitário: R$ 300.00     =");
            System.out.println("=-------------------------------=");
            System.out.print("= Subtotal: R$" + total);
            System.out.print("             =\n");
            System.out.println("===========By Matheus============");
        }
        else if (escolha == 3) {
            p3.quantidade--;
            total += p3.valor;
            System.out.println("\n".repeat(50));
            System.out.printf("Você escolheu o %s, da marca %s!\n", p3.nome, p3.marca);
            System.out.println();
            System.out.println("===========NOTA FISCAL===========");
            System.out.println("= Produto: ReDragon Sylinder    =");
            System.out.println("= Código: 54NMVP22              =");
            System.out.println("= Valor unitário: R$ 530.00     =");
            System.out.println("=-------------------------------=");
            System.out.print("= Subtotal: R$" + total);
            System.out.print("             =\n");
            System.out.println("===========By Matheus============");
        } else {
            System.out.println("Produto inválido");
        }


        input.close();
    }
}