import javax.swing.*;
import java.awt.*;
class Regulation extends JFrame
{
	JLabel jlb,jl;
       	JTextField jtf;
	JButton bs,br,bu,b,st,su,m,r,l;
	Container c=null;
                 Color c3=new Color(30,135,150);
	ImageIcon i1=new ImageIcon("xxx.jpg ","xxx");
	Regulation()
	{
		super("Regulation");
		c=getContentPane();
		c.setLayout(null);
                                     c.setBackground(c3);
		 jl=new JLabel(i1);
                                 jl.setBounds(80,0,900,167);
		c.add(jl);
		
b=new JButton("Branchentry");
		b.setBounds(80,210,150,30);
		c.add(b);
	st=new JButton("Studententry");
		st.setBounds(232,210,150,30);
		c.add(st);
                su=new JButton("Subjectentry");
		su.setBounds(384,210,150,30);
		c.add(su);
	m=new JButton("Marksentry");
		m.setBounds(536,210,150,30);
		c.add(m);
                r=new JButton("Reports");
                	r.setBounds(688,210,150,30);
                	c.add(r);	
	l=new JButton("LogOut");
		l.setBounds(840,210,150,30);
		c.add(l);	
		jlb=new JLabel("Regulation");
	                 jlb.setBounds(300,330,100,30);
		c.add(jlb);
		jtf=new JTextField(10);
		jtf.setBounds(450,330,100,30);
		c.add(jtf);

		bs=new JButton("Save");
		bs.setBounds(320,400,100,30);
		c.add(bs);
		br=new JButton("Reset");
		br.setBounds(460,400,100,30);
		c.add(br);
                                  bu=new JButton("update");
		bu.setBounds(590,400,100,30);
		c.add(bu);
                                 
		                       setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
	public static void main(String[] args) 
	{
		Regulation me=new Regulation();
		me.setVisible(true);
		me.setSize(2000,1000);
	}
} 