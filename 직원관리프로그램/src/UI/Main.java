package UI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import employee.EmployeeSet;

public class Main extends JFrame {

    int updateIdx;
    JPanel contentPane;
    JPanel createPanel = new JPanel();
    JPanel fullPanel = new JPanel();
    JPanel partPanel = new JPanel();
    JPanel readPanel = new JPanel();
    JPanel updatePanel = new JPanel();
    JPanel deletePanel = new JPanel();


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Main() {
        updateIdx = -1;
        setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750,600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setResizable(false);
        contentPane.setLayout(null);

        EmployeeSet set = new EmployeeSet();


        //mainPanel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.decode("#F2F2F7"));
        mainPanel.setBounds(0, 0, 736, 563);
        mainPanel.setLayout(null);
        contentPane.add(mainPanel);
        JLabel mainTitle = new JLabel("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
        mainTitle.setBounds(0, 10, 736, 138);
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitle.setFont(new Font("맑은 고딕", Font.BOLD, 34));
        mainPanel.add(mainTitle);
        JButton mainCreate = new JButton("\uC9C1\uC6D0 \uB4F1\uB85D");
        mainCreate.setBackground(new Color(255, 255, 255));
        mainCreate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        mainCreate.setBounds(168, 155, 400, 50);
        mainPanel.add(mainCreate);
        JButton mainRead = new JButton("\uC9C1\uC6D0 \uAC80\uC0C9");
        mainRead.setBackground(new Color(255, 255, 255));
        mainRead.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        mainRead.setBounds(168, 225, 400, 50);
        mainPanel.add(mainRead);
        JButton mainUpdate = new JButton("\uC9C1\uC6D0 \uAC31\uC2E0");
        mainUpdate.setBackground(new Color(255, 255, 255));
        mainUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        mainUpdate.setBounds(168, 295, 400, 50);
        mainPanel.add(mainUpdate);
        JButton mainDelete = new JButton("\uC9C1\uC6D0 \uC0AD\uC81C");
        mainDelete.setBackground(new Color(255, 255, 255));
        mainDelete.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        mainDelete.setBounds(168, 365, 400, 50);
        mainPanel.add(mainDelete);
        JButton mainExit = new JButton("\uD504\uB85C\uADF8\uB7A8 \uC885\uB8CC");
        mainExit.setBackground(new Color(255, 255, 255));
        mainExit.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        mainExit.setBounds(168, 435, 400, 50);
        mainPanel.add(mainExit);

        mainPanel.setVisible( true);
        createPanel.setVisible(false);
        readPanel.setVisible(false);
        updatePanel.setVisible(false);
        deletePanel.setVisible(false);
        partPanel.setVisible(false);
        fullPanel.setVisible(false);

        mainCreate.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { mainCreate.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { mainCreate.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(true);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - \uC9C1\uC6D0\uB4F1\uB85D");
            }
        });
        mainRead.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { mainRead.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { mainRead.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(false);
                readPanel.setVisible(true);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - \uC9C1\uC6D0\uAC80\uC0C9");
            }
        });
        mainUpdate.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { mainUpdate.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { mainUpdate.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(true);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - \uC9C1\uC6D0\uAC31\uC2E0");

            }
        });
        mainDelete.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { mainDelete.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { mainDelete.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(true);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - \uC9C1\uC6D0\uC0AD\uC81C");
            }
        });
        mainExit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { mainExit.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { mainExit.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });


        // createPanel//////////////////////////////////////////////////////////////////////////////////////
        createPanel.setBackground(Color.decode("#F2F2F7"));
        createPanel.setBounds(0, 0, 736, 563);
        createPanel.setLayout(null);

        JButton create_full = new JButton("\uC815\uADDC\uC9C1 \uB4F1\uB85D");
        create_full.setBackground(new Color(255, 255, 255));
        create_full.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        create_full.setBounds(168, 190, 400, 50);
        createPanel.add(create_full);

        JButton create_part = new JButton("\uC784\uC2DC\uC9C1 \uB4F1\uB85D");
        create_part.setBackground(new Color(255, 255, 255));
        create_part.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        create_part.setBounds(168, 260, 400, 50);
        createPanel.add(create_part);

        JButton create_cancel = new JButton("\uB3CC\uC544\uAC00\uAE30");
        create_cancel.setBackground(new Color(255, 255, 255));
        create_cancel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        create_cancel.setBounds(168, 330, 400, 50);
        createPanel.add(create_cancel);
        contentPane.add(createPanel);

        create_full.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_full.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_full.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(true);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - \uC9C1\uC6D0\uB4F1\uB85D - \uC815\uADDC\uC9C1 \uB4F1\uB85D");
            }
        });

        create_part.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_part.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_part.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(true);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - \uC9C1\uC6D0\uB4F1\uB85D - \uC784\uC2DC\uC9C1 \uB4F1\uB85D");
            }
        });

        create_cancel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_cancel.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_cancel.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( true );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
            }
        });

        ///////////////////////////// fullPanel/////////////////////////////////////
        fullPanel.setBackground(Color.decode("#F2F2F7"));
        fullPanel.setBounds(0, 0, 736, 563);
        fullPanel.setLayout(null);
        contentPane.add(fullPanel);

        JLabel create_full_nameLabel = new JLabel("\uC774\uB984");
        create_full_nameLabel.setBounds(260, 165, 100, 30);
        create_full_nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        fullPanel.add(create_full_nameLabel);

        JTextField create_full_nameInput = new JTextField();
        create_full_nameInput.setBackground(new Color(255, 255, 255));
        create_full_nameInput.setBounds(305, 165, 206, 30);
        create_full_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        fullPanel.add(create_full_nameInput);
        create_full_nameInput.setColumns(10);

        JLabel create_full_depart = new JLabel("\uBD80\uC11C");
        create_full_depart.setBounds(260, 210, 100, 30);
        create_full_depart.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        fullPanel.add(create_full_depart);

        JComboBox create_full_depart_combo = new JComboBox<String>();
        create_full_depart_combo.addItem("총무");
        create_full_depart_combo.addItem("인사");
        create_full_depart_combo.addItem("기획");
        create_full_depart_combo.addItem("생산");
        create_full_depart_combo.addItem("영업");
        create_full_depart_combo.setBackground(new Color(255, 255, 255));
        create_full_depart_combo.setBounds(305, 210, 206, 30);
        create_full_depart_combo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        fullPanel.add(create_full_depart_combo);

        JLabel create_full_pos = new JLabel("\uC9C1\uC704");
        create_full_pos.setBounds(260, 260, 100, 30);
        create_full_pos.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        fullPanel.add(create_full_pos);
        JComboBox create_full_pos_combo = new JComboBox<String>();
        create_full_pos_combo.addItem("이사");
        create_full_pos_combo.addItem("부장");
        create_full_pos_combo.addItem("과장");
        create_full_pos_combo.addItem("대리");
        create_full_pos_combo.addItem("사원");
        create_full_pos_combo.setBackground(new Color(255, 255, 255));
        create_full_pos_combo.setBounds(305, 260, 206, 30);
        create_full_pos_combo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        fullPanel.add(create_full_pos_combo);

        JLabel create_full_grade = new JLabel("Grade");
        create_full_grade.setBounds(246, 305, 100, 30);
        create_full_grade.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        fullPanel.add(create_full_grade);

        JTextField create_full_gradeInput = new JTextField();
        create_full_gradeInput.setBackground(new Color(255, 255, 255));
        create_full_gradeInput.setBounds(305, 305, 206, 30);
        create_full_gradeInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        fullPanel.add(create_full_gradeInput);
        create_full_gradeInput.setColumns(10);


        JButton create_full_ok = new JButton("\uB4F1\uB85D");
        create_full_ok.setBackground(new Color(255, 255, 255));
        create_full_ok.setBounds(300, 360, 80, 30);
        create_full_ok.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        fullPanel.add(create_full_ok);

        JButton create_full_cancel = new JButton("취소");
        create_full_cancel.setBackground(new Color(255, 255, 255));
        create_full_cancel.setBounds(400, 360, 80, 30);
        create_full_cancel.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        fullPanel.add(create_full_cancel);

        create_full_ok.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_full_ok.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_full_ok.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                String name = create_full_nameInput.getText().toString().trim();
                String depart = (String)create_full_depart_combo.getSelectedItem();
                String pos = (String)create_full_pos_combo.getSelectedItem();
                String grade = create_full_gradeInput.getText().toString().trim();
                if (set.RegisterFullTimeEmp(name, depart, pos, grade)) {
                    JOptionPane.showMessageDialog(null, name+"님 등록 완료");
                    create_full_nameInput.setText(null);
                    create_full_gradeInput.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "등록 실패!\n입력을 확인하세요.");
                }
            }
        });

        create_full_cancel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_full_cancel.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_full_cancel.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(true);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - 직원등록");
            }
        });


        //////////////////////////////////partPanel//////////////////
        partPanel.setBackground(Color.decode("#F2F2F7"));
        partPanel.setBounds(0, 0, 736, 563);
        partPanel.setLayout(null);
        contentPane.add(partPanel);

        JLabel create_part_nameLabel = new JLabel("\uC774\uB984");
        create_part_nameLabel.setBounds(260, 190, 100, 30);
        create_part_nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        partPanel.add(create_part_nameLabel);

        JTextField create_part_nameInput = new JTextField();
        create_part_nameInput.setBackground(new Color(255, 255, 255));
        create_part_nameInput.setBounds(305, 190, 206, 30);
        create_part_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        partPanel.add(create_part_nameInput);
        create_part_nameInput.setColumns(10);

        JLabel create_part_depart = new JLabel("\uBD80\uC11C");
        create_part_depart.setBounds(260, 235, 100, 30);
        create_part_depart.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        partPanel.add(create_part_depart);

        JComboBox create_part_depart_combo = new JComboBox<String>();
        create_part_depart_combo.addItem("총무");
        create_part_depart_combo.addItem("인사");
        create_part_depart_combo.addItem("기획");
        create_part_depart_combo.addItem("생산");
        create_part_depart_combo.addItem("영업");
        create_part_depart_combo.setBackground(new Color(255, 255, 255));
        create_part_depart_combo.setBounds(305, 235, 206, 30);
        create_part_depart_combo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        partPanel.add(create_part_depart_combo);

        JLabel create_part_hours = new JLabel("Hours");
        create_part_hours.setBounds(246, 280, 100, 30);
        create_part_hours.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        partPanel.add(create_part_hours);

        JTextField create_part_hoursInput = new JTextField();
        create_part_hoursInput.setBackground(new Color(255, 255, 255));
        create_part_hoursInput.setBounds(305, 280, 206, 30);
        create_part_hoursInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        partPanel.add(create_part_hoursInput);
        create_part_hoursInput.setColumns(10);


        JButton create_part_ok = new JButton("\uB4F1\uB85D");
        create_part_ok.setBackground(new Color(255, 255, 255));
        create_part_ok.setBounds(300, 335, 80, 30);
        create_part_ok.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        partPanel.add(create_part_ok);

        JButton create_part_cancel = new JButton("취소");
        create_part_cancel.setBackground(new Color(255, 255, 255));
        create_part_cancel.setBounds(400, 335, 80, 30);
        create_part_cancel.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        partPanel.add(create_part_cancel);

        create_part_ok.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_part_ok.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_part_ok.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                String name = create_part_nameInput.getText().toString().trim();
                String depart = (String)create_part_depart_combo.getSelectedItem();
                String hours = create_part_hoursInput.getText().toString().trim();
                if (set.RegisterPartTimeEmp(name, depart, hours)) {
                    JOptionPane.showMessageDialog(null, name+"님 등록 완료");
                    create_part_nameInput.setText(null);
                    create_part_hoursInput.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "등록 실패!\n입력을 확인하세요.");
                }
            }
        });

        create_part_cancel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { create_part_cancel.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { create_part_cancel.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( false );
                createPanel.setVisible(true);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8 - 직원등록");
            }
        });


        // readPanel//////////////////////////////////////////////////////////////////////////////////////////////////
        readPanel.setBackground(Color.decode("#F2F2F7"));
        readPanel.setBounds(0, 0, 736, 563);
        readPanel.setLayout(null);

        JPanel read_table_panel = new JPanel();
        read_table_panel.setLayout(new BorderLayout());
        read_table_panel.setBounds(12, 10, 712, 449);
        readPanel.add(read_table_panel);

        JTable read_table = new JTable();
        read_table.setModel(new DefaultTableModel(new String[0][0], new String[0]));
        JScrollPane read_sp = new JScrollPane(read_table);
        read_sp.setPreferredSize(new Dimension(423, 200));
        read_table_panel.add(read_table, BorderLayout.CENTER);

        JCheckBox fulltimeCheck = new JCheckBox("\uC815\uADDC\uC9C1");
        fulltimeCheck.setSelected(true);
        fulltimeCheck.setBounds(23, 481, 64, 23);
        fulltimeCheck.setBackground(null);
        fulltimeCheck.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        readPanel.add(fulltimeCheck);

        JCheckBox parttimeCheck = new JCheckBox("\uC784\uC2DC\uC9C1");
        parttimeCheck.setSelected(true);
        parttimeCheck.setBounds(85, 481, 64, 23);
        parttimeCheck.setBackground(null);
        parttimeCheck.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        readPanel.add(parttimeCheck);

        JButton allsearchBtn = new JButton("\uC77C\uAD04\uAC80\uC0C9");
        allsearchBtn.setBackground(new Color(255, 255, 255));
        allsearchBtn.setBounds(24, 510, 116, 30);
        allsearchBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        readPanel.add(allsearchBtn);

        HintTextField read_nameInput = new HintTextField("검색 할 이름 입력");
        read_nameInput.setBackground(new Color(255, 255, 255));
        read_nameInput.setBounds(246, 510, 206, 30);
        read_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        readPanel.add(read_nameInput);
        read_nameInput.setColumns(10);

        JButton read_searchnameBtn = new JButton("\uAC80\uC0C9");
        read_searchnameBtn.setBackground(new Color(255, 255, 255));
        read_searchnameBtn.setBounds(460, 510, 64, 30);
        read_searchnameBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        readPanel.add(read_searchnameBtn);

        JButton read_cancelBtn = new JButton("\uB3CC\uC544\uAC00\uAE30");
        read_cancelBtn.setBackground(new Color(255, 255, 255));
        read_cancelBtn.setBounds(619, 510, 91, 30);
        read_cancelBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        readPanel.add(read_cancelBtn);

        allsearchBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { allsearchBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { allsearchBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {

                String titleTemp[] = new String[7];
                titleTemp[0] = "구분";
                titleTemp[1] = "ID";
                titleTemp[2] = "이름";
                titleTemp[3] = "부서";
                titleTemp[4] = "직위";
                titleTemp[5] = "Grade";
                titleTemp[6] = "hours";
                read_table.setModel(new DefaultTableModel(set.searchAll(fulltimeCheck.isSelected(), parttimeCheck.isSelected()), titleTemp));

                read_table_panel.add(read_table.getTableHeader(), BorderLayout.NORTH);
                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setHorizontalAlignment(SwingConstants.CENTER);;
                TableColumnModel Tcm = read_table.getColumnModel();

                for(int i=0; i<7; i++)
                    Tcm.getColumn(i).setCellRenderer(dtcr);
            }
        });

        read_searchnameBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { read_searchnameBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { read_searchnameBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {

                String titleTemp[] = new String[7];
                titleTemp[0] = "구분";
                titleTemp[1] = "ID";
                titleTemp[2] = "이름";
                titleTemp[3] = "부서";
                titleTemp[4] = "직위";
                titleTemp[5] = "Grade";
                titleTemp[6] = "hours";
                read_table.setModel(new DefaultTableModel(set.searchName(read_nameInput.getText().toString().trim()), titleTemp));

                read_table_panel.add(read_table.getTableHeader(), BorderLayout.NORTH);
                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setHorizontalAlignment(SwingConstants.CENTER);;
                TableColumnModel Tcm = read_table.getColumnModel();

                for(int i=0; i<7; i++)
                    Tcm.getColumn(i).setCellRenderer(dtcr);
            }
        });

        read_cancelBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { read_cancelBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { read_cancelBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( true );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
            }
        });

        contentPane.add(readPanel);

        // updatePanel/////////////////////////////////////////////////////////////////////
        updatePanel.setBackground(Color.decode("#F2F2F7"));
        updatePanel.setBounds(0, 0, 736, 563);
        updatePanel.setLayout(null);
        contentPane.add(updatePanel);

        JPanel update_table_panel = new JPanel();
        update_table_panel.setLayout(new BorderLayout());
        update_table_panel.setBounds(12, 10, 712, 210);
        updatePanel.add(update_table_panel);

        JTable update_table = new JTable();
        update_table.setModel(new DefaultTableModel(new String[0][0], new String[0]));
        JScrollPane update_sp = new JScrollPane(update_table);
        update_sp.setPreferredSize(new Dimension(423, 200));
        update_table_panel.add(update_table, BorderLayout.CENTER);

        HintTextField update_nameInput = new HintTextField("검색 할 이름 입력");
        update_nameInput.setBackground(new Color(255, 255, 255));
        update_nameInput.setBounds(25, 240 , 169, 30);
        update_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        updatePanel.add(update_nameInput);
        update_nameInput.setColumns(10);

        JButton update_searchnameBtn = new JButton("\uAC80\uC0C9");
        update_searchnameBtn.setBackground(new Color(255, 255, 255));
        update_searchnameBtn.setBounds(202, 240, 64, 30);
        update_searchnameBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        updatePanel.add(update_searchnameBtn);

        HintTextField update_idInput = new HintTextField("갱신 할 ID 입력");
        update_idInput.setBackground(new Color(255, 255, 255));
        update_idInput.setBounds(300, 240 , 169, 30);
        update_idInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        updatePanel.add(update_idInput);
        update_idInput.setColumns(10);

        JButton update_updateBtn = new JButton("선택");
        update_updateBtn.setBackground(new Color(255, 255, 255));
        update_updateBtn.setBounds(477, 240, 64, 30);
        update_updateBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        updatePanel.add(update_updateBtn);

        JButton update_cancelBtn = new JButton("\uB3CC\uC544\uAC00\uAE30");
        update_cancelBtn.setBackground(new Color(255, 255, 255));
        update_cancelBtn.setBounds(619, 240, 91, 30);
        update_cancelBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        updatePanel.add(update_cancelBtn);
        contentPane.add(updatePanel);

////////////// update full panel
        JPanel update_full_panel = new JPanel();
        update_full_panel.setBounds(0, 275, 736, 288);
        update_full_panel.setLayout(null);
        update_full_panel.setBackground(Color.decode("#F2F2F7"));
        updatePanel.add(update_full_panel);

        JLabel update_full_nameLabel = new JLabel("\uC774\uB984");
        update_full_nameLabel.setBounds(220, 30, 100, 30);
        update_full_nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_full_panel.add(update_full_nameLabel);

        JTextField update_full_nameInput = new JTextField();
        update_full_nameInput.setBackground(new Color(255, 255, 255));
        update_full_nameInput.setBounds(265, 30, 206, 30);
        update_full_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_full_panel.add(update_full_nameInput);
        update_full_nameInput.setColumns(10);

        JLabel update_full_depart = new JLabel("\uBD80\uC11C");
        update_full_depart.setBounds(220, 75, 100, 30);
        update_full_depart.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_full_panel.add(update_full_depart);

        JComboBox update_full_depart_combo = new JComboBox<String>();
        update_full_depart_combo.addItem("총무");
        update_full_depart_combo.addItem("인사");
        update_full_depart_combo.addItem("기획");
        update_full_depart_combo.addItem("생산");
        update_full_depart_combo.addItem("영업");
        update_full_depart_combo.setBackground(new Color(255, 255, 255));
        update_full_depart_combo.setBounds(265, 75, 206, 30);
        update_full_depart_combo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_full_panel.add(update_full_depart_combo);

        JLabel update_full_pos = new JLabel("\uC9C1\uC704");
        update_full_pos.setBounds(220, 125, 100, 30);
        update_full_pos.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_full_panel.add(update_full_pos);
        JComboBox update_full_pos_combo = new JComboBox<String>();
        update_full_pos_combo.addItem("이사");
        update_full_pos_combo.addItem("부장");
        update_full_pos_combo.addItem("과장");
        update_full_pos_combo.addItem("대리");
        update_full_pos_combo.addItem("사원");
        update_full_pos_combo.setBackground(new Color(255, 255, 255));
        update_full_pos_combo.setBounds(265, 125, 206, 30);
        update_full_pos_combo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_full_panel.add(update_full_pos_combo);

        JLabel update_full_grade = new JLabel("Grade");
        update_full_grade.setBounds(206, 170, 100, 30);
        update_full_grade.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_full_panel.add(update_full_grade);


        JTextField update_full_gradeInput = new JTextField();
        update_full_gradeInput.setBackground(new Color(255, 255, 255));
        update_full_gradeInput.setBounds(265, 170, 206, 30);
        update_full_gradeInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_full_panel.add(update_full_gradeInput);
        update_full_gradeInput.setColumns(10);


        JButton update_full_ok = new JButton("갱신");
        update_full_ok.setBackground(new Color(255, 255, 255));
        update_full_ok.setBounds(328, 225, 80, 30);
        update_full_ok.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_full_panel.add(update_full_ok);


////////////// update part panel
        JPanel update_part_panel = new JPanel();
        update_part_panel.setBounds(0, 275, 736, 288);
        update_part_panel.setLayout(null);
        update_part_panel.setBackground(Color.decode("#F2F2F7"));
        updatePanel.add(update_part_panel);

        JLabel update_part_nameLabel = new JLabel("\uC774\uB984");
        update_part_nameLabel.setBounds(220, 45, 100, 30);
        update_part_nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_part_panel.add(update_part_nameLabel);

        JTextField update_part_nameInput = new JTextField();
        update_part_nameInput.setBackground(new Color(255, 255, 255));
        update_part_nameInput.setBounds(265, 45, 206, 30);
        update_part_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_part_panel.add(update_part_nameInput);
        update_part_nameInput.setColumns(10);

        JLabel update_part_depart = new JLabel("\uBD80\uC11C");
        update_part_depart.setBounds(220, 90, 100, 30);
        update_part_depart.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_part_panel.add(update_part_depart);

        JComboBox update_part_depart_combo = new JComboBox<String>();
        update_part_depart_combo.addItem("총무");
        update_part_depart_combo.addItem("인사");
        update_part_depart_combo.addItem("기획");
        update_part_depart_combo.addItem("생산");
        update_part_depart_combo.addItem("영업");
        update_part_depart_combo.setBackground(new Color(255, 255, 255));
        update_part_depart_combo.setBounds(265, 90, 206, 30);
        update_part_depart_combo.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_part_panel.add(update_part_depart_combo);

        JLabel update_part_hours = new JLabel("Hours");
        update_part_hours.setBounds(206, 135, 100, 30);
        update_part_hours.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        update_part_panel.add(update_part_hours);

        JTextField update_part_hoursInput = new JTextField();
        update_part_hoursInput.setBackground(new Color(255, 255, 255));
        update_part_hoursInput.setBounds(265, 135, 206, 30);
        update_part_hoursInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_part_panel.add(update_part_hoursInput);
        update_part_hoursInput.setColumns(10);


        JButton update_part_ok = new JButton("갱신");
        update_part_ok.setBackground(new Color(255, 255, 255));
        update_part_ok.setBounds(328, 190, 80, 30);
        update_part_ok.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        update_part_panel.add(update_part_ok);

        update_updateBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { update_updateBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { update_updateBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                String id = update_idInput.getText().toString().trim();
                updateIdx = set.UpdateSelector(id);
                if (updateIdx != -1) {
                    JOptionPane.showMessageDialog(null, "갱신 정보를 입력하세요.");
                    if(set.UpdateInstanceFull(updateIdx)) {
                        update_full_panel.setVisible(true);
                        update_part_panel.setVisible(false);
                    } else {
                        update_full_panel.setVisible(false);
                        update_part_panel.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "없는 사용자이거나 입력값이 잘못되었습니다.");
                    update_full_panel.setVisible(false);
                    update_part_panel.setVisible(false);
                }
            }
        });

        update_searchnameBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { update_searchnameBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { update_searchnameBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {

                String titleTemp[] = new String[7];
                titleTemp[0] = "구분";
                titleTemp[1] = "ID";
                titleTemp[2] = "이름";
                titleTemp[3] = "부서";
                titleTemp[4] = "직위";
                titleTemp[5] = "Grade";
                titleTemp[6] = "hours";
                update_table.setModel(new DefaultTableModel(set.searchName(update_nameInput.getText().toString().trim()), titleTemp));

                update_table_panel.add(update_table.getTableHeader(), BorderLayout.NORTH);
                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setHorizontalAlignment(SwingConstants.CENTER);;
                TableColumnModel Tcm = update_table.getColumnModel();

                for(int i=0; i<7; i++)
                    Tcm.getColumn(i).setCellRenderer(dtcr);
            }
        });

        update_full_ok.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { update_full_ok.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { update_full_ok.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                String name = update_full_nameInput.getText().toString().trim();
                String depart = (String)update_full_depart_combo.getSelectedItem();
                String pos = (String)update_full_pos_combo.getSelectedItem();
                String grade = update_full_gradeInput.getText().toString().trim();
                if (set.UpdateFullTimeEmp(updateIdx, name, depart, pos, grade)) {
                    JOptionPane.showMessageDialog(null, name+"님 갱신 완료");
                    update_full_nameInput.setText(null);
                    update_full_gradeInput.setText(null);
                    updateIdx=-1;
                    update_full_panel.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "갱신 실패!\n입력을 확인하세요.");
                }
            }
        });

        update_part_ok.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { update_part_ok.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { update_part_ok.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                String name = update_part_nameInput.getText().toString().trim();
                String depart = (String)update_part_depart_combo.getSelectedItem();
                String hours = update_part_hoursInput.getText().toString().trim();
                if (set.UpdatePartTimeEmp(updateIdx, name, depart, hours)) {
                    JOptionPane.showMessageDialog(null, name+"님 갱신 완료");
                    update_part_nameInput.setText(null);
                    update_part_hoursInput.setText(null);
                    updateIdx=-1;
                    update_part_panel.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "갱신 실패!\n입력을 확인하세요.");
                }
            }
        });

        update_full_panel.setVisible(false);
        update_part_panel.setVisible(false);

        update_cancelBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { update_cancelBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { update_cancelBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( true );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
            }
        });
        

        // deletePanel//////////////////////////////////////////////////////////////////////
        deletePanel.setBackground(Color.decode("#F2F2F7"));
        deletePanel.setBounds(0, 0, 736, 563);
        deletePanel.setLayout(null);

        JPanel delete_table_panel = new JPanel();
        delete_table_panel.setLayout(new BorderLayout());
        delete_table_panel.setBounds(12, 10, 712, 449);
        deletePanel.add(delete_table_panel);

        JTable delete_table = new JTable();
        delete_table.setModel(new DefaultTableModel(new String[0][0], new String[0]));
        JScrollPane delete_sp = new JScrollPane(delete_table);
        delete_sp.setPreferredSize(new Dimension(423, 200));
        delete_table_panel.add(delete_table, BorderLayout.CENTER);

        HintTextField delete_nameInput = new HintTextField("검색 할 이름 입력");
        delete_nameInput.setBackground(new Color(255, 255, 255));
        delete_nameInput.setBounds(25, 491 , 169, 30);
        delete_nameInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        deletePanel.add(delete_nameInput);
        delete_nameInput.setColumns(10);

        JButton delete_searchnameBtn = new JButton("\uAC80\uC0C9");
        delete_searchnameBtn.setBackground(new Color(255, 255, 255));
        delete_searchnameBtn.setBounds(202, 491, 64, 30);
        delete_searchnameBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        deletePanel.add(delete_searchnameBtn);

        HintTextField delete_idInput = new HintTextField("삭제 할 ID 입력");
        delete_idInput.setBackground(new Color(255, 255, 255));
        delete_idInput.setBounds(300, 491 , 169, 30);
        delete_idInput.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        deletePanel.add(delete_idInput);
        delete_idInput.setColumns(10);

        JButton delete_deleteBtn = new JButton("\uC0AD\uC81C");
        delete_deleteBtn.setBackground(new Color(255, 255, 255));
        delete_deleteBtn.setBounds(477, 491, 64, 30);
        delete_deleteBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        delete_deleteBtn.setForeground(new Color(255, 0, 0));
        deletePanel.add(delete_deleteBtn);

        JButton delete_cancelBtn = new JButton("\uB3CC\uC544\uAC00\uAE30");
        delete_cancelBtn.setBackground(new Color(255, 255, 255));
        delete_cancelBtn.setBounds(619, 491, 91, 30);
        delete_cancelBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        deletePanel.add(delete_cancelBtn);

        contentPane.add(deletePanel);

        delete_searchnameBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { delete_searchnameBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { delete_searchnameBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {

                String titleTemp[] = new String[7];
                titleTemp[0] = "구분";
                titleTemp[1] = "ID";
                titleTemp[2] = "이름";
                titleTemp[3] = "부서";
                titleTemp[4] = "직위";
                titleTemp[5] = "Grade";
                titleTemp[6] = "hours";
                delete_table.setModel(new DefaultTableModel(set.searchName(delete_nameInput.getText().toString().trim()), titleTemp));

                delete_table_panel.add(delete_table.getTableHeader(), BorderLayout.NORTH);
                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setHorizontalAlignment(SwingConstants.CENTER);;
                TableColumnModel Tcm = delete_table.getColumnModel();

                for(int i=0; i<7; i++)
                    Tcm.getColumn(i).setCellRenderer(dtcr);
            }
        });

        delete_deleteBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { delete_deleteBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { delete_deleteBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                String name = delete_idInput.getText().toString().trim();
                if (set.DeleteInformation(name)) {
                    JOptionPane.showMessageDialog(null, name+"님 삭제 완료");
                    delete_idInput.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "삭제 실패!\n없는 사용자이거나 입력값이 잘못되었습니다.");
                }
            }
        });

        delete_cancelBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { delete_cancelBtn.setBackground(Color.decode("#D9D9DE")); }
            public void mouseExited(MouseEvent evt) { delete_cancelBtn.setBackground(new Color(255, 255, 255)); }
            public void mouseClicked(MouseEvent e) {
                mainPanel.setVisible( true );
                createPanel.setVisible(false);
                readPanel.setVisible(false);
                updatePanel.setVisible(false);
                deletePanel.setVisible(false);
                partPanel.setVisible(false);
                fullPanel.setVisible(false);
                setTitle("\uAE08\uC624\uC5D4\uC9C0\uB2C8\uC5B4\uB9C1 \uC9C1\uC6D0 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
            }
        });
    }
}
