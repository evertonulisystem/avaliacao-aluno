package br.com.gotasdetecnologia;

import javax.swing.JOptionPane;

public class Calculos {

	public static void main(String[] args) {
		
		String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String idadeAluno = JOptionPane.showInputDialog("Qual a idade do aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		String numeroCPF = JOptionPane.showInputDialog("Informe o numero do CPF: ");
		String nomePai = JOptionPane.showInputDialog("Informe o nome do pai do aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Informe o nome da mae do aluno: ");
		
		String disciplina1 = JOptionPane.showInputDialog("Qual a Disciplina? ");
		
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1? ");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2? ");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3? ");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4? ");
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNomeAluno(nomeAluno);
		aluno1.setIdadeAluno(Integer.valueOf(idadeAluno));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroCPF(numeroCPF);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		
//		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
//		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
//		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
//		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		
		//Saida Inicial com dados do aluno
		System.out.println("Nome do aluno: " + aluno1.getNomeAluno());
		System.out.println("Idade do aluno: " + aluno1.getIdadeAluno());
		System.out.println("Nascimento do aluno: " + aluno1.getDataNascimento());
		System.out.println("Pai do aluno: " + aluno1.getNomePai());
		System.out.println("Mãe do Aluno: " + aluno1.getNomeMae());
		
		System.out.println("Disciplina Avaliada: " + aluno1.getDisciplina());
		System.out.println("Nota 1 definida" + aluno1.getDisciplina().getNota1());
		System.out.println("Nota 2 definida" + aluno1.getDisciplina().getNota2());
		System.out.println("Nota 3 definida" + aluno1.getDisciplina().getNota3());
		System.out.println("Nota 4 definida" + aluno1.getDisciplina().getNota4());
		
		System.out.println("A média do aluno foi: " + aluno1.getMedia());
		System.out.println("O aluno foi aprovado? " + aluno1.getResultado());
		
	}
}
