package Domain;

import java.util.Date;

public class Empresa {
	
	private String nome;
	private Date data;
	private Double valorEmpresa;
	private Integer crescimentoAnual;
	
	public Empresa() {
		
	}

	public Empresa(String nome, Date data, Double valorEmpresa, Integer crescimentoAnual) {
		this.nome = nome;
		this.data = data;
		this.valorEmpresa = valorEmpresa;
		this.crescimentoAnual = crescimentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorEmpresa() {
		return valorEmpresa;
	}

	public void setValorEmpresa(Double valorEmpresa) {
		this.valorEmpresa = valorEmpresa;
	}

	public Integer getCrescimentoAnual() {
		return crescimentoAnual;
	}

	public void setCrescimentoAnual(Integer crescimentoAnual) {
		this.crescimentoAnual = crescimentoAnual;
	}
	
	public Double CrescimentoEmpresa() {
		Double crescimento = ((valorEmpresa * crescimentoAnual) / 100);
		valorEmpresa += crescimento;
		return valorEmpresa;
	}

}
