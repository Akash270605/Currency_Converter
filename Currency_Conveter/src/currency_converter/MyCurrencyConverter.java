/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency_converter;

import javax.swing.JOptionPane;

/**
 *
 * @author darknight
 */
public class MyCurrencyConverter extends javax.swing.JFrame {

String[] currencyUnits= {
    "Units", 
    "United States Dollar",
    "Nigerian Naira",
    "Brazilian Real",
    "Canadian Dollar",
    "Kenyan Shilling",
    "Indonesian Rupiah",
    "Indian Rupee",
    "Philippine Peso",
    "Pakistani Rupee",
    "Pound Sterling",
    "Afghan Afghani",
    "Albanian Lek",
    "Algerian Dinar",
    "Argentine Peso",
    "Armenian Dram",
    "Australian Dollar",
    "Euro",
    "Azerbaijani Manat",
    "Bahamian Dollar",
    "Bahraini Dinar",
    "Bangladeshi Taka",
    "Belarusian Ruble",
    "Euro",
    "Bhutanese Ngultrum",
    "Bolivian Boliviano",
    "Bulgarian Lev ",
    "Cambodian Riel",
    "Central African CFA Franc",
    "Chilean Peso",
    "Chinese Yuan",
    "Colombian Peso",
    "Congolese Franc",
    "Euro",
    "Cuban Peso",
    "Czech Koruna",
    "Danish Krone",
    "Eastern Caribbean Dollar",
    "Egyptian Pound",
    "Euro",
    "Ethiopian Birr",
    "Fijian Dollar",
    "Euro",
    "Euro",
    "CFP Franc",
    "Gambian Dalasi",
    "Georgian Lari",
    "Euro",
    "Ghanaian Cedi",
    "Euro",
    "Danish Krone",
    "Hong Kong Dollar",
    "Hungarian Forint",
    "Icelandic Krona",
    "Iranian Rial",
    "Iraqi Dinar",
    "Euro",
    "Israeli New Shekel",
    "Euro",
    "Japanese Yen",
    "Jersey Pound",
    "Jordanian Dinar",
    "Kazakhstani Tenge",
    "North Korean Won",
    "South Korean Won",
    "Kuwaiti Dinar",
    "Euro",
    "Lebanese Pound",
    "Liberian Dollar",
    "Libyan Dinar",
    "Euro",
    "Euro",
    "Malagasy Ariary",
    "Malaysian Ringgit",
    "Maldivian Rufiyaa",
    "Mexican Peso",
    "Euro",
    "Mongolian Togrik",
    "Moroccan Dihram",
    "Burmese Kyat",
    "Nepalese Rupee",
    "Euro",
    "New Zealand Dollar",
    "Macedonian Denar",
    "Norwegian Krone",
    "Omani Rial",
    "Jordanian Dina",
    "Panamanian Balboa",
    "Peruvian Sol",
    "Polish Zloty",
    "Euro",
    "Qatari Riyal",
    "Romanian Leu",
    "Russian Ruble",
    "Saudi Riyal",
    "Serbian Dinar",
    "Singapore Dollar",
    "Euro",
    "Euro",
    "South African Rand",
    "South Sudanese Pound",
    "Euro",
    "Sri Lankan Rupee",
    "Sudanese Pound",
    "Swedish Krona",
    "Swiss Franc",
    "Syrian Pound",
    "New Taiwan Dollar",
    "Tajikistani Somoni",
    "Thai Baht",
    "Turkish Lira",
    "Ugandan Shilling",
    "Ukrainian Hryvnia",
    "United Arab Emirates Dirham",
    "Uzbekistani Som",
    "Euro",
    "United States Dollar",
    "Vietnamese Dong",
    "Yemeni Rial",
    "Zambian Kwacha",
    "United States Dollar"
       
} ;

double United_States_Dollar =1.27;
double Nigerian_Naira= 2122.79;
double Brazilian_Real = 7.69;
double Canadian_Dollar= 1.78;
double Kenyan_Shilling= 164.79;
double Indonesian_Rupiah=20133.03;
double Indian_Rupee= 107.32;
double Philippine_Peso=74.25;
double Pakistani_Rupee=351.33;
double Pound_Sterling=1.0;
double Afghan_Afghani=86.32;
    double Albanian_Lek= 118.59;
    double Algerian_Dinar=169.51;
    double Argentine_Peso=1282.37 ;
    double Armenian_Dram=505.35 ;
    double Australian_Dollar =1.95;
    double Euro=1.20 ;
    double Azerbaijani_Manat=2.16 ;
    double Bahamian_Dollar=1.27 ;
    double Bahraini_Dinar =0.48;
    double Bangladeshi_Taka =151.63;
    double Belarusian_Ruble=4.15 ;
    double Bhutanese_Ngultrum= 107.49;
    double Bolivian_Boliviano=8.78 ;
    double Bulgarian_Lev=  2.36;
    double Cambodian_Riel= 5120.94;
    double Central_African_CFA_Franc = 790.93;
   double Chilean_Peso =1241.11;
  double Chinese_Yuan= 9.24;
    double Colombian_Peso= 5630.09;
    double Congolese_Franc= 3626.33;
  double Cuban_Peso=30.45 ;
   double Czech_Koruna=30.38 ;
    double Danish_Krone=8.98 ;
    double Eastern_Caribbean_Dollar=3.43 ;
   double Egyptian_Pound=63.10 ;
    double Ethiopian_Birr=160.74 ;
   double Fijian_Dollar=2.88 ;
    double CFP_Franc=144.16 ;
    double Gambian_Dalasi=90.01 ;
   double Georgian_Lari=3.60 ;
   double Ghanaian_Cedi=19.35 ;
   double Hong_Kong_Dollar=9.87 ;
   double Hungarian_Forint=498.06 ;
   double Icelandic_Krona=175.45 ;
   double Iranian_Rial=53371.87 ;
   double Iraqi_Dinar=1662.14 ;
   double Israeli_New_Shekel=4.61 ;
   double Japanese_Yen=190.15 ;
   double Jordanian_Dinar=0.90 ;
   double Kazakhstani_Tenge=666.65 ;
   double North_Korean_Won=1137.11 ;
   double South_Korean_Won=1777.79 ;
    double Kuwaiti_Dinar=0.39 ;
   double Lebanese_Pound=113623.30 ;
  double Liberian_Dollar=227.12 ;
   double Libyan_Dinar=6.18 ;
   double Malagasy_Ariary=5975.76 ;
   double Malaysian_Ringgit=5.67 ;
   double Maldivian_Rufiyaa=19.53 ;
   double Mexican_Peso=25.81 ; 
   double Mongolian_Togrik= 4326.8435;
   double Moroccan_Dihram=12.69;
   double Burmese_Kyat=2675.80;
   double Nepalese_Rupee= 171.97;
    double New_Zealand_Dollar= 2.15;
  double Macedonian_Denar=74.19;
    double Norwegian_Krone=14.02;
   double Omani_Rial=0.49;
    double Panamanian_Balboa=1.27;
   double Peruvian_Sol=4.75;
    double Polish_Zloty=5.17;
   double Qatari_Riyal=4.60;
   double Romanian_Leu=5.99;
    double Russian_Ruble=134.21;
    double Saudi_Riyal=4.76;
   double Serbian_Dinar=140.89;
   double Singapore_Dollar=1.70;
    double South_African_Rand=22.94;
   double South_Sudanese_Pound=761.79;
   double Sudanese_Pound=762.02;
   double Swedish_Krona=13.94;
   double Swiss_Franc=1.12;
    double Syrian_Pound=16.57;
   double New_Taiwan_Dollar=41.23;
   double Tajikistani_Somoni=13.85;
   double Thai_Baht=43.66;
   double Turkish_Lira=44.01;
   double Ugandan_Shilling=4682.09;
    double Ukrainian_Hryvnia=52.92;
   double United_Arab_Emirates_Dirham=4.65;
   double Uzbekistani_Som=16312.04;
    double Vietnamese_Dong=32177.37;
  double Yemeni_Rial=316.66;
   double Zambian_Kwacha=34.16;
   double Sri_Lankan_Rupee=367.95;
    
    public MyCurrencyConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox();
        secondCountry = new javax.swing.JComboBox();
        t2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Currency Converter");

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choosen One....", "USA", "Nigeria", "Brazil", "Canada", "Kenya", "Indonesia", "India", "Philippine", "Pakistan", "United Kingdom", "Afghanistan", "Albania", "Algeria", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Belarus", "Belgium", "Bhutan", "Bolivia", "Bulgaria", "Cambodia", "Central African Republic", "Chile", "China", "Colombia", "Congo", "Crotia", "Cuba", "Czech Republic", "Denmark", "Dominica", "Egypt", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Fench Polynesia", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Greenland", "Hong Kong", "Hungary", "Iceland", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Japan", "Jersey", "Jordan", "Kazakhstan", "North Korea", "South Korea", "Kuwait", "Latvia", "Lebonon", "Liberia", "Libya", "Lithuania", "Luxembourg", "Madagascar", "Malaysia", "Maldives", "Mexico", "Monaco", "Mongolia", "Morocco", "Myanmar", "Nepal", "Netherlands", "New Zealand", "North Macedonia", "Norway", "Oman", "Palestine", "Panama", "Peru", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Saudi Arabia", "Serbia", "Singapore", "Slovakia", "Slovenia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Thailand", "Turkey", "Uganda", "Ukraine", "United Arab Emirates", "Uzbekistan", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choosen One....", "USA", "Nigeria", "Brazil", "Canada", "Kenya", "Indonesia", "India", "Philippine", "Pakistan", "United Kingdom", "Afghanistan", "Albania", "Algeria", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Belarus", "Belgium", "Bhutan", "Bolivia", "Bulgaria", "Cambodia", "Central African Republic", "Chile", "China", "Colombia", "Congo", "Crotia", "Cuba", "Czech Republic", "Denmark", "Dominica", "Egypt", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Fench Polynesia", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Greenland", "Hong Kong", "Hungary", "Iceland", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Japan", "Jersey", "Jordan", "Kazakhstan", "North Korea", "South Korea", "Kuwait", "Latvia", "Lebonon", "Liberia", "Libya", "Lithuania", "Luxembourg", "Madagascar", "Malaysia", "Maldives", "Mexico", "Monaco", "Mongolia", "Morocco", "Myanmar", "Nepal", "Netherlands", "New Zealand", "North Macedonia", "Norway", "Oman", "Palestine", "Panama", "Peru", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Saudi Arabia", "Serbia", "Singapore", "Slovakia", "Slovenia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Thailand", "Turkey", "Uganda", "Ukraine", "United Arab Emirates", "Uzbekistan", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 153, 0));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("From Currency of");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("To Currency of");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        firstCurrencyUnit.setForeground(new java.awt.Color(255, 0, 51));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("Units");

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        secondCurrencyUnit.setForeground(new java.awt.Color(0, 255, 0));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("Units");

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convert Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 0, 0));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1)
                        .addGap(113, 113, 113)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstCountry, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secondCountry, 0, 1, Short.MAX_VALUE)
                            .addComponent(t2)
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Convert Currency

        if(firstCountry.getSelectedIndex() ==0 || secondCountry.getSelectedIndex() ==0 || t1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "You Must Select both Countries and must input the Amount", "Error Message",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double amountToChange= Double.parseDouble(t1.getText());
        double amountInPounds= 0.0;

        switch(firstCountry.getSelectedItem().toString()){
            case "USA": amountInPounds = amountToChange / United_States_Dollar;  break;
            case "Nigeria": amountInPounds = amountToChange / Nigerian_Naira;  break;
            case "Brazil": amountInPounds = amountToChange / Brazilian_Real;  break;
            case "Canada": amountInPounds = amountToChange / Canadian_Dollar;  break;
            case "Kenya": amountInPounds = amountToChange / Kenyan_Shilling;  break;
            case "Indonesia": amountInPounds = amountToChange / Indonesian_Rupiah;  break;
            case "India": amountInPounds = amountToChange / Indian_Rupee;  break;
            case "Philippine": amountInPounds = amountToChange / Philippine_Peso;  break;
            case "Pakistan": amountInPounds = amountToChange / Pakistani_Rupee;  break;
            case "United Kingdom": amountInPounds = amountToChange / Pound_Sterling;  break;
                
            case "Afghanistan": amountInPounds = amountToChange / Afghan_Afghani;  break;
            case "Albania": amountInPounds = amountToChange / Albanian_Lek;  break;
            case "Algeria": amountInPounds = amountToChange / Algerian_Dinar;  break;
            case "Argentina": amountInPounds = amountToChange / Argentine_Peso;  break;
            case "Armenia": amountInPounds = amountToChange / Armenian_Dram;  break;
            case "Australia": amountInPounds = amountToChange / Australian_Dollar;  break;
            case "Austria": amountInPounds = amountToChange / Euro;  break;
            case "Azerbaijan": amountInPounds = amountToChange / Azerbaijani_Manat;  break;
            case "Bahamas": amountInPounds = amountToChange / Bahamian_Dollar;  break;
            case "Bahrain": amountInPounds = amountToChange / Bahraini_Dinar;  break;
            case "Bangladesh": amountInPounds = amountToChange / Bangladeshi_Taka;  break;
            case "Belarus": amountInPounds = amountToChange / Belarusian_Ruble;  break;
            case "Belgium": amountInPounds = amountToChange / Euro;  break;
            case "Bhutan": amountInPounds = amountToChange / Bhutanese_Ngultrum;  break;
            case "Bolivia": amountInPounds = amountToChange / Bolivian_Boliviano;  break;
         
            case "Bulgaria": amountInPounds = amountToChange / Bulgarian_Lev;  break;
            case "Cambodia": amountInPounds = amountToChange / Cambodian_Riel;  break;
            case "Central African Republic": amountInPounds = amountToChange / Central_African_CFA_Franc;  break;
            case "Chile": amountInPounds = amountToChange / Chilean_Peso;  break;
            case "China": amountInPounds = amountToChange / Chinese_Yuan;  break;
            case "Colombia": amountInPounds = amountToChange / Colombian_Peso;  break;
            case "Congo": amountInPounds = amountToChange / Congolese_Franc;  break;
            case "Croatia": amountInPounds = amountToChange / Euro;  break;
            case "Cuba": amountInPounds = amountToChange / Cuban_Peso;  break;
            case "Czech Republic": amountInPounds = amountToChange / Czech_Koruna;  break;
            case "Denmark": amountInPounds = amountToChange / Danish_Krone;  break;
            case "Dominica": amountInPounds = amountToChange / Eastern_Caribbean_Dollar;  break;
            case "Egypt": amountInPounds = amountToChange / Egyptian_Pound;  break;
            case "Estonia": amountInPounds = amountToChange / Euro;  break;
            case "Ethiopia": amountInPounds = amountToChange / Ethiopian_Birr;  break;
            case "Fiji": amountInPounds = amountToChange / Fijian_Dollar;  break;
            case "Finland": amountInPounds = amountToChange / Euro;  break;
            case "France": amountInPounds = amountToChange / Euro;  break;
            case "French Polynesia": amountInPounds = amountToChange / CFP_Franc;  break;
            case "Gambia": amountInPounds = amountToChange / Gambian_Dalasi;  break;
            case "Georgia": amountInPounds = amountToChange / Georgian_Lari;  break;
            case "Germany": amountInPounds = amountToChange / Euro;  break;
            case "Ghana": amountInPounds = amountToChange / Ghanaian_Cedi;  break;
            case "Greece": amountInPounds = amountToChange / Euro;  break;
            
             case "Greenland": amountInPounds = amountToChange / Danish_Krone;  break;
            case "Hong Kong": amountInPounds = amountToChange / Hong_Kong_Dollar;  break;
            case "Hungary": amountInPounds = amountToChange / Hungarian_Forint;  break;
            case "Iceland": amountInPounds = amountToChange / Icelandic_Krona;  break;
            case "Iran": amountInPounds = amountToChange / Iranian_Rial;  break;
            case "Iraq": amountInPounds = amountToChange / Iraqi_Dinar;  break;
            case "Ireland": amountInPounds = amountToChange / Euro;  break;
            case "Israel": amountInPounds = amountToChange / Israeli_New_Shekel;  break;
            case "Italy": amountInPounds = amountToChange / Euro;  break;
            case "Japan": amountInPounds = amountToChange / Japanese_Yen;  break;
                
            case "Jersey": amountInPounds = amountToChange / Pound_Sterling;  break;
            case "Jordan": amountInPounds = amountToChange / Jordanian_Dinar;  break;
            case "Kazakhstan": amountInPounds = amountToChange / Kazakhstani_Tenge;  break;
            case "North Korea": amountInPounds = amountToChange / North_Korean_Won;  break;
            case "South Korea": amountInPounds = amountToChange / South_Korean_Won;  break;
            case "Kuwait": amountInPounds = amountToChange / Kuwaiti_Dinar;  break;
            case "Latvia": amountInPounds = amountToChange / Euro;  break;
            case "Lebanon": amountInPounds = amountToChange / Lebanese_Pound;  break;
            case "Liberia": amountInPounds = amountToChange / Liberian_Dollar;  break;
            case "Libya": amountInPounds = amountToChange / Libyan_Dinar;  break;
            case "Lithuania": amountInPounds = amountToChange / Euro;  break;
            case "Luxembourg": amountInPounds = amountToChange / Euro;  break;
            case "Madagascar": amountInPounds = amountToChange / Malagasy_Ariary;  break;
            case "Malaysia": amountInPounds = amountToChange / Malaysian_Ringgit;  break;
            case "Maldives": amountInPounds = amountToChange / Maldivian_Rufiyaa;  break;
         
            case "Mexico": amountInPounds = amountToChange / Mexican_Peso;  break;
            case "Monaco": amountInPounds = amountToChange / Euro;  break;
            case "Mongolia": amountInPounds = amountToChange / Mongolian_Togrik;  break;
            case "Morocco": amountInPounds = amountToChange / Moroccan_Dihram;  break;
            case "Myanmar": amountInPounds = amountToChange / Burmese_Kyat;  break;
            case "Nepal": amountInPounds = amountToChange / Nepalese_Rupee;  break;
            case "Netherlands": amountInPounds = amountToChange / Euro;  break;
            case "New Zealand": amountInPounds = amountToChange / New_Zealand_Dollar;  break;
            case "North Macedonia": amountInPounds = amountToChange / Macedonian_Denar;  break;
            case "Norway": amountInPounds = amountToChange / Norwegian_Krone;  break;
            case "Oman": amountInPounds = amountToChange / Omani_Rial;  break;
            case "Palestine": amountInPounds = amountToChange / Jordanian_Dinar;  break;
            case "Panama": amountInPounds = amountToChange / Panamanian_Balboa;  break;
            case "Peru": amountInPounds = amountToChange / Peruvian_Sol;  break;
            case "Poland": amountInPounds = amountToChange / Polish_Zloty;  break;
            case "Portugal": amountInPounds = amountToChange / Euro;  break;
            case "Qatar": amountInPounds = amountToChange / Qatari_Riyal;  break;
            case "Romania": amountInPounds = amountToChange / Romanian_Leu;  break;
            case "Russia": amountInPounds = amountToChange / Russian_Ruble;  break;
            case "Saudi Arabia": amountInPounds = amountToChange / Saudi_Riyal;  break;
            case "Serbia": amountInPounds = amountToChange / Serbian_Dinar;  break;
            case "Singapore": amountInPounds = amountToChange / Singapore_Dollar;  break;
            case "Slovakia": amountInPounds = amountToChange / Euro;  break;
            case "Slovenia": amountInPounds = amountToChange / Euro;  break;
             
              case "South Africa": amountInPounds = amountToChange / South_African_Rand;  break;
            case "South Sudan": amountInPounds = amountToChange / South_Sudanese_Pound;  break;
            case "Spain": amountInPounds = amountToChange / Euro;  break;
            case "Sri Lanka": amountInPounds = amountToChange / Sri_Lankan_Rupee;  break;
            case "Sudan": amountInPounds = amountToChange / Sudanese_Pound;  break;
            case "Sweden": amountInPounds = amountToChange / Swedish_Krona;  break;
            case "Switzerland": amountInPounds = amountToChange / Swiss_Franc;  break;
            case "Syria": amountInPounds = amountToChange / Syrian_Pound;  break;
            case "Taiwan": amountInPounds = amountToChange / New_Taiwan_Dollar;  break;
            case "Tajikistan": amountInPounds = amountToChange / Tajikistani_Somoni;  break;
                
            case "Thailand": amountInPounds = amountToChange / Thai_Baht;  break;
            case "Turkey": amountInPounds = amountToChange / Turkish_Lira;  break;
            case "Uganda": amountInPounds = amountToChange / Ugandan_Shilling;  break;
            case "Ukraine": amountInPounds = amountToChange / Ukrainian_Hryvnia;  break;
            case "United Arab Emirates": amountInPounds = amountToChange / United_Arab_Emirates_Dirham;  break;
            case "Uzbekistan": amountInPounds = amountToChange / Uzbekistani_Som;  break;
            case "Vatican City": amountInPounds = amountToChange / Euro;  break;
            case "Venezuela": amountInPounds = amountToChange / United_States_Dollar;  break;
            case "Vietnam": amountInPounds = amountToChange / Vietnamese_Dong;  break;
            case "Yemen": amountInPounds = amountToChange / Yemeni_Rial;  break;
            case "Zambia": amountInPounds = amountToChange / Zambian_Kwacha;  break;
            case "Zimbabwe": amountInPounds = amountToChange / United_States_Dollar;  break;
            
            default: amountInPounds =0.0;
        }

        //Amount is changed in pounds
        double amountChanged =0.0;
        switch(secondCountry.getSelectedItem().toString()){
            case "USA": amountChanged = amountInPounds *United_States_Dollar;  break;
            case "Nigeria": amountChanged = amountInPounds * Nigerian_Naira;  break;
            case "Brazil": amountChanged = amountInPounds * Brazilian_Real;  break;
            case "Canada": amountChanged = amountInPounds * Canadian_Dollar;  break;
            case "Kenya": amountChanged = amountInPounds * Kenyan_Shilling;  break;
            case "Indonesia": amountChanged = amountInPounds * Indonesian_Rupiah;  break;
            case "India": amountChanged = amountInPounds * Indian_Rupee;  break;
            case "Philippine": amountChanged = amountInPounds * Philippine_Peso;  break;
            case "Pakistan": amountChanged = amountInPounds * Pakistani_Rupee;  break;
            case "United Kingdom": amountChanged = amountInPounds * Pound_Sterling;  break;
              
             case "Afghanistan": amountChanged = amountInPounds * Afghan_Afghani;  break;
            case "Albania": amountChanged = amountInPounds * Albanian_Lek;  break;
            case "Algeria": amountChanged = amountInPounds * Algerian_Dinar;  break;
            case "Argentina": amountChanged = amountInPounds * Argentine_Peso;  break;
            case "Armenia": amountChanged = amountInPounds * Armenian_Dram;  break;
            case "Australia": amountChanged = amountInPounds * Australian_Dollar;  break;
            case "Austria": amountChanged = amountInPounds * Euro;  break;
            case "Azerbaijan": amountChanged = amountInPounds * Azerbaijani_Manat;  break;
            case "Bahamas": amountChanged = amountInPounds * Bahamian_Dollar;  break;
            case "Bahrain": amountChanged = amountInPounds * Bahraini_Dinar;  break;
            case "Bangladesh": amountChanged = amountInPounds * Bangladeshi_Taka;  break;
            case "Belarus": amountChanged = amountInPounds * Belarusian_Ruble;  break;
            case "Belgium": amountChanged = amountInPounds * Euro;  break;
            case "Bhutan": amountChanged = amountInPounds * Bhutanese_Ngultrum;  break;
            case "Bolivia": amountChanged = amountInPounds * Bolivian_Boliviano;  break;
         
            case "Bulgaria": amountChanged = amountInPounds * Bulgarian_Lev;  break;
            case "Cambodia": amountChanged = amountInPounds * Cambodian_Riel;  break;
            case "Central African Republic": amountChanged = amountInPounds * Central_African_CFA_Franc;  break;
            case "Chile": amountChanged = amountInPounds * Chilean_Peso;  break;
            case "China": amountChanged = amountInPounds * Chinese_Yuan;  break;
            case "Colombia": amountChanged = amountInPounds * Colombian_Peso;  break;
            case "Congo": amountChanged = amountInPounds * Congolese_Franc;  break;
            case "Croatia": amountChanged = amountInPounds * Euro;  break;
            case "Cuba": amountChanged = amountInPounds * Cuban_Peso;  break;
            case "Czech Republic": amountChanged = amountInPounds * Czech_Koruna;  break;
            case "Denmark": amountChanged = amountInPounds * Danish_Krone;  break;
            case "Dominica": amountChanged = amountInPounds * Eastern_Caribbean_Dollar;  break;
            case "Egypt": amountChanged = amountInPounds * Egyptian_Pound;  break;
            case "Estonia": amountChanged = amountInPounds * Euro;  break;
            case "Ethiopia": amountChanged = amountInPounds * Ethiopian_Birr;  break;
            case "Fiji": amountChanged = amountInPounds * Fijian_Dollar;  break;
            case "Finland": amountChanged = amountInPounds * Euro;  break;
            case "France": amountChanged = amountInPounds * Euro;  break;
            case "French Polynesia": amountChanged = amountInPounds * CFP_Franc;  break;
            case "Gambia": amountChanged = amountInPounds * Gambian_Dalasi;  break;
            case "Georgia": amountChanged = amountInPounds * Georgian_Lari;  break;
            case "Germany": amountChanged = amountInPounds * Euro;  break;
            case "Ghana": amountChanged = amountInPounds * Ghanaian_Cedi;  break;
            case "Greece": amountChanged = amountInPounds * Euro;  break;
            
             case "Greenland": amountChanged = amountInPounds * Danish_Krone;  break;
            case "Hong Kong": amountChanged = amountInPounds * Hong_Kong_Dollar;  break;
            case "Hungary": amountChanged = amountInPounds * Hungarian_Forint;  break;
            case "Iceland": amountChanged = amountInPounds * Icelandic_Krona;  break;
            case "Iran": amountChanged = amountInPounds * Iranian_Rial;  break;
            case "Iraq": amountChanged = amountInPounds * Iraqi_Dinar;  break;
            case "Ireland": amountChanged = amountInPounds * Euro;  break;
            case "Israel": amountChanged = amountInPounds * Israeli_New_Shekel;  break;
            case "Italy": amountChanged = amountInPounds * Euro;  break;
            case "Japan": amountChanged = amountInPounds * Japanese_Yen;  break;
                
            case "Jersey": amountChanged = amountInPounds * Pound_Sterling;  break;
            case "Jordan": amountChanged = amountInPounds * Jordanian_Dinar;  break;
            case "Kazakhstan": amountChanged = amountInPounds * Kazakhstani_Tenge;  break;
            case "North Korea": amountChanged = amountInPounds * North_Korean_Won;  break;
            case "South Korea": amountChanged = amountInPounds * South_Korean_Won;  break;
            case "Kuwait": amountChanged = amountInPounds * Kuwaiti_Dinar;  break;
            case "Latvia": amountChanged = amountInPounds * Euro;  break;
            case "Lebanon": amountChanged = amountInPounds * Lebanese_Pound;  break;
            case "Liberia": amountChanged = amountInPounds * Liberian_Dollar;  break;
            case "Libya": amountChanged = amountInPounds * Libyan_Dinar;  break;
            case "Lithuania": amountChanged = amountInPounds * Euro;  break;
            case "Luxembourg": amountChanged = amountInPounds * Euro;  break;
            case "Madagascar": amountChanged = amountInPounds * Malagasy_Ariary;  break;
            case "Malaysia": amountChanged = amountInPounds * Malaysian_Ringgit;  break;
            case "Maldives": amountChanged = amountInPounds * Maldivian_Rufiyaa;  break;
         
            case "Mexico": amountChanged = amountInPounds * Mexican_Peso;  break;
            case "Monaco": amountChanged = amountInPounds * Euro;  break;
            case "Mongolia": amountChanged = amountInPounds * Mongolian_Togrik;  break;
            case "Morocco": amountChanged = amountInPounds * Moroccan_Dihram;  break;
            case "Myanmar": amountChanged = amountInPounds * Burmese_Kyat;  break;
            case "Nepal": amountChanged = amountInPounds * Nepalese_Rupee;  break;
            case "Netherlands": amountChanged = amountInPounds * Euro;  break;
            case "New Zealand": amountChanged = amountInPounds * New_Zealand_Dollar;  break;
            case "North Macedonia": amountChanged = amountInPounds * Macedonian_Denar;  break;
            case "Norway": amountChanged = amountInPounds * Norwegian_Krone;  break;
            case "Oman": amountChanged = amountInPounds * Omani_Rial;  break;
            case "Palestine": amountChanged = amountInPounds * Jordanian_Dinar;  break;
            case "Panama": amountChanged = amountInPounds * Panamanian_Balboa;  break;
            case "Peru": amountChanged = amountInPounds * Peruvian_Sol;  break;
            case "Poland": amountChanged = amountInPounds * Polish_Zloty;  break;
            case "Portugal": amountChanged = amountInPounds * Euro;  break;
            case "Qatar": amountChanged = amountInPounds * Qatari_Riyal;  break;
            case "Romania": amountChanged = amountInPounds * Romanian_Leu;  break;
            case "Russia": amountChanged = amountInPounds * Russian_Ruble;  break;
            case "Saudi Arabia": amountChanged = amountInPounds * Saudi_Riyal;  break;
            case "Serbia": amountChanged = amountInPounds * Serbian_Dinar;  break;
            case "Singapore": amountChanged = amountInPounds * Singapore_Dollar;  break;
            case "Slovakia": amountChanged = amountInPounds * Euro;  break;
            case "Slovenia": amountChanged = amountInPounds * Euro;  break;
             
              case "South Africa": amountChanged = amountInPounds * South_African_Rand;  break;
            case "South Sudan": amountChanged = amountInPounds * South_Sudanese_Pound;  break;
            case "Spain": amountChanged = amountInPounds * Euro;  break;
            case "Sri Lanka": amountChanged = amountInPounds * Sri_Lankan_Rupee;  break;
            case "Sudan": amountChanged = amountInPounds * Sudanese_Pound;  break;
            case "Sweden": amountChanged = amountInPounds * Swedish_Krona;  break;
            case "Switzerland": amountChanged = amountInPounds * Swiss_Franc;  break;
            case "Syria": amountChanged = amountInPounds * Syrian_Pound;  break;
            case "Taiwan": amountChanged = amountInPounds * New_Taiwan_Dollar;  break;
            case "Tajikistan": amountChanged = amountInPounds * Tajikistani_Somoni;  break;
                
            case "Thailand": amountChanged = amountInPounds * Thai_Baht;  break;
            case "Turkey": amountChanged = amountInPounds * Turkish_Lira;  break;
            case "Uganda": amountChanged = amountInPounds * Ugandan_Shilling;  break;
            case "Ukraine": amountChanged = amountInPounds * Ukrainian_Hryvnia;  break;
            case "United Arab Emirates": amountChanged = amountInPounds * United_Arab_Emirates_Dirham;  break;
            case "Uzbekistan": amountChanged = amountInPounds * Uzbekistani_Som;  break;
            case "Vatican City": amountChanged = amountInPounds * Euro;  break;
            case "Venezuela": amountChanged = amountInPounds * United_States_Dollar;  break;
            case "Vietnam": amountChanged = amountInPounds * Vietnamese_Dong;  break;
            case "Yemen": amountChanged = amountInPounds * Yemeni_Rial;  break;
            case "Zambia": amountChanged = amountInPounds * Zambian_Kwacha;  break;
            case "Zimbabwe": amountChanged = amountInPounds * United_States_Dollar;  break;
                
            default: amountChanged =0.0;
        }

        String value =String.format("%.2f", amountChanged);
        t2.setText(value);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        int position= secondCountry.getSelectedIndex();

        secondCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        int position= firstCountry.getSelectedIndex();

        firstCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
