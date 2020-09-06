package com.emont.security;

import com.emont.security.Database;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

public class Emont extends JFrame {

    private Database db;
    private String[] cols_names;
    private JLabel[] menus;
    private JLabel activeMenuIcon;
    private final Color menu_selected = new Color(52, 163, 227);
    private final Color menu_unselected = new Color(84,84,95);

    public Emont(Database db) {
        initComponents();
        this.db = db;
        menus = new JLabel[] {button1, button2, button3};
        this.activeMenuIcon = this.button1;
        this.button1.setForeground(menu_selected);
        selectedField.addItem("First Name");
        selectedField.addItem("Last Name");
        selectedField.addItem("ID");

        cols_names = new String[] {"f_name", "l_name", "id"};
    }

    public void start(){
        this.setVisible(true);
        results_panel.getViewport().setBackground(new Color(35,36,68));
        table_pane.getViewport().setBackground(new Color(35,36,68));
        table_pane.setBorder(BorderFactory.createEmptyBorder());
        results_panel.setBorder(BorderFactory.createEmptyBorder());
    }

    private void changeSelectedMenu(int index){
        this.activeMenuIcon.setForeground(menu_unselected);
        this.activeMenuIcon = menus[index];
        this.activeMenuIcon.setForeground(menu_selected);
    }

    private void successLogin(){

        CardLayout cardLayout = (CardLayout) App.getLayout();
        cardLayout.next(App);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ignacio
        App = new JPanel();
        login = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        label7 = new JLabel();
        separator3 = new JLabel();
        ac_point_field = new JTextField();
        label8 = new JLabel();
        separator4 = new JLabel();
        label9 = new JLabel();
        separator5 = new JLabel();
        password_field = new JPasswordField();
        log_in_button = new JButton();
        home = new JPanel();
        actions = new JPanel();
        addRegister = new JPanel();
        label1 = new JLabel();
        label5 = new JLabel();
        label2 = new JLabel();
        label10 = new JLabel();
        firstName = new JTextField();
        LastName = new JTextField();
        label6 = new JLabel();
        log_in_button2 = new JButton();
        searchRegister = new JPanel();
        label11 = new JLabel();
        input_search = new JTextField();
        submit_search = new JButton();
        label12 = new JLabel();
        results_panel = new JScrollPane();
        table_results = new JTable();
        selectedField = new JComboBox();
        showRegisters = new JPanel();
        ShowTitle = new JLabel();
        table_pane = new JScrollPane();
        whole_table = new JTable();
        button1 = new JLabel();
        button2 = new JLabel();
        button3 = new JLabel();

        //======== this ========
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setVisible(true);
        var contentPane = getContentPane();

        //======== App ========
        {
            App.setLayout(new CardLayout());

            //======== login ========
            {
                login.setBackground(Color.white);
                login.setVisible(false);

                //---- label3 ----
                label3.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\login-screen.png"));

                //---- label4 ----
                label4.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\watermark.png"));

                //---- label7 ----
                label7.setText("Username");
                label7.setFont(new Font("Ebrima", Font.BOLD, 10));
                label7.setForeground(new Color(112, 112, 112));

                //---- separator3 ----
                separator3.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\line.png"));

                //---- ac_point_field ----
                ac_point_field.setBorder(null);
                ac_point_field.setFont(new Font("Ebrima", Font.PLAIN, 10));
                ac_point_field.setMargin(new Insets(1, 6, 3, 6));
                ac_point_field.setForeground(new Color(51, 51, 51));

                //---- label9 ----
                label9.setText("Password");
                label9.setFont(new Font("Ebrima", Font.BOLD, 10));
                label9.setForeground(new Color(112, 112, 112));

                //---- separator5 ----
                separator5.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\line.png"));

                //---- password_field ----
                password_field.setBorder(null);
                password_field.setFont(new Font("Ebrima", Font.PLAIN, 10));
                password_field.setMargin(new Insets(1, 6, 3, 6));
                password_field.setForeground(new Color(51, 51, 51));

                //---- log_in_button ----
                log_in_button.setText("LOG IN");
                log_in_button.setBorderPainted(false);
                log_in_button.setBorder(null);
                log_in_button.setBackground(new Color(36, 36, 67));
                log_in_button.setForeground(Color.white);
                log_in_button.setFont(new Font("Lato Black", Font.PLAIN, 11));


                GroupLayout loginLayout = new GroupLayout(login);
                loginLayout.setHonorsVisibility(false);
                login.setLayout(loginLayout);
                loginLayout.setHorizontalGroup(
                    loginLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                            .addGroup(loginLayout.createParallelGroup()
                                .addComponent(label4)
                                .addGroup(loginLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(loginLayout.createParallelGroup()
                                        .addGroup(loginLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(loginLayout.createSequentialGroup()
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105))
                                            .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ac_point_field, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, loginLayout.createParallelGroup()
                                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(user_id_field, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(separator4, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, loginLayout.createParallelGroup()
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(password_field, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(loginLayout.createParallelGroup()
                                                    .addComponent(log_in_button, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(separator5, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(label3))
                );
                loginLayout.setVerticalGroup(
                    loginLayout.createParallelGroup()
                        .addGroup(loginLayout.createSequentialGroup()
                            .addComponent(label4)
                            .addGap(70, 70, 70)
                            .addComponent(label7)
                            .addGap(1, 1, 1)
                            .addComponent(ac_point_field, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(label8)
                            .addGap(1, 1, 1)
                            .addComponent(user_id_field, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(separator4)
                            .addGap(28, 28, 28)
                            .addComponent(label9)
                            .addGap(1, 1, 1)
                            .addComponent(password_field, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(separator5)
                            .addGap(31, 31, 31)
                            .addComponent(log_in_button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(100, Short.MAX_VALUE))
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                );
            }
            App.add(login, "card1");

            //======== home ========
            {
                home.setBackground(new Color(13, 13, 43));

                //======== actions ========
                {
                    actions.setLayout(new CardLayout());

                    //======== addRegister ========
                    {
                        addRegister.setBackground(new Color(35, 35, 68));

                        //---- label1 ----
                        label1.setText("Add a new register to the table");
                        label1.setFont(new Font("Lato Heavy", Font.PLAIN, 22));
                        label1.setForeground(Color.white);

                        //---- label5 ----
                        label5.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\line.png"));

                        //---- label2 ----
                        label2.setText("First Name");
                        label2.setFont(new Font("Ebrima", Font.PLAIN, 12));
                        label2.setForeground(Color.white);

                        //---- label10 ----
                        label10.setText("Last Name");
                        label10.setFont(new Font("Ebrima", Font.PLAIN, 12));
                        label10.setForeground(Color.white);

                        //---- firstName ----
                        firstName.setBorder(null);
                        firstName.setOpaque(false);
                        firstName.setForeground(new Color(204, 204, 204));
                        firstName.setFont(firstName.getFont().deriveFont(firstName.getFont().getStyle() | Font.ITALIC));

                        //---- LastName ----
                        LastName.setOpaque(false);
                        LastName.setBorder(null);
                        LastName.setForeground(new Color(204, 204, 204));
                        LastName.setFont(new Font("Segoe UI", Font.ITALIC, 12));

                        //---- label6 ----
                        label6.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\line.png"));

                        //---- log_in_button2 ----
                        log_in_button2.setText("ADD");
                        log_in_button2.setBorderPainted(false);
                        log_in_button2.setBorder(null);
                        log_in_button2.setBackground(new Color(102, 102, 255));
                        log_in_button2.setForeground(Color.white);
                        log_in_button2.setFont(new Font("Lato Black", Font.PLAIN, 11));


                        GroupLayout addRegisterLayout = new GroupLayout(addRegister);
                        addRegister.setLayout(addRegisterLayout);
                        addRegisterLayout.setHorizontalGroup(
                            addRegisterLayout.createParallelGroup()
                                .addGroup(addRegisterLayout.createSequentialGroup()
                                    .addGroup(addRegisterLayout.createParallelGroup()
                                        .addGroup(addRegisterLayout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addRegisterLayout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addRegisterLayout.createSequentialGroup()
                                            .addGap(103, 103, 103)
                                            .addGroup(addRegisterLayout.createParallelGroup()
                                                .addComponent(firstName, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(log_in_button2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(addRegisterLayout.createParallelGroup()
                                                .addComponent(LastName, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(109, Short.MAX_VALUE))
                        );
                        addRegisterLayout.setVerticalGroup(
                            addRegisterLayout.createParallelGroup()
                                .addGroup(addRegisterLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(addRegisterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label2)
                                        .addComponent(label10))
                                    .addGap(5, 5, 5)
                                    .addGroup(addRegisterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LastName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstName, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(addRegisterLayout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addComponent(log_in_button2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(192, Short.MAX_VALUE))
                        );
                    }
                    actions.add(addRegister, "card1");

                    //======== searchRegister ========
                    {
                        searchRegister.setBackground(new Color(35, 36, 68));

                        //---- label11 ----
                        label11.setText("Search for user");
                        label11.setFont(new Font("Lato Heavy", Font.PLAIN, 22));
                        label11.setForeground(Color.white);

                        //---- input_search ----
                        input_search.setForeground(Color.white);
                        input_search.setBorder(null);
                        input_search.setFont(new Font("Ebrima", Font.ITALIC, 16));
                        input_search.setBackground(new Color(13, 13, 43));

                        //---- submit_search ----
                        submit_search.setText("GO");
                        submit_search.setBorderPainted(false);
                        submit_search.setBorder(null);
                        submit_search.setBackground(new Color(102, 102, 255));
                        submit_search.setForeground(Color.white);
                        submit_search.setFont(new Font("Lato Black", Font.PLAIN, 11));


                        //---- label12 ----
                        label12.setIcon(new ImageIcon("C:\\Users\\ptcna\\Documents\\GitHub\\database-emont\\img\\line.png"));

                        //======== results_panel ========
                        {
                            results_panel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                            results_panel.setBorder(null);
                            results_panel.setBackground(new Color(36, 36, 68));
                            results_panel.setOpaque(false);

                            //---- table_results ----
                            table_results.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                            table_results.setVisible(false);
                            table_results.setBackground(new Color(13, 13, 43));
                            table_results.setForeground(Color.white);
                            table_results.setFont(new Font("Lato", Font.PLAIN, 12));
                            table_results.setGridColor(Color.black);
                            table_results.setIntercellSpacing(new Dimension(5, 2));
                            table_results.setRowSelectionAllowed(false);
                            table_results.setRowHeight(25);
                            table_results.setAutoCreateRowSorter(true);
                            table_results.setEnabled(false);
                            results_panel.setViewportView(table_results);
                        }

                        GroupLayout searchRegisterLayout = new GroupLayout(searchRegister);
                        searchRegister.setLayout(searchRegisterLayout);
                        searchRegisterLayout.setHorizontalGroup(
                            searchRegisterLayout.createParallelGroup()
                                .addGroup(searchRegisterLayout.createSequentialGroup()
                                    .addGroup(searchRegisterLayout.createParallelGroup()
                                        .addGroup(searchRegisterLayout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(searchRegisterLayout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addGroup(searchRegisterLayout.createParallelGroup()
                                                .addComponent(results_panel, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(searchRegisterLayout.createSequentialGroup()
                                                    .addGap(26, 26, 26)
                                                    .addComponent(selectedField, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(45, 45, 45)
                                                    .addGroup(searchRegisterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(label12, 0, 0, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(input_search, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(49, 49, 49)
                                                    .addComponent(submit_search, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))))
                                    .addContainerGap(44, Short.MAX_VALUE))
                        );
                        searchRegisterLayout.setVerticalGroup(
                            searchRegisterLayout.createParallelGroup()
                                .addGroup(searchRegisterLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                    .addGroup(searchRegisterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectedField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(input_search, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(submit_search, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label12)
                                    .addGap(63, 63, 63)
                                    .addComponent(results_panel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(70, Short.MAX_VALUE))
                        );
                    }
                    actions.add(searchRegister, "card2");

                    //======== showRegisters ========
                    {
                        showRegisters.setBackground(new Color(35, 36, 68));

                        //---- ShowTitle ----
                        ShowTitle.setText("Students Table");
                        ShowTitle.setFont(new Font("Lato Heavy", Font.PLAIN, 22));
                        ShowTitle.setForeground(Color.white);

                        //======== table_pane ========
                        {
                            table_pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                            table_pane.setBorder(null);
                            table_pane.setBackground(new Color(36, 36, 68));
                            table_pane.setOpaque(false);

                            //---- whole_table ----
                            whole_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                            whole_table.setBackground(new Color(13, 13, 43));
                            whole_table.setForeground(Color.white);
                            whole_table.setFont(new Font("Lato", Font.PLAIN, 12));
                            whole_table.setGridColor(Color.black);
                            whole_table.setIntercellSpacing(new Dimension(5, 2));
                            whole_table.setRowSelectionAllowed(false);
                            whole_table.setRowHeight(25);
                            whole_table.setAutoCreateRowSorter(true);
                            whole_table.setEnabled(false);
                            table_pane.setViewportView(whole_table);
                        }

                        GroupLayout showRegistersLayout = new GroupLayout(showRegisters);
                        showRegisters.setLayout(showRegistersLayout);
                        showRegistersLayout.setHorizontalGroup(
                            showRegistersLayout.createParallelGroup()
                                .addGroup(showRegistersLayout.createSequentialGroup()
                                    .addGroup(showRegistersLayout.createParallelGroup()
                                        .addGroup(showRegistersLayout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(ShowTitle, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(showRegistersLayout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(table_pane, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(48, Short.MAX_VALUE))
                        );
                        showRegistersLayout.setVerticalGroup(
                            showRegistersLayout.createParallelGroup()
                                .addGroup(showRegistersLayout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(ShowTitle, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(table_pane, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(92, Short.MAX_VALUE))
                        );
                    }
                    actions.add(showRegisters, "card3");
                }

                //---- button1 ----
                button1.setText("Add register");
                button1.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
                button1.setForeground(new Color(84, 84, 95));
                button1.setBackground(new Color(81, 81, 87, 222));


                //---- button2 ----
                button2.setText("Search for user");
                button2.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
                button2.setForeground(new Color(84, 84, 95));
                button2.setBackground(new Color(81, 81, 87, 222));


                //---- button3 ----
                button3.setText("Show table");
                button3.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
                button3.setForeground(new Color(84, 84, 95));
                button3.setBackground(new Color(81, 81, 87, 222));


                GroupLayout homeLayout = new GroupLayout(home);
                home.setLayout(homeLayout);
                homeLayout.setHorizontalGroup(
                    homeLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(homeLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                            .addComponent(actions, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE))
                );
                homeLayout.setVerticalGroup(
                    homeLayout.createParallelGroup()
                        .addComponent(actions, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(homeLayout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            App.add(home, "card2");
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(App, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(App, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ignacio
    private JPanel App;
    private JPanel login;
    private JLabel label3;
    private JLabel label4;
    private JLabel label7;
    private JLabel separator3;
    private JTextField ac_point_field;
    private JLabel label8;
    private JLabel separator4;
    private JTextField user_id_field;
    private JLabel label9;
    private JLabel separator5;
    private JPasswordField password_field;
    private JButton log_in_button;
    private JPanel home;
    private JPanel actions;
    private JPanel addRegister;
    private JLabel label1;
    private JLabel label5;
    private JLabel label2;
    private JLabel label10;
    private JTextField firstName;
    private JTextField LastName;
    private JLabel label6;
    private JButton log_in_button2;
    private JPanel searchRegister;
    private JLabel label11;
    private JTextField input_search;
    private JButton submit_search;
    private JLabel label12;
    private JScrollPane results_panel;
    private JTable table_results;
    private JComboBox selectedField;
    private JPanel showRegisters;
    private JLabel ShowTitle;
    private JScrollPane table_pane;
    private JTable whole_table;
    private JLabel button1;
    private JLabel button2;
    private JLabel button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
