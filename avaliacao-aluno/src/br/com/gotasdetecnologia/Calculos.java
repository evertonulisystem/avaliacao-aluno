package br.com.gotasdetecnologia;

import javax.swing.JOptionPane;

public class Calculos {

	public static void main(String[] args) {
		
		String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String idadeAluno = JOptionPane.showInputDialog("Qual a idade do aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		String numeroCPF = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		String nomePai = JOptionPane.showInputDialog("Informe o nome do pai do aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Informe o nome da mae do aluno: ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNomeAluno(nomeAluno);
		aluno1.setIdadeAluno(Integer.valueOf(idadeAluno));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroCPF(numeroCPF);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		
		
		
	}

}
