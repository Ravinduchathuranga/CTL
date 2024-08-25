package model;

import java.io.IOException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CTL1 extends SimpleTagSupport {

    
    
    @Override
    public void doTag() throws JspException, IOException {
        //we can add custom printing things like these 
        JspContext c=getJspContext();
        c.getOut().write("Hello");
    }

}
