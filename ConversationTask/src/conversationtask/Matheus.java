/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversationtask;

/**
 *
 * @author Isabela Vilas
 */
public class Matheus extends Pessoa {
    
    public Matheus(){
        super("Matheus");
    }
    
    @Override
    public void DemonstrarSentimento(Pessoa pessoa){
        
        System.out.println("===== Sentimento =====");
        this.Falar("Oi, " + pessoa.SaberONome() + ", tudo bem?");
        pessoa.Responder(this, enTipoResposta.Sentimento);
        this.Falar("Dane-se!");
        
    }
    
}
