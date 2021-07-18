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
		
		//String disciplina1 = JOptionPane.showInputDialog("Qual a Disciplina? ");
		
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
			
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Hardware");
		disciplina2.setNota(80);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Logica");
		disciplina3.setNota(50);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Redes");
		disciplina4.setNota(50);
		aluno1.getDisciplinas().add(disciplina4);
		
		
		//Saida Inicial com dados do aluno
		System.out.println("Nome do aluno: " + aluno1.getNomeAluno());
		System.out.println("Idade do aluno: " + aluno1.getIdadeAluno());
		System.out.println("Nascimento do aluno: " + aluno1.getDataNascimento());
		System.out.println("Pai do aluno: " + aluno1.getNomePai());
		System.out.println("Mãe do Aluno: " + aluno1.getNomeMae());
		System.out.println("A média do aluno foi: " + aluno1.getMedia());
		System.out.println("O aluno foi aprovado? " + aluno1.getResultado());
		
	}
}
