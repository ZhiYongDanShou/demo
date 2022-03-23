package software.lsp;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class Client {
    private XMLHelper xmlHelper = null;
    private DataOperator dataOperator = null;
    private CipherA cipher = null;
    private  String testString = "hello";
    public Client() throws  InstantiationException,IllegalAccessException,ClassNotFoundException{
        xmlHelper = new XMLHelper();
        dataOperator = new DataOperator();
        cipher = (CipherA)Class.forName(xmlHelper.getClassName()).newInstance();
        dataOperator.setCipherA(cipher);
        String result = dataOperator.encrypt(testString);
        System.out.println(result);
    }

    public static void main(String[] args)throws InstantiationException,IllegalAccessException,ClassNotFoundException {
        new Client();
    }
}
