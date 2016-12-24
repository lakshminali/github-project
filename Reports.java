import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Reports extends JFrame implements ActionListener
{
	JLabel jl,jlb1,jlb2,jlb3,jlb4;
        JComboBox jc1,jc2,jc3,jc4;
	JButton bs,br,bu,bm,b,st,su,m,r,l;
        Color c1=new Color(30,135,150);
	Container c=null;
        ImageIcon i1=new ImageIcon("xxx.jpg");
	Reports()
	{
		super("Reports");
		c=getContentPane();
		c.setLayout(null);
                c.setBackground(c1);
                jl=new JLabel(i1);
                jl.setBounds(80,0,910,147);
		c.add(jl);
                b=new JButton("Branchentry");
		b.setBounds(80,148,150,30);
		c.add(b);
                b.addActionListener(this);
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
	        l=new JButton("LogOut");
		l.setBounds(840,148,150,30);
		c.add(l);	
                l.addActionListener(this);
		jlb1=new JLabel("course");
	        jlb1.setBounds(300,250,90,30);
		c.add(jlb1);
                jc1 = new JComboBox();
                jc1.addItem("");
		jc1.addItem("BTech");
                jc1.addItem("MBA");
                jc1.setBounds(410,250,150,30);
		c.add(jc1);
		jlb2=new JLabel("Branch");
		jlb2.setBounds(300,305,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
                jc2.addItem("");
		jc2.addItem("CSE");
                jc2.addItem("IT");
                jc2.addItem("ECE");
                jc2.addItem("EEE");
                jc2.setBounds(410,305,150,30);
		c.add(jc2);
		jlb3=new JLabel("year");
		jlb3.setBounds(300,360,150,30);
		c.add(jlb3);
		jc3 = new JComboBox();
                jc3.addItem("");
		jc3.addItem("I");
                jc3.addItem("II");
                jc3.addItem("III"); 
                jc3.addItem("IV");
                jc3.setBounds(410,360,150,30);
		c.add(jc3);
                jlb4=new JLabel("Sem");
		jlb4.setBounds(300,415,150,30);
		c.add(jlb4);
		jc4= new JComboBox();
                jc4.addItem("");
		jc4.addItem("I");
                jc4.addItem("II");
                jc4.setBounds(410,415,150,30);
		c.add(jc4); 
                bs=new JButton("Save");
		bs.setBounds(360,500,70,30);
		c.add(bs);
		br=new JButton("Reset");
		br.setBounds(460,500,70,30);
		c.add(br);
                bu=new JButton("update");
		bu.setBounds(560,500,80,30);
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
                   if(ae.getSource()==m)
		{Marksentry me=new Marksentry();
		me.setVisible(true);
		this.setVisible(false);
		me.setSize(1000,800);
		me.setResizable(false);
		}
                    if(ae.getSource()==l)
		{Starter st=new Starter();
		st.setVisible(true);
		this.setVisible(false);
		st.setSize(1000,800);
		st.setResizable(false);
}		}						
	public static void main(String[] args) 
	{
		Reports re=new Reports();
		re.setVisible(true);
		re.setSize(2000,1000);
	}
} 