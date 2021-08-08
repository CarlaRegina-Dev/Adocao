package SistemaAdocaoPET;
import java.util.ArrayList;
/*
 * SENAI CIMATEC 
 * @author Carla Regina dos Anjos dos Santos 
 * Desenvolvimento de sistema - Noturno 
 */
public class Pessoa {
    private String nome;
    private String CPF;
    private int anoNascimento;
    private ArrayList <Pet> petsAdocao;
    private static final int MAXIMO_PETS = 2;
    
    public Pessoa(String nome, String CPF, int anoNascimento){
        this.nome=nome;
        this.CPF=CPF;
        this.anoNascimento=anoNascimento;
        this.petsAdocao= new ArrayList<>();  
    }
        
       /*public boolean adotarPet (Pet p){
            if(anoNascimento<2003 && petsAdocao.size()<Pessoa.MAXIMO_PETS){ 
               petsAdocao.add(p);
                
                return true
            } else { 
            	
            	return false;                
          	}
        }     */ 
    
    public boolean adotarPet(Pet p) {
        boolean permissao = (anoNascimento < 2003 && petsAdocao.size() < MAXIMO_PETS) 
             ? petsAdocao.add(p) : false;
             
        return permissao;
    }
        
        public String listarPets(){
            String dados = "";
                for(Pet p: petsAdocao){
                  dados+= p.getInfoPet();  
        
                } return dados;
        }        
}
