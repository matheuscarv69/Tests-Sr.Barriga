package pages;

import core.BasePage;

public class MenuPage extends BasePage {

    public void accessScreenInsertAccount() {
        clickLink("Contas");
        clickLink("Adicionar");
    }

    public void accessScreenAccountOptions() {
        clickLink("Contas");
        clickLink("Listar");
    }

    public void accessScreenCreateMovement() {
        clickLink("Criar Movimentação");
    }

    public void accessScreenMonthlySummary(){
        clickLink("Resumo Mensal");
    }

}
