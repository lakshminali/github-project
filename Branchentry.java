import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Branchentry extends JFrame implements ActionListener
{
	JLabel jl,jlab,jb,jbc;
	JTextField jtf1,jtf2,jtf3;
	JButton bs,br;
	JButton b,st,su,m,r,l;
	Container c=null;
	Color c1=new Color(30,135,150);
	ImageIcon ii=new ImageIcon("xxx.jpg");	
	Branchentry()
	{
		super("Branch Entry");
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(c1);
                jl=new JLabel(ii);
		c.setLayout(null);
		jl.setBounds(80,0,910,147);
		c.add(jl); 		       
   	        b=new JButton("Branchentry");
		b.setBounds(80,148,150,30);
		c.add(b);
              	st=new JButton("Studententry");
		st.setBounds(232,148,150,30);
		c.add(st);
                st.addActionListener(this);
                su=new JButton("Subjectentry");
		su.setBounds(384,148,150,30);
		c.add(su);
		su.addActionListener(this);
	        m=new JButton("Marksentry");
		m.setBounds(536,148,150,30);
		c.add(m);
		m.addActionListener(this);
                r=new JButton("Reports");
                r.setBounds(688,148,150,30);
                c.add(r);
		r.addActionListener(this);	
	        l=new JButton("LogOut");
		l.setBounds(840,148,150,30);
		c.add(l);	
		l.addActionListener(this);
		jlab=new JLabel("COURSE");
	 	jlab.setBounds(300,300,160,30);
		c.add(jlab);
		jtf1=new JTextField(10); 
		jtf1.setBounds(400,300,160,30);
		c.add(jtf1);
		 jb=new JLabel("BRANCH");
		jb.setBounds(300,350,160,30);
		c.add(jb);
		jtf2=new JTextField(10); 
		jtf2.setBounds(400,350,160,30);
		c.add(jtf2);
		jbc=new JLabel("BRANCH CODE");
		jbc.setBounds(300,400,160,30);
		c.add(jbc);
		jtf3=new JTextField(10); 
		jtf3.setBounds(400,400,160,30);
		c.add(jtf3);
		bs=new JButton("Save");
		bs.setBounds(360,460,70,30);
		c.add(bs);
		br=new JButton("Reset");
		br.setBounds(470,460,70,30);
		c.add(br);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
       public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==st)
		{Studententry be=new Studententry();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(false);
		}
		if(ae.getSource()==su)
		{Subjectentry se=new Subjectentry();
		se.setVisible(true);
		this.setVisible(false);
		se.setSize(1000,800);
		se.setResizable(false);
		}
		if(ae.getSource()==m)
		{Marksentry me=new Marksentry();
		me.setVisible(true);
		this.setVisible(false);
		me.setSize(1000,800);
		me.setResizable(false);
		}
		if(ae.getSource()==r)
		{Reports re=new Reports();
		re.setVisible(true);
		this.setVisible(false);
		re.setSize(1000,800);
		re.setResizable(false);
		}
		if(ae.getSource()==l)
		{Starter st=new Starter();
		st.setVisible(true);
		this.setVisible(false);
		st.setSize(1000,800);
		st.setResizable(false);
		}
		}
	
	public static void main(String[] args) 
	{
		Branchentry be=new Branchentry();
		be.setVisible(false);
		be.setSize(1000,800);
	}
} 