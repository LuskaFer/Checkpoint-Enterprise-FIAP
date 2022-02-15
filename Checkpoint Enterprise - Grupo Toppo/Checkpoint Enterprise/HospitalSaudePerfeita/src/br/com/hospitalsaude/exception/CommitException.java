package br.com.hospitalsaude.exception;

public class CommitException extends Exception {
	
	public CommitException() {
		super("Erro, não foi possível realizar o commit!");
	}
	
	public CommitException(String msg) {
		super(msg);
	}
}
