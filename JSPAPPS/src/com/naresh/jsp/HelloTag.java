/**
 * 
 */
package com.naresh.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Naresh
 *
 */
public class HelloTag extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		try{
			JspWriter out=pageContext.getOut();
			out.println("Welcome to Guest<br>");
		}catch(Exception e){
			
		}
		return SKIP_BODY;
	}
@Override
public int doEndTag() throws JspException {
	try{
		JspWriter out=pageContext.getOut();
		out.println("Bye from Guest");
	}catch(Exception e){
		
	}
	return EVAL_PAGE;
}

}
