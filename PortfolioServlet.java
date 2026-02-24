import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PortfolioServlet extends HttpServlet {

    public void init() {
        System.out.println("Portfolio Loaded");
    }

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>Sai Aniket Portfolio</title></head><body>");

      
        out.println("<h1>Sai Aniket</h1>");
        out.println("<h3>B.Tech | Gandhi Institute of Engineering and Technology | 2nd Year</h3>");

        out.println("<img src='profile.jpg' width='150'><br><hr>");

        
        out.println("<ul>");
        out.println("<li><a href='#bio'>Bio</a></li>");
        out.println("<li><a href='#skills'>Skills</a></li>");
        out.println("<li><a href='#projects'>Projects</a></li>");
        out.println("<li><a href='#achievements'>Achievements</a></li>");
        out.println("<li><a href='#contact'>Contact</a></li>");
        out.println("</ul><hr>");

      
        out.println("<h1 id='bio'>Bio</h1>");
        out.println("<p>I am a passionate B.Tech student interested in software development, cybersecurity, and building real-world applications. I enjoy solving problems using programming and continuously learning new technologies.</p><hr>");

      
        out.println("<h1 id='skills'>Skills</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Skill</th><th>Level</th></tr>");
        out.println("<tr><td>Java</td><td>Intermediate</td></tr>");
        out.println("<tr><td>Python</td><td>Intermediate</td></tr>");
        out.println("<tr><td>JavaScript</td><td>Intermediate</td></tr>");
        out.println("<tr><td>HTML</td><td>Advanced</td></tr>");
        out.println("<tr><td>CSS</td><td>Advanced</td></tr>");
        out.println("<tr><td>SQL</td><td>Intermediate</td></tr>");
        out.println("<tr><td>DSA</td><td>Learning</td></tr>");
        out.println("<tr><td>C</td><td>Intermediate</td></tr>");
        out.println("</table><hr>");


        out.println("<h1 id='projects'>Projects</h1>");
        out.println("<ul>");
        out.println("<li><b>AgriVision:</b> Agriculture crop recommendation platform</li>");
        out.println("<li><b>Visa Connect:</b> Visa consultancy service platform</li>");
        out.println("<li><b>Student Feedback System:</b> Students give feedback and teachers view in their account</li>");
        out.println("<li><b>CyberEye:</b> AI phishing detector and web application firewall</li>");
        out.println("</ul><hr>");

        
        out.println("<h1 id='achievements'>Achievements</h1>");
        out.println("<ul>");
        out.println("<li>Secured 6th position in Learnathon</li>");
        out.println("</ul><hr>");


        out.println("<h1 id='contact'>Contact</h1>");
        out.println("<table border='1'>");
        out.println("<tr><td>Email</td><td>sai.aniket2004@gmail.com</td></tr>");
        out.println("<tr><td>LinkedIn</td><td>/td>https://www.linkedin.com/in/sai-aniket-734380382?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app</tr>");
        out.println("<tr><td>GitHub</td><td>https://github.com/Saianiket2005</td></tr>");
        out.println("<tr><td>Phone</td><td>7978352912</td></tr>");
        out.println("</table>");

        out.println("</body></html>");
    }

    
}