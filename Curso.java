import java.util.Date;

public class Curso {
 private  String nome;
 private  int cargaHoraria;
 private  String modalidade;
 private  String nivel;
 private  Date dateDeinicio;
 private  Date dataDefim;
 private  Boolean gratuito;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getCargaHoraria() {
    return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
}
public String getModalidade() {
    return modalidade;
}
public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
}
public String getNivel() {
    return nivel;
}
public void setNivel(String nivel) {
    this.nivel = nivel;
}
public Date getDateDeinicio() {
    return dateDeinicio;
}
public void setDateDeinicio(Date dateDeinicio) {
    this.dateDeinicio = dateDeinicio;
}
public Date getDataDefim() {
    return dataDefim;
}
public void setDataDefim(Date dataDefim) {
    this.dataDefim = dataDefim;
}
public Boolean getGratuito() {
    return gratuito;
}
public void setGratuito(Boolean gratuito) {
    this.gratuito = gratuito;
}

   
}
