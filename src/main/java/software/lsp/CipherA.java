package software.lsp;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class CipherA {
        public CipherA() {
        }

        public String encrypt(String plainText) {
            byte[] text = plainText.getBytes();
            for (int i = 0; i < text.length; i++) {
                text[i] ^= 8;
            }
            String rs="CipherA encrypt:"+new String(text);
            return rs;
        }

}

