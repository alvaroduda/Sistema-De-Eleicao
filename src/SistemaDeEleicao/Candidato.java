package SistemaDeEleicao;
    
/**
 * Essa classe representa um candidato em uma eleição, contém atributos e métodos.
 * @author Álvaro Duda
 * @date 15 de Outubro de 2024
 */

public class Candidato {

        
        private int numerodocanditado;
        private String nomedocandidato;
        private int numerodevotos;


        public Candidato (int numerodocanditado, String nomedocandidato) {
            this.numerodocanditado = numerodocanditado;
            this.nomedocandidato = nomedocandidato;
            this.numerodevotos = 0;
        }


        public int getNumerodocanditado() {
            return numerodocanditado;
        }


        public String getNomedocandidato() {
            return nomedocandidato;
        }


        public int getNumerodevotos() {
            return numerodevotos;
        }
        
        public void descricaoCandidato() {
            System.out.println("Candidato: " + getNomedocandidato() + " | Número: " + getNumerodocanditado() + " | Votos: " + getNumerodevotos());
        }

        public void adicionarVoto () {
          numerodevotos++;
            if (numerodevotos == 1){
                System.out.println("Você efetuou um voto, agora " + getNomedocandidato() + " tem " + getNumerodevotos() + " voto.");}
            else {
                System.out.println("Você efetuou um voto, agora " + getNomedocandidato() + " tem " + getNumerodevotos() + " votos.");}    
            
             descricaoCandidato();
        }
        
    }
