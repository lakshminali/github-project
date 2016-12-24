import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Subjectentry extends JFrame implements ActionListener
{
	JLabel  jl,jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13,jlb14;
        JComboBox jc1,jc2;
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9,jtf10;
	JButton bs,br,bu,b,st,su,m,r,l;
	Container c=null;
        Color c1=new Color(51,213,225);
	ImageIcon i1=new ImageIcon("xxx.Bitmap Image");
	Subjectentry()
	{
		super("Subject entry");
		c=getContentPane();
		c.setLayout(null);
                c.setBackground(c1);
                jl=new JLabel(i1);
                jl.setBounds(80,0,900,167);
		c.add(jl);
		b=new JButton("Branchentry");
		b.setBounds(80,160,150,30);
		c.add(b);
                b.addActionListener(this);	
	        st=new JButton("Studententry");
		st.setBounds(232,160,150,30);
		c.add(st);
                st.addActionListener(this);
                su=new JButton("Subjectentry");
		su.setBounds(384,160,150,30);
		c.add(su);                              
	        m=new JButton("Marksentry");
		m.setBounds(536,160,150,30);
		c.add(m);
                m.addActionListener(this);
                r=new JButton("Reports");
                r.setBounds(688,160,150,30);
                c.add(r);
                r.addActionListener(this);	
	        l=new JButton("LogOut");
		l.setBounds(840,160,150,30);
		c.add(l);
                l.addActionListener(this);
		jlb1=new JLabel("Course");
		jlb1.setBounds(320,190,150,30);
		c.add(jlb1);
		jc1 = new JComboBox();
                jc1.addItem(" "); 
		jc1.addItem("BTech");
                jc1.addItem("MBA");
                jc1.setBounds(410,200,150,25);
		c.add(jc1);
		jlb2=new JLabel("Branch");
		jlb2.setBounds(320,220,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
		jc2.addItem(" ");
		jc2.addItem("CSE");
                jc2.addItem("IT");
                jc2.addItem("ECE"); 
                jc2.addItem("EEE");
                jc2.setBounds(410,230,150,25);
		c.add(jc2);
                jlb3=new JLabel("Enter subject name");
	        jlb3.setBounds(320,250,150,25);
		c.add(jlb3);
		jlb4=new JLabel("1");
	        jlb4.setBounds(320,290,150,25);
		c.add(jlb4);
		jtf1=new JTextField(10); 
		jtf1.setBounds(350,290,150,25);
		c.add(jtf1);
                jlb5=new JLabel("2");
	        jlb5.setBounds(320,320,150,25);
		c.add(jlb5);
		jtf2=new JTextField(10); 
		jtf2.setBounds(350,320,150,25);
		c.add(jtf2);
                jlb6=new JLabel("3");
	        jlb6.setBounds(320,350,70,25);
		c.add(jlb6);
		jtf3=new JTextField(10); 
		jtf3.setBounds(350,350,150,25);
		c.add(jtf3);
                jlb7=new JLabel("4");
	        jlb7.setBounds(320,380,150,25);
		c.add(jlb7);
		jtf4=new JTextField(10); 
		jtf4.setBounds(350,380,150,25);
		c.add(jtf4);
                jlb8=new JLabel("5");
	        jlb8.setBounds(320,410,150,25);
		c.add(jlb8);		
                jtf5=new JTextField(10); 
		jtf5.setBounds(350,410,150,25);
		c.add(jtf5);
                jlb9=new JLabel("6");
	        jlb9.setBounds(320,440,70,25);
		c.add(jlb9);
		jtf6=new JTextField(10); 
		jtf6.setBounds(350,440,150,25);
		c.add(jtf6); 
                jlb10=new JLabel("Enter Labs");
	        jlb10.setBounds(320,460,150,25);
		c.add(jlb10);
                jlb11=new JLabel("1");
	        jlb11.setBounds(320,500,150,25);
		c.add(jlb11);
		jtf7=new JTextField(10); 
		jtf7.setBounds(350,500,150,25);
		c.add(jtf7);
                jlb12=new JLabel("2");
	        jlb12.setBounds(320,530,150,25);
		c.add(jlb12);
		jtf8=new JTextField(10); 
		jtf8.setBounds(350,530,150,25);
		c.add(jtf8);
                jlb13=new JLabel("3");
	        jlb13.setBounds(320,560,150,25);
		c.add(jlb13);
		jtf9=new JTextField(10); 
		jtf9.setBounds(350,560,150,25);
		c.add(jtf9); 
                jlb14=new JLabel("4");
	        jlb14.setBounds(320,590,150,25);
		c.add(jlb14);
		jtf10=new JTextField(10); 
		jtf10.setBounds(350,590,150,25);
		c.add(jtf10);
		bs=new JButton("Save");
		bs.setBounds(350,650,70,30);
		c.add(bs);
		br=new JButton("Reset");
		br.setBounds(460,650,70,30);
		c.add(br);
                bu=new JButton("update");
		bu.setBounds(570,650,80,30);
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
                                   
		Subjectentry se=new Subjectentry();
		se.setVisible(false);
		se.setSize(5000,5000);
	}
} 