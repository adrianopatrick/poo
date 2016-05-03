package br.unifor.poo.aula.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	public static void main(String[] args) {
		File dados = new File("C:\\Users\\alunot18\\dados.txt");
		try (BufferedReader buffer = new BufferedReader(new FileReader(dados));) {
			String linha = null;
			while ((linha = buffer.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro geral de acesso.");
		}
	}
}
