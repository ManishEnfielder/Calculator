package Design;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class designpanel1 extends JFrame implements KeyListener,ActionListener{
	String msg="";
	public int i=0,t=0,j=0,l=0,Z=0,Q=0,N=0,G=0,R=0,L=0,E=0,M=0;
	public 	double a[]=new double[1000];
	public	double ans=0;
	DecimalFormat dec=new DecimalFormat("#0.000");
public String s="\u00F7",s1="\u232B",s3="\u00D7",s4="\uFF1D";
JTextArea ta=new JTextArea();
JScrollPane sp=new JScrollPane(ta);
Image ie=Toolkit.getDefaultToolkit().getImage("C:\\Users\\SHASHI-MONI\\Downloads\\4.png");
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("AC");
JButton b11=new JButton(s1);
JButton b12=new JButton("%");
JButton b13=new JButton(s);
JButton b14=new JButton(s3);
JButton b15=new JButton("-");
JButton b16=new JButton("+");
JButton b17=new JButton(s4);
JButton b18=new JButton(".");
JButton b19=new JButton("0");
JButton tb=new JButton();
JButton tb1=new JButton();
designpanel1()
{
	setTitle("Calculator");
	ta.setCaretColor(Color.decode("#F0F0F0"));
	b1.setBackground(Color.decode("#FFFFFF"));
	b2.setBackground(Color.decode("#FFFFFF"));
	b3.setBackground(Color.decode("#FFFFFF"));
	b4.setBackground(Color.decode("#FFFFFF"));
	b5.setBackground(Color.decode("#FFFFFF"));
	b6.setBackground(Color.decode("#FFFFFF"));
	b7.setBackground(Color.decode("#FFFFFF"));
	b8.setBackground(Color.decode("#FFFFFF"));
	b9.setBackground(Color.decode("#FFFFFF"));
	b10.setBackground(Color.decode("#FFFFFF"));
	b11.setBackground(Color.decode("#FFFFFF"));
	b12.setBackground(Color.decode("#FFFFFF"));
	b13.setBackground(Color.decode("#FFFFFF"));
	b14.setBackground(Color.decode("#FFFFFF"));
	b15.setBackground(Color.decode("#FFFFFF"));
	b16.setBackground(Color.decode("#FFFFFF"));
	b17.setBackground(Color.decode("#FB7730"));
	b18.setBackground(Color.decode("#FFFFFF"));
	b19.setBackground(Color.decode("#FFFFFF"));
	tb.setBackground(Color.decode("#FFFFFF"));
	tb1.setBackground(Color.decode("#FFFFFF"));
	b10.setFont(new Font("Arial",Font.PLAIN,16));
	b1.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b2.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b3.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b4.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b5.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b6.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b7.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b8.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b9.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b10.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b11.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b12.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b13.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b14.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b15.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b16.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b17.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b18.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b19.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	tb.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	tb1.setBorder(BorderFactory.createLineBorder(Color.decode("#C3C5C6"),1));
	b1.setBounds(-1,344,64,50);
	b2.setBounds(62,344,63,50);
	b3.setBounds(124,344,63,50);
	b4.setBounds(-1,295,64,50);
	b5.setBounds(62,295,63,50);
	b6.setBounds(124,295,63,50);
	b7.setBounds(-1,246,64,50);
	b8.setBounds(62,246,63,50);
	b9.setBounds(124,246,63,50);
	b10.setBounds(-1,197,64,50);
	b11.setBounds(62,197,63,50);
	b12.setBounds(124,197,63,50);
	b13.setBounds(186,197,64,50);
	b14.setBounds(186,246,64,50);
	b15.setBounds(186,295,64,50);
	b16.setBounds(186,344,64,50);
	b17.setBounds(186,393,64,50);
	b18.setBounds(124,393,63,50);
	b19.setBounds(-1,393,126,50);
	tb.setBounds(-1,393,64,50);
	tb1.setBounds(-1,393,64,50);
	sp.setBounds(0,0,249,197);
	b1.setForeground(Color.decode("#4F5157"));
	b2.setForeground(Color.decode("#4F5157"));
	b3.setForeground(Color.decode("#4F5157"));
	b4.setForeground(Color.decode("#4F5157"));
	b5.setForeground(Color.decode("#4F5157"));
	b6.setForeground(Color.decode("#4F5157"));
	b7.setForeground(Color.decode("#4F5157"));
	b8.setForeground(Color.decode("#4F5157"));
	b9.setForeground(Color.decode("#4F5157"));
	b10.setForeground(Color.decode("#FB7730"));
	b11.setForeground(Color.decode("#4F5157"));
	b12.setForeground(Color.decode("#4F5157"));
	b13.setForeground(Color.decode("#4F5157"));
	b14.setForeground(Color.decode("#4F5157"));
	b15.setForeground(Color.decode("#4F5157"));
	b16.setForeground(Color.decode("#4F5157"));
	b17.setForeground(Color.decode("#FFFFFF"));
	b18.setForeground(Color.decode("#4F5157"));
	b19.setForeground(Color.decode("#4F5157"));
	tb.setForeground(Color.decode("#4F5157"));
	tb1.setForeground(Color.decode("#4F5157"));
	ta.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
				e.consume();	
		}
	});
	ta.setBackground(Color.decode("#F0F0F0"));
	ta.setForeground(Color.decode("#181818"));
	ta.setBounds(0,0,249,197);
	ta.setLineWrap(true);
	ta.setWrapStyleWord(true);
	ta.setFont(new Font("DotumChe", Font.PLAIN, 40));
	Cursor c=getCursor();
	ta.setCursor(new Cursor (c.DEFAULT_CURSOR));
	b1.setRolloverEnabled(false);
	b2.setRolloverEnabled(false);
	b3.setRolloverEnabled(false);
	b4.setRolloverEnabled(false);
	b5.setRolloverEnabled(false);
	b6.setRolloverEnabled(false);
	b7.setRolloverEnabled(false);
	b8.setRolloverEnabled(false);
	b9.setRolloverEnabled(false);
	b10.setRolloverEnabled(false);
	b11.setRolloverEnabled(false);
	b12.setRolloverEnabled(false);
	b13.setRolloverEnabled(false);
	b14.setRolloverEnabled(false);
	b15.setRolloverEnabled(false);
	b16.setRolloverEnabled(false);
	b17.setRolloverEnabled(false);
	b18.setRolloverEnabled(false);
	b19.setRolloverEnabled(false);
	tb.setRolloverEnabled(false);
	tb1.setRolloverEnabled(false);
	b1.setFocusable(false);
	b2.setFocusable(false);
	b3.setFocusable(false);
	b4.setFocusable(false);
	b5.setFocusable(false);
	b6.setFocusable(false);
	b7.setFocusable(false);
	b8.setFocusable(false);
	b9.setFocusable(false);
	b10.setFocusable(false);
	b11.setFocusable(false);
	b12.setFocusable(false);
	b13.setFocusable(false);
	b14.setFocusable(false);
	b15.setFocusable(false);
	b16.setFocusable(false);
	b17.setFocusable(false);
	b18.setFocusable(false);
	b19.setFocusable(false);
	tb.setFocusable(false);
	tb1.setFocusable(false);
	b17.setBorderPainted(false);
	getContentPane().add(sp);
	getContentPane().add(b1);
	getContentPane().add(b2);
	getContentPane().add(b3);
	getContentPane().add(b4);
	getContentPane().add(b5);
	getContentPane().add(b6);
	getContentPane().add(b7);
	getContentPane().add(b8);
	getContentPane().add(b9);
	getContentPane().add(b10);
	getContentPane().add(b11);
	getContentPane().add(b12);
	getContentPane().add(b13);
	getContentPane().add(b14);
	getContentPane().add(b15);
	getContentPane().add(b16);
	getContentPane().add(b17);
	getContentPane().add(b18);
	getContentPane().add(b19);
	getContentPane().add(tb);
	getContentPane().add(tb1);
	setIconImage(ie);
	if(i==0)
	ta.setText("\n\n\n\t   0");
	b1.addActionListener((ActionListener) this);
	b2.addActionListener((ActionListener) this);
	b3.addActionListener((ActionListener) this);
	b4.addActionListener((ActionListener) this);
	b5.addActionListener((ActionListener) this);
	b6.addActionListener((ActionListener) this);
	b7.addActionListener((ActionListener) this);
	b8.addActionListener((ActionListener) this);
	b9.addActionListener((ActionListener) this);
	b10.addActionListener((ActionListener) this);
	b11.addActionListener((ActionListener) this);
	b12.addActionListener((ActionListener) this);
	b13.addActionListener((ActionListener) this);
	b14.addActionListener((ActionListener) this);
	b15.addActionListener((ActionListener) this);
	b16.addActionListener((ActionListener) this);
	b17.addActionListener((ActionListener) this);
	b18.addActionListener((ActionListener) this);
	b19.addActionListener((ActionListener) this);
	tb.addActionListener((ActionListener) this);
	tb1.addActionListener((ActionListener) this);
	ta.addKeyListener(this);
	sp.setSize(250,198);
	setSize(265,480);
	setVisible(true);
	this.setLayout(new BorderLayout());
	setResizable(false);
	setDefaultCloseOperation(this.EXIT_ON_CLOSE);
}
public void keyPressed(KeyEvent e) 
{
try {
	sp.setVerticalScrollBarPolicy(sp.VERTICAL_SCROLLBAR_AS_NEEDED);
int W=e.getKeyChar();
if(Z==1 && W==KeyEvent.VK_BACK_SPACE )
{
	e.consume();
}
if(W==KeyEvent.VK_1)
{
	if(Z==0)
	{	
		if(i>0)
		{
		if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=1;
			msg=msg.substring(0,msg.length()-1);
			msg+=1;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=1;
			msg+=1;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
		a[i]=1;
		msg+=1;
		ta.setText(msg);
		i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=1;
				msg+=1;
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_2)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=2;
			msg=msg.substring(0,msg.length()-1);
			msg+=2;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=2;
			msg+=2;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=2;
	msg+=2;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=2;
				msg+=2;
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_3)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=3;
			msg=msg.substring(0,msg.length()-1);
			msg+=3;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=3;
			msg+=3;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=3;
	msg+=3;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=3;
				msg+=3;
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_4)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=4;
			msg=msg.substring(0,msg.length()-1);
			msg+=4;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=4;
			msg+=4;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=4;
	msg+=4;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=4;
				msg+=4;
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_5)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=5;
			msg=msg.substring(0,msg.length()-1);
			msg+=5;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=5;
			msg+=5;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=5;
	msg+=5;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=5;
				msg+=5;
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_6)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=6;
			msg=msg.substring(0,msg.length()-1);
			msg+=6;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=6;
			msg+=6;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=6;
	msg+=6;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=6;
				msg+=6;	
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_7)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=7;
			msg=msg.substring(0,msg.length()-1);
			msg+=7;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=7;
			msg+=7;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=7;
	msg+=7;
	ta.setText(msg);	
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=7;
				msg+=7;	
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_8)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=8;
			msg=msg.substring(0,msg.length()-1);
			msg+=8;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=8;
			msg+=8;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=8;
	msg+=8;
	ta.setText(msg);	
	i++;
	}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=8;
				msg+=8;	
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_9)
{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=9;
			msg=msg.substring(0,msg.length()-1);
			msg+=9;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=9;
			msg+=9;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=9;
	msg+=9;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=9;
				msg+=9;	
				ta.setText(msg);
				i++;
				Z=0;
		}
}
if(W==KeyEvent.VK_DELETE)
{	
	Z=0;
	for(int z=0;z<a.length;z++)
	a[z]=0;
	ans=0;
	i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
	msg="";
	if(sp.getVerticalScrollBar().isVisible())
		sp.setVerticalScrollBarPolicy(sp.VERTICAL_SCROLLBAR_NEVER);
	ta.setText("\n\n\n\t   0");
    
}
if(W==KeyEvent.VK_BACK_SPACE)
{
	if(Z==0)
	{
	if(t==1)
	{	
		i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
		ta.setText("\n\n\n\t   0");
		msg="";
		t=0;
	}
	if(i==0)
	{
		i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
		e.consume();
		msg="";
		ta.setText("\n\n\n\t   0");
	}
	if(msg!="" && msg.length()>0)
	if(a.length>0  && i>0)
	{
		if((i==2 && a[i-1]=='+' || a[i-1]=='-'  || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%') && (a[i-2]==ans) && a[i-2]!=0)
		{
			ta.setText("\n\n\n\t   0");
			i=0;
			msg="";
			ans=0;
		}
		if(N==1 && i==2 && ans==0 && (a[i-1]=='+' || a[i-1]=='-'  || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%') && (a[i-2]==ans))
		{
			ta.setText("\n\n\n\t   0");
			i=0;
			msg="";
			ans=0;
			E=0;
		}
		if(i>0)
		{
		if(a[i-1]=='.')
			L=0;
		if(a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%')
		{
			for(int H=i;(a[H]!='+' || a[H]!='-' || a[H]!='*' || a[H]!='/' || a[H]!='%') && H>0;H--)
			{
				if(a[H]=='.')
				{
					L=1;
					break;
				}
				else
					L=0;
			}
		}
		}
	if(i>0)
	{	
	i--;
	msg=msg.substring(0,msg.length()-1);
	}
	}
	if(i==0)
	{
		i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
		e.consume();
		msg="";
		ta.setText("\n\n\n\t   0");
	}
	}
}
if(W=='%')
{
	if(Z==0)
	{
	if(msg!="")
	{
	if(i!=0  && (a[i-1]=='%' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='+'))
	{
	a[i-1]='%';
	msg=msg.substring(0,msg.length()-1);
	msg+='%';
	ta.setText(msg);
	}
	else
	{
	if(i!=0  && a[i-1]!='.')
	{
	a[i]='%';
	msg+='%';
	ta.setText(msg);
	i++;
	}
	}
	}
	L=0;
	}
	else
		if(Z==1)
		{
			i=0;
			a[i]=ans;
			i++;
			msg="";
			msg+=dec.format(ans);
			ta.setText(msg);
			if(msg!="")
			{
				if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
				{
					a[i-1]='%';
					msg=msg.substring(0,msg.length()-1);
					msg+='%';
					ta.setText(msg);
				}
				else
				{
					if(i!=0  && a[i-1]!='.')
					{
					a[i]='%';
					msg+='%';
					ta.setText(msg);
					i++;
					}
				}
		}
		Z=0;
		L=0;
		}
	}
if(W=='/')
{
		if(Z==0)
		{
		if(msg!="")
		{
		if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
		{
			String s="\u00F7";
		a[i-1]='/';
		msg=msg.substring(0,msg.length()-1);
		msg+=s;
		ta.setText(msg);
		}
		else
		{
		if(i!=0  && a[i-1]!='.')
		{
			String s="\u00F7";
		a[i]='/';
		msg+=s;
		ta.setText(msg);
		i++;
		}
		}
		}
		L=0;
		}
		else
			if(Z==1)
			{
				i=0;
				a[i]=ans;
				i++;
				msg="";
				msg+=dec.format(ans);
				ta.setText(msg);
				if(msg!="")
				{
					if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
					{
						String s="\u00F7";
						a[i-1]='/';
						msg=msg.substring(0,msg.length()-1);
						msg+=s;
						ta.setText(msg);
					}
					else
					{
						if(i!=0  && a[i-1]!='.')
						{
							String s="\u00F7";
						a[i]='/';
						msg+=s;
						ta.setText(msg);
						i++;
						}
					}
			}
			Z=0;
			L=0;
			}
	}
if(W=='*')
{
		if(Z==0)
		{
		if(msg!="")
		{
		if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
		{
			String s3="\u00D7";
		a[i-1]='*';
		msg=msg.substring(0,msg.length()-1);
		msg+=s3;
		ta.setText(msg);
		}
		else
		{
		if(i!=0  && a[i-1]!='.')
		{
			String s3="\u00D7";
		a[i]='*';
		msg+=s3;
		ta.setText(msg);
		i++;
		}
		}
		}
		L=0;
		}
		else
			if(Z==1)
			{
				i=0;
				a[i]=ans;
				i++;
				msg="";
				msg+=dec.format(ans);
				ta.setText(msg);
				if(msg!="")
				{
					if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
					{
						String s3="\u00D7";
						a[i-1]='*';
						msg=msg.substring(0,msg.length()-1);
						msg+=s3;
						ta.setText(msg);
					}
					else
					{
						if(i!=0  && a[i-1]!='.')
						{
						String s3="\u00D7";
						a[i]='*';
						msg+=s3;
						ta.setText(msg);
						i++;
						}
					}
			}
			Z=0;
			L=0;
			}
	}
if(W=='-')
{
		if(Z==0)
		{
		if(msg!="")
		{
		if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
		{
		a[i-1]='-';
		msg=msg.substring(0,msg.length()-1);
		msg+='-';
		ta.setText(msg);
		}
		else
		{
		if(i!=0  && a[i-1]!='.')
		{
		a[i]='-';
		msg+='-';
		ta.setText(msg);
		i++;
		}
		}
		}
		L=0;
		}
		else
			if(Z==1)
			{
				i=0;
				a[i]=ans;
				i++;
				msg="";
				msg+=dec.format(ans);
				ta.setText(msg);
				if(msg!="")
				{
					if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
					{
						a[i-1]='-';
						msg=msg.substring(0,msg.length()-1);
						msg+='-';
						ta.setText(msg);
					}
					else
					{
						if(i!=0  && a[i-1]!='.')
						{
						a[i]='-';
						msg+='-';
						ta.setText(msg);
						i++;
						}
					}
			}
			Z=0;
			L=0;
			}
	}
if(W=='+')
{
		if(Z==0)
		{
		if(msg!="")
		{
		if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
		{
		a[i-1]='+';
		msg=msg.substring(0,msg.length()-1);
		msg+='+';
		ta.setText(msg);
		}
		else
		{
		if(i!=0  && a[i-1]!='.')
		{
		a[i]='+';
		msg+='+';
		ta.setText(msg);
		i++;
		}
		}
		}
		L=0;
		}
		else
			if(Z==1)
			{
				i=0;
				a[i]=ans;
				i++;
				msg="";
				msg+=dec.format(ans);
				ta.setText(msg);
				if(msg!="")
				{
					if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
					{
						a[i-1]='+';
						msg=msg.substring(0,msg.length()-1);
						msg+='+';
						ta.setText(msg);
					}
					else
					{
						if(i!=0  && a[i-1]!='.')
						{
						a[i]='+';
						msg+='+';
						ta.setText(msg);
						i++;
						}
					}
			}
			Z=0;
			L=0;
			}
	}

if(W==KeyEvent.VK_ENTER)
{
	e.consume();
	a[i]='=';
	if(a[0]!='=')
	{
if(a[i-1]!='+' && a[i-1]!='-' && a[i-1]!='*' && a[i-1]!='/' && a[i-1]!='%' && a[i-1]!='.')
{
	int k=0,c=0,U=0;
	double z=0,m=0,E=0;
	String ke="";
	for(j=0;a[k]!='=';j++)
	{
		if(j!=0)
		{
		if(a[k]!='.')
		a[j]=a[c];
		c++;
		m=0;
		}
	for(k=c;(a[k]!='+' && a[k]!='-' && a[k]!='*' && a[k]!='/' && a[k]!='%' && a[k]!='.') && a[k]!='=';k++)
	{
		if(U==1)
		{
			ke+=(int)a[k];
		}
		z=a[k];
		m=m*10+z;
		c=k+1;
	}
	if(U==1)
	{	
		E=Double.valueOf(ke);
		for(int R=0;R<ke.length();R++)
		E/=10;
		a[j-1]=a[j-1]+E;
		int UI,ty=j,ma=j;
		for(UI=k;a[UI]!='=';UI++)
		a[ty++]=a[UI];
		a[ty]='=';
		c=ma;
		j--;
		ke="";
		E=0;
		U=0;
	}
	else
	{
		if(j>0)
		j++;
		a[j]=m;
	}
	
		if(a[c]=='.')
		{
			U=1;
		}
	}
i=j;
a[j]='=';
if(a[0]==61)
{
a[0]=a[0]*10;
l=1;
}
for(j=0;a[j]!='=';j++,j++)
{	
	
	N=1;
	if(a[1]=='=')
	{
	ans=a[0];
	Z=1;
	ta.setText(String.valueOf("\n\n\n= "+dec.format(ans)));
	break;
	}
	if(j==0)
	{
		if(a[j+1]=='/')
		{
			if(a[j]==610 && l==1)
			{
				a[j]=a[j]/10;
				l=0;
			}
			if(a[j]==0 && a[j+2]==0)
			{
				i=0;
				ta.setText("Syntax Error");
				t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				msg="";
				break;
			}
			if(a[j+2]==0)
			{
				i=0;
				ta.setText("Syntax Error");
				t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				msg="";
				break;
			}
			ans=a[j]/a[j+2];
			j++;
		}
	}
else
	if(a[j]=='/')
		ans/=a[j+1];
	
	if(j==0)
	{
		if(a[j+1]=='*')
			{
				if(a[j]==610 && l==1)
					{
						a[j]=a[j]/10;
						l=0;
					}
				ans=a[j]*a[j+2];
				j++;	
			}
	}	
else
	if(a[j]=='*')
		ans*=a[j+1];

	if(j==0)
	{
		if(a[j+1]=='+')
		{
			if(a[j]==610 && l==1)
			{
				a[j]=a[j]/10;
				l=0;
			}
			ans=a[j]+a[j+2];
			j++;
		}		
	}	
	else
		if(a[j]=='+')
		{
			ans+=a[j+1];
		}

	if(j==0)
	{
	if(a[j+1]=='-')
	{
		if(a[j]==610 && l==1)
		{
			a[j]=a[j]/10;
			l=0;
		}
		ans=a[j]-a[j+2];
		j++;
	}
	}
else
	if(a[j]=='-')
		{
		ans-=a[j+1];
		}
	
	if(j==0)	
	{	
		if(a[j+1]=='%')
		{
		if(a[j]==610 && l==1)
		{
		a[j]=a[j]/10;
		l=0;
		}
		if(a[j+2]==0)
		{
			i=0;
			ta.setText("Syntax Error");
			t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
		msg="";
		break;
		}
		 		ans=a[j]%a[j+2];
		 		j++;
		 	}	
	}
	else
		if(a[j]=='%')
		{
			if(a[j+1]==0)
			{
				i=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				ta.setText("Syntax Error");
				msg="";
			t=1;
			break;
			}
			ans%=a[j+1];
		}
	ta.setText(String.valueOf("\n\n\n= "+dec.format(ans)));
Z=1;
}
}
	else
	{
		i=0;
		ta.setText("Syntax Error");
		msg="";
		t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
	}
	}
	}
if(W=='.')
{
	if(Z==0)	
	if(L==0)
	{
	if(msg!="")
	if(i!=0 &&(a[i-1]!='+' && a[i-1]!='-' && a[i-1]!='*' && a[i-1]!='/' && a[i-1]!='%' && a[i-1]!='.'))
	{
	a[i]='.';
	msg+='.';
	ta.setText(msg);
i++;
L=1;
}}
}
if(W==KeyEvent.VK_0)
{
	if(!(i==1 && a[i-1]==0))
	{
	if(Z==0)
	{
			if(i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%'))
			{
				ta.setText(msg);
			}
			else
			{
	if(i>0)
	{	
	if((a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%')&& L==0)
		R=1;
	else
		R=0;
	}
	if(i==0)
		R=1;
	a[i]=0;
	msg+=0;
	ta.setText(msg);
	i++;
	}
	}
	else
		if(Z==1)
		{
			if(a[i-1]=='+' && a[i-1]=='-' && a[i-1]=='*' && a[i-1]=='/' && a[i-1]=='%')
			{
				a[i]=0;
				msg+=0;
				ta.setText(msg);
				i++;
				Z=0;
			}
			else
			{
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=0;
				msg+=0;
				ta.setText(msg);
				i++;
				Z=0;
			}
		}
	Z=0;
		}
	else
		R=1;
	
}
}
catch(Exception e1)
{
	
}
}
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub	
	
}
public void actionPerformed(ActionEvent e)
{
try {
sp.setVerticalScrollBarPolicy(sp.VERTICAL_SCROLLBAR_AS_NEEDED);
if(e.getSource()==b1)
	{
	if(Z==0)
	{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=1;
			msg=msg.substring(0,msg.length()-1);
			msg+=1;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=1;
			msg+=1;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
		a[i]=1;
		msg+=1;
		ta.setText(msg);
		i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=1;
				msg+=1;
				ta.setText(msg);
				i++;
				Z=0;
		}
	}
	if(e.getSource()==b2)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=2;
				msg=msg.substring(0,msg.length()-1);
				msg+=2;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=2;
				msg+=2;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=2;
		msg+=2;
		ta.setText(msg);
		i++;
			}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=2;
					msg+=2;
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
	if(e.getSource()==b3)
	{	
		if(Z==0)
		{
		if(i>0)
		{
			if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
		{
			i--;
			a[i]=3;
			msg=msg.substring(0,msg.length()-1);
			msg+=3;
			ta.setText(msg);
			i++;
			R=0;
		}
		else
			{
			a[i]=3;
			msg+=3;
			ta.setText(msg);
			i++;
			}
		}
		else
		{
	a[i]=3;
	msg+=3;
	ta.setText(msg);
	i++;
		}
	}
	else
		if(Z==1)
		{
				ta.setText("");
				msg="";
				i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
				a[i]=3;
				msg+=3;
				ta.setText(msg);
				i++;
				Z=0;
		}
	}
	if(e.getSource()==b4)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=4;
				msg=msg.substring(0,msg.length()-1);
				msg+=4;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=4;
				msg+=4;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=4;
		msg+=4;
		ta.setText(msg);
		i++;
			}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=4;
					msg+=4;
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
		if(e.getSource()==b5)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=5;
				msg=msg.substring(0,msg.length()-1);
				msg+=5;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=5;
				msg+=5;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=5;
		msg+=5;
		ta.setText(msg);
		i++;
			}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=5;
					msg+=5;
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
	if(e.getSource()==b6)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=6;
				msg=msg.substring(0,msg.length()-1);
				msg+=6;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=6;
				msg+=6;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=6;
		msg+=6;
		ta.setText(msg);
		i++;
			}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=6;
					msg+=6;	
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
	if(e.getSource()==b7)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=7;
				msg=msg.substring(0,msg.length()-1);
				msg+=7;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=7;
				msg+=7;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=7;
		msg+=7;
		ta.setText(msg);	
		i++;
			}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=7;
					msg+=7;	
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
	if(e.getSource()==b8)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=8;
				msg=msg.substring(0,msg.length()-1);
				msg+=8;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=8;
				msg+=8;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=8;
		msg+=8;
		ta.setText(msg);	
		i++;
		}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=8;
					msg+=8;	
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
	if(e.getSource()==b9)
	{
		if(Z==0)
		{
			if(i>0)
			{
				if((a[i-1]==0 && R==1) || (i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%')) || (i==1 && a[i-1]==0))
			{
				i--;
				a[i]=9;
				msg=msg.substring(0,msg.length()-1);
				msg+=9;
				ta.setText(msg);
				i++;
				R=0;
			}
			else
				{
				a[i]=9;
				msg+=9;
				ta.setText(msg);
				i++;
				}
			}
			else
			{
		a[i]=9;
		msg+=9;
		ta.setText(msg);
		i++;
			}
		}
		else
			if(Z==1)
			{
					ta.setText("");
					msg="";
					i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
					a[i]=9;
					msg+=9;	
					ta.setText(msg);
					i++;
					Z=0;
			}
	}
	if(e.getSource()==b10)
	{
		Z=0;
		ta.setText("");
		for(int z=0;z<a.length;z++)
		a[z]=0;
		ans=0;
		i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
		msg="";
		if(sp.getVerticalScrollBar().isVisible())
			sp.setVerticalScrollBarPolicy(sp.VERTICAL_SCROLLBAR_NEVER);
		ta.setText("\n\n\n\t   0");
	}
	if(e.getSource()==b11)
	{
		if(Z==0)
		{
		if(t==1)
		{	i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
			ta.setText("\n\n\n\t   0");
			msg="";
			t=0;
		}
		if(i==0)
		{
			i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
			msg="";
			ta.setText("\n\n\n\t   0");
		}
		if(msg!="" && msg.length()>0)
		if(a.length>0  && i>0)
		{
			if((a[i-1]=='+' || a[i-1]=='-'  || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%') && (a[i-2]==ans) && a[i-2]!=0 && i==2)
			{
				ta.setText("\n\n\n\t   0");
				i=0;
				msg="";
				ans=0;
			}
			if(N==1 && i==2 && ans==0 && (a[i-1]=='+' || a[i-1]=='-'  || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%') && (a[i-2]==ans))
			{
				ta.setText("\n\n\n\t   0");
				i=0;
				msg="";
				ans=0;
				E=0;
			}
			if(i>0)
			{
			if(a[i-1]=='.')
				L=0;
			if(a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%')
			{
				for(int H=i;(a[H]!='+' || a[H]!='-' || a[H]!='*' || a[H]!='/' || a[H]!='%') && H>0;H--)
				{
					if(a[H]=='.')
					{
						L=1;
						break;
					}
					else
						L=0;
				}
			}
			}
		if(i>0)
		{	
		i--;
		msg=msg.substring(0,msg.length()-1);
		}
		ta.setText(msg);
		}
		}
		if(i==0)
		{
			i=0;t=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;L=0;E=0;M=0;
			msg="";
			ta.setText("\n\n\n\t   0");
		}
	}
	if(e.getSource()==b12)
	{
		if(Z==0)
		{
			if(msg!="")
			{
			if(i!=0  && (a[i-1]=='%' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='+'))
			{
			a[i-1]='%';
			msg=msg.substring(0,msg.length()-1);
			msg+='%';
			ta.setText(msg);
			}
			else
			{
			if(i!=0  && a[i-1]!='.')
			{
			a[i]='%';
			msg+='%';
			ta.setText(msg);
			i++;
			}
			}
			}
			L=0;
			}
		else
			if(Z==1)
			{
				i=0;
				a[i]=ans;
				i++;
				msg="";
				msg+=dec.format(ans);
				ta.setText(msg);
				if(msg!="")
				{
					if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
					{
						a[i-1]='%';
						msg=msg.substring(0,msg.length()-1);
						msg+='%';
						ta.setText(msg);
					}
					else
					{
						if(i!=0  && a[i-1]!='.')
						{
						a[i]='%';
						msg+='%';
						ta.setText(msg);
						i++;
						}
					}
			}
			Z=0;
			L=0;
			}
		}
	if(e.getSource()==b13)
	{
		if(Z==0)
		{
			if(msg!="")
			{
			if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
			{
				String s="\u00F7";
			a[i-1]='/';
			msg=msg.substring(0,msg.length()-1);
			msg+=s;
			ta.setText(msg);
			}
			else
			{
			if(i!=0  && a[i-1]!='.')
			{
				String s="\u00F7";
			a[i]='/';
			msg+=s;
			ta.setText(msg);
			i++;
			}
			}
			}
			L=0;
			}
		else if(Z==1)
				{
			i=0;
			a[i]=ans;
			i++;
			msg="";
			msg+=dec.format(ans);
			ta.setText(msg);
			if(msg!="")
			{
				if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
				{
					String s="\u00F7";
					a[i-1]='/';
					msg=msg.substring(0,msg.length()-1);
					msg+=s;
					ta.setText(msg);
				}
				else
				{
					if(i!=0  && a[i-1]!='.')
					{
						String s="\u00F7";
					a[i]='/';
					msg+=s;
					ta.setText(msg);
					i++;
					}
				}
		}
		Z=0;
		L=0;
		}
}
	if(e.getSource()==b14)
	{
		if(Z==0)
		{
			if(msg!="")
			{
			if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
			{
				String s3="\u00D7";
			a[i-1]='*';
			msg=msg.substring(0,msg.length()-1);
			msg+=s3;
			ta.setText(msg);
			}
			else
			{
			if(i!=0  && a[i-1]!='.')
			{
				String s3="\u00D7";
			a[i]='*';
			msg+=s3;
			ta.setText(msg);
			i++;
			}
			}
			}
			L=0;
			}
		else if(Z==1)
		{
			i=0;
			a[i]=ans;
			i++;
			msg="";
			msg+=dec.format(ans);
			ta.setText(msg);
			if(msg!="")
			{
				if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
				{
					String s3="\u00D7";
					a[i-1]='*';
					msg=msg.substring(0,msg.length()-1);
					msg+=s3;
					ta.setText(msg);
				}
				else
				{
					if(i!=0  && a[i-1]!='.')
					{
					String s3="\u00D7";
					a[i]='*';
					msg+=s3;
					ta.setText(msg);
					i++;
					}
				}
		}
		Z=0;
		L=0;
		}
}
	if(e.getSource()==b15)
	{
		if(Z==0)
		{
			if(msg!="")
			{
			if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
			{
			a[i-1]='-';
			msg=msg.substring(0,msg.length()-1);
			msg+='-';
			ta.setText(msg);
			}
			else
			{
			if(i!=0  && a[i-1]!='.')
			{
			a[i]='-';
			msg+='-';
			ta.setText(msg);
			i++;
			}
			}
			}
			L=0;
			}
		else if(Z==1)
		{
			i=0;
			a[i]=ans;
			i++;
			msg="";
			msg+=dec.format(ans);
			ta.setText(msg);
			if(msg!="")
			{
				if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
				{
					a[i-1]='-';
					msg=msg.substring(0,msg.length()-1);
					msg+='-';
					ta.setText(msg);
				}
				else
				{
					if(i!=0  && a[i-1]!='.')
					{
					a[i]='-';
					msg+='-';
					ta.setText(msg);
					i++;
					}
				}
		}
		Z=0;
		L=0;
		}
}
	if(e.getSource()==b16)
	{
		if(Z==0)
		{
			if(msg!="")
			{
			if(i!=0  && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
			{
			a[i-1]='+';
			msg=msg.substring(0,msg.length()-1);
			msg+='+';
			ta.setText(msg);
			}
			else
			{
			if(i!=0  && a[i-1]!='.')
			{
			a[i]='+';
			msg+='+';
			ta.setText(msg);
			i++;
			}
			}
			}
			L=0;
			}
		else if(Z==1)
		{
			i=0;
			a[i]=ans;
			i++;
			msg="";
			msg+=dec.format(ans);
			ta.setText(msg);
			if(msg!="")
			{
				if(i!=0 && (a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%'))
				{
					a[i-1]='+';
					msg=msg.substring(0,msg.length()-1);
					msg+='+';
					ta.setText(msg);
				}
				else
				{
					if(i!=0  && a[i-1]!='.')
					{
					a[i]='+';
					msg+='+';
					ta.setText(msg);
					i++;
					}
				}
		}
		Z=0;
		L=0;
		}
}
	if(e.getSource()==b17)
	{
		a[i]='=';
		if(a[0]!='=')
		{
	if(a[i-1]!='+' && a[i-1]!='-' && a[i-1]!='*' && a[i-1]!='/' && a[i-1]!='%' && a[i-1]!='.')
	{
	int k=0,c=0,U=0;
	double z=0,m=0,E=0;
	String ke="";
	for(j=0;a[k]!='=';j++)
	{
		if(j!=0)
		{
		if(a[k]!='.')
		a[j]=a[c];
		c++;
		m=0;
		}
	for(k=c;(a[k]!='+' && a[k]!='-' && a[k]!='*' && a[k]!='/' && a[k]!='%' && a[k]!='.') && a[k]!='=';k++)
	{
		if(U==1)
		{
			ke+=(int)a[k];
		}
		z=a[k];
		m=m*10+z;
		c=k+1;
	}
	if(U==1)
	{	
		E=Double.valueOf(ke);
		for(int R=0;R<ke.length();R++)
		E/=10;
		a[j-1]=a[j-1]+E;
		int UI,ty=j,ma=j;
		for(UI=k;a[UI]!='=';UI++)
		a[ty++]=a[UI];
		a[ty]='=';
		c=ma;
		j--;
		ke="";
		E=0;
		U=0;
	}
	else
	{
		if(j>0)
		j++;
		a[j]=m;
	}
	
		if(a[c]=='.')
		{
			U=1;
		}
	}
	i=j;
	a[j]='=';
if(a[0]==61)
{
	a[0]=a[0]*10;
	l=1;
}
	for(j=0;a[j]!='=';j++,j++)
	{	
		if(a[1]=='=')
		{
		ans=a[0];
		Z=1;
		ta.setText(String.valueOf("\n\n\n= "+dec.format(ans)));
		break;
		}
		if(j==0)
		{
			if(a[j+1]=='/')
			{
				if(a[j]==610 && l==1)
				{
					a[j]=a[j]/10;
					l=0;
				}
				if(a[j]==0 && a[j+2]==0)
				{
					i=0;
					ta.setText("Syntax Error");
					t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;
					msg="";
					break;
				}
				if(a[j+2]==0)
				{
					i=0;
					ta.setText("Syntax Error");
					t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;
					msg="";
					break;
				}
				ans=a[j]/a[j+2];
				j++;
			}
		}
	else
		if(a[j]=='/')
			ans/=a[j+1];
		
		if(j==0)
		{
			if(a[j+1]=='*')
				{
					if(a[j]==610 && l==1)
						{
							a[j]=a[j]/10;
							l=0;
						}
					ans=a[j]*a[j+2];
					j++;	
				}
		}	
	else
		if(a[j]=='*')
			ans*=a[j+1];
	
		if(j==0)
		{
			if(a[j+1]=='+')
			{
				if(a[j]==610 && l==1)
				{
					a[j]=a[j]/10;
					l=0;
				}
				ans=a[j]+a[j+2];
				j++;
			}		
		}	
		else
			if(a[j]=='+')
			{
				ans+=a[j+1];
			}
	
		if(j==0)
		{
		if(a[j+1]=='-')
		{
			if(a[j]==610 && l==1)
			{
				a[j]=a[j]/10;
				l=0;
			}
			ans=a[j]-a[j+2];
			j++;
		}
		}
	else
		if(a[j]=='-')
			{
			ans-=a[j+1];
			}
		
		if(j==0)	
		{	
			if(a[j+1]=='%')
			{
			if(a[j]==610 && l==1)
			{
			a[j]=a[j]/10;
			l=0;
			}
			if(a[j+2]==0)
			{
				i=0;
				ta.setText("Syntax Error");
				t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;E=0;M=0;
			msg="";
			break;
			}
 		 		ans=a[j]%a[j+2];
 		 		j++;
 		 	}	
		}
		else
			if(a[j]=='%')
			{
				if(a[j+1]==0)
				{
					i=0;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;E=0;M=0;
					ta.setText("Syntax Error");
					msg="";
				t=1;
				break;
				}
				ans%=a[j+1];
			}
		ta.setText(String.valueOf("\n\n\n= "+dec.format(ans)));
	Z=1;
	}
	}
		else
		{
			i=0;
			ta.setText("Syntax Error");
			msg="";
			t=1;j=0;l=0;Z=0;Q=0;N=0;G=0;R=0;E=0;M=0;
		}
		}
		}
	if(e.getSource()==b18)
	{
		if(Z==0)
		if(L==0)
		{
		if(msg!="")
		if(i!=0 &&(a[i-1]!='+' && a[i-1]!='-' && a[i-1]!='*' && a[i-1]!='/' && a[i-1]!='%' && a[i-1]!='.'))
		{
		a[i]='.';
		msg+='.';
		ta.setText(msg);
	i++;
	L=1;
	}}
	}
	if(e.getSource()==b19)
	{
		if(!(i==1 && a[i-1]==0))
		{
		if(Z==0)
		{
			if(i>1 && a[i-1]==0 && (a[i-2]=='+' || a[i-2]=='-' || a[i-2]=='*' || a[i-2]=='/' || a[i-2]=='%'))
		{
			ta.setText(msg);
		}
		else
		{
			if(i>0)
			{
			if((a[i-1]=='+' || a[i-1]=='-' || a[i-1]=='*' || a[i-1]=='/' || a[i-1]=='%')&& L==0)
				R=1;
			else
				R=0;
			}
			if(i==0)
				R=1;
			a[i]=0;
			msg+=0;
			ta.setText(msg);
			i++;
		}
		}
		else
			if(Z==1)
			{
				if(a[i-1]=='+' && a[i-1]=='-' && a[i-1]=='*' && a[i-1]=='/' && a[i-1]=='%')
				{
					a[i]=0;
					msg+=0;
					ta.setText(msg);
					i++;
					Z=0;
				}
				else
				{
					msg="";
					i=0;
					a[i]=0;
					msg+=0;
					ta.setText(msg);
					i++;
					Z=0;
				}
			}
	}
		else
			R=1;
	}
	if(e.getSource()==tb)
	{
	
	}
}
	catch(Exception q)
	{
		
	}
}
public static void main(String[] argc)
{
	designpanel1 b=new designpanel1();
}

private void designpanel1() {
	// TODO Auto-generated method stub
	
}
}

