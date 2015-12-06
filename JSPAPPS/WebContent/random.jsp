<% java.util.Random r=new java.util.Random();
int k=r.nextInt(10);
out.println("Random number is: "+k);
int x=Integer.parseInt(request.getParameter("guess").trim());

if(k==x){
	out.println("<h2>Your Guess is correct</h2>");
}else{
	out.println("<h2>Your Guess is wrong try next time</h2>");
	}
%>

