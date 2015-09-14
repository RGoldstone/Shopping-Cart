package ui;

import app.Bucket;
import app.Exceptions;
import app.Inventory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private final Inventory inventory;
    private final Bucket bucket;

    //number of choosen item
    private int itemCount = 1;
    private String[][] tableColumnData;
    private String[] listOfItem;
    private final String[] tableHeader = new String[]{"Name", "Price"};

    /**
     * Creates new form NewJFrame
     */
    public MainFrame() {
        //set center in the screen
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set up variables
        Exceptions exception = new Exceptions();

        inventory = new Inventory();
        bucket = new Bucket();

        //initialize table data
        int tableSize = inventory.getNameArray().length;
        tableColumnData = new String[tableSize][tableSize];
        //put name to table (column = 0)
        int count = 0;
        for (int i = 0; i < tableSize; i++) {
            tableColumnData[i][count] = inventory.getNameArray()[i];
        }
        //put price to table (column = 1)
        count++;
        for (int i = 0; i < tableSize; i++) {
            tableColumnData[i][count] = String.valueOf(inventory.getPriceArray()[i]);
        }

        listOfItem = inventory.getNameArray();
        //initialize view
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPurchase = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboxItem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboxPriority = new javax.swing.JComboBox();
        jComboxQuantity = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShoppingItem = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLableStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPurchase.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(249, 3, 3));
        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAdd.setText("Add to Cart");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Item");

        jComboxItem.setModel(new javax.swing.DefaultComboBoxModel(listOfItem));

        jLabel3.setText("Quantity");

        jComboxPriority.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Medium", "Low" }));

        jComboxQuantity.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 }));

        jLabel2.setText("Priority");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboxPriority, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboxItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboxQuantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboxItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboxPriority))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboxQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTableShoppingItem.setModel(new javax.swing.table.DefaultTableModel(
            tableColumnData,
            tableHeader
        ));
        jScrollPane1.setViewportView(jTableShoppingItem);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 58, 237));
        jLabel4.setText("Shopping Items");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 58, 237));
        jLabel5.setText("Purchasing zone");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 41));
        jLabel6.setText("Welcome to Dexter's House of Pain");

        jLableStatus.setForeground(new java.awt.Color(0, 66, 255));
        jLableStatus.setText("Please Choose Item " + itemCount);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75)
                        .addComponent(jLableStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLableStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        String name = JOptionPane.showInputDialog(this, "Input your name", "Purchase", JOptionPane.PLAIN_MESSAGE);
        //if user inputs valid name

        if (name != null && !name.isEmpty()) {
            Double budget = 0.0;
            boolean valid = true;
            do {
                budget = 0.0;
                try {
                    budget = Double.valueOf(JOptionPane.showInputDialog(this, "Input your budget", "Purchase", JOptionPane.PLAIN_MESSAGE));
                    valid = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please input a valid number!", "OOP!!", JOptionPane.WARNING_MESSAGE);
                    valid = false;
                }
                if (budget > 1000000000) {
                    JOptionPane.showMessageDialog(this, "You're too rich for Dexter's House of Pain.", "OOP!!", JOptionPane.WARNING_MESSAGE);
                    valid = false;
                }
            } while (!valid);
            this.setVisible(false);
            new CheckoutFrame(name, budget).setVisible(true);
        }

        //process to purchase
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //update index of choosen item
        int excludeIndex = jComboxItem.getSelectedIndex();
        if (excludeIndex == -1 || jComboxItem.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Out of stock", "Empty Items", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //add data to inventory/cart
        // System.out.println(index);
        int index = itemCount - 1;
        bucket.setName((String) jComboxItem.getSelectedItem()); // takes item at location c, puts it into
        // bucket location a
        inventory.setName(index, " "); // takes item at location c out of
        // inventory

        bucket.setPrice(inventory.getPrice(index)); // takes price at location
        // c, puts it into bucket at
        // location a
        inventory.setPrice(index, 0.00); // takes price at location c, sets it
        // back to 0.00 (removes it)

        bucket.setPriority((String) jComboxPriority.getSelectedItem()); // takes priority at location c,
        // puts it into bucket location a
        inventory.setPriority(index, " "); // takes priority at location c,
        // sets it back to 0 (removes it)

        bucket.setQuantity((Integer) jComboxQuantity.getSelectedItem()); // takes quantity
        // at location c,
        // puts it into
        // bucket location
        // a
        inventory.setQuantity(index, 0); // takes quantity at location c, sets
        // it back to 0 (removes it)

        //update itemCount
        itemCount++;

        //reupdate table data 
        //reupdate table
        tableColumnData = updateTableData(excludeIndex);
        //reupdate combox 
        listOfItem = updateComboBoxItemData(excludeIndex);

        //re-update view 
        jTableShoppingItem.setModel(new DefaultTableModel(tableColumnData, tableHeader));
        jComboxItem.setModel(new DefaultComboBoxModel(listOfItem));
        jComboxPriority.setSelectedIndex(0);
        jComboxQuantity.setSelectedIndex(0);
        jLableStatus.setText("Please Choose Item " + itemCount);
    }//GEN-LAST:event_btnAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JComboBox jComboxItem;
    private javax.swing.JComboBox jComboxPriority;
    private javax.swing.JComboBox jComboxQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLableStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableShoppingItem;
    // End of variables declaration//GEN-END:variables

    public static void run() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    private String[][] updateTableData(int excludeIndex) {
        if (excludeIndex == -1) {
            return tableColumnData;
        }
        //initialize table data
        for (int i = 0; i < tableColumnData[0].length; i++) {
            if (((String) jComboxItem.getItemAt(excludeIndex)).equalsIgnoreCase(tableColumnData[i][0])) {
                tableColumnData[i][0] = null;
                tableColumnData[i][1] = null;
            }
        }
        return tableColumnData;
    }

    private String[] updateComboBoxItemData(int excludeIndex) {
        if (excludeIndex == -1) {
            return listOfItem;
        }
        //initialize table data
        int newSize = listOfItem.length - 1;
        String[] newListItem = new String[newSize];
        int index = 0;
        for (int i = 0; i < listOfItem.length; i++) {
            if (i != excludeIndex) {
                newListItem[index] = listOfItem[i];
                index++;
            }
        }

        return newListItem;
    }
}
