package core;

public class Properties {

    /** Propriedade usada para não fechar a execução do WebDriver -> BaseTest.class **/
    /** OBS: NÃO RECOMENDADO, USADO APENAS FINS DIDÁTICOS **/
    public static boolean CLOSE_BROWSER = true;

    /** Informe o Browser que deseja executar os testes **/
    public static Browsers BROWSER = Browsers.CHROME;
    public static TypeExecution TIPO_EXECUCAO = TypeExecution.CLOUD;

    public enum Browsers{
        CHROME,
        FIREFOX
    }

    public enum TypeExecution{
        LOCAL,
        GRID,
        CLOUD
    }


}
