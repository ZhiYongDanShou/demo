package software.lsp;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class CipherB extends CipherA{

        @Override
        public String encrypt(String plainText) {
            byte[] text = plainText.getBytes();
            for (int i = 0; i < text.length; i++) {
                text[i] += 8;
            }
            String rs="CipherB encrypt:"+new String(text);
            return rs;
//        return "加密算法B" + plainText;
        }
}
