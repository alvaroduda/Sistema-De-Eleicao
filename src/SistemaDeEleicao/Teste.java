package SistemaDeEleicao;

/**
 * Essa Teste serve para testar a criação de um candidato, exibe informações sobre ele e simula a votação.
 * @author Álvaro Duda
 * @date 15 de Outubro de 2024
 */

public class Teste{

public static void main(String[] args){

Candidato candidato1 = new Candidato(01, "Leopoldo");

candidato1.descricaoCandidato();

candidato1.adicionarVoto();

}
}