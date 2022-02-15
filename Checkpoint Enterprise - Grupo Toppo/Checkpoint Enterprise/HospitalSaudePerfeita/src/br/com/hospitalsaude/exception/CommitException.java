package br.com.hospitalsaude.exception;

public class CommitException extends Exception {
	
	public CommitException() {
		super("Erro, n�o foi poss�vel realizar o commit!");
	}
	
	public CommitException(String msg) {
		super(msg);
	}
}
