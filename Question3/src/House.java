
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class House extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldTotalGrossIncome;
    private JTextField textFieldTotalMonthlyDebt;
    private JTextField textFieldMortgageInterestRate;
    private JTextField textFieldPayment;
    private JTextField txtHousingpayment;
    private JTextField textFieldOther;
    private JTextField textFieldMax;
    private JTextField textFieldAmountofMortgage;
    private JTextField textFieldTerm;
    private JButton btnGo;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    House frame = new House();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public House() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);
       
        JLabel lblTotalGrossIncome = new JLabel("Total Gross Income");
        GridBagConstraints gbc_lblTotalGrossIncome = new GridBagConstraints();
        gbc_lblTotalGrossIncome.anchor = GridBagConstraints.EAST;
        gbc_lblTotalGrossIncome.insets = new Insets(0, 0, 5, 5);
        gbc_lblTotalGrossIncome.gridx = 2;
        gbc_lblTotalGrossIncome.gridy = 1;
        contentPane.add(lblTotalGrossIncome, gbc_lblTotalGrossIncome);
       
        textFieldTotalGrossIncome = new JTextField();
        GridBagConstraints gbc_textFieldTotalGrossIncome = new GridBagConstraints();
        gbc_textFieldTotalGrossIncome.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldTotalGrossIncome.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldTotalGrossIncome.gridx = 3;
        gbc_textFieldTotalGrossIncome.gridy = 1;
        contentPane.add(textFieldTotalGrossIncome, gbc_textFieldTotalGrossIncome);
        textFieldTotalGrossIncome.setColumns(10);
       
        JLabel lblTotalMonthlyDebt = new JLabel("Total Monthly Debt");
        GridBagConstraints gbc_lblTotalMonthlyDebt = new GridBagConstraints();
        gbc_lblTotalMonthlyDebt.anchor = GridBagConstraints.EAST;
        gbc_lblTotalMonthlyDebt.insets = new Insets(0, 0, 5, 5);
        gbc_lblTotalMonthlyDebt.gridx = 2;
        gbc_lblTotalMonthlyDebt.gridy = 2;
        contentPane.add(lblTotalMonthlyDebt, gbc_lblTotalMonthlyDebt);
       
        textFieldTotalMonthlyDebt = new JTextField();
        GridBagConstraints gbc_textFieldTotalMonthlyDebt = new GridBagConstraints();
        gbc_textFieldTotalMonthlyDebt.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldTotalMonthlyDebt.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldTotalMonthlyDebt.gridx = 3;
        gbc_textFieldTotalMonthlyDebt.gridy = 2;
        contentPane.add(textFieldTotalMonthlyDebt, gbc_textFieldTotalMonthlyDebt);
        textFieldTotalMonthlyDebt.setColumns(10);
       
        JLabel lblMortgageInterestRate = new JLabel("Mortgage Interest Rate");
        GridBagConstraints gbc_lblMortgageInterestRate = new GridBagConstraints();
        gbc_lblMortgageInterestRate.anchor = GridBagConstraints.EAST;
        gbc_lblMortgageInterestRate.insets = new Insets(0, 0, 5, 5);
        gbc_lblMortgageInterestRate.gridx = 2;
        gbc_lblMortgageInterestRate.gridy = 3;
        contentPane.add(lblMortgageInterestRate, gbc_lblMortgageInterestRate);
       
        textFieldMortgageInterestRate = new JTextField();
        textFieldMortgageInterestRate.setText("");
        GridBagConstraints gbc_textFieldMortgageInterestRate = new GridBagConstraints();
        gbc_textFieldMortgageInterestRate.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldMortgageInterestRate.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldMortgageInterestRate.gridx = 3;
        gbc_textFieldMortgageInterestRate.gridy = 3;
        contentPane.add(textFieldMortgageInterestRate, gbc_textFieldMortgageInterestRate);
        textFieldMortgageInterestRate.setColumns(10);
       
        JLabel lblTerm = new JLabel("Term");
        GridBagConstraints gbc_lblTerm = new GridBagConstraints();
        gbc_lblTerm.anchor = GridBagConstraints.EAST;
        gbc_lblTerm.insets = new Insets(0, 0, 5, 5);
        gbc_lblTerm.gridx = 2;
        gbc_lblTerm.gridy = 4;
        contentPane.add(lblTerm, gbc_lblTerm);
       
        textFieldTerm = new JTextField();
        GridBagConstraints gbc_textFieldTerm = new GridBagConstraints();
        gbc_textFieldTerm.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldTerm.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldTerm.gridx = 3;
        gbc_textFieldTerm.gridy = 4;
        contentPane.add(textFieldTerm, gbc_textFieldTerm);
        textFieldTerm.setColumns(10);
       
        JLabel lblPayment = new JLabel("Payment");
        GridBagConstraints gbc_lblPayment = new GridBagConstraints();
        gbc_lblPayment.anchor = GridBagConstraints.EAST;
        gbc_lblPayment.insets = new Insets(0, 0, 5, 5);
        gbc_lblPayment.gridx = 2;
        gbc_lblPayment.gridy = 5;
        contentPane.add(lblPayment, gbc_lblPayment);
       
        textFieldPayment = new JTextField();
        textFieldPayment.setText("");
        GridBagConstraints gbc_textFieldPayment = new GridBagConstraints();
        gbc_textFieldPayment.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldPayment.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldPayment.gridx = 3;
        gbc_textFieldPayment.gridy = 5;
        contentPane.add(textFieldPayment, gbc_textFieldPayment);
        textFieldPayment.setColumns(10);
       
        JLabel lblHousingPayment = new JLabel("Housing Payment");
        GridBagConstraints gbc_lblHousingPayment = new GridBagConstraints();
        gbc_lblHousingPayment.anchor = GridBagConstraints.EAST;
        gbc_lblHousingPayment.insets = new Insets(0, 0, 5, 5);
        gbc_lblHousingPayment.gridx = 2;
        gbc_lblHousingPayment.gridy = 7;
        contentPane.add(lblHousingPayment, gbc_lblHousingPayment);
       
        txtHousingpayment = new JTextField();
        txtHousingpayment.setEditable(false);
        //txtHousingpayment.setText(sHousingPayment);
        GridBagConstraints gbc_txtHousingpayment = new GridBagConstraints();
        gbc_txtHousingpayment.insets = new Insets(0, 0, 5, 0);
        gbc_txtHousingpayment.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtHousingpayment.gridx = 3;
        gbc_txtHousingpayment.gridy = 7;
        contentPane.add(txtHousingpayment, gbc_txtHousingpayment);
        txtHousingpayment.setColumns(10);
       
        JLabel lblHousingPaymentother = new JLabel("Housing Payment +Other Obligations");
        GridBagConstraints gbc_lblHousingPaymentother = new GridBagConstraints();
        gbc_lblHousingPaymentother.anchor = GridBagConstraints.EAST;
        gbc_lblHousingPaymentother.insets = new Insets(0, 0, 5, 5);
        gbc_lblHousingPaymentother.gridx = 2;
        gbc_lblHousingPaymentother.gridy = 8;
        contentPane.add(lblHousingPaymentother, gbc_lblHousingPaymentother);
       
        textFieldOther = new JTextField();
        textFieldOther.setEditable(false);
        GridBagConstraints gbc_textFieldOther = new GridBagConstraints();
        gbc_textFieldOther.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldOther.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldOther.gridx = 3;
        gbc_textFieldOther.gridy = 8;
        contentPane.add(textFieldOther, gbc_textFieldOther);
        textFieldOther.setColumns(10);
       
        JLabel lblMaximumPaymentAllowed = new JLabel("Maximum Payment Allowed");
        GridBagConstraints gbc_lblMaximumPaymentAllowed = new GridBagConstraints();
        gbc_lblMaximumPaymentAllowed.anchor = GridBagConstraints.EAST;
        gbc_lblMaximumPaymentAllowed.insets = new Insets(0, 0, 5, 5);
        gbc_lblMaximumPaymentAllowed.gridx = 2;
        gbc_lblMaximumPaymentAllowed.gridy = 9;
        contentPane.add(lblMaximumPaymentAllowed, gbc_lblMaximumPaymentAllowed);
       
        textFieldMax = new JTextField();
        textFieldMax.setEditable(false);
        GridBagConstraints gbc_textFieldMax = new GridBagConstraints();
        gbc_textFieldMax.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldMax.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldMax.gridx = 3;
        gbc_textFieldMax.gridy = 9;
        contentPane.add(textFieldMax, gbc_textFieldMax);
        textFieldMax.setColumns(10);
       
        JLabel lblAmountOfMortgage = new JLabel("Amount of Mortgage that can be Financed");
        GridBagConstraints gbc_lblAmountOfMortgage = new GridBagConstraints();
        gbc_lblAmountOfMortgage.anchor = GridBagConstraints.EAST;
        gbc_lblAmountOfMortgage.insets = new Insets(0, 0, 0, 5);
        gbc_lblAmountOfMortgage.gridx = 2;
        gbc_lblAmountOfMortgage.gridy = 10;
        contentPane.add(lblAmountOfMortgage, gbc_lblAmountOfMortgage);
       
        textFieldAmountofMortgage = new JTextField();
        textFieldAmountofMortgage.setEditable(false);
        GridBagConstraints gbc_textFieldAmountofMortgage = new GridBagConstraints();
        gbc_textFieldAmountofMortgage.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldAmountofMortgage.gridx = 3;
        gbc_textFieldAmountofMortgage.gridy = 10;
        contentPane.add(textFieldAmountofMortgage, gbc_textFieldAmountofMortgage);
        textFieldAmountofMortgage.setColumns(10);
       
        btnGo = new JButton("Go!");
        GridBagConstraints gbc_btnGo = new GridBagConstraints();
        gbc_btnGo.insets = new Insets(0, 0, 5, 0);
        gbc_btnGo.gridx = 3;
        gbc_btnGo.gridy = 6;
        contentPane.add(btnGo, gbc_btnGo);
        btnGo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                double totalGrossIncome = Double.parseDouble(textFieldTotalGrossIncome.getText());
               
                double totalMonthlyDebt = Double.parseDouble(textFieldTotalMonthlyDebt.getText());
               
                double mortgageInterestRate = Double.parseDouble(textFieldMortgageInterestRate.getText());
               
                double term = Double.parseDouble(textFieldTerm.getText());
               
                double payment = Double.parseDouble(textFieldPayment.getText());
               
                double housingPayment = (totalGrossIncome/12)*0.18;
                double other = ((totalGrossIncome/12)*0.36) - totalMonthlyDebt;
               
                double max;
                if (housingPayment > other){
                    max = other;
                }
                else{
                    max = housingPayment;
                }
               
                double amountOfMortgage = (max)*(1-Math.pow((1+(mortgageInterestRate/100)/12),(-(term*12/12)*12)))*(12/(mortgageInterestRate/100));
               
                DecimalFormat df = new DecimalFormat("#.##");
                String sHousingPayment = df.format(housingPayment);
                String sOther = df.format(other);
                String sMax = df.format(max);
                String sAmountOfMortgage = df.format(amountOfMortgage);
               
                txtHousingpayment.setText(sHousingPayment);
                textFieldOther.setText(sOther);
                textFieldMax.setText(sMax);
                textFieldAmountofMortgage.setText(sAmountOfMortgage);
            }
        });
       

    }

}