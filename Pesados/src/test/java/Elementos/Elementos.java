package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By pesquisar = By.id("q");
	private By usuario = By.id("Username");
	private By senha = By.id("Password");
	private By btnlogin = By.xpath("/html/body/div[1]/div[2]/div/div/form/button[1]");
	private By btnCadastros = By.xpath("//*[@id=\"single-spa-application:@unidas/navbar\"]/navbar-root/div/app-main/div/div/app-menu/div/div[2]/ul/li/ul/li/a/span");
	private By btnCategorias =  By.id("id-Categorias");
	private By btnIncluirCategoria = By.id("btn-add-new");
	private By nomeCategoria = By.id("nomeCategoria");
	private By status = By.id("statusCategoria");
	private By familia = By.id("familiaCategoria");
	private By descricaoCategoria = By.id("descricaoCategoria");
	private By btnSalvar =  By.id("btn-save-add");
	
	public By getPesquisar() {
		return pesquisar;
	}
	public By getUsuario() {
		return usuario;
	}
	public By getSenha() {
		return senha;
	}
	public By getBtnlogin() {
		return btnlogin;
	}
	public By getBtnCadastros() {
		return btnCadastros;
	}
	public By getBtnCategorias() {
		return btnCategorias;
	}
	public By getBtnIncluirCategoria() {
		return btnIncluirCategoria;
	}
	public By getNomeCategoria() {
		return nomeCategoria;
	}
	public By getStatus() {
		return status;
	}
	public By getFamilia() {
		return familia;
	}
	public By getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public By getBtnSalvar() {
		return btnSalvar;
	}
	
	
	

}
