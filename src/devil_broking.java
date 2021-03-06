
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class stock {
    //global declaration for details
    JTextField t_fname, t_lname, t_acc_no, t_mob,t_password;
    JRadioButton rb1, rb2;
    String[] city = {"Select a city", "Rajkot", "Jamnagar", "Ahmedabad", "Surat","Mumbai","Pune"};
    JComboBox list_city = new JComboBox<>(city);
    String[] state = {"Select a state", "Gujarat", "Maharashtra", "Delhi", "Punjab"};
    JComboBox list_state = new JComboBox<>(state);

    Client TempClient;
    ArrayList<Client> dataList;

    stock(ArrayList<Client> dataList){
        this.dataList = dataList;
        TempClient = new Client();
        //TempClient = new Client("undefined","undefined");
    }

    public void frame1() {
        //elements declaration
        JFrame f1 = new JFrame("Devil Broking");
        JTextField tf_id;
        JPasswordField pf_pass;
        JLabel l_id, l_pass;
        JButton b_login = new JButton("Login");
        JButton b_signup = new JButton("SignUp");
        JLabel welcome = new JLabel("Welcome to Devil Broking");

        //background
        f1.setContentPane(new JLabel(new ImageIcon("bg2.jpg")));

        //labels
        l_id = new JLabel("User ID: ");
        l_pass = new JLabel("Password: ");
        l_id.setBounds(500, 300, 100, 50);
        l_pass.setBounds(500, 350, 100, 50);
        welcome.setBounds(525,100,250,100);

        welcome.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_id.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_pass.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));

        //text field
        tf_id = new JTextField("");
        pf_pass = new JPasswordField();
        tf_id.setBounds(610, 315, 100, 25);
        pf_pass.setBounds(610, 365, 100, 25);

        //button
        b_login.setBounds(515, 410, 100, 50);
        b_login.setVisible(true);

        b_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf_id.getText().hashCode() == 0 || pf_pass.getText().hashCode() == 0) {
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                } else if (Objects.equals(tf_id.getText(), TempClient.last_name) && Objects.equals(pf_pass.getText(), TempClient.password)) {
                    f1.setVisible(false);
                    frame3();
                }

                /*else if (tf_id.getText().equals("raj") && pf_pass.getText().equals("123")) {
                    f1.setVisible(false);
                    frame3();*/
                //}
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                }
            }
        });

        b_signup.setBounds(665, 410, 100, 50);
        b_signup.setVisible(true);

        b_signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                frame2();
            }
        });

        //adding elements
        f1.add(welcome);
        f1.add(l_id);
        f1.add(l_pass);
        f1.add(tf_id);
        f1.add(pf_pass);
        f1.add(b_login);
        f1.add(b_signup);
        f1.setVisible(true);
        f1.setBounds(180, 25, 1200, 800);
    }

    public void frame2() {
        JFrame f2 = new JFrame("Devil Broking");
        JLabel l_fname, l_lname, l_acc_no, l_mob, l_city, l_state, l_acc_type,l_password;
        JButton b_next;

        int acc = (int) (Math.random()*5000);

        //background
        f2.setContentPane(new JLabel(new ImageIcon("bg2.jpg")));

        //labels
        l_fname = new JLabel("Name : ");
        l_fname.setBounds(450, 50, 125, 50);
        l_lname = new JLabel("Username : ");
        l_lname.setBounds(450, 100, 125, 50);
        l_password = new JLabel("Password : ");
        l_password.setBounds(450,150,125,50);
        l_acc_no = new JLabel("Account number : ");
        l_acc_no.setBounds(450, 200, 160, 50);
        l_acc_type = new JLabel("Account Type : ");
        l_acc_type.setBounds(450, 250, 150, 50);
        l_mob = new JLabel("Mobile Number : ");
        l_mob.setBounds(450, 300, 160, 50);
        l_city = new JLabel("City : ");
        l_city.setBounds(450, 350, 125, 50);
        l_state = new JLabel("State : ");
        l_state.setBounds(450, 450, 125, 50);

        l_fname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_lname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_password.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_acc_no.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_acc_type.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_mob.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_city.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_state.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));


        //text-field
        t_fname = new JTextField("");
        t_fname.setBounds(625, 65, 100, 25);
        t_lname = new JTextField("");
        t_lname.setBounds(625, 115, 100, 25);
        t_password = new JTextField("");
        t_password.setBounds(625, 165, 100, 25);
        t_acc_no = new JTextField();
        t_acc_no.setText(String.valueOf(acc));
        t_acc_no.setBounds(625, 215, 100, 25);
        t_acc_no.setEditable(false);
        t_mob = new JTextField("");
        t_mob.setBounds(625, 315, 100, 25);

        //radio-button
        rb1 = new JRadioButton("Savings");
        rb2 = new JRadioButton("Current");
        rb1.setBounds(600, 265, 100, 30);
        rb2.setBounds(725, 265, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        //button
        b_next = new JButton("NEXT");
        b_next.setBounds(725, 565, 80, 30);
        b_next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t_fname.getText().hashCode() == 0 || t_lname.getText().hashCode() == 0 || t_acc_no.getText().hashCode() == 0 || t_mob.getText().hashCode() == 0) {
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                } else {
                    TempClient.first_name = t_fname.getText();
                    TempClient.last_name = t_lname.getText();
                    TempClient.password = t_password.getText();
                    TempClient.phone_no = t_mob.getText();
                    TempClient.city = (String) list_city.getSelectedItem();
                    TempClient.state = (String) list_state.getSelectedItem();
                    TempClient.account_no = t_acc_no.getText();
                    if(rb1.isSelected()){
                    TempClient.account_type = "Savings";
                    }
                    else {
                        TempClient.account_type = "Current";
                    }

                    dataList.add(TempClient);

                    try{
                        FileManager.saveList(dataList);
                    }
                    catch(Exception a){
                        System.out.println("Error occurred : " + e);
                    }

                    f2.setVisible(false);
                    frame1();
                }
            }
        });

        //list
        list_city.setBounds(625, 365, 125, 50);
        list_city.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (city[0] == (String) list_city.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Select a city!");
                }
            }
        });

        list_state.setBounds(625, 465, 125, 50);
        list_state.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (state[0] == (String) list_state.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Select a state!");
                }
            }
        });

        //adding
        f2.setBounds(180, 25, 1200, 800);
        f2.add(l_fname);
        f2.add(l_lname);
        f2.add(l_password);
        f2.add(l_acc_no);
        f2.add(l_acc_type);
        f2.add(l_city);
        f2.add(l_state);
        f2.add(l_mob);
        f2.add(t_fname);
        f2.add(t_lname);
        f2.add(t_password);
        f2.add(t_acc_no);
        f2.add(t_mob);
        f2.add(rb1);
        f2.add(rb2);
        f2.add(list_city);
        f2.add(list_state);
        f2.add(rb1);
        f2.add(rb2);
        f2.add(b_next);
        f2.setVisible(true);
    }

    public void frame3() {

        //ELEMENTS DECLARATION
        JFrame f3 = new JFrame("Devil Broking");
        JLabel l_sensex, l_nifty, l_watchlist;
        JButton b_next = new JButton("NEXT");

        //background
        f3.setContentPane(new JLabel(new ImageIcon("bg2.jpg")));

        //labels
        l_sensex = new JLabel("SENSEX");
        l_sensex.setBounds(100, 25, 125, 50);
        l_nifty = new JLabel("NIFTY 50");
        l_nifty.setBounds(600, 25, 125, 50);
        l_watchlist = new JLabel("Dow Jones:");
        l_watchlist.setBounds(600, 325, 120, 50);

        l_nifty.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_sensex.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_watchlist.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));


        //image
        JLabel i1 = new JLabel(new ImageIcon("graph1.png"));
        JLabel i2 = new JLabel(new ImageIcon("graph2.png"));
        JLabel i3 = new JLabel(new ImageIcon("graph3.png"));
        JLabel i4 = new JLabel(new ImageIcon("graph4.png"));
        i1.setBounds(100, 75, 400, 161);
        i2.setBounds(600, 75, 400, 162);
        i3.setBounds(100, 325, 400, 240);
        i4.setBounds(600, 325, 400, 240);

        //buttons
        //next
        b_next.setBounds(1050, 600, 100, 50);
        b_next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(false);
                frame4();
            }
        });

        f3.add(i1);
        f3.add(i2);
        f3.add(i3);
        f3.add(i4);

        //ADDING ELEMENTS
        f3.add(l_sensex);
        f3.add(l_nifty);
        f3.add(l_watchlist);
        f3.add(b_next);
        f3.setBounds(180, 25, 1200, 800);
        f3.setVisible(true);
    }

    public void frame4() {
        //ELEMENTS DECLARATION
        JFrame f4 = new JFrame("Devil Broking");
        JLabel l_name, l_price, l_qty, l_currentbal;
        JButton b_buy = new JButton("BUY");
        JButton b_sell = new JButton("SELL");
        JButton b_details = new JButton("Details");
        JTextField tf_price, tf_qty, tf_balance;

        //background
        f4.setContentPane(new JLabel(new ImageIcon("bg2.jpg")));

        String[] company_name = {"Select a company", "TCS", "Reliance", "NMDC", "Eicher Motors", "Nifty 50", "Sensex"};
        JComboBox cb = new JComboBox<>(company_name);

        //combobox
        cb.setBounds(530, 100, 150, 40);
        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (company_name[1] == (String) cb.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Current Market Price is 3500 Rs");
                }
                if (company_name[2] == (String) cb.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Current market Price is 1500 Rs");
                }
            }
        });

        //textfield
        tf_price = new JTextField("");
        tf_price.setBounds(530, 150, 150, 40);
        tf_qty = new JTextField("");
        tf_qty.setBounds(530, 200, 150, 40);
        tf_balance = new JTextField("");
        tf_balance.setBounds(530, 250, 150, 40);
        //t_price.setVisible(true);

        //LABELS
        l_name = new JLabel("Name of stock: ");
        l_name.setBounds(350, 100, 150, 40);
        l_currentbal = new JLabel("Current Balance: ");
        l_currentbal.setBounds(350, 250, 150, 40);
        l_price = new JLabel("Price : ");
        l_price.setBounds(350, 150, 150, 40);
        l_qty = new JLabel("Quantity : ");
        l_qty.setBounds(350, 200, 150, 40);

        l_name.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_currentbal.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_price.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l_qty.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));

        //Buttons
        //buy
        b_buy.setBounds(485, 410, 100, 50);
        b_buy.setVisible(true);
        b_buy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf_price.getText().hashCode() == 0 || tf_qty.getText().hashCode() == 0) {
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                }
                if (Integer.parseInt(tf_price.getText()) <= 0 || Integer.parseInt(tf_qty.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid price/quantity");
                }

                int temp_a = Integer.parseInt(tf_price.getText());
                int temp_b = Integer.parseInt(tf_qty.getText());
                int temp_mul = temp_a * temp_b;

                if (temp_mul > Integer.parseInt(tf_balance.getText())) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                } else {
                    JOptionPane.showMessageDialog(null, "Stocks are bought!");
                }
                tf_price.setText("");
                tf_qty.setText("");
                tf_balance.setText("");
            }
        });
        //sell
        b_sell.setBounds(595, 410, 100, 50);
        b_sell.setVisible(true);
        b_sell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf_price.getText().hashCode() == 0 || tf_qty.getText().hashCode() == 0) {
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                }
                if (Integer.parseInt(tf_price.getText()) <= 0 || Integer.parseInt(tf_qty.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid price/quantity");
                } else {
                    JOptionPane.showMessageDialog(null, "Stocks are sold!");
                    tf_price.setText("");
                    tf_qty.setText("");
                    tf_balance.setText("");
                }
            }
        });
        //balance
        b_details.setBounds(1000, 50, 100, 50);
        b_details.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f4.setVisible(false);
                frame5();
            }
        });

        //ADDING ELEMENTS
        f4.add(l_name);
        f4.add(cb);
        f4.add(l_price);
        f4.add(tf_price);
        f4.add(l_qty);
        f4.add(tf_qty);
        f4.add(b_buy);
        f4.add(b_sell);
        f4.add(l_currentbal);
        f4.add(tf_balance);
        f4.add(b_details);
        f4.setBounds(180, 25, 1200, 800);
        f4.setVisible(true);
    }

    public void frame5(){
        JFrame f5 = new JFrame("Devil Broking");

        //background image
        f5.setContentPane(new JLabel(new ImageIcon("bg2.jpg")));

        JLabel l1 = new JLabel("Name : ");
        JLabel l2 = new JLabel("Username : ");
        JLabel l8 = new JLabel("Password : ");
        JLabel l3 = new JLabel("Account Number: ");
        JLabel l4 = new JLabel("Account Type: ");
        JLabel l5 = new JLabel("Mobile Number: ");
        JLabel l6 = new JLabel("City : ");
        JLabel l7 = new JLabel("State: ");

        l1.setBounds(450,50,125,50);
        l2.setBounds(450,100,125,50);
        l8.setBounds(450,150,125,50);
        l3.setBounds(450,200,160,50);
        l4.setBounds(450,250,150,50);
        l5.setBounds(450,300,150,50);
        l6.setBounds(450,350,125,50);
        l7.setBounds(450,400,125,50);

        l1.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l2.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l3.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l4.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l5.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l6.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        l7.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));

        f5.add(l1);
        f5.add(l2);
        f5.add(l8);
        f5.add(l3);
        f5.add(l4);
        f5.add(l5);
        f5.add(l6);
        f5.add(l7);

        // Text Field
        JTextField tf1 = new JTextField(TempClient.first_name);
        JTextField tf2 = new JTextField(TempClient.last_name);
        JTextField tf8 = new JTextField(TempClient.password);
        JTextField tf3 = new JTextField(TempClient.account_no);
        JTextField tf4 = new JTextField(TempClient.phone_no);
        JTextField tf5 = new JTextField(TempClient.city);
        JTextField tf6 = new JTextField(TempClient.state);
        JTextField tf7 = new JTextField(TempClient.account_type);

        JButton close = new JButton("close");
        close.setBounds(600,500,100,25);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f5.setVisible(false);
            }
        });

        tf1.setBounds(625,65,100,25);
        tf2.setBounds(625,115,100,25);
        tf8.setBounds(625,165,100,25);
        tf3.setBounds(625,215,100,25);
        tf4.setBounds(625,315,100,25);
        tf5.setBounds(625,365,100,25);
        tf6.setBounds(625,415,100,25);
        tf7.setBounds(625,265,100,25);

        tf1.setVisible(true);
        tf2.setVisible(true);
        tf8.setVisible(true);
        tf3.setVisible(true);
        tf4.setVisible(true);
        tf5.setVisible(true);
        tf6.setVisible(true);
        tf7.setVisible(true);

        tf1.setEditable(false);
        tf2.setEditable(false);
        tf8.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);
        tf6.setEditable(false);
        tf7.setEditable(false);

        f5.add(tf1);
        f5.add(tf2);
        f5.add(tf8);
        f5.add(tf3);
        f5.add(tf4);
        f5.add(tf5);
        f5.add(tf6);
        f5.add(tf7);
        f5.add(close);

        // frame setting
        // f5.setSize(1200, 600);
        f5.setBounds(180, 100, 1200, 600);
        f5.setLayout(null);
        f5.setVisible(true);
    }
}

public class devil_broking {

    public static void main(String args[]) throws Exception {

        ArrayList<Client> list = FileManager.getList();
        stock s1 = new stock(list);
        s1.frame1();
    }
}

class Client implements Serializable {


    String first_name;
    String last_name;
    String password;
    String phone_no;
    String city;
    String state;
    String account_no;
    String account_type;

}

class FileManager {

    static ArrayList<Client> getList() throws Exception {

        File file_checker = new File("DATA.txt");

        if (file_checker.exists()) {
            System.out.println("File already exists");
        } else {
            file_checker.createNewFile();

            ArrayList<Client> DATA = new ArrayList<>();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file_checker));
            oos.writeObject(DATA);
            oos.close();

            System.out.println("File created");

        }

        ArrayList<Client> DATA;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Data.txt"));
        DATA = (ArrayList<Client>) ois.readObject();
        ois.close();
        return DATA;
    }

    static void saveList(ArrayList<Client> DATA) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.txt"));
        oos.writeObject(DATA);
        oos.close();
    }
}