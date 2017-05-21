/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baby;


import java.awt.datatransfer.*;
import java.util.*;
import java.awt.*;
import javax.swing.text.*;
import javax.swing.*;
import java.io.*;
public class Final extends javax.swing.JFrame {

   char[] ha = {'ሀ', 'ሁ', 'ሂ', 'ሃ', 'ሄ', 'ህ', 'ሆ'};
    String[] h = {"ha", "hu", "hi", "ha", "hie", "h", "ho"};
    char[] la = {'ለ', 'ሉ', 'ሊ', 'ላ', 'ሌ', 'ል', 'ሎ'};
    String[] l = {"le", "lu", "li", "la", "lie", "l", "lo"};
    char[] hah = {'ሐ', 'ሑ', 'ሒ', 'ሓ', 'ሐ', 'ሕ', 'ሖ'};
    String[] hh = {"ha", "hu", "hi", "ha", "hie", "h", "ho"};
    char[] m = {'መ', 'ሙ', 'ሚ', 'ማ', 'ሜ', 'ም', 'ሞ'};
    String[] me = {"me", "mu", "mi", "ma", "me", "m", "mo"};

    char[] rr = {'ረ', 'ሩ', 'ሪ', 'ራ', 'ሬ', 'ር', 'ሮ'};
    String[] re = {"re", "ru", "ri", "ra", "re", "r", "ro"};
    char [] ve={'ቨ','ቩ','ቪ','ቫ','ቬ','ቭ','ቮ'};
String[] vee={"ve","vu","vi","va","ve","v","vo"};

    char[] s = {'ሰ', 'ሱ', 'ሲ', 'ሳ', 'ሴ', 'ስ', 'ሶ'};
    String[] se = {"se", "su", "si", "sa", "se", "s", "so"};

    char[] sh = {'ሸ', 'ሹ', 'ሺ', 'ሻ', 'ሼ', 'ሽ', 'ሮ'};
    String[] she = {"she", "shu", "shi", "sha", "shie", "sh", "sho"};

    char[] q = {'ቀ', 'ቁ', 'ቂ', 'ቃ', 'ቄ', 'ቅ', 'ቆ'};
    String[] qe = {"ke", "ku", "ki", "ka", "kie", "k", "ko"};

    char[] b = {'በ', 'ቡ', 'ቢ', 'ባ', 'ቤ', 'ብ', 'ቦ'};
    String[] be = {"be", "bu", "bi", "ba", "be", "b", "bo"};

    char[] t = {'ተ', 'ቱ', 'ቲ', 'ታ', 'ቴ', 'ት', 'ቶ'};
    String[] te = {"te", "tu", "ti", "ta", "tie", "t", "to"};

    char[] ch = {'ቸ', 'ቹ', 'ቺ', 'ቻ', 'ቼ', 'ች', 'ቾ'};
    String[] che = {"che", "chu", "chi", "cha", "chie", "ch", "cho"};

    char[] n = {'ነ', 'ኑ', 'ኒ', 'ና', 'ኔ', 'ን', 'ኖ'};
    String[] ne = {"ne", "nu", "ni", "na", "ne", "n", "no"};

    char[] gn = {'ኘ', 'ኙ', 'ኚ', 'ኛ', 'ኘ', 'ኝ', 'ኞ'};
    String[] gne = {"gne", "gnu", "gni", "gna", "gne", "gn", "gno"};

    char[] x = {'አ', 'ኡ', 'ኢ', 'ኣ', 'ኤ', 'እ', 'ኦ'};
    String[] xe = {"a", "u", "e", "a", "e", "e", "o"};
   


char [] k={'ከ','ኩ','ኪ','ካ','ኬ','ክ','ኮ'};
String [] kk={"ke","ku","ki","ka","kie","k","ko"};
//Char ህ ={‘ሕሕ’,’ኡ’,’ኢ’,’ኣ’,’ኤ’,’እ’,’ኦ’};
//String aa={“a”,”au”,”ai”,”aa”,”aie”,”ae”,”ao”};
char  [] we={'ወ','ዉ','ዊ','ዋ','ዌ','ው','ዎ'};
String  []wee={"we","wu","wi","wa","wie","w","wo"};
char []e={'ዐ','ዑ','ዒ','ዓ','ዔ','ዕ','ዖ'};
String []ee={"ee","eu","ei","ea","eie","e","eo"};


char [] z ={'ዘ','ዙ','ዚ','ዛ','ዜ','ዝ','ዞ'};
String [] ze={"ze","zu","zi","za","zie","z","zo"};
char [] zhe={'ዠ','ዡ','ዢ','ዣ','ዤ','ዥ','ዦ'};
String []zhee={"zhe","zhu","zhi","zha","zhie","zh","zho"};
char []ye={'የ','ዩ','ዪ','ያ','ዬ','ይ','ዮ'};
String []yee={"ye","yu","yi","ya","yie","y","yo"};
char[] de={'ደ','ዱ','ዲ','ዳ','ዴ','ድ','ዶ'};
String[] dee={"de","du","di","da","die","d","do"};
char[] je={'ጀ','ጁ','ጂ','ጃ','ጄ','ጅ','ጆ'};
String [] jee={"je","ju","ji","ja","jie","j","jo"};
char[] ge={'ገ','ጉ','ጊ','ጋ','ጌ','ግ','ጎ'};
String [] gee={"ge","gu","gi","ga","gie","g","go"};
char [] tie={'ጠ','ጡ','ጢ','ጣ','ጤ','ጥ','ጦ'};
String [] tee={"te","tu","ti","ta","te","t","to"};
char []chee={'ጨ','ጩ','ጪ','ጫ','ጨ','ጭ','ጮ'};
String[] cheee={"che","chu","chi","cha","chie","ch","cho"};
char []pe={'ጰ','ጱ','ጲ','ፓ','ጴ','ጵ','ፖ'};
String []pee={"pe","pu","pi","pa","pie","p","po"};
char []tse={'ጸ','ጹ','ጺ','ጻ','ጼ','ጽ','ጾ'};
String []tsee={"tse","tsu","tsi","tsa","tsie","ts","tso"};
char []hhh={'ኸ','ኹ','ኺ','ኻ','ኺ','ኽ','ኾ'};
String[] hhe = {"he", "hu", "hi", "ha", "hie", "h", "ho"};
char []tese={'ፀ','ፁ','ፂ','ፃ','ፄ','ፅ','ፆ'};
String []tseee={"tse","tsu","tsi","tsa","tsie","ts","tso"};
char []fe={'ፈ','ፉ','ፊ','ፋ','ፌ','ፍ','ፎ'};
String []fee={"fe","fu","fi","fa","fie","f","fo"};
char  [] ppe={'ፕ','ፑ','ፒ','ፓ','ፔ','ፕ','ፖ'};
String []pp={"pe","pu","pi","pa","pie","p","po"};

char []dik={'ሗ','ሏ','ሟ','ሷ','ሿ','ሯ','ቋ'};
String []dikee={"hua","lua","muai","sua","shua","rua","qua"};
char []diki={'ቧ','ቯ','ቷ','ቿ','ኋ','ኗ','ኳ'};
String []dik1={"bua","vua","tua","chua","hua","nua","kua"};
char []dikj={'ሗ','ዟ','ዧ','ዷ','ጓ','ጟ','ጧ'};
String[]dik2={"hua","zua","zhua","dua","gua","jua","tua"};
char[]dikk={'ጷ','ጿ','ፏ',' ',' ',' ',' '};

String []dik3={"pua","pua","fua","","","",""};
char []pu={'።','፣','̋','፤','!','(',')'};
        String []puu={".",",","\"",",","!","(",")"};

    public Final() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    
    //used to highlight the selected text static 



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        tf1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("jMenu4");

        jButton3.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton3.setText("highlight");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton1.setText("Indentation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton2.setText("clean");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton4.setText("read");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton5.setText("find");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        ta2.setColumns(20);
        ta2.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        tf1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jButton6.setText("help");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("GroupMembers");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        ta1.setRows(5);
        ta1.setText("\nሰርዝ ማለት አጥፋ ማለት አይደለም፣ሰርዝ አስወግድ ማለትም አይደለም ፣ሰርዝ ማለት ደምስስ ማለት ነው።");
        jScrollPane1.setViewportView(ta1);

        jButton9.setFont(new java.awt.Font("Nyala", 2, 18)); // NOI18N
        jButton9.setText("highlight");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jMenu2.setText("Count");
        jMenu2.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem5.setText("sentence");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem6.setText("word");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Translitration");
        jMenu3.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem7.setText("toEnglish");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Frequency");
        jMenu5.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem8.setText("punctuation");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem9.setText("word");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Editors");
        jMenu1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem1.setText("cut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem3.setText("copy");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuItem4.setText("paste");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton6)
                        .addGap(57, 57, 57)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton8)))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String h=ta1.getSelectedText();
         new Highlighterr().hl(ta1,h);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JFileChooser c=new JFileChooser();
     c.showOpenDialog(null);
     File f=c.getSelectedFile();
     String fn=f.getAbsolutePath();
     try{
     FileReader fr=new FileReader(fn);
     BufferedReader br=new BufferedReader(fr);
     ta1.read(br, null);
     br.close();
     
     
     }
     catch(Exception e){
    JOptionPane.showMessageDialog(null,"this is not our problem");
     }
    }//GEN-LAST:event_jButton4ActionPerformed
 final Clipboard clip = getToolkit().getSystemClipboard(); 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
           //cut
        
   String selection=ta1.getSelectedText();
   StringSelection data=new StringSelection(ta1.getText());
   //contents - the transferable object representing the clipboard content
   //owner - the object which owns the clipboard content
   clip.setContents(data, data);
   

   ta1.replaceRange("", ta1.getSelectionStart(), ta1.getSelectionEnd());        // TODO add your handling code here:
                                       

    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      //copy
        try{
            //access contents from clopboard
            
   StringSelection data=new StringSelection(ta1.getText()); 
   clip.setContents(data, data);
   throw new UnsupportedFlavorException(DataFlavor.stringFlavor);
        }
catch(UnsupportedFlavorException hhk){}  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            //paste
       
        Transferable cl = clip.getContents(clip);

try{
if(cl.isDataFlavorSupported(DataFlavor.stringFlavor));
{
String s=(String)(cl.getTransferData(DataFlavor.stringFlavor));
ta1.replaceSelection(s);
}
}
//ta1.replaceSelection(s);

        


catch(Exception gg){
}
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
          //word counter
       //java.util
        
        if(ta1.getText()==null){
   
    
   ta2.setText( "በመጀመሪያ ቴክስት ኤሪያው ላይ ቃላትን ያስገቡ ");
    }
else
{
    
        
StringTokenizer st=new StringTokenizer(ta1.getText());
ta2.setText("የመፃፊያ ሰሌዳው  "+st.countTokens()+"    ቃላት አሉት");
}
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       char[] a = ta1.getText().toCharArray();
        String result = "";
        for (char r : a) {
              if (r == ' ') {
                    result = result+' ';
                }
            for (int i =0 ; i <= 6; i++) {

                          
                
                if (r == ha[i]) {
                    result = result + h[i];
                }
                else if(r==la[i]){
                    result+=l[i];
                }
                 else if(r==hah[i]){
                    result+=hh[i];
                }
                 else if(r==m[i]){
                    result+=me[i];
                }
                 else if(r==rr[i]){
                    result+=re[i];
                }
             else if(r==s[i]){
                    result+=se[i];
                }
                 else if(r==sh[i]){
                    result+=she[i];
                }
             else if(r==q[i]){
                    result+=qe[i];
                }
                 else if(r==b[i]){
                    result+=be[i];
                }
                 else if(r==t[i]){
                    result+=te[i];
                }
                else if(r==ch[i]){
                    result+=che[i];
                }
                else if(r==n[i]){
                    result+=ne[i];
                }
                else if(r==gn[i]){
                    result+=gne[i];
                }
                else if(r==x[i]){
                    result+=xe[i];
                }
                else if(r==k[i]){
                    result+=kk[i];
                }
                else if(r==we[i]){
                    result+=wee[i];
                }
                else if(r==e[i]){
                    result+=ee[i];
                }
                else if(r==z[i]){
                    result+=ze[i];
                }
                else if(r==zhe[i]){
                    result+=zhee[i];
                }
                else if(r==ye[i]){
                    result+=yee[i];
                }
                else if(r==de[i]){
                    result+=dee[i];
                }
                else if(r==je[i]){
                    result+=jee[i];
                }
                else if(r==ge[i]){
                    result+=gee[i];
                }
                else if(r==tie[i]){
                    result+=tee[i];
                }
                else if(r==chee[i]){
                    result+=cheee[i];
                }
                else if(r==pe[i]){
                    result+=pee[i];
                }
                else if(r==tse[i]){
                    result+=tsee[i];
                }
                else if(r==fe[i]){
                    result+=fee[i];
                }
                else if(r==hhh[i]){
                    result+=hhe[i];
                }
                else if(r==tese[i]){
                    result+=tseee[i];
                }
                else if(r==ppe[i]){
                    result+=pp[i];
                }
                else if(r==ve[i]){
                    result+=vee[i];
                }else
                  if(r==dik[i])
            {
               result+=dikee[i];
            }
            else
                  if(r==diki[i])
            {
               result+=dik1[i];
            }
            else
                  if(r==dikj[i])
            {
               result+=dik2[i];
            }
            else
                  if(r==dikk[i])
            {
               result+=dik3[i];
            }
                else
                  if(r==pu[i])
            {
               result+=puu[i];
            }
            
            }
            
         

        }
       
         ta2.setText(result);  
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       //word repeation 
        
        //new Counting(ta1.getText()).countWord();
        ArrayList<String> words=new ArrayList<String>();
        ArrayList<Integer>count=new ArrayList<Integer>();
    
           Scanner s=new Scanner(ta1.getText());
           while(s.hasNext()){
           String word=s.next();
           if(words.contains(word)){
           int c=words.indexOf(word);
           count.set(c, count.get(c)+1);
           
           }
           else{
           words.add(word);
           count.add(1);
           }
           }
        
       
           for(int i=1;i<=words.size();i++){
           
           ta2.append("\nthe word    "+ words.get(i)+"    exists    "+count.get(i)+"  times\n");
           
           }
           
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
char a[]=ta1.getText().toCharArray();
  int c=0;
   int f=0;
   int d=0;
   int g=0;
   int h=0;
   int i=0;
   int j=0;
  
  for(char e:a){
      
  if(e=='።'){
  c++;
  }
  else if(e=='ዘ'){
  f++;
  }
   else if(e=='̋'){
  d++;
  }
   else if(e=='!'){
  g++;
  }
   else if(e=='?'){
  h++;
  }
   else if(e=='፣'){
  i++;
  }
  else if(e=='{'||e=='}'){
  j++;
  }
  }
  
  ta2.setText("the text area have  \n "+c+"   full stops\n"+g+"  exclamation marks\n"+f+"  commas\n"+
         +d+"  quotes \n "+h+"   question marks\n"
  +i+" colons  \n"+j +"   braces");         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
char a[]=ta1.getText().toCharArray();
  int c=0;
  char e='።';
  for(char h:a){
  if(h==e){
  c++;
  
  }
  else{
  
  ta2.setText("0");
  
  }
  
  }

  
        
   ta2.setText("this paragraph has      "+c+"     sentences");     

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
tf1.setToolTipText("search");        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 ta2.append("1: first of all you should take texts\n"+" from file by presseing  button አንብብ");
        ta2.append("\n2: in order to find a word from atext area \n"+"you shold first write the searched word in\n"+
                "the text field and press the button ፈልግ ");
        ta2.append("\n3: if the word that you search is available in the \n"+"text area the it is going to be highlighted ");
                  // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
ta2.setText(null);
        
        
        ta2.append(" \n Mesiker Mekonnon");
      ta2.append(" \n Mikiyas yehuala");
      ta2.append("\n  Abenizer Abreham ");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String original = ta1.getText();
		String newString = "";
		
		int originalStringLength = original.length();
		
		for( int i=0; i<originalStringLength; i++ ){
			
			
			
			if( original.charAt(i)=='\n' ){
				
				newString = newString+ "\n\t";
				
			}
			
			else{
				
				
				newString = newString + original.charAt(i);;
				
			}
			
		}
	ta1.setText(newString);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  new Highlighterr().removeHl(ta1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 
        String g=tf1.getText();
         new Highlighterr().hl(ta1,g);
        ta2.append(g+ "\n");
         tf1.setText("");      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   String h=ta1.getSelectedText();
        new Highlighterr().hl(ta1,h);      
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private final javax.swing.JTextArea ta1 = new javax.swing.JTextArea();
    private javax.swing.JTextArea ta2;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
