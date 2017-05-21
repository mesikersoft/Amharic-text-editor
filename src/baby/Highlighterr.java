
package baby;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.*;


public class Highlighterr {
    
class MyHighightPainter extends DefaultHighlighter.DefaultHighlightPainter {
//super class is default highlight painter
    public MyHighightPainter(Color c) {
        super(c);
    }
}

Highlighter.HighlightPainter myHighightPainter=new MyHighightPainter(Color.GREEN);

public void hl(JTextComponent cmp ,String pattern){
  
try{
    Highlighter h=cmp.getHighlighter();

Document d=cmp.getDocument();
String t=d.getText(0, d.getLength());
int p=0;
while((p=t.toUpperCase().indexOf(pattern.toUpperCase(),p))>=0){
h.addHighlight(p, p+pattern.length(), myHighightPainter);
p+=pattern.length();


}




}
catch(Exception ee){

JOptionPane.showMessageDialog(null, "hilight erorr");

}


} 
public void removeHl(JTextComponent cmp){
Highlighter hl=cmp.getHighlighter();
Highlighter.Highlight[] h=hl.getHighlights();
for(int i=0;i<h.length;i++)
{
if(h[i].getPainter() instanceof MyHighightPainter )
{
    hl.removeHighlight(h[i]);
    


}


}


}

    
}
