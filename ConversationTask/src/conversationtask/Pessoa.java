package conversationtask;

public abstract class Pessoa {
    
    // CONTRUTORES
    public Pessoa(String nome){
        this.Nome = nome;
    }
    
    // VARIAVEIS
    private String Nome;
    public String SaberONome(){ return this.Nome; }
    
    // METODOS
    protected void Falar(String texto){
        System.out.println(this.Nome + ": " + texto);
    }   
    
    protected String Responder(Pessoa pessoa, enTipoResposta tipo){
        
        if(tipo == enTipoResposta.Saudacao){
            System.out.println(this.Nome + ": Eae " + pessoa.SaberONome());
            return "";
        }            
        else if(tipo == enTipoResposta.Apresentacao){
            System.out.println(this.Nome + ": Oi, meu nome é " + this.Nome + ". E o seu?");
            return this.Nome;
        }
        else if(tipo == enTipoResposta.Sentimento){
            System.out.println(this.Nome + ": Oi, " + pessoa.SaberONome() + ", não estou muito bem, acabei de ser demitido.");
            return "";
        }
        else {
            return "";
        }
            
    } 
        
    public void Saudar(Pessoa pessoa){
    
        System.out.println("===== Saudação =====");
        this.Falar("Oi " + pessoa.SaberONome());
        pessoa.Responder(this, enTipoResposta.Saudacao);
    
    }
    
    public void SeApresentar(Pessoa pessoa){
    
        System.out.println("===== Apresentação =====");
        this.Falar("Oi, sou o " + this.Nome + ". Qual o seu nome?");
        var nome = pessoa.Responder(this, enTipoResposta.Apresentacao);
        this.Falar("Prazer, " + nome + ". Meu nome é " + this.Nome);
    
    }
    
    public void DemonstrarSentimento(Pessoa pessoa){
        
        System.out.println("===== Sentimento =====");
        this.Falar("Oi, " + pessoa.SaberONome() + ", tudo bem?");
        pessoa.Responder(this, enTipoResposta.Sentimento);
        this.Falar("Poxa, " + pessoa.SaberONome() + ". Que pena! Deixa eu te levar para tomar um sorvete para compensar.");
        
    
    }
    
}
