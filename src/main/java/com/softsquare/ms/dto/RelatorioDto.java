package com.softsquare.ms.dto;

public class RelatorioDto {

	private String status;
	private String inscricao;
	private String dataNascimento;
	private String nome;
	private String inst;
	private String idPolo;
	private String polo;
	private String poloSede;
	private String cidadePolo;
	private String estadoPolo;
	private String cpf;
	private String rg;
	private String curso;
	private String periodo;
	private String dataInscricao;
	private String dataProva;
	private String dddResidencial;
	private String foneRes;
	private String dddCel;
	private String foneCel;
	private String email;
	private String condEsp;
	private String dataEnsal;
	private String dataPagt;
	private String dataMatr;
	private String sit;
	private String mesMatr;
	private String cupom;
	private String camp;
	private String etapa;
	private String ciclo;
	private String entrEnem;
	private String origem;
	private String emprDesc;
	private String subDesc;
	private String source;
	private String medium;
	private String content;
	private String campaign;
	private String cpc;
	private String search;
	private String matricEtapa;
	private String contrAceito;
	
	public RelatorioDto() { }
	
	public RelatorioDto(String linha) {
		String[] colunas = linha.split(",");
		
		for(int i=0;i < colunas.length; i++) {
			colunas[i] = colunas[i].trim().replaceAll("\"", "");
		}
		
		status = colunas[0];
		inscricao = colunas[1];
		dataNascimento = colunas[2];
		nome = colunas[3];
		inst = colunas[4];
		idPolo = colunas[5];
		polo = colunas[6];
		poloSede = colunas[7];
		cidadePolo = colunas[8];
		estadoPolo = colunas[9];
		cpf = colunas[10];
		rg = colunas[11];
		curso = colunas[12];
		periodo = colunas[13];
		dataInscricao = colunas[14];
		dataProva = colunas[15];
		dddResidencial = colunas[16];
		foneRes = colunas[17];
		dddCel = colunas[18];
		foneCel = colunas[19];
		email = colunas[20];
		condEsp = colunas[21];
		dataEnsal = colunas[22];
		dataPagt = colunas[23];
		dataMatr = colunas[24];
		sit = colunas[25];
		mesMatr = colunas[26];
		cupom = colunas[27];
		camp = colunas[28];
		etapa = colunas[29];
		ciclo = colunas[30];
		entrEnem = colunas[31];
		origem = colunas[32];
		emprDesc = colunas[33];
		subDesc = colunas[34];
		source = colunas[35];
		medium = colunas[36];
		content = colunas[37];
		campaign = colunas[38];
		cpc = colunas[39];
		search = colunas[40];
		matricEtapa = colunas[41];
		contrAceito = colunas[42];

		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInst() {
		return inst;
	}

	public void setInst(String inst) {
		this.inst = inst;
	}

	public String getIdPolo() {
		return idPolo;
	}

	public void setIdPolo(String idPolo) {
		this.idPolo = idPolo;
	}

	public String getPolo() {
		return polo;
	}

	public void setPolo(String polo) {
		this.polo = polo;
	}

	public String getPoloSede() {
		return poloSede;
	}

	public void setPoloSede(String poloSede) {
		this.poloSede = poloSede;
	}

	public String getCidadePolo() {
		return cidadePolo;
	}

	public void setCidadePolo(String cidadePolo) {
		this.cidadePolo = cidadePolo;
	}

	public String getEstadoPolo() {
		return estadoPolo;
	}

	public void setEstadoPolo(String estadoPolo) {
		this.estadoPolo = estadoPolo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(String dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public String getDataProva() {
		return dataProva;
	}

	public void setDataProva(String dataProva) {
		this.dataProva = dataProva;
	}

	public String getDddResidencial() {
		return dddResidencial;
	}

	public void setDddResidencial(String dddResidencial) {
		this.dddResidencial = dddResidencial;
	}

	public String getFoneRes() {
		return foneRes;
	}

	public void setFoneRes(String foneRes) {
		this.foneRes = foneRes;
	}

	public String getDddCel() {
		return dddCel;
	}

	public void setDddCel(String dddCel) {
		this.dddCel = dddCel;
	}

	public String getFoneCel() {
		return foneCel;
	}

	public void setFoneCel(String foneCel) {
		this.foneCel = foneCel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCondEsp() {
		return condEsp;
	}

	public void setCondEsp(String condEsp) {
		this.condEsp = condEsp;
	}

	public String getDataEnsal() {
		return dataEnsal;
	}

	public void setDataEnsal(String dataEnsal) {
		this.dataEnsal = dataEnsal;
	}

	public String getDataPagt() {
		return dataPagt;
	}

	public void setDataPagt(String dataPagt) {
		this.dataPagt = dataPagt;
	}

	public String getDataMatr() {
		return dataMatr;
	}

	public void setDataMatr(String dataMatr) {
		this.dataMatr = dataMatr;
	}

	public String getSit() {
		return sit;
	}

	public void setSit(String sit) {
		this.sit = sit;
	}

	public String getMesMatr() {
		return mesMatr;
	}

	public void setMesMatr(String mesMatr) {
		this.mesMatr = mesMatr;
	}

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}

	public String getCamp() {
		return camp;
	}

	public void setCamp(String camp) {
		this.camp = camp;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getEntrEnem() {
		return entrEnem;
	}

	public void setEntrEnem(String entrEnem) {
		this.entrEnem = entrEnem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getEmprDesc() {
		return emprDesc;
	}

	public void setEmprDesc(String emprDesc) {
		this.emprDesc = emprDesc;
	}

	public String getSubDesc() {
		return subDesc;
	}

	public void setSubDesc(String subDesc) {
		this.subDesc = subDesc;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getCpc() {
		return cpc;
	}

	public void setCpc(String cpc) {
		this.cpc = cpc;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getMatricEtapa() {
		return matricEtapa;
	}

	public void setMatricEtapa(String matricEtapa) {
		this.matricEtapa = matricEtapa;
	}

	public String getContrAceito() {
		return contrAceito;
	}

	public void setContrAceito(String contrAceito) {
		this.contrAceito = contrAceito;
	}

	@Override
	public String toString() {
		return "RelatorioDto [status=" + status + ", inscricao=" + inscricao + ", dataNascimento=" + dataNascimento
				+ ", nome=" + nome + ", inst=" + inst + ", idPolo=" + idPolo + ", polo=" + polo + ", poloSede="
				+ poloSede + ", cidadePolo=" + cidadePolo + ", estadoPolo=" + estadoPolo + ", cpf=" + cpf + ", rg=" + rg
				+ ", curso=" + curso + ", periodo=" + periodo + ", dataInscricao=" + dataInscricao + ", dataProva="
				+ dataProva + ", dddResidencial=" + dddResidencial + ", foneRes=" + foneRes + ", dddCel=" + dddCel
				+ ", foneCel=" + foneCel + ", email=" + email + ", condEsp=" + condEsp + ", dataEnsal=" + dataEnsal
				+ ", dataPagt=" + dataPagt + ", dataMatr=" + dataMatr + ", sit=" + sit + ", mesMatr=" + mesMatr
				+ ", cupom=" + cupom + ", camp=" + camp + ", etapa=" + etapa + ", ciclo=" + ciclo + ", entrEnem="
				+ entrEnem + ", origem=" + origem + ", emprDesc=" + emprDesc + ", subDesc=" + subDesc + ", source="
				+ source + ", medium=" + medium + ", content=" + content + ", campaign=" + campaign + ", cpc=" + cpc
				+ ", search=" + search + ", matricEtapa=" + matricEtapa + ", contrAceito=" + contrAceito + "]";
	}

}
