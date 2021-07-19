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
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNomeAluno(nomeAluno);
		aluno1.setIdadeAluno(Integer.valueOf(idadeAluno));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroCPF(numeroCPF);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
			
	
		
		for (int posicao = 1; posicao <= 4; posicao++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+posicao+":");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina:"+posicao+":");
			
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "DEseja remover alguma disciplina?");
		if (escolha ==0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a discilina 1 ,2 3, ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover));

			
		}
		
		System.out.println("Nome do aluno: " + aluno1.getNomeAluno());
		System.out.println("Idade do aluno: " + aluno1.getIdadeAluno());
		System.out.println("Nascimento do aluno: " + aluno1.getDataNascimento());
		System.out.println("Pai do aluno: " + aluno1.getNomePai());
		System.out.println("Mãe do Aluno: " + aluno1.getNomeMae());
		System.out.println("A média do aluno foi: " + aluno1.getMedia());
		System.out.println("O aluno foi aprovado? " + aluno1.getResultado());
		
		
	}
}
