package model;

public class Contato {

	private Integer idContato;
	private String nomeContato;
	private String emailContato;
	private String mensagemContato;

	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getMensagemContato() {
		return mensagemContato;
	}

	public void setMensagemContato(String mensagemContato) {
		this.mensagemContato = mensagemContato;
	}

	public Contato(String nomeContato, String emailContato, String mensagemContato) {
		super();
		this.nomeContato = nomeContato;
		this.emailContato = emailContato;
		this.mensagemContato = mensagemContato;
	}

	public Contato() {

	}

}
