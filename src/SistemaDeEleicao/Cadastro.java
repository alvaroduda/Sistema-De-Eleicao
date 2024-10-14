package SistemaDeEleicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Essa permite cadastrar vários candidatos e registrar votos.
 * No final, mostra os resultados da votação.
 * @author Álvaro Duda
 * @date 15 de Outubro de 2024
 */

public class Cadastro {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Candidato> candidatos = new ArrayList<>();


        System.out.print("Quantos candidatos deseja cadastrar? ");
        int quantidadeCandidatos = scanner.nextInt();
        for (int i = 0; i < quantidadeCandidatos; i++) {
            System.out.print("Digite o número do candidato: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do candidato: ");
            String nome = scanner.nextLine();
            candidatos.add(new Candidato(numero, nome));
        }

        System.out.print("Quantos votos deseja registrar? ");
        int quantidadeVotos = scanner.nextInt();
        for (int i = 0; i < quantidadeVotos; i++) {
            System.out.print("Digite o número do candidato que recebeu o voto: ");
            int numeroVoto = scanner.nextInt();
            boolean encontrado = false;
            for (Candidato candidato : candidatos) {
                if (candidato.getNumerodocanditado() == numeroVoto) {
                    candidato.adicionarVoto();
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Candidato não encontrado: " + numeroVoto);
            }
        }

        System.out.println("\nResultados da votação:");
        for (Candidato candidato : candidatos) {
            candidato.descricaoCandidato();
        }

        scanner.close();

    }

}
