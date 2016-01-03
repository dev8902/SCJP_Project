/**
 * 
 */
package com.naresh.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * @author Naresh
 *
 */
public class WelcomeTag extends BodyTagSupport{
	int count=0;
	@Override
	public int doStartTag() throws JspException {
		try{
			JspWriter out=pageContext.getOut();
			out.println("<h1>Welcome</h1><br>");
		}catch(Exception e){
			
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doAfterBody() throws JspException {
		count++;
		if(count==3)
			return SKIP_BODY;
		else
			return EVAL_BODY_AGAIN;	
	}
@Override
public int doEndTag() throws JspException {
	try{
		JspWriter out=pageContext.getOut();
	}catch(Exception e){
		
	}
	return SKIP_PAGE;
}
	

}
