import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Marksentry extends JFrame implements ActionListener
{
	JLabel jlb1,jlb2,jlb3,jlb4,jl;
        JComboBox jc1,jc2,jc3,jc4;
	JButton bs,br,bu,b,st,su,m,r,l;
	Container c=null;
        Color c3=new Color(30,135,150);
	ImageIcon i1=new ImageIcon("xxx.jpg ","xxx");
	Marksentry()
	{
		super("Marks Entry");
		c=getContentPane();
		c.setLayout(null);
                c.setBackground(c3);
		jl=new JLabel(i1);
                jl.setBounds(80,0,900,167);
		c.add(jl);		
	        b=new JButton("Branchentry");
		b.setBounds(80,170,150,30);
		c.add(b);
		b.addActionListener(this);
	        st=new JButton("Studententry");
		st.setBounds(232,170,150,30);
		c.add(st);
		st.addActionListener(this);
                su=new JButton("Subjectentry");
		su.setBounds(384,170,150,30);
		c.add(su);
		su.addActionListener(this);
	        m=new JButton("Marksentry");
		m.setBounds(536,170,150,30);
		c.add(m);
	        r=new JButton("Reports");
                r.setBounds(688,170,150,30);
                c.add(r);
		r.addActionListener(this);	
	        l=new JButton("LogOut");
		l.setBounds(840,170,150,30);
		c.add(l);
		l.addActionListener(this);	
		jlb1=new JLabel("course");
	        jlb1.setBounds(300,330,150,50);
		c.add(jlb1);
                jc1 = new JComboBox();
                                        
		jc1.addItem(""); 
		jc1.addItem("BTech");
                jc1.addItem("MBA");
                jc1.setBounds(400,330,150,30);
		c.add(jc1);
		jlb2=new JLabel("Branch");
		jlb2.setBounds(300,390,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
                                      jc2.addItem(""); 
		jc2.addItem("CSE");
                jc2.addItem("IT");
                jc2.addItem("ECE");
                jc2.addItem("EEE");
                jc2.setBounds(400,390,150,30);
		c.add(jc2);
		jlb3=new JLabel("year");
		jlb3.setBounds(300,450,150,30);
		c.add(jlb3);
		jc3 = new JComboBox();
		jc3.addItem(""); 
		jc3.addItem("2008");
                                     jc3.addItem("2009");
                                     jc3.addItem("2010"); 
                                     jc3.addItem("2011");
                                     jc3.setBounds(400,450,150,30);
		c.add(jc3);
                                     jlb4=new JLabel("Sem");
		jlb4.setBounds(300,520,150,30);
		c.add(jlb4);
		jc4= new JComboBox();
 		jc4.addItem(""); 
		jc4.addItem("I");
                                      jc4.addItem("II");
                                     jc4.setBounds(400,520,150,30);
		c.add(jc4); 
                                     bs=new JButton("Save");
		bs.setBounds(360,600,70,30);
		c.add(bs);
		br=new JButton("Reset");
		br.setBounds(460,600,70,30);
		c.add(br);
                bu=new JButton("update");
		bu.setBounds(560,600,90,30);
		c.add(bu);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{Branchentry be=new Branchentry();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(false);
		}
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
		Marksentry me=new Marksentry();
		me.setVisible(false);
		me.setSize(2000,1000);
	}
} 