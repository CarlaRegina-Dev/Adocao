package SistemaAdocaoPET;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * SENAI CIMATEC 
 * @author Carla Regina dos Anjos dos Santos 
 * Desenvolvimento de sistema - Noturno 
 */
public class AdocaoMain {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Pet p1 =  new Pet ("Garfield","Vira-Lata",2003,'M');
        Pet p2 =  new Pet ("Chico", "Siamês",2010,'M');
        Pet p3 =  new Pet ("Lala", "Persa", 2000,'F');
        Pet p4 =  new Pet ("Suzi", "Angorá",2021,'F');
        
        ArrayList<Pet>petsAdocao = new ArrayList<Pet>();
        
        petsAdocao.add(p1);
        petsAdocao.add(p2);
        petsAdocao.add(p3);
        petsAdocao.add(p4);
        
        Pessoa pessoa = new Pessoa("Sara","123456789-00",1987);      
        
        AdocaoMain.abrirMenuInciar(pessoa,petsAdocao,entrada);
    }
    
     public static void abrirMenuInciar(Pessoa pessoa,ArrayList<Pet>petsAdocao,
             Scanner entrada){
        String opcao ="X";
            while(!opcao.equals("4")){
                System.out.println("O que deseja fazer ?" + "\n" 
                        + "1) Adotar pet" + "\n"
                        + "2) Listar pets adotados" + "\n"
                        + "3) Listar pets restantes" + "\n" 
                        + "4) Sair");
                opcao = entrada.next();
                    if(opcao.equals("1")){
                        AdocaoMain.realizarAdocao(pessoa,petsAdocao,entrada); 
                   
                    }else if(opcao.equals("2")){
                        AdocaoMain.listarPetsAdotados(pessoa);
                    
                    } else if (opcao.equals("3")){
                        AdocaoMain.listarPetsRestantes(petsAdocao); 
                    }     
            }
    }
    private static void realizarAdocao(Pessoa pessoa, ArrayList<Pet>petsAdocao, 
            Scanner entrada){
        System.out.println("Informe qual pet deseja adotar: ");
        for (int i = 0; i < petsAdocao.size(); i++) {
            System.out.println(i + " - " + petsAdocao.get(i).getInfoPet());
        }
        int numeroPet = entrada.nextInt();
        Pet candidato = petsAdocao.get(numeroPet);
        if (pessoa.adotarPet(candidato) == true) {
            System.out.println("Pet " + numeroPet + " adotado com sucesso!\n");
            petsAdocao.remove(candidato);
        } else {
            System.out.println("Você já adotou o máximo de pets permitidos!\n");
        }
    }
    
    private static void listarPetsAdotados(Pessoa pessoa) {
        System.out.println("\n Pets adotados até o momento: ");
        System.out.println(pessoa.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsAdocao) {
        System.out.println("\n Pets restantes para adoção: ");
        for (Pet p : petsAdocao) {
            System.out.println(p.getInfoPet());
        }
 }      
}
