package model;

public class Cliente {
	private Integer idCliente;
	private String nomeCliente;
	private String emailCliente;
	private String senhaCliente;
	private String enderecoCliente;
	private String cidadeCliente;
	private String ufCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getUfCliente() {
		return ufCliente;
	}

	public void setUfCliente(String ufCliente) {
		this.ufCliente = ufCliente;
	}

	public Cliente(String nomeCliente, String emailCliente, String senhaCliente, String enderecoCliente,
			String cidadeCliente, String ufCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
		this.enderecoCliente = enderecoCliente;
		this.cidadeCliente = cidadeCliente;
		this.ufCliente = ufCliente;
	}

	public Cliente() {

	}

}