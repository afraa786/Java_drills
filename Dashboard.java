import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame { 

    Dashboard() {
        JLabel title = new JLabel("University", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 36));
        title.setForeground(Color.BLACK);
        title.setPreferredSize(new Dimension(1540, 60));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/images.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel img = new JLabel(i3);

        JMenuBar mb = new JMenuBar();

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        newInfo.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Member");
        facultyInfo.setBackground(Color.PINK);
        facultyInfo.setFont(new Font("Arial", Font.PLAIN, 16));
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.PINK);
        studentInfo.setFont(new Font("Arial", Font.PLAIN, 16));
        newInfo.add(studentInfo);

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        details.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(details);

        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.PINK);
        facultyDetails.setFont(new Font("Arial", Font.PLAIN, 16));
        details.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.PINK);
        studentDetails.setFont(new Font("Arial", Font.PLAIN, 16));
        details.add(studentDetails);

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        leave.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.PINK);
        facultyLeave.setFont(new Font("Arial", Font.PLAIN, 16));
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.PINK);
        studentLeave.setFont(new Font("Arial", Font.PLAIN, 16));
        leave.add(studentLeave);

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        leaveDetails.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.PINK);
        facultyLeaveDetails.setFont(new Font("Arial", Font.PLAIN, 16));
        leaveDetails.add(facultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.PINK);
        studentLeaveDetails.setFont(new Font("Arial", Font.PLAIN, 16));
        leaveDetails.add(studentLeaveDetails);

        JMenu exam = new JMenu("Examination Details");
        exam.setForeground(Color.BLACK);
        exam.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Details");
        ExaminationDetails.setBackground(Color.PINK);
        ExaminationDetails.setFont(new Font("Arial", Font.PLAIN, 16));
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Update Marks");
        EnterMarks.setBackground(Color.PINK);
        EnterMarks.setFont(new Font("Arial", Font.PLAIN, 16));
        exam.add(EnterMarks);

        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.PINK);
        updatefacultyinfo.setFont(new Font("Arial", Font.PLAIN, 16));
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.PINK);
        updatestudentinfo.setFont(new Font("Arial", Font.PLAIN, 16));
        updateInfo.add(updatestudentinfo);

        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        fee.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.PINK);
        feestructure.setFont(new Font("Arial", Font.PLAIN, 16));
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee form");
        feeform.setBackground(Color.PINK);
        feeform.setFont(new Font("Arial", Font.PLAIN, 16));
        fee.add(feeform);

        JMenu utility = new JMenu("About Us");
        utility.setForeground(Color.BLACK);
        utility.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(utility);

        JMenuItem collegeinfo = new JMenuItem("Contact Details");
        collegeinfo.setBackground(Color.PINK);
        collegeinfo.setFont(new Font("Arial", Font.PLAIN, 16));
        utility.add(collegeinfo);

        JMenuItem moreInfo = new JMenuItem("Brochure");
        moreInfo.setBackground(Color.PINK);
        moreInfo.setFont(new Font("Arial", Font.PLAIN, 16));
        utility.add(moreInfo);

        JMenuItem about = new JMenuItem("Our Mission");
        about.setBackground(Color.PINK);
        about.setFont(new Font("Arial", Font.PLAIN, 16));
        utility.add(about);

        JMenuItem vis = new JMenuItem("Our Vision");
        vis.setBackground(Color.PINK);
        vis.setFont(new Font("Arial", Font.PLAIN, 16));
        utility.add(vis);

        setJMenuBar(mb);
        setLayout(new BorderLayout());
        add(title, BorderLayout.NORTH);
        add(img, BorderLayout.CENTER);

        setSize(1540, 850);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
