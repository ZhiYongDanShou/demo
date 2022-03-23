package software.lsp;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class DataOperator {
    public CipherA getCipherA() {
        return cipherA;
    }

    private CipherA cipherA = null;
    public DataOperator(){
    }
    public void setCipherA(CipherA c){
        cipherA = c;
    }
    public String encrypt(String plainText){
        return cipherA.encrypt(plainText);
    }
}
