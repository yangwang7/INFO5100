package StudentInformationSystem;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentsApplication extends JFrame {

	private JTable studentsTable;
	JPanel p;
	JButton add;
	JLabel idLabel, firstLabel, lastLabel, genderLabel;
	JTextField idText, firstText, lastText, genderText;
	Students students;
	
	public StudentsApplication() {
		students = new Students();
		
		p = new JPanel(new GridLayout(4, 2));
		
		add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText();
				String first = firstText.getText();
				String last = lastText.getText();
				String gender = genderText.getText();
				students.addStudent(new Student(id, first, last, gender));
				studentsTable.updateUI();
				idText.setText("");
				firstText.setText("");
				lastText.setText("");
				genderText.setText("");
			}
		});
		
		idLabel = new JLabel("ID");
		firstLabel = new JLabel("First Name");
		lastLabel = new JLabel("Last Name");
		genderLabel = new JLabel("Gender");
		
		idText= new JTextField(10);
		firstText = new JTextField(10);
		lastText = new JTextField(10);
		genderText = new JTextField(10);

		StudentsTableModel model = new StudentsTableModel(students);
		studentsTable = new JTable(model);
		JScrollPane jsp = new JScrollPane(studentsTable);
		
		p.add(idLabel);
		p.add(idText);
		p.add(firstLabel);
		p.add(firstText);
		p.add(lastLabel);
		p.add(lastText);
		p.add(genderLabel);
		p.add(genderText);

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(BorderLayout.NORTH, p);
		con.add(BorderLayout.CENTER,add);
		con.add(BorderLayout.SOUTH, jsp);

		setSize(400, 400);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
	}

	public static void main(String[] args) {
		new StudentsApplication();
	}
}

class Students {
	private Collection<Student> students = new ArrayList<Student>();

	public Collection<Student> getStudents() {
		return students;

	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public int getNumberOfStudents() {
		return getStudents().size();
	}

}

class Student {
	String id;
	String first;
	String last;
	String gender;

	public Student(String id, String first, String last, String gender) {
		this.id = id;
		this.first = first;
		this.last = last;
		this.gender = gender;
	}
}

class StudentsTableModel implements TableModel {

	private Students students;

	public StudentsTableModel(Students students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.getNumberOfStudents();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "ID";
		}
		if (columnIndex == 1) {
			return "First";
		}
		if (columnIndex == 2)
			return "Last";
		if (columnIndex == 3)
			return "Gender";
		return null;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Collection<Student> s = students.getStudents();
		int row = -1;
		for (Student student : s) {
			row++;
			if (row == rowIndex) {
				if (columnIndex == 0) {
					return student.id + "";
				}
				if (columnIndex == 1) {
					return student.first;
				}
				if (columnIndex == 2) {
					return student.last;
				}
				if (columnIndex == 3) {
					return student.gender;
				}
			}
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
