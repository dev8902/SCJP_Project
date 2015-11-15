import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * 
 */

/**
 * @author Naresh
 *
 */
public class TestApplet extends Applet implements ActionListener{
	Label l;
	TextField tf;
	Button b;
	@Override
	public void init() {
		l=new Label("Enter Select Command");
		tf=new TextField(30);
		b=new Button("Get Data");
		Font f=new Font("Arial", Font.BOLD, 20);
		l.setFont(f);
		add(l);
		tf.setFont(f);
		add(tf);
		b.setFont(f);
		add(b);
		b.addActionListener(this);
	}
	@Override
	public void paint(Graphics g) {
		setBackground(Color.cyan);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			String s=tf.getText();
			URL u=new URL("http://localhost:2015/SERVLETAPP/AppletTestServlet?cmd="+s);
			AppletContext context=getAppletContext();
			context.showDocument(u);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	

}
