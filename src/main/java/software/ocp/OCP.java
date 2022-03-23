package software.ocp;

import software.lsp.XMLHelper;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class OCP {
    private XMLHelper xmlHelper = null;
    private LoginForm loginform = null;
    private AbstractButton abstractButton = null;
    public OCP() throws  InstantiationException,IllegalAccessException,ClassNotFoundException{
        xmlHelper = new XMLHelper();
        loginform = new LoginForm();
        abstractButton = (AbstractButton)Class.forName(xmlHelper.getClassName()).newInstance();
        loginform.setButton(abstractButton);
        loginform.display();
    }

    public static void main(String[] args)throws InstantiationException,IllegalAccessException,ClassNotFoundException {
        new OCP();
    }
}
