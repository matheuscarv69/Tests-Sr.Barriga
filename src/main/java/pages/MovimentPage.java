package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class MovimentPage extends BasePage {


    public void setType(String option) {
        selectComboBoxOption("tipo", option);
    }

    public void setDateMoviment(String dateMoviment) {
        write("data_transacao", dateMoviment);
    }

    public void setDatePayment(String datePayment) {
        write("data_pagamento", datePayment);
    }

    public void setDescription(String description) {
        write("descricao", description);
    }

    public void setInterested(String interested) {
        write("interessado", interested);
    }

    public void setValue(String value) {
        write("valor", value);
    }

    public void setAccount(String account) {
        selectComboBoxOption("conta", account);
    }

    public void setSituationPaidOut() {
        clickRadioButton("status_pago");
    }

    public void setSituationPending() {
        clickRadioButton("status_pendente");
    }

    public void clickButtonSave() {
        clickButton(By.xpath("//button[@class='btn btn-primary']"));
    }

    public String getMessageSuccess() {
        return getTextComponent(By.xpath("//div[@class='alert alert-success']"));
    }

    public String getMsgRequiredDateMovement() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Data da Movimentação é obrigatório']"));
    }

    public String getMsgRequiredDatePayment() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Data do pagamento é obrigatório']"));
    }

    public String getMsgRequiredDescription() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Descrição é obrigatório']"));
    }

    public String getMsgRequiredInterested() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Interessado é obrigatório']"));
    }

    public String getMsgRequiredValue() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Valor é obrigatório']"));
    }

    public String getMsgRequiredValueNumber() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Valor deve ser um número']"));
    }

    /** Pega a mensagem de erro de data de movimentacao aior que data de pagamento **/
    public String getMsgRequiredInvalidFutureMovement(){
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']//li[.='Data da Movimentação deve ser menor ou igual à data atual']"));
    }


}
