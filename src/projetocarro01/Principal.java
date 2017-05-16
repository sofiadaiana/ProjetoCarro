
package projetocarro01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Carro01> listaCarro; 
        listaCarro = new ArrayList<>();
        Carro01 novo;
        int opcao; //0 - Sair 1 - Inserir 2 - Imprimir 3 - Média do valor de todos os carros 4 - Qtde de carros da cor prata
        
        do{
            opcao=menu();
            switch (opcao){
                case 1:
                    novo= cadastro();
                    listaCarro.add(novo);
                    System.out.println("Cadastrado com sucesso.");
                break;
                case 2:
                   imprimir(listaCarro);
                break;       
                case 3:
                    calcMedia(listaCarro);
                break;
                case 4:
                    calcCorPrata(listaCarro);
                break;
            }
        }while (opcao!=0);
    }
    
    private static int menu() {
        int op;
        Scanner leia= new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Imprimi");
            System.out.println("4 - Qtde de carros da cor prata");
            op=leia.nextInt();
        }while(op<0 || op>4);
        return op;
    }      
    private static Carro01 cadastro() {
        Scanner leia = new Scanner (System.in);
        Carro01 x = new Carro01();
        System.out.println("Digite a cor do carro.....:");
        x.setCor(leia.next());
        System.out.println("Digite o valor do carro...:");
        x.setValor(leia.nextDouble());
        return x;
    }
    private static void imprimir(List<Carro01> listaCarro) {
        if(listaCarro.isEmpty()){
            System.out.println("Lista Vazia");
        }
        else{
            System.out.println("Relação de carros");
            for(int i=0;i<listaCarro.size();i++){
                System.out.println(listaCarro.get(i).toString());
            }
        }
    }

    private static void calcMedia(ArrayList<Carro01> listaCarro) {
        if(listaCarro.isEmpty()){
            System.out.println("Lista Vazia");
        }
         else{
            double soma=0;
            for (int i = 0; i < listaCarro.size(); i++) {
                soma=soma+ listaCarro.get(i).getValor();
            }
            double media=soma/listaCarro.size();
            System.out.printf("O valor médio dos carros é:%.2f\n", media);
        }   
    }

    private static void calcCorPrata(ArrayList<Carro01> listaCarro) {
        if(listaCarro.isEmpty()){
            System.out.println("Lista Vazia");
        }
        else{
            int qtde=0;
            for (int i = 0; i < listaCarro.size(); i++) {
                if (listaCarro.get(i).getCor().equalsIgnoreCase("Prata"))
                qtde=qtde+1;
            }
            System.out.println("A quantidade de carros prata é:"+qtde);
        }
            
    }
        
}

