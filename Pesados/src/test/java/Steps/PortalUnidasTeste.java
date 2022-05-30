package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PortalUnidasTeste extends Metodos {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {

		metodos.abrirNavegador(site);

	} 

	@When("digito email {string}")
	public void digito_email(String email) {

		metodos.escrever(email, getUsuario());
		metodos.clicar(getBtnlogin());

	}

	@When("digito senha {string}")
	public void digito_senha(String senha) {

		metodos.escrever(senha, getSenha());
		metodos.submit(getBtnlogin());

	}

	@When("clico em cadatros")
	public void clico_em_cadatros() {

		metodos.clicar(getBtnCadastros());

	}

	@When("clico em categorias")
	public void clico_em_categorias() {

		metodos.clicar(getBtnCategorias());

	}

	@When("clico em incluir categoria")
	public void clico_em_incluir_categoria(String teste) throws IOException {

		metodos.clicar(getBtnIncluirCategoria());
		metodos.screenShot(teste);

	}

	@When("preencho todos os campos")
	public void preencho_todos_os_campos(String teste) throws IOException {

		metodos.escrever("Nova Categoria", getNomeCategoria());
		metodos.clicar(getStatus());
		metodos.Selecionar(getStatus());
		metodos.clicar(getFamilia());
		metodos.Selecionar(getFamilia());
		metodos.escrever("Nova Categoria Teste", getDescricaoCategoria());
		metodos.screenShot(teste);

	}

	@When("clico em salvar")
	public void clico_em_salvar(String teste) throws IOException {

		metodos.clicar(getBtnSalvar());
		metodos.screenShot(teste);

	}

	@Then("categoria cadastrada com sucesso")
	public void categoria_cadastrada_com_sucesso() {

		// metodos.validarTexto("Registro incluido com sucesso", get());
		metodos.fecharNavegador();

	}

}
