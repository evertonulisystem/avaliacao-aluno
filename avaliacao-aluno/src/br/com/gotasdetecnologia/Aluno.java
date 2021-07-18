package br.com.gotasdetecnologia;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nomeAluno;
	private int idadeAluno;
	private String dataNascimento;
	private String numeroCPF;
	private String nomePai;
	private String nomeMae; 
	
	// essa linha sai quando virar Lista private Disciplina disciplina = new Disciplina();
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno() {
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getIdadeAluno() {
		return idadeAluno;
	}

	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	
		public double getMedia() {
		return 0;
		}
	
	public boolean getResultado() {
		double media = this.getMedia();
		if (media >= 70) {
			return true;
		}else {
				return false;
					}
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", idadeAluno=" + idadeAluno + ", dataNascimento=" + dataNascimento
				+ ", numeroCPF=" + numeroCPF + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae+"]";
	}

	

}
