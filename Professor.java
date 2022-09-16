public class Professor {
   private String nome;
   private String formacao;
   private String email;
   public void status(){
    System.out.println("NOME DO PROFESSOR " + getNome());
    System.out.println("EMAIL DO PROFESSOR"+ getEmail());

   }

public String getFormacao() {
	return formacao;
}

public void setFormacao(String formacao) {
	this.formacao = formacao;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}



}

