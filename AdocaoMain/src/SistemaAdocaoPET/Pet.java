package SistemaAdocaoPET;
/*
 * SENAI CIMATEC 
 * @author Carla Regina dos Anjos dos Santos 
 * Desenvolvimento de sistema - Noturno 
 */
public class Pet {
    private String nome;
    private String raca;
    private int anoNascimento;
    private char sexo;
    
    public Pet (String nome, String raca, int anoNascimento, char sexo){
        this.nome=nome;
        this.raca=raca;
        this.anoNascimento=anoNascimento;
        this.sexo=sexo;        
    }
        
        public String getInfoPet(){
            return nome + "|" + raca + "|" + anoNascimento + "|" + sexo + "\n";
        }
}
