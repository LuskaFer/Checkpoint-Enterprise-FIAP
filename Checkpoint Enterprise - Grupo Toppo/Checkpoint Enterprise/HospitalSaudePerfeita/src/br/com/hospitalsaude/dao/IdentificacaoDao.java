package br.com.hospitalsaude.dao;
import br.com.hospitalsaude.bean.*;
import br.com.hospitalsaude.exception.*;


public interface IdentificacaoDao {

		void create (Identificacao identificacao) throws CommitException;
		
		Identificacao read (int id);
		
		void update (Identificacao identificacao) throws CommitException;
		
		void delete (int id) throws CommitException;
		
}
