import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Studententry extends JFrame implements ActionListener
{
	JLabel jl,jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8;
        	JComboBox jc1,jc2,jc3;
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
	JButton bs,br,bu, b,st,su,m,r,l;
        	Color c1=new Color(30,135,150);
	Container c=null;
        	ImageIcon ii=new ImageIcon("xxx.jpg");
	Studententry()
	{
		super("Student Entry");
		c=getContentPane();
		c.setLayout(null);
                		c.setBackground(c1);
/*Image*/	       	
		jl=new JLabel(ii);
		c.setLayout(null);
		jl.setBounds(80,0,910,147);
		c.add(jl);
/*Branch Entry*/
   	        	b=new JButton("Branch Entry");
		b.setBounds(80,148,150,30);
		c.add(b);
                		b.addActionListener(this);
/*Student Entry*/
	        	st=new JButton("Student Entry");
		st.setBounds(232,148,150,30);
		c.add(st);
/*Subject Entry*/
                		su=new JButton("Subject Entry");
		su.setBounds(384,148,150,30);
		c.add(su);
                		su.addActionListener(this);
/*Marks Entry*/
		m=new JButton("Marks Entry");
		m.setBounds(536,148,150,30);
		c.add(m);
		m.addActionListener(this);
/*Reports*/
	                   r=new JButton("Reports");
                		r.setBounds(688,148,150,30);
                		c.add(r);	
		r.addActionListener(this);
/*LogOut*/
	                   l=new JButton("LogOut");
		l.setBounds(840,148,150,30);
		c.add(l);
                		l.addActionListener(this);
/*Course Label*/	
		jlb1=new JLabel("Course");
		jlb1.setBounds(300,240,150,30);
		c.add(jlb1);
/*Courses ComboBox*/
	        	jc1 = new JComboBox();
		jc1.addItem("");
		jc1.addItem("B.Tech");
                		jc1.addItem("MBA");
	        	jc1.setBounds(410,240,150,30);
		c.add(jc1);

		jlb2=new JLabel("Branch");
		jlb2.setBounds(300,290,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
		jc2.addItem("");
		jc2.addItem("CSE");
		jc2.addItem("IT");
		jc2.addItem("ECE");
		jc2.addItem("EEE");
		jc2.addItem("CIVIL");
		jc2.addItem("MECH");
               		jc2.setBounds(410,290,150,30);
		c.add(jc2);
		jlb3=new JLabel("Year");
		jlb3.setBounds(300,340,150,30);
		c.add(jlb3);
		jc3 = new JComboBox();
		jc3.addItem("");
		jc3.addItem("I ");
              	jc3.addItem("II ");
                jc3.addItem("III "); 
                jc3.addItem("IV ");
                jc3.setBounds(410,340,150,30);
		c.add(jc3);
                jlb4=new JLabel("studntregdno");
	        jlb4.setBounds(300,390,150,30);
		c.add(jlb4);		
		jtf1=new JTextField(10); 
		jtf1.setBounds(410,390,150,30);
		c.add(jtf1);
                jlb5=new JLabel("studntname");
	        jlb5.setBounds(300,440,150,30);
		c.add(jlb5);
		jtf2=new JTextField(10); 
		jtf2.setBounds(410,440,150,30);
		c.add(jtf2);
                jlb6=new JLabel("Date of birth");
	        jlb6.setBounds(300,490,150,30);
		c.add(jlb6);
		jtf3=new JTextField(10); 
		jtf3.setBounds(410,490,150,30);
		c.add(jtf3);
                jlb7=new JLabel("Address");
	        jlb7.setBounds(300,540,150,30);
		c.add(jlb7);
		jtf4=new JTextField(10); 
		jtf4.setBounds(410,540,150,30);
		c.add(jtf4);
                jlb8=new JLabel("Phoneno");
	        	jlb8.setBounds(300,590,150,30);
		c.add(jlb8);
		jtf5=new JTextField(10); 
		jtf5.setBounds(410,590,150,30);
		c.add(jtf5);
                bs=new JButton("Save");
		bs.setBounds(360,650,70,30);
		c.add(bs);
		br=new JButton("Reset");
		br.setBounds(460,650,70,30);
		c.add(br);
                bu=new JButton("Update");
		bu.setBounds(560,650,90,30);
		c.add(bu);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{Branchentry be=new Branchentry();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(true);
		}
                if(ae.getSource()==su)
		{Subjectentry se=new Subjectentry();
		se.setVisible(true);
		this.setVisible(false);
		se.setSize(1000,800);
		se.setResizable(true);
		}
                if(ae.getSource()==m)
		{Marksentry me=new Marksentry();
		me.setVisible(true);
		this.setVisible(false);
		me.setSize(1000,800);
		me.setResizable(true);
		}
                if(ae.getSource()==r)
		{Reports re=new Reports();
		re.setVisible(true);
		this.setVisible(false);
		re.setSize(1000,800);
		re.setResizable(true);
		}
                if(ae.getSource()==l)
		{Starter st=new Starter();
		st.setVisible(true);
		this.setVisible(false);
		st.setSize(1000,800);
		st.setResizable(true);
		}						
	}
	public static void main(String[] args) 
	{
		Studententry be=new Studententry();
		be.setVisible(false);
		be.setSize(1000,800);
	}
} 